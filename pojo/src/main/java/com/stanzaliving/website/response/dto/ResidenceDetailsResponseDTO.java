package com.stanzaliving.website.response.dto;

import java.util.ArrayList;
import java.util.List;

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
public class ResidenceDetailsResponseDTO {

	private int residenceId;
	private String name;
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
	private int priorityOrder;
	private String residenceType;
	private String mobileNo;
	private String gmbLink;
	private String virtualTourURL;
	private String cardCTAName;
	private int cardCTAId;
	private int residenceTypeId;
	private String genderSlug;

	@Builder.Default
	private List<ResidenceOccupancyResponseDTO> residenceOccupancies = new ArrayList(0);

	@Builder.Default
	private List<ImageResponseDTO> images = new ArrayList(0);
	@Builder.Default
	private List<ResidenceNearbyLocationResponseDTO> residenceNearbyLocations = new ArrayList(0);

	private AddressResponseDTO address;
}
