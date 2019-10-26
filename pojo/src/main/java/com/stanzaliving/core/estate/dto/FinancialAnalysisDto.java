package com.stanzaliving.core.estate.dto;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;

@Data
public class FinancialAnalysisDto {

	public double monthlyRent;
	public int leaseDuration;
	public int securityDeposit;
	public int leaseLockinPeriod;
	public double rentalInflationPercentage;
	public int rentalInflationPeriod;
	public int ammortizationPeriod;
	public int advanceRentPeriod;
	public int rentFreePeriod;
	public LocalDate buildingHandoverDate;
	public LocalDate rentStartDate;

	
	/*Broker Info*/	
	
	private BrokerDetailsDto brokerDetails;
	
	private List<CapexEstimationDto> capexEstimationDtos;
	
	private String comments1;
	
	private String comments2;

}

