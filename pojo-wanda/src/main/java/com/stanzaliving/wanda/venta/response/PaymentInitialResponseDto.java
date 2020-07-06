package com.stanzaliving.wanda.venta.response;

import java.time.LocalDate;

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
	
	private Double securityDeposit;
	
	private Double maintenanceAmount;

	private Double advanceRent;
	
	private Double totalAmount;
	
	private Integer advanceRentMonths;
	
	private Double minimumAmount;
	
	private LocalDate contractStartDate;
}
