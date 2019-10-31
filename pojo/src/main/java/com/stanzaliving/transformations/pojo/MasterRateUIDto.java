package com.stanzaliving.transformations.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MasterRateUIDto {
	
	private String masterBOIId;
	
	private String category;
	
	private String particular;
	
	private Double monthlyRentRate;
	
	private Double buyRate;
	
	private String itemCode;
	
	private String specification;
	
	private boolean rentalAvailable;
	
}