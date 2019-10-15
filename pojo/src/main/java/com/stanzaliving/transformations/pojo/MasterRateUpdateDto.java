package com.stanzaliving.transformations.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MasterRateUpdateDto {
	
	private String masterBOIId;
	
	private int cityId;
	
	private Double monthlyRentRate;
	
	private Double buyRate;
	
}
