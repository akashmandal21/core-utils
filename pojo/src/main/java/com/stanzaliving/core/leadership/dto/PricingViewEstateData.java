package com.stanzaliving.core.leadership.dto;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@ToString
@Setter
public class PricingViewEstateData {

	private String monthlyRent;
	
	private String securityDeposit;
	
	private String rentalInflation;
	
	private String advanceRent;
	
	private String leaseDuration;
	
	private String rentFreePeriod;
	
	private String tokenDeposit;
	
	private String amortizationPeriod;
	
	private String buildingArea;
	
	private String numberOfRooms;
	
	private String pricePerBed;
	
	private String numberOfBeds;

	private String effectiveBedCount;

	private String effectivePricePerBed;
	
	private String locationComments;
	
	private String brandType;
	
	private List<String> keyPositives;
	
	private List<String> keyNegatives;
}
