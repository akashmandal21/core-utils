package com.stanzaliving.filixIntegration;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.core.base.enums.DateFormat;
import com.stanzaliving.core.base.utils.DateUtil;
import com.stanzaliving.core.kafka.dto.KafkaDTO;
import com.stanzaliving.core.kafka.producer.NotificationProducer;
import com.stanzaliving.core.payment.enums.PaymentMode;
import com.stanzaliving.filixIntegration.Dto.AbstractOracleDto;
import com.stanzaliving.filixIntegration.Dto.CustomerApiDto;
import com.stanzaliving.filixIntegration.Dto.FilixTransactionDto;
import com.stanzaliving.filixIntegration.Enum.EventType;
import com.stanzaliving.filixIntegration.Enum.OracleServiceOwner;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Log4j2
@Service
@Transactional
public class CustomerDepositApiService extends CustomerApiFactory {

    @Value("venta-integration")
    private String oracleIntegrationTopic;

    @Autowired
    NotificationProducer notificationProducer;

    @Autowired
    private  ObjectMapper objectMapper;

    @Override
    public void produceOnKafkaForCreate(Map<Object, Object> dataMap) {
        log.info("In CustomerDepositApiService packet received {} ",dataMap.toString());
        AbstractOracleDto abstractOracleDto = new AbstractOracleDto();
        abstractOracleDto.setContextArgs(getPayloadForDeposit(dataMap));
        abstractOracleDto.setEventType(EventType.CREATE);
        abstractOracleDto.setServiceOwner(OracleServiceOwner.CUSTOMER_DEPOSIT);
        log.info("In CustomerDepositApiService packet to produce {} ", abstractOracleDto);
        notificationProducer.publish(oracleIntegrationTopic,"student",new KafkaDTO("filix-integration", "deposit", AbstractOracleDto.class.getName(), abstractOracleDto));

    }


    @Override
    public void produceOnKafkaForUpdate(Map<Object, Object> dataMap) {

        AbstractOracleDto abstractOracleDto = new AbstractOracleDto();
        abstractOracleDto.setContextArgs(getPayloadForDeposit(dataMap));
        abstractOracleDto.setEventType(EventType.UPDATE);
        abstractOracleDto.setServiceOwner(OracleServiceOwner.CUSTOMER_DEPOSIT);
        notificationProducer.publish(oracleIntegrationTopic,"student",new KafkaDTO("filix-integration", "deposit", AbstractOracleDto.class.getName(), abstractOracleDto));

    }

    private Map<String, Object> getPayloadForDeposit(Map<Object, Object> dataMap) {

        Map<String, Object> mapToSend = new HashMap<>();
        try {
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            CustomerApiDto customerApiDto = objectMapper.readValue(dataMap.get("data").toString(), CustomerApiDto.class);
            if(null != customerApiDto && null != customerApiDto.getFilixTransactionDto() ) {
                FilixTransactionDto filixTransactionDto = customerApiDto.getFilixTransactionDto();
                log.info("filixTransactionDto {} ", filixTransactionDto);
                mapToSend.put(FundType, Boolean.FALSE);
                mapToSend.put(account, "730309");
                mapToSend.put(stanzaId,filixTransactionDto.getServiceTransactionId());
                mapToSend.put(date,DateUtil.customDateFormatter(new Date(), DateFormat.DD_MM_YYYY));
                mapToSend.put(exchangeRate, 1.00);
                mapToSend.put(currency, "INR");
                mapToSend.put(customer, Objects.isNull(filixTransactionDto.getUserId())?"": filixTransactionDto.getUserId());
                mapToSend.put(class_str, "");
                mapToSend.put(department, "");
                mapToSend.put(memo, "SD Deposit");
                mapToSend.put(bookingId,"");
                mapToSend.put(merchantTransactionId, filixTransactionDto.getMerchantTransactionId());
                mapToSend.put(gatewayTransactionId,filixTransactionDto.getServiceTransactionId());
                mapToSend.put(paymentOption,filixTransactionDto.getPaymentMode().getPaymentModeDesc());
                mapToSend.put(chequenumber,"");
                mapToSend.put(undepositFunds, Boolean.FALSE);
                mapToSend.put(payment,filixTransactionDto.getAmount());
                mapToSend.put(extraFields,getExtraFields(filixTransactionDto));
            }
        } catch (IOException e) {
            log.error("Error occurred in getPayloadForDeposit {}", e);
        }

        return mapToSend;
    }

    private Map<String, Object> getExtraFields(FilixTransactionDto filixTransactionDto) {
        Map<String, Object> map = new HashMap<>();
        map.put(residenceName,"");
        return map;
    }

    private String FundType= "FundType";
    private String account="account";
    private String stanzaId="stanzaId";
    private String date="date";
    private String exchangeRate="exchangeRate";
    private String currency="currency";
    private String customer="customer";
    private String location ="location";
    private String memo="memo";
    private String bookingId="bookingId";
    private String merchantTransactionId="merchantTransactionId";
    private String gatewayTransactionId="gatewayTransactionId";
    private String paymentOption="paymentOption";
    private String chequenumber= "chequenumber";
    private String payment="payment";
    private String undepositFunds="undepositFunds";
    private String extraFields="extraFields";
    private String residenceName="residenceName";
    private String class_str="class_str";
    private String department="department";
    private String razorpayAccount = "720201";
    private String paytmAccount = "720203";
    private String cashAccount = "720204";
    private String chequeAccount = "720205";
    private String virtualAccount = "720206";
    private String url = "https://5742638-sb1.restlets.api.netsuite.com/app/site/hosting/restlet.nl?script=435&deploy=1";


}
