package com.stanzaliving.wanda.venta.response;

import java.util.Date;
import java.util.List;

import com.stanzaliving.wanda.dtos.AmenitiesDto;

import com.stanzaliving.wanda.enums.PropertyCategory;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceAmenitiesDetailsDto {
	
	private Boolean rofr;

	private PropertyCategory propertyCategory;

	private String bedLeft;

	private String ventaHouseId;
	
	private String houseName;
	
	private String microMarketName;
	
	private String cityName;
	
	private String occupancy;
	
	private Double monthlyFee;
	
	private String roomNumber;
	
	@Deprecated
	private Integer roomId;

	private String bookingUuid;

	private List<AmenitiesDto> amenities;
	
	private Integer bedLeftNumber;
	
	private String userId;
	
	private String roomUuid;

	private Date moveInDate;

	private String societyName;
}