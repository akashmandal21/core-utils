package com.stanzaliving.core.payment.dto;

import com.stanzaliving.core.payment.enums.PaymentStatus;
import com.stanzaliving.core.user.enums.UserType;

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
public class PaymentDto {
	private String uuid;
	private String userId;
	private String userType;
	private PaymentStatus paymentStatus;
	
}
