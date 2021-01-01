package com.stanzaliving.payment.constants;

public interface PaytmConstants {

	// Paytm end urls
	String PAYTM_INITIATE_TRANSACTION_END_URL = "/initiateTransaction";

	String PAYTM_INITIATE_TRANSACTION_CALLBACK_URL = "/status/";
	
	String PAYTM_TRANSACTION_STATUS_END_URL = "/order/status";
	
	String PAYTM_REFUND_API_END_URL = "/refund/apply";

	// Paytm attributes
	String CURRENCY="INR";
	
	String REQUEST_TYPE = "Payment";
	
	String INIT_TRANS_API_VERSION = "v1";	
	
	String TRANS_STATUS_API_VERSION = "v1";	
	
	String WEB_WEBSITE = "WEBSTAGING";

	String APP_WEBSITE = "APPSTAGING";

	String WEB_CHANNEL = "WEB";

	String APP_CHANNEL = "WAP";

	String PAYMENT_INDUSTRY = "Retail";
	
	String INITIATE_TRANSACTION_RESULT_STATUS_SUCCESS = "S";

	String INITIATE_TRANSACTION_RESULT_STATUS_FAILURE = "F";

	String INITIATE_TRANSACTION_RESULT_STATUS_SYSTEM_EROOR = "U";
	
	String ACCEPT_REFUND_WEBHOOK_SUCCESS_STATUS = "SUCCESS";
	
	String ACCEPT_REFUND_WEBHOOK_FAILED_STATUS = "FAILED";

	String TXN_SUCCESS = "TXN_SUCCESS";

	String TXN_FAILURE = "TXN_FAILURE";
	
	String PENDING = "PENDING";
	
	String REFUND_TXN_TYPE = "REFUND";

}
