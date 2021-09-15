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
import org.apache.commons.lang3.StringUtils;
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
                    mapToSend.put(invoiceType,"Damage");
                    //invoiceCategoryDto.getCategoryName()
                }
                mapToSend.put(bookingid,invoice.getReferenceUuid());
                mapToSend.put(tranid,"");
                mapToSend.put(dueDate,DateUtil.customDateFormatter(DateUtil.addDaysToDate(DateUtil.convertToDate(invoice.getIssueDate()),6),DateFormat.DD_MM_YYYY));
                mapToSend.put(customer,invoice.getResidentId());
                mapToSend.put(class_str, "");
                mapToSend.put(department, "");
                mapToSend.put(excahngeRate,1.00);
                mapToSend.put(currency,"INR");
                mapToSend.put(billingState, filixBillFromDto.getGstState());
                mapToSend.put(billingCountry,"India");
                mapToSend.put(postingPeriod,"");
                mapToSend.put(itemList,getInvoiceLineItems(invoice,invoiceCategoryDto));
                mapToSend.put(extraFields,getExtraFields(invoice));
            }
        } catch (IOException e) {
            logger.error("Error occurred in getPayloadForInvoice {}", e);
        }
        logger.info("final mapToSend "+mapToSend );
        return mapToSend;
    }

    private List getInvoiceLineItems(FilixInvoiceDto invoice,FilixInvoiceCategoryDto invoiceCategoryDto) {

        List<Map<String, Object>> lineItems = new ArrayList();
        int lineId = 0;
        Map<String, Object> map = new HashMap<>();
        if(invoice.getInvoiceType().equals("Rental") || invoice.getInvoiceType().equals("Penalty")) {
            map = createLineItemMap(invoice, null, invoice.getTotalAmount(), lineId++, 0D, 0, "INTRASTATE");

        }
//        else if(InvoiceType.FOOD_SERVICE.equals(invoice.getInvoiceType())) {
//            double taxAmount = invoice.getInvoiceAmount() - (invoice.getInvoiceAmount() * ( 100 / (100 + Constants.FOOD_INVOICE_GST_PERCENTAGE)));
//            Double nonGstInvoiceAmount = invoice.getInvoiceAmount() - taxAmount;
//            map = createLineItemMap(invoice, null, nonGstInvoiceAmount, lineId++, taxAmount, Constants.FOOD_INVOICE_GST_PERCENTAGE, "INTRASTATE");
//
//        }
//        else if(InvoiceType.VAS.equals(invoice.getInvoiceType())) {
//            List<BookingService> bookingServices = bookingServicesDaoImpl.getActiveVasServices(Integer.valueOf(invoice.getBookingId()));
//            for(BookingService bookingService : bookingServices) {
//                com.stanzaliving.inventory.model.Service service = serviceDao.findById(bookingService.getServiceId());
//                double taxRate = service.getCgst()+service.getSgst();
//                double servicePrice = bookingService.getPrice();
//
//                double taxAmount = servicePrice - (servicePrice * ( 100 / (100 + (taxRate))));
//                Double nonGstInvoiceAmount = servicePrice - taxAmount;
//                map = createLineItemMap(invoice, service.getName(), nonGstInvoiceAmount, lineId++, taxAmount, taxRate, "INTRASTATE");
//                lineId += 1;
//            }
//        }
        else {
            //Services with 18% GST
//            double taxAmount = invoice.getTotalAmount() - (invoice.getTotalAmount() * ( 100 / (100 + Constants.SERVICE_INVOICE_GST_PERCENTAGE)));
            double taxAmount=0;
            Double nonGstInvoiceAmount = invoice.getTotalAmount() - taxAmount;
            map = createLineItemMap(invoice, null, nonGstInvoiceAmount, lineId++, 0D, 0, "");

        }

        lineItems.add(map);
        Map<String, Object> discountMap = getDiscountLineIfApplicable(invoice, lineId++);
        logger.info("discountMap {}", discountMap );
        if(null != discountMap) {
            lineItems.add(discountMap);
        }
        return lineItems;



    }

    private Map<String, Object> getDiscountLineIfApplicable(FilixInvoiceDto invoice, int lineId) {
        Map<String, Object> map = new HashMap<>();
//        Double discountAmount = invoice.getInvoiceLineItems().stream().filter(item -> item.getLineItem().contains("Discount")).mapToDouble(item -> Math.abs(item.getAmount())).sum();
        Double discountAmount=0.0;
        logger.info("discountAmount {}", discountAmount );
        if(0 < discountAmount) {
            map.put(item, "Discount");
            map.put(amount, -1 * discountAmount);
            map.put(stanzaLineId, lineId);
            return map;
        }
        return null;
    }

    private Map<String, Object> createLineItemMap(FilixInvoiceDto invoice, String serviceName, double nonGstInvoiceAmount, int lineId , double taxAmount, double taxRate, String taxlocation) {
        Map<String, Object> map = new HashMap<>();
        if(null == invoice.getFromDate() && null == invoice.getToDate()) {
            map.put(item, "Maintenance Charges");
        }else {
            map.put(item, "Damage");
        }
        map.put(quantity, 1);
        map.put(rate, nonGstInvoiceAmount);
        map.put(amount, nonGstInvoiceAmount);
        map.put(hsnCode,"");
        map.put(stanzaLineId, lineId);
        map.put(taxlocationtype, taxlocation);
        map.put(taxrate, taxRate);
        map.put(taxamount, taxAmount);


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