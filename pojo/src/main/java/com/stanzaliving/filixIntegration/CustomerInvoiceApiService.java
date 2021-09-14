package com.stanzaliving.filixIntegration;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.stanzaliving.collector.enums.InvoiceType;
import com.stanzaliving.core.base.enums.DateFormat;
import com.stanzaliving.core.base.utils.DateUtil;
import com.stanzaliving.core.kafka.dto.KafkaDTO;
import com.stanzaliving.core.kafka.producer.NotificationProducer;
import com.stanzaliving.filixIntegration.Dto.*;
import com.stanzaliving.filixIntegration.Enum.EventType;
import com.stanzaliving.filixIntegration.Enum.OracleServiceOwner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.*;

@Service
@Transactional
public class CustomerInvoiceApiService extends CustomerApiFactory {

    private static final Logger logger = LoggerFactory.getLogger(CustomerInvoiceApiService.class);

    @Autowired
    private ObjectMapper objectMapper ;

    @Value("venta-integration")
    private String oracleIntegrationTopic;
    @Autowired
    NotificationProducer notificationProducer;

    @Override
    public void produceOnKafkaForCreate(Map<Object, Object> dataMap) {
        logger.info("In CustomerInvoiceApiService packet received {} ",dataMap.toString());
        AbstractOracleDto abstractOracleDto = new AbstractOracleDto();
        abstractOracleDto.setContextArgs(getPayloadForInvoice(dataMap));
        abstractOracleDto.setEventType(EventType.CREATE);
        abstractOracleDto.setServiceOwner(OracleServiceOwner.CUSTOMER_INVOICE);
        logger.info("In CustomerInvoiceApiService packet to produce {} ", abstractOracleDto);
        notificationProducer.publish(oracleIntegrationTopic,"student",new KafkaDTO("filix-integration", "invoice", AbstractOracleDto.class.getName(), abstractOracleDto));

    }

    @Override
    public void produceOnKafkaForUpdate(Map<Object, Object> dataMap) {
        AbstractOracleDto kafkaDto = new AbstractOracleDto();
        kafkaDto.setContextArgs(getPayloadForInvoice(dataMap));
        kafkaDto.setEventType(EventType.UPDATE);
        kafkaDto.setServiceOwner(OracleServiceOwner.CUSTOMER_INVOICE);
        notificationProducer.publish(oracleIntegrationTopic,"student",new KafkaDTO("filix-integration", "invoice", AbstractOracleDto.class.getName(), kafkaDto));

    }

    private Map<String, Object> getPayloadForInvoice(Map<Object, Object> dataMap) {
        Map<String, Object> mapToSend = new HashMap<>();
        logger.info("start map filling " );
        try {
//            objectMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
//            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            logger.info("dataMap "+dataMap.get("data").toString().replaceAll("\\{", "").replaceAll("\\}",""));
            //dataMap.get("data").toString()
            CustomerApiDto customerApiDto = objectMapper.readValue(dataMap.get("data").toString(), CustomerApiDto.class);
            logger.info("customerApiDto "+customerApiDto );
            if(null != customerApiDto && null != customerApiDto.getFilixInvoiceDto()) {
                FilixInvoiceDto invoice = customerApiDto.getFilixInvoiceDto();
                FilixInvoiceCategoryDto invoiceCategoryDto=customerApiDto.getFilixInvoiceCategoryDto();
                logger.info("invoice "+invoice);
                FilixBillingFromDto filixBillFromDto=customerApiDto.getFilixBillingFromDto();
                mapToSend.put(stanzaId,invoice.getId());
                mapToSend.put(date, null==invoice.getIssueDate()?"":DateUtil.customDateFormatter(DateUtil.convertToDate(invoice.getIssueDate()), DateFormat.DD_MM_YYYY) );
                mapToSend.put(startDate, null != invoice.getFromDate() ? DateUtil.customDateFormatter(DateUtil.convertToDate(invoice.getFromDate()) , DateFormat.DD_MM_YYYY) : "");
                mapToSend.put(endDate, null != invoice.getToDate() ? DateUtil.customDateFormatter(DateUtil.convertToDate(invoice.getToDate()),DateFormat.DD_MM_YYYY) : "");
                if(null == invoice.getFromDate() && null == invoice.getToDate()) {
                    mapToSend.put(invoiceType, "Maintenance Charges");
                }else {
                    mapToSend.put(invoiceType,invoiceCategoryDto.getCategoryName());
                }
                mapToSend.put(bookingid,invoice.getReferenceUuid());
                mapToSend.put(tranid,"");
                mapToSend.put(dueDate,DateUtil.addDaysToDate(DateUtil.convertToDate(invoice.getIssueDate()),6));
                mapToSend.put(customer,invoice.getResidentId());
                mapToSend.put(class_str, "");
                mapToSend.put(department, "");
                mapToSend.put(excahngeRate,1.00);
                mapToSend.put(currency,"INR");
                mapToSend.put(billingState, filixBillFromDto.getGstState());
                mapToSend.put(billingCountry,"India");
                mapToSend.put(postingPeriod,"");
                mapToSend.put(itemList,"");
                mapToSend.put(extraFields,getExtraFields(invoice));
            }
        } catch (IOException e) {
            logger.error("Error occurred in getPayloadForInvoice {}", e);
        }
        logger.info("final mapToSend "+mapToSend );
        return mapToSend;
    }


    private Map<String, Object> createLineItemMap(FilixInvoiceDto invoice, String serviceName, double nonGstInvoiceAmount, int lineId , double taxAmount, double taxRate, String taxlocation) {
        Map<String, Object> map = new HashMap<>();
        if(null == invoice.getFromDate() && null == invoice.getToDate()) {
            map.put(item, "Maintenance Charges");
        }else {
            map.put(item, invoice.getInvoiceType());
        }
        map.put(quantity, 1);
        map.put(rate, "");
        map.put(amount, "");
        map.put(hsnCode, "");
        map.put(stanzaLineId, "");
        map.put(taxlocationtype, "");
        map.put(taxrate, "");
        map.put(taxamount, "");


        return map;
    }


    private Map<String, Object> getExtraFields(FilixInvoiceDto invoice) {
        Map<String, Object> map = new HashMap<>();
        map.put(residenceName,"");
        return map;
    }
    private String stanzaId="stanzaId";
    private String date="date";
    private String startDate="startDate";
    private String endDate="endDate";
    private String invoiceType="invoiceType";
    private String tranid="tranid";
    private String bookingid="bookingid";
    private String class_str="class";
    private String department="department";
    private String dueDate="dueDate";
    private String customer="customer";
    private String location="location";
    private String excahngeRate="excahngeRate";
    private String currency="currency";
    private String billingState="billingState";
    private String billingCountry="billingCountry";
    private String itemList="itemList";
    private String item="item";
    private String quantity="quantity";
    private String rate="rate";
    private String amount="amount";
    private String hsnCode="hsnCode";
    private String stanzaLineId="stanzaLineId";
    private String extraFields="extraFields";
    private String residenceName="residenceName";
    private String method = "HttpMethod";
    private String taxlocationtype="taxlocationtype";
    private String taxamount="taxamount";
    private String postingPeriod="postingPeriod";
    private String taxrate="taxrate";
    private String url_string = "url";
    private String url = "https://5742638-sb1.restlets.api.netsuite.com/app/site/hosting/restlet.nl? script=434&deploy=1";
}