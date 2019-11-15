package com.stanzaliving.core.estate.dto;

import java.io.Serializable;
import java.util.Map;

import lombok.Data;

@Data
public class EstateDashboardDetailsDto implements Serializable{

	private static final long serialVersionUID = 1123121L;

	private PropertyAnalysisDto propertyAnalysisDto;
	
	private LocationAnalysisDto locationAnalysisDto;
	
	private Map<String, String> propertyImages;
	
	private LandlordAnalysisDto landlordAnalysisDto;
	
	private FinancialAnalysisDto financialAnalysisDto;
	
	private EstateDashboardListingDto listingDto;
}
