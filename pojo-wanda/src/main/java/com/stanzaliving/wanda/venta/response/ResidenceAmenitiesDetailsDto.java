package com.stanzaliving.wanda.venta.response;

import java.util.List;

import com.stanzaliving.wanda.dtos.AmenitiesDto;

import lombok.Getter;

@Getter
public class ResidenceAmenitiesDetailsDto {
	
	private Boolean rofr;
	
	private String bedLeft;
	
	private String houseName;
	
	private String microMarketName;
	
	private String cityName;
	
	private String Occupancy;
	
	private String roomNumber;
	
	private Integer roomId;
	
	private List<AmenitiesDto> amenities;
}