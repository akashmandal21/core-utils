package com.stanzaliving.website.response.dto;

import java.util.HashSet;
import java.util.Set;

import com.stanzaliving.website.enums.FomoTag;
import com.stanzaliving.website.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ResidenceResponseShortDTO {

	private int residenceId;
	
	private String name;
	
	private String slug;
	
	private Gender gender;
	
	private int micromarketId;
	
	private String micromarketName;
	
	private String micromarketSlug;

	private int cityId;
	
	private String cityName;
	
	private String citySlug;
	
	private int startingPrice;
	
	private Integer preBookingAmount;
	
	private String preBookingMode;
	
	private String googleMapLink;
	
	private double latitude;
	
	private double longitude;
	
	private String virtualTourImage;

	private String videoLink;
	
	private Integer sortOrder;
	
	private FomoTag fomoTag;
	
	private String fomoTagName;
	
	private String fomoTagcolour;
	
	private Double distanceFromPlace;

	@Builder.Default
	private Set<FacilityResponseDTO> facilites = new HashSet<>(0);

	@Builder.Default
	private Set<ResidenceOccupancyResponseDTO> residenceOccupancies = new HashSet<>(0);

	@Builder.Default
	private Set<ImageResponseDTO> images = new HashSet<>(0);
}
