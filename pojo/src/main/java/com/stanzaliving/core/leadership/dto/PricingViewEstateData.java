package com.stanzaliving.core.leadership.dto;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class PricingViewEstateData {

	private String monthlyRent;
	
	private String securityDeposit;
	
	private String rentalInflation;
	
	private String advanceRent;
	
	private String leaseDuration;
	
	private String rentFreePeriod;
	
	private String tokenDeposit;
	
	private String amortizationPeriod;
	
	private List<String> keyPositives;
	
	private List<String> keyNegatives;
}
