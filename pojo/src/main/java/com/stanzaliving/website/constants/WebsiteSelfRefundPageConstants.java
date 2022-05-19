package com.stanzaliving.website.constants;

import lombok.experimental.UtilityClass;

@UtilityClass
public class WebsiteSelfRefundPageConstants {
	
	public final int REFUND_REMAINING_WAITING_PERIOD_DAYS_COUNT = 14;

	public final String SELF_REFUND_REQUEST_NOT_RAISED_MESSAGE = "You haven’t raised any request for a refund for:";

	public final String ZERO_PREBOOKING_TRANSACTION_FOUND_MESSAGE = "We didn’t find any reservation under your name."
			+ System.lineSeparator()
			+ "Don’t worry, it’s not too late. Explore our residences and reserve the one you like";

	public final String PREBOOKING_AMOUNT_ADJUSTED_IN_BOOKING_MESSAGE = "The pre-booking amount you're requesting for refund has already been adjusted in your confirmed booking.";

	public final String SELF_REFUND_REQUEST_ALREADY_RAISED_MESSAGE = "Your refund request already exists (Reference Number: %s)."
			+ System.lineSeparator() + "The amount will reach your account within the next %s days.";

	public final String SELF_REFUND_REQUEST_FAILED_MESSAGE = "Something went wrong. We are re-initiating your refund request and you'll receive the amount within the next %s days.";

	public final String REFUND_SUCCESS_MESSAGE = "Refund successfully processed and the amount will reflect in your account in %s days";
	
	public final String REFUND_SUCCESS_MESSAGE_AFTER_REMAINING_DAYS_OVER = "Refund successfully processed.";
	
	public final String CONTACT_STANZA_SUPPORT_MESSAGE = "Please contact stanza support team at operations@stanzaliving.com";

	public final String REFUND_INITIATED_MESSAGE = "Refund initiated successfully and you'll receive the amount within the next %s days.";

	public final String REFUND_PENDING_POST_REMAINING_DAYS_OVER = "Your refund request is still in process. Please write to us at operations@stanzaliving.com for further assistance.";

}
