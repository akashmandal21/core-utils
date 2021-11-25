package com.stanzaliving.filixIntegration;


import org.springframework.stereotype.Component;





@Component
public class AsyncCustomerApi {

//    private Logger logger = LoggerFactory.getLogger(AsyncCustomerApi.class);
//
//    private final CustomerCreationApiService customerCreationApiService;
//
//    private final CustomerPaymentApiService customerPaymentApiService;
//
//    private final CustomerInvoiceApiService customerInvoiceApiService;
//
//    private final CustomerDepositApiService customerDepositApiService;
//    @Autowired
//    CustomerCreditMemoApiService customerCreditMemoApiService;
//
//    ObjectMapper objectMapper = new ObjectMapper();
//
//    public AsyncCustomerApi(CustomerCreationApiService customerCreationApiService, CustomerPaymentApiService customerPaymentApiService, CustomerInvoiceApiService customerInvoiceApiService,CustomerDepositApiService customerDepositApiService) {
//        this.customerCreationApiService = customerCreationApiService;
//        this.customerPaymentApiService = customerPaymentApiService;
//        this.customerInvoiceApiService = customerInvoiceApiService;
//        this.customerDepositApiService = customerDepositApiService;
//    }
//
//
//    public CustomerApiFactory getApi(CustomerApiEnum api) {
//        switch(api) {
//            case  CUSTOMER_INVOICE:
//                return customerInvoiceApiService;
//            case  CUSTOMER_DEPOSIT:
//                return customerDepositApiService;
//            case  CUSTOMER_CREDIT_MEMO:
//                return customerCreditMemoApiService;
//        }
//        return null;
//    }
//
//
//    public void produceKafkaPacketForApi(KafkaDTO kafkaDTO) {
//
//        CustomerApiEnum api = CustomerApiEnum.valueOf((String)kafkaDTO.getType());
//        CustomerApiActionEnum action =CustomerApiActionEnum.valueOf((String)kafkaDTO.getSubType());
//        Map<Object, Object> dataMap = (Map) kafkaDTO.getData();
//        try {
//            logger.info("dataMap {} ", dataMap.toString());
//            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//            CustomerApiDto customerApiDto = objectMapper.readValue(dataMap.get("data").toString(), CustomerApiDto.class);
//            logger.info("customerApiDto {} ", customerApiDto.toString());
//
//        } catch (IOException e) {
//            logger.info("Exception occurred ",e.getStackTrace());
//        }
//
//        logger.info("not a test data ");
//        switch(action) {
//            case CREATE :
//                getApi(api).produceOnKafkaForCreate(dataMap);
//                break;
//            case UPDATE :
//                getApi(api).produceOnKafkaForUpdate(dataMap);
//                break;
//        }
//    }
//
}
