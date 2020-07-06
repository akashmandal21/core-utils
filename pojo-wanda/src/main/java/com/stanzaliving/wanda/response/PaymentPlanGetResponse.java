package com.stanzaliving.wanda.response;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class PaymentPlanGetResponse {

	private String bookingId;
	
	private String installmentType;
	
	private String couponCode;
	
	private String couponCodeText;
	
	private double securityDeposit;
	
	private double maintenanceAmount;

	private double advanceRent;
	
	private double totalAmount;
	
	private String advanceRentMonths;
	
	private double minimumAmount;
	
	private String payAmountText;
}
