package com.stanzaliving.website.response.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.stanzaliving.website.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApartmentResponseDto implements Serializable, Comparable<ApartmentResponseDto> {

	private static final long serialVersionUID = 1L;
	
	private Integer apartmentId;
	
	private String propertyCode;
	
	private Long societyId;
	
	private Integer roomCount;
	
	private String apartmentName;
	
	private String apartmentSlug;
	
	private Gender gender;
	
	private String micromarketName;
	
	private String pricingPlan;
	
	private Integer startingPrice;
	
	private Integer sortOrder;
	
	private Integer preBookingAmount;
	
	private String preBookingMode;
	
	private String googleMapLink;
	
	private String videoLink;
	
	private String virtualTourImage;
	
	private String area;
	
	private String floorNumber;
	
	private Date created;
	
	@Builder.Default
	private Integer similarApartmentsCount = 0;
	
	@Builder.Default
	private Set<FacilityResponseDTO> facilites = new HashSet<>();
	
	@Builder.Default
	private Set<ApartmentRoomTypeResponseDTO> apartmentRoomTypes = new HashSet<>();
	
	@Builder.Default
	private Set<ImageResponseDTO> images = new HashSet<>(0);

	@Override
	public int compareTo(ApartmentResponseDto dto2) {
		
		if (Objects.isNull(getSortOrder()) || Objects.isNull(dto2.getSortOrder()))
			return getCreated().compareTo(dto2.getCreated());
		return getSortOrder().compareTo(dto2.getSortOrder());
	}
}