package com.stanzaliving.core.electricity.dto;

import com.stanzaliving.core.enums.ApartmentType;

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
public class ApartmentElectricityBillListingHeaderDto {
	
	private String propertyName;
	
	private String propertyCode;
	
	private String residenceId;
	
	private ApartmentType apartmentType;
	
	private String apartmentTypeName;
	
	private String propertyAddressLine1;
	
	private String propertyAddressLine2;
	
	private String cityName;
	
	private String cityId;
	
	private String micromarketName;
	
	private String micromarketId;
	
	private String code;
	
	private double pendingAmount;
	
	private int occupiedRoom;
	
	private int totalRoom;
	
	private int occupiedBed;

	private int totalBed;

}