package com.stanzaliving.filixIntegration;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.core.base.utils.DateUtil;
import com.stanzaliving.core.kafka.dto.KafkaDTO;
import com.stanzaliving.core.kafka.producer.NotificationProducer;
import com.stanzaliving.filixIntegration.Dto.AbstractOracleDto;
import com.stanzaliving.filixIntegration.Dto.CustomerApiDto;
import com.stanzaliving.filixIntegration.Dto.FilixInvoiceDto;
import com.stanzaliving.filixIntegration.Dto.FilixInvoiceLineItems;
import com.stanzaliving.filixIntegration.Enum.EventType;
import com.stanzaliving.filixIntegration.Enum.OracleServiceOwner;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.*;

@Service
@Transactional
public class CustomerCreditMemoApiService extends CustomerApiFactory {

    private static final Logger logger = LoggerFactory.getLogger(CustomerCreditMemoApiService.class);

    ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    NotificationProducer notificationProducer;

    @Value("venta-integration")
    private String oracleIntegrationTopic;

    @Override
    public void produceOnKafkaForCreate(Map<Object, Object> dataMap) {
        logger.info("In CustomerCreditMemoApiService packet received {} ",dataMap.toString());
        AbstractOracleDto abstractOracleDto = new AbstractOracleDto();
        abstractOracleDto.setContextArgs(getPayloadForCreditMemo(dataMap));
        abstractOracleDto.setEventType(EventType.CREATE);
        abstractOracleDto.setServiceOwner(OracleServiceOwner.CUSTOMER_CREDIT_MEMO);
        logger.info("In CustomerCreditMemoApiService packet to produce {} ", abstractOracleDto);
        notificationProducer.publish(oracleIntegrationTopic,"student",new KafkaDTO("filix-integration", "student", AbstractOracleDto.class.getName(), abstractOracleDto));
    }

    @Override
    public void produceOnKafkaForUpdate(Map<Object, Object> dataMap) {
        AbstractOracleDto abstractOracleDto = new AbstractOracleDto();
        abstractOracleDto.setContextArgs(getPayloadForCreditMemo(dataMap));
        abstractOracleDto.setEventType(EventType.UPDATE);
        abstractOracleDto.setServiceOwner(OracleServiceOwner.CUSTOMER_CREDIT_MEMO);
        notificationProducer.publish(oracleIntegrationTopic,"student",new KafkaDTO("filix-integration", "student", AbstractOracleDto.class.getName(), abstractOracleDto));

    }
    private Map<String, Object> getPayloadForCreditMemo(Map<Object, Object> dataMap) {

        Map<String, Object> mapToSend = new HashMap<>();
        try {
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            CustomerApiDto customerApiDto = objectMapper.readValue(dataMap.get("data").toString(), CustomerApiDto.class);
            if(null != customerApiDto && null != customerApiDto.getFilixInvoiceDto()) {
                FilixInvoiceDto creditNote = customerApiDto.getFilixInvoiceDto();
                FilixInvoiceLineItems lineItems =customerApiDto.getFilixInvoiceLineItems() ;
                //confirm
                mapToSend.put(stanzaId, String.valueOf(creditNote.getReferenceUuid()));
                mapToSend.put(date, DateUtil.convertDateToString(DateUtil.convertToDate(creditNote.getIssueDate()), DateUtil.dd_MMM_yyyy_Slash_Format));
                mapToSend.put(startDate, DateUtil.convertDateToString(DateUtil.convertToDate(creditNote.getFromDate()), DateUtil.dd_MMM_yyyy_Slash_Format));
                mapToSend.put(endDate, DateUtil.convertDateToString(DateUtil.convertToDate(creditNote.getToDate()), DateUtil.dd_MMM_yyyy_Slash_Format));
                mapToSend.put(classString, "");
                mapToSend.put(department, "");
                mapToSend.put(customer,creditNote.getResidentId());
                mapToSend.put(exchangerate, 1.00);
                mapToSend.put(currency, "INR");
                mapToSend.put(po_hash, "");
                mapToSend.put(memo, "");
                mapToSend.put(autoapply, Boolean.FALSE);
                mapToSend.put(billingState,"");
                mapToSend.put(billingCountry, "India");
                mapToSend.put(bookingId,creditNote.getReferenceUuid());
                mapToSend.put(itemList,lineItems);
                mapToSend.put(autoApplyList, getAutoApplyList(creditNote));
                mapToSend.put(extraFields,getExtraFields(creditNote));
            }
        }
        catch (IOException e) {
            logger.error("Error occurred in getPayloadForCreditMemo {}", e);
        }
        return mapToSend;
    }



    private Object getAutoApplyList(FilixInvoiceDto creditNote) {
        List<Map<String, Object>> lineItems = new ArrayList();
        Map<String, Object> map = new HashMap<>();
        map.put(invoiceNum, String.valueOf(creditNote.getUuid()));
        map.put(paymentAmount, creditNote.getTotalAmount());
        lineItems.add(map);
        return lineItems;
    }

    private Map<String, Object> getExtraFields(FilixInvoiceDto invoice) {
        Map<String, Object> map = new HashMap<>();
        map.put(residenceName,"");
        return map;
    }

    private String stanzaId="stanzaId";
    private String tranid ="tranid";
    private String date="date";
    private String startDate="startDate";
    private String endDate="endDate";
    private String classString="class";
    private String department="department";
    private String customer="customer";
    private String location="location";
    private String exchangerate="exchangerate";
    private String currency="currency";
    private String memo="memo";
    private String autoapply="autoapply";
    private String billingState="billingState";
    private String billingCountry="billingCountry";
    private String bookingId="bookingId";
    private String item="item";
    private String itemList="itemList";
    private String quantity="quantity";
    private String itemRate="itemRate";
    private String hsnCode="hsnCode";
    private String stanzaLineId="stanzaLineId";
    private String taxlocationtype="taxlocationtype";
    private String amount="amount";
    private String taxamount="taxamount";
    private String taxrate="taxrate";
    private String autoApplyList="autoApplyList";
    private String invoiceNum="invoiceNum";
    private String paymentAmount="paymentAmount";
    private String extraFields="extraFields";
    private String residenceName="residenceName";
    private String po_hash="po_hash";
    private String method = "HttpMethod";
    private String url_string = "url";
    private String url = "https://5742638-sb1.restlets.api.netsuite.com/app/site/hosting/restlet.nl?script=452&deploy=1";
}
