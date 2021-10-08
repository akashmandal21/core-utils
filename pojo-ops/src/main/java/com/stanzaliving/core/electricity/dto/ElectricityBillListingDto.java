package com.stanzaliving.core.electricity.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ElectricityBillListingDto {
	
	private String propertyName;
	
	private String propertyCode;
	
	private String bhkName;
	
	private String propertyAddress;
	
	private String cityName;
	
	private String cityId;
	
	private String micromarketName;
	
	private String micromarketId;
	
	private String societyName;
	
	private String societyId;
	
	private int pendingBillsCount;
	
	private int pendingAmount;
	
	private Date lastUpdatedAt;

	private String lastUpdatedBy;

}