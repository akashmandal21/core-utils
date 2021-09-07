package com.stanzaliving.filixIntegration;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.core.base.utils.DateUtil;
import com.stanzaliving.core.kafka.dto.KafkaDTO;
import com.stanzaliving.core.kafka.producer.NotificationProducer;
import com.stanzaliving.core.payment.enums.PaymentMode;
import com.stanzaliving.filixIntegration.Dto.AbstractOracleDto;
import com.stanzaliving.filixIntegration.Dto.CustomerApiDto;
import com.stanzaliving.filixIntegration.Dto.FilixPaymentTransactionRequestDto;
import com.stanzaliving.filixIntegration.Enum.EventType;
import com.stanzaliving.filixIntegration.Enum.OracleServiceOwner;
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
public class CustomerPaymentApiService extends CustomerApiFactory{
    private static final Logger logger = LoggerFactory.getLogger(CustomerPaymentApiService.class);

    private static ObjectMapper objectMapper;
    @Autowired
    NotificationProducer notificationProducer;

    static {
        objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }


    @Value("venta-integration")
    private String oracleIntegrationTopic;

    @Override
    public void produceOnKafkaForCreate(Map<Object, Object> dataMap) {
        logger.info("In CustomerPaymentApiService packet received {} ",dataMap.toString());
        AbstractOracleDto abstractOracleDto = new AbstractOracleDto();
        abstractOracleDto.setContextArgs(getPayloadForPayment(dataMap));
        abstractOracleDto.setEventType(EventType.CREATE);
        abstractOracleDto.setServiceOwner(OracleServiceOwner.CUSTOMER_PAYMENT);
        logger.info("In CustomerPaymentApiService packet to produce {} ", abstractOracleDto);
        notificationProducer.publish(oracleIntegrationTopic,"student",new KafkaDTO("filix-integration", "student", AbstractOracleDto.class.getName(), abstractOracleDto));
    }

    @Override
    public void produceOnKafkaForUpdate(Map<Object, Object> dataMap) {
        AbstractOracleDto abstractOracleDto = new AbstractOracleDto();
        abstractOracleDto.setContextArgs(getPayloadForWriteOffPayment(dataMap));
        abstractOracleDto.setEventType(EventType.UPDATE);
        abstractOracleDto.setServiceOwner(OracleServiceOwner.CUSTOMER_PAYMENT);
        notificationProducer.publish(oracleIntegrationTopic,"student",new KafkaDTO("filix-integration", "student", AbstractOracleDto.class.getName(), abstractOracleDto));

    }


    private Map<String, Object> getPayloadForWriteOffPayment(Map<Object, Object> dataMap) {
        Map<String, Object> mapToSend = new HashMap<>();
        try {

            CustomerApiDto customerApiDto = objectMapper.readValue(dataMap.get("data").toString(), CustomerApiDto.class);
            if(null != customerApiDto && null != customerApiDto.getFilixPaymentTransactionRequestDto()) {
                FilixPaymentTransactionRequestDto transaction = customerApiDto.getFilixPaymentTransactionRequestDto();
                mapToSend.put(Stanzaid, String.valueOf(transaction.getTransactionId()));
                mapToSend.put(writeOff, Boolean.TRUE);
                mapToSend.put(writeoffDate, DateUtil.convertDateToString(new Date(), DateUtil.dd_MMM_yyyy_Slash_Format));
            }
        }
        catch (IOException e) {
            logger.error("Error occurred in getPayloadForPayment {}", e);
        }

        return mapToSend;

    }

    private Map<String, Object> getPayloadForPayment(Map<Object, Object> dataMap) {

        Map<String, Object> mapToSend = new HashMap<>();
        try {

            CustomerApiDto customerApiDto = objectMapper.readValue(dataMap.get("data").toString(), CustomerApiDto.class);
            if(null != customerApiDto  &&  ((null != customerApiDto.getFilixPaymentTransactionRequestDto() ) )) {
                mapToSend.put(FundType, Boolean.FALSE);
                mapToSend.put(exchangeRate, 1.00);
                mapToSend.put(currency, "INR");
                mapToSend.put(autoApply, Boolean.TRUE);
                mapToSend.put(class_str ,"");
                mapToSend.put(department, "");
                mapToSend.put(memo ,"Customer payment");
//TODO: "0 < customerApiDto.getSdAdjusted()" chnge if condition
                if(null != customerApiDto) {
                    FilixPaymentTransactionRequestDto transaction = customerApiDto.getFilixPaymentTransactionRequestDto();

                    mapToSend.put(account, getAccount(transaction.getPaymentMode()));
                    mapToSend.put(stanzaId, "");//pending
                    mapToSend.put(date, DateUtil.convertDateToString(new Date(), DateUtil.dd_MMM_yyyy_Slash_Format));
                    mapToSend.put(bookingid,transaction.getTransactionId());
                    mapToSend.put(customer, "");
                    mapToSend.put(paymentOption,transaction.getPaymentMode().getPaymentModeDesc());
                    mapToSend.put(applyDeposit,"");
                    mapToSend.put(paymentAmount, transaction.getAmount());
                    mapToSend.put(extraFields,"");

                }
            }
        } catch (IOException e) {
            logger.error("Error occurred in getPayloadForPayment {}", e);
        }

        return mapToSend;
    }

    private String getAccount(PaymentMode paymentMode) {
        switch (paymentMode.getPaymentModeDesc()) {
            case "Cash" : return cashAccount;
            case "Cheque" : return chequeAccount;
            case "Netbanking" : return razorpayAccount;
            case "QR Code" : return virtualAccount;
            case "Virtual Account" : return virtualAccount;
            case "PAYTM" : return paytmAccount;

        }
        return "100001";
    }

    private String FundType = "FundType"; //If the payment is deposited in a bank, this value will be false. If the payment remains undeposted ,this value will be true.
    private String account = "account"; //Stanza Bank account where this payment will be received
    private String stanzaId = "stanzaId"; //receipt id
    private String date = "date";
    private String bookingid = "bookingid";
    private String exchangeRate = "exchangeRate";
    private String currency = "currency";
    private String customer = "customer";
    private String paymentOption = "paymentOption";
    private String applyDeposit = "applyDeposit";
    private String paymentAmount = "paymentAmount";
    private String autoApply = "autoApply";
    private String Stanzaid = "Stanzaid";
    private String writeOff = "Writeoff";
    private String writeoffDate = "WriteoffDate";
    private String razorpayAccount = "720201";
    private String paytmAccount = "720203";
    private String cashAccount = "720204";
    private String chequeAccount = "720205";
    private String virtualAccount = "720206";
    private String extraFields="extraFields";
    private String residenceName="residenceName";
    private String depositRefNumber="depositRefNumber";
    private String debitPaymentRate="debitPaymentRate";
    private String class_str = "class";
    private String department = "department";
    private String memo = "memo";
    private String url = "https://5742638-sb1.restlets.api.netsuite.com/app/site/hosting/restlet.nl?script=450&deploy=1";

}
