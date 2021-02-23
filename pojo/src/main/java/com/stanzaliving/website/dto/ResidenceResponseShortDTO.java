package com.stanzaliving.website.dto;

import java.util.HashSet;
import java.util.Set;

import com.stanzaliving.website.enums.Gender;
import com.stanzaliving.website.response.dto.AddressResponseDTO;
import com.stanzaliving.website.response.dto.FacilityResponseDTO;
import com.stanzaliving.website.response.dto.ImageResponseDTO;
import com.stanzaliving.website.response.dto.ResidenceOccupancyResponseDTO;

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

	private Gender gender;

	private int micromarketId;

	private String micromarketName;

	private String micromarketSlug;

	private int cityId;

	private String cityName;

	private String citySlug;

	private Set<ResidenceOccupancyResponseDTO> residenceOccupancies = new HashSet<>(0);

	private Set<ImageResponseDTO> images = new HashSet<>(0);

	private AddressResponseDTO address;

	private String description;

	private String seoTitle;

	private String seoDescription;

	private String pricingPlan;

	private int startingPrice;

	private double latitude;

	private double longitude;

	private boolean enabled;

	private String slug;

	private Integer fomoBedCount;

	private Double distanceFromPlace;

	private Integer preBookingAmount;

	private String preBookingMode;

	private Set<FacilityResponseDTO> facilites = new HashSet<>(0);

	private String facilitesSortedString;

	private String googleMapLink;

	private Integer sortOrder;

	private boolean soldOut;

	private String virtualTourImage;

	private String fomoTag;

}
