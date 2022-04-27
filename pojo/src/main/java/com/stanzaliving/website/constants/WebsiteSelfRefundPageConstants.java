package com.stanzaliving.website.constants;

import lombok.experimental.UtilityClass;

@UtilityClass
public class WebsiteSelfRefundPageConstants {

	public final String SELF_REFUND_REQUEST_NOT_RAISED_MESSAGE = "You haven't raised any request for refund";
	public final String ZERO_PREBOOKING_TRANSACTION_FOUND_MESSAGE = "You haven't prebooked yet";
	public final String PREBOOKING_AMOUNT_ADJUSTED_IN_BOOKING_MESSAGE = "You do not have any pre-booking transaction available for refund as its already has been adjusted in your booking";
	public final String SELF_REFUND_REQUEST_ALREADY_RAISED_MESSAGE = "You have already raised a refund request against your prebooking transaction and the amount will reflect in your account in 14 days";
	public final String SELF_REFUND_REQUEST_FAILED_MESSAGE = "Unfortunately, your refund request was failed. We've initiatied another refund request. You'll receive the amount in 14 working days.";

	public final String REFUND_SUCCESS_MESSAGE = "Refund successfully processed and the amount will reflect in your account in 14 days";
	public final String CONTACT_STANZA_SUPPORT_MESSAGE = "Please contact stanza support team at operations@stanzaliving.com";
	
	public final String REFUND_INITIATED_MESSAGE = "Refund initiated successfully";

}
