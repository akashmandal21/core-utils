package com.stanzaliving.wanda.response;

import com.stanzaliving.wanda.venta.response.MonthlyFeeDto;

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
	
	private String moveInDateStr;
	
	private String moveInDateText;
	
	private String contractStartDate;

	private String contractStartDateText;
	
	private String contractPeriod;
	
	private String contractPeriodText;

	private int contractId;
	
	private MonthlyFeeDto monthlyFeeDto;
	
	private String monthlyFeeText;
	
	private String securityDeposit;
	
	private String securityDepositText;
	
	private String maintenanceFee;
	
	private String maintenanceFeeText;

	private String advanceFee;
	
	private String advanceFeeText;
	
	private String advanceFeeDescription;
	
}