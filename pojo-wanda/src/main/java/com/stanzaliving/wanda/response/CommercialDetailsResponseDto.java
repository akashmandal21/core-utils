package com.stanzaliving.wanda.response;

import java.util.List;

import com.stanzaliving.wanda.dtos.MonthlyFee;
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
	
	private String subContract2ContractPeriod;
	
	private String subContract2ContractEndDateText;
	
	private String subContract2StartDate;
	
	 private MonthlyFee subContract2MonthlyFee;
}