package com.stanzaliving.wanda.response;

import java.util.List;

import com.stanzaliving.wanda.dtos.AmenitiesDto;
import com.stanzaliving.wanda.dtos.PackagedServicesDtoV2;
import com.stanzaliving.wanda.dtos.VasServicesDtoV2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class StayDetailsDtoV2 extends PendingBookingDto {

	private double latitude;

	private double longitude;

	private String persuasion;

	private String roomNumber;

	private List<AmenitiesDto> amenities;

	private List<PackagedServicesDtoV2> packagedServices;

	private List<VasServicesDtoV2> selectedVasServices;

	private List<VasServicesDtoV2> topupVasServices;
	
	private boolean showCafe;
	
	private String address;

	private String apartmentType;
}
