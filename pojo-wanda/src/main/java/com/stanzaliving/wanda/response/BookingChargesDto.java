package com.stanzaliving.wanda.response;

import java.util.Map;

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
public class BookingChargesDto {

	private String bookingId;
	
	private String installmentType;
	
	private String couponCode;
	
	private String couponCodeText;
	
	private Double securityDeposit;
	
	private Double maintenanceAmount;

	private Double advanceRent;
	
	private Double totalAmount;
	
	private String advanceRentMonths;
	
	private Double totalDiscount;
	
	private Double minimumAmount;
	
	private String payAmountText;
	
	private Map<String, String> charges;
}
