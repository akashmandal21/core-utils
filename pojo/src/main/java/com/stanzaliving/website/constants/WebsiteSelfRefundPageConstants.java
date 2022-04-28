package com.stanzaliving.website.constants;

import lombok.experimental.UtilityClass;

@UtilityClass
public class WebsiteSelfRefundPageConstants {

	public final String SELF_REFUND_REQUEST_NOT_RAISED_MESSAGE = "You haven’t raised any request for a refund for:";

	public final String ZERO_PREBOOKING_TRANSACTION_FOUND_MESSAGE = "No bookings found in your name."
			+ System.lineSeparator()
			+ "Don't worry, it's not too late. Initiate the pre-booking process by clicking here.";

	public final String PREBOOKING_AMOUNT_ADJUSTED_IN_BOOKING_MESSAGE = "The pre-booking amount you're requesting for refund has already been adjusted in your confirmed booking.";

	public final String SELF_REFUND_REQUEST_ALREADY_RAISED_MESSAGE = "Your refund request already exists (Reference Number: 00000)."
			+ System.lineSeparator() + "The amount will reach your account within the next 14 days.";

	public final String SELF_REFUND_REQUEST_FAILED_MESSAGE = "Something went wrong. We are re-initiating your refund request and you'll receive the amount within the next 14 days.";

	public final String REFUND_SUCCESS_MESSAGE = "Refund successfully processed and the amount will reflect in your account in 14 days";
	
	public final String CONTACT_STANZA_SUPPORT_MESSAGE = "Please contact stanza support team at operations@stanzaliving.com";

	public final String REFUND_INITIATED_MESSAGE = "Refund initiated successfully and you'll receive the amount within the next 14 days.";

	public final String REFUND_PENDING_POST_14_DAYS = "Your refund request is still in process. Please write to us at operations@stanzaliving.com for further assistance.";

}
