package com.stanzaliving.payment.dto;

import lombok.Data;

/**
 * @author raj.kumar
 *
 */

@Data
public class PaymentPayloadDto {

	 private String orderId;
	 private Double amount;
	 private String phoneNumber;
	 private String status;
	 private String userId;
	 private String userType;
	 private String bookingId;
	 private String paymentSource;
	 private String paymentMode;

}