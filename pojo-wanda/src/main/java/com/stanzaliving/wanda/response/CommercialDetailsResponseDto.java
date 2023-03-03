package com.stanzaliving.wanda.response;

import com.stanzaliving.booking.enums.BookingType;
import com.stanzaliving.booking.enums.ResidenceAgreementType;
import com.stanzaliving.wanda.dtos.MonthlyFee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
public class CommercialDetailsResponseDto {

	private String moveInDate;
	
	private BookingType bookingType;
	
	private String moveInDateStr;
	
	private String moveInDateText;
	
	private String contractStartDate;

	private String contractStartDateText;
	
	private String contractEndDateText;
	
	private String contractPeriod;
	
	private String contractPeriodText;

	private int contractId;
	
	private MonthlyFee monthlyFeeDto;
	
	private String monthlyFeeText;
	
	private String securityDeposit;
	
	private String securityDepositText;
	
	private String maintenanceFee;
	
	private String maintenanceFeeText;

	private String advanceFee;
	
	private String advanceFeeText;
	
	private String advanceFeeDescription;
	
	private String lockInPeriod;
	
	private String lockInPeriodText;
	
	private String maxDate;
	
	private String instalmentType;

	private Integer maintenanceFeeSelectionId;

	private Boolean maintenanceFeeEditable;
	
    private String subContract1StartDate; //add
	 
	 private String subContract1EndDateText; //add
	 
	private String subContract1ContractPeriod; //add
	
	private String subContract2ContractPeriod; //add
	
	private String subContract2EndDateText; //add
	
	private String subContract2StartDate; //add
	
	 private MonthlyFee subContract2MonthlyFee; //add

	private String onboardingCharges;

	private String onboardingChargesText;

	private String onboardingChargesDescription;

	@Builder.Default
	private ResidenceAgreementType residenceAgreementType = ResidenceAgreementType.LEASE_DEED;

	private Boolean priceStrategyEnabled;
	
}