package com.stanzaliving.core.payment.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PreBookingRefoundDto {

	private String mobileNo;
	private String paymentId;
	private String refundRequestId;
	private String refundInitiatedBy;
}
