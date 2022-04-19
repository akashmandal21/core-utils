package com.stanzaliving.wanda.response;

import java.util.List;
import java.util.Map;

import com.stanzaliving.booking.enums.PaymentTerm;
import com.stanzaliving.wanda.dtos.TransactionDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class BookingChargesDtoV2 {

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
	
	private String textForRemainingAmount;
	
	private List<TransactionDto> transactions;
	
	private Boolean bookingProceed;
	@Default
	private Double totalRemaingAmount=0.0d;
	
	private Double totalAmountPaid;
	
	private String totalAmountPaidStr;
	
	@Default
	private Double totalRemaingminimumAmount=0.0d;
	
	private String totalRemaingminimumAmountStr;
	
}
