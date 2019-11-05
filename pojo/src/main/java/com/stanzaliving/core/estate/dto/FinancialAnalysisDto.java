package com.stanzaliving.core.estate.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FinancialAnalysisDto {

	private String monthlyRent;
	private String leaseDurationInYears;
	private String securityDepositMonthsOfRent;
	private String rentalInflationInYears;
	private String rentalInflationPercent;
	private String advanceRentMonthCount;
	private String amortizedPeriodInMonths;
	private String leaseLockInPeriodInYears;
	private String tokenDepositInRupees;
	private String rentFreePeriodInMonths;
	private String brokerageDays;
	private String financialCommets;
	private String buildingHandoverDate;
	private String rentStartDate;
	
	
	/*Broker Info*/	
	
	private BrokerDetailsDto brokerDetails;
	
	private List<CapexEstimationDto> capexEstimationDtos;
	
	private String comments1;
	
	private String comments2;

}

