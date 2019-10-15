package com.stanzaliving.transformations.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
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
