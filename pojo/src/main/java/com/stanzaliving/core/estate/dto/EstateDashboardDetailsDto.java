package com.stanzaliving.core.estate.dto;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class EstateDashboardDetailsDto {

	private PropertyAnalysisDto propertyAnalysisDto;
	
	private LocationAnalysisDto locationAnalysisDto;
	
	private Map<String, List<String>> propertyImages;
	
	private LandlordAnalysisDto landlordAnalysisDto;
	
	private FinancialAnalysisDto financialAnalysisDto;
}
