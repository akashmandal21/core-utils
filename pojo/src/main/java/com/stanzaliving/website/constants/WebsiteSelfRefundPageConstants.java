package com.stanzaliving.website.constants;

import com.stanzaliving.booking.enums.BookingStatus;
import lombok.experimental.UtilityClass;

import java.util.Arrays;
import java.util.List;

@UtilityClass
public class WebsiteSelfRefundPageConstants {

	public final List<String> BOOKING_EXIST_PREBOOKING_NOT_ELIGIBLE_LIST = Arrays.asList(BookingStatus.AGREEMENT_PENDING.getBookingStatus(), BookingStatus.AGREEMENT_SENT.getBookingStatus(), BookingStatus.BOOKING_FORFEITURE.getBookingStatus(), BookingStatus.CANCELLED.getBookingStatus(), BookingStatus.CONTRACT_COMPLETED.getBookingStatus(), BookingStatus.CONTRACT_TERMINATED.getBookingStatus(), BookingStatus.ONBOARDING_COMPLETED.getBookingStatus(), BookingStatus.ONBOARDING_IN_PROGRESS.getBookingStatus(), BookingStatus.ONBOARDING_PENDING.getBookingStatus(), BookingStatus.PAYMENT_PENDING.getBookingStatus(), BookingStatus.RENT_DEFAULTER_PAID.getBookingStatus(), BookingStatus.RENT_DEFAULTER_UNPAID.getBookingStatus(), BookingStatus.SHARED_WITH_RESIDENT.getBookingStatus(), BookingStatus.STAY_FORFEITURE.getBookingStatus(), BookingStatus.TRESSPASSER.getBookingStatus());

	public final String BOOKING_EXIST_PREBOOKING_NOT_ELIGIBLE = "<div id=\"noBookingFound\" class=\"case-4\"><p><span class=\"font-medium\">Seems like you already have a booking with us.</span> Just head over to the Stanza Living Resident App and check the status of your refund.</p></div>";

	public final int REFUND_REMAINING_WAITING_PERIOD_DAYS_COUNT = 14;

	public final String SELF_REFUND_REQUEST_NOT_RAISED_MESSAGE = "Your booking is waiting to get finalized.";

	public final String ZERO_PREBOOKING_TRANSACTION_FOUND_MESSAGE = "<div id=\"noBookingFound\" class=\"case-4\"><p><span class=\"font-medium\">There's no transaction associated with this number… as yet.</span> Explore our residences to change that.</p></div>";

	public final String PREBOOKING_AMOUNT_ADJUSTED_IN_BOOKING_MESSAGE = "<div id=\"amountAdjusted\" class=\"case-3\"><p><span class=\"font-medium\">You do not have any transaction available for refund</span> as it already has been adjusted in your booking</p></div>";

	public final String SELF_REFUND_REQUEST_ALREADY_RAISED_MESSAGE = "<div id=\"refundRequested\" class=\"case-1\"><p><span class=\"font-medium\">We already have your request.</span></p><p>We understand that waiting is tough. But it takes up to %s working days for the amount to reflect in your account.</p></div>";

	public final String SELF_REFUND_REQUEST_FAILED_MESSAGE = "<div id=\"refundFailed\" class=\"case-2\"><p><span class=\"font-medium\">Unfortunately your refund request was failed.</span> We've initiated another refund request. You'll receive the amount in %s working days</p></div>";

	public final String REFUND_SUCCESS_MESSAGE = "Refund successfully processed and the amount will reflect in your account in %s days";
	
	public final String REFUND_SUCCESS_MESSAGE_AFTER_REMAINING_DAYS_OVER = "Refund successfully processed.";

	public final String CONTACT_STANZA_SUPPORT_MESSAGE = "Please contact stanza support team at operations@stanzaliving.com";

	public final String REFUND_INITIATED_MESSAGE = "Refund initiated successfully and you'll receive the amount within the next %s days.";

	public final String REFUND_PENDING_POST_REMAINING_DAYS_OVER = "Your refund request is still in process. Please write to us at operations@stanzaliving.com for further assistance.";

}
