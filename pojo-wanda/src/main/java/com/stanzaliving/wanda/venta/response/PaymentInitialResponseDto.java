package com.stanzaliving.wanda.venta.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class PaymentInitialResponseDto {

	private String bookingId;
	
	private String installmentType;
	
	private DiscountResponseDto discountResponseDto;
	
	private double securityDeposit;
	
	private double maintenanceAmount;

	private double advanceRent;
	
	private double totalAmount;
	
	private int advanceRentMonths;
	
	private double minimumAmount;
	
	private double contractStartDate;
}
