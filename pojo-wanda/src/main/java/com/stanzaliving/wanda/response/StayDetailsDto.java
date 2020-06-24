package com.stanzaliving.wanda.response;

import java.util.List;

import com.stanzaliving.wanda.dtos.AmenitiesDto;
import com.stanzaliving.wanda.dtos.PackagedServicesDto;
import com.stanzaliving.wanda.dtos.VasServicesDto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class StayDetailsDto extends PendingBookingDto {

	private double latitude;

	private double longitude;

	private String persuasion;

	private List<AmenitiesDto> amenities;

	private List<PackagedServicesDto> packagedServices;

	private List<VasServicesDto> selectedVasServices;
	
	private List<VasServicesDto> topupVasServices;
}
