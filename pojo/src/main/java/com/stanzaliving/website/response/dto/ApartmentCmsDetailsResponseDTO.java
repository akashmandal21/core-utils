package com.stanzaliving.website.response.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.stanzaliving.core.enums.PropertyEntityType;
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
public class ApartmentCmsDetailsResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private int residenceId;
	private String name;
	private String propertyCode;
	private String floorNumber;
	private Double area;
	private Gender gender;
	private String genderName;
	private int micromarketId;
	private String micromarketName;
	private String micromarketSlug;
	private int cityId;
	private String cityName;
	private String citySlug;
	private String description;
	private String seoTitle;
	private String seoDescription;
	private String pricingPlan;
	private int pricingPlanId;
	private int startingPrice;
	private double latitude;
	private double longitude;
	private boolean enabled;
	private String slug;
	private Integer preBookingAmount;
	private FomoTag fomoTag;
	private String fomoTagName;
	private String fomoTagcolour;
	private int sortOrder;
	private String googleMapLink;
	private String virtualTourImage;
	private String videoLink;
	private String cardCTAName;
	private Integer cardCTAId;
	private String leadFormModeName;
	private Integer leadFormModeId;
	private String genderSlug;
	private String mobileNo;
	private String phoneNo;
	
	private PropertyEntityType propertyEntityType;

	@Builder.Default
	private Set<ApartmentRoomTypeResponseDTO> apartmentRoomTypes = new HashSet<>();

	@Builder.Default
	private Set<ImageResponseDTO> images = new HashSet<>(0);
	
	@Builder.Default
	private Set<ResidenceNearbyLocationResponseDTO> residenceNearbyLocations = new HashSet<>(0);

	private AddressResponseDTO address;
}
