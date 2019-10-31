package com.stanzaliving.core.estate.dto;

import lombok.Data;

@Data
public class LandlordInfoDto {

	private String landlordName;
	
	private String landlordType;
	
	private double ownershipPercentage;
	
	private String panNumber;
}
