package com.stanzaliving.core.estate.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class EstateDashboardListingDto {

	private String propertyId;
	
	private String propertyName;

	private String cityName;

	private String microMarketName;
	
	private LocalDate handoverDate;
	
	private String addedBy;
	
	private String propertyStatus;

}
