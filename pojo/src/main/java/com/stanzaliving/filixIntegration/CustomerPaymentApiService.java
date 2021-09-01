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


    @Value("oracle_integration_venta")
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
//                    Double sdAdjusted = customerApiDto.getSdAdjusted();
//		    		Transaction transaction = transactionService.findByStatusAndType(booking.getBookingId(), Constants.COMPLETED, "BOOKING");
//		    		mapToSend.put(account, "100001"); //pending
                    mapToSend.put(account, getAccount(transaction.getPaymentMode()));
                    mapToSend.put(stanzaId, "invoice_adjustment_"+"booking.getBookingId()");//pending
                    mapToSend.put(date, DateUtil.convertDateToString(new Date(), DateUtil.dd_MMM_yyyy_Slash_Format));
                    mapToSend.put(bookingid, "String.valueOf(booking.getBookingId())");
                    mapToSend.put(customer, "booking.getStudent().getStudentId()");
                    mapToSend.put(paymentOption, "");
                    mapToSend.put(applyDeposit, "getApplyDeposit(sdAdjusted, booking)");
                    mapToSend.put(paymentAmount, 0);
                    mapToSend.put(extraFields,"getExtraFields(booking.getStudent().getStudentId()");

                }else {
                    FilixPaymentTransactionRequestDto transaction = customerApiDto.getFilixPaymentTransactionRequestDto();
//                    FilixIntegrationStudentDto student = customerApiDto.getStudent();
//		        	mapToSend.put(account, "100001");
                    mapToSend.put(account, getAccount(transaction.getPaymentMode()));
                    mapToSend.put(stanzaId, String.valueOf(transaction.getTransactionId()));
                    mapToSend.put(date, "DateUtil.convertDateToString(transaction.getCompletionDate(), DateUtil.dd_MMM_yyyy_Slash_Format)");
                    mapToSend.put(bookingid, "String.valueOf(transaction.getBookingId())");
                    mapToSend.put(customer, "student.getStudentId()");
                    mapToSend.put(paymentOption, transaction.getPaymentMode().getPaymentModeDesc());
                    mapToSend.put(paymentAmount, transaction.getAmount());
                    mapToSend.put(extraFields,"getExtraFields(student.getStudentId())");
                }
            }
        } catch (IOException e) {
            logger.error("Error occurred in getPayloadForPayment {}", e);
        }

        return mapToSend;
    }

//    private List<Map<String, Object>> getApplyDeposit(Double sdAdjusted, FilixIntegrationBookingDto booking) {
//        boolean isWpBooking = BookingUtil.isWpBooking(booking.getBookingType());
//        Invoice invoice = invoiceService.fetchByInvoiceTypeAndBookingId(isWpBooking ? InvoiceType.SECURITY_DEPOSIT : InvoiceType.BOOKING, booking.getBookingId());
//        List<Map> securityLedgers = securityLedgerDao.findNarrationByBookingIds(Arrays.asList(booking.getBookingId()));
//        Map securityLedger = securityLedgers.get(0);
//        String narration = (String) securityLedger.get("narration");
//        Integer transactionId =  Integer.valueOf(narration.replace("Corresponding to transactionId ", ""));
//
//        List<Map<String, Object>> applyDeposit = new ArrayList();
//        Map<String, Object> map = new HashMap<>();
//        map.put(depositRefNumber, transactionId);
//        map.put(debitPaymentRate, sdAdjusted);
//        applyDeposit.add(map);
//        return applyDeposit;
//    }
//
//    private Map<String, Object> getExtraFields(String studentId) {
//        Map<String, Object> map = new HashMap<>();
//        map.put(residenceName,residenceDao.getResidenceNameFromStudentId(studentId));
//        return map;
//    }

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
