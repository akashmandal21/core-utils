package com.stanzaliving.wanda.venta.response;

import java.util.List;

import com.stanzaliving.wanda.dtos.AmenitiesDto;

import com.stanzaliving.wanda.enums.PropertyCategory;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ResidenceAmenitiesDetailsDto {
	
	private Boolean rofr;

	private PropertyCategory propertyCategory;

	private String bedLeft;

	private String ventaHouseId;
	
	private String houseName;
	
	private String microMarketName;
	
	private String cityName;
	
	private String Occupancy;
	
	private String roomNumber;
	
	private Integer roomId;

	private String bookingUuid;

	private List<AmenitiesDto> amenities;
}