package com.stanzaliving.website.response.dto;

import java.util.Date;

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
public class WebsitePrebookingPaymentRefundDetailsDto {

	private String residenceName;
	
	private String cityName;
	
	private Date prebookingDate;

	private String paymentUuid;
	
	private String phone;
	
	private double amount;
	
	private Date refundedOn;
}
