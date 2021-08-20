/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.website.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author nipunaggarwal
 *
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ResidenceUIResponseDTO {

	private Integer residenceId;
	private String name;
	private String gender;
	private Integer micromarketId;
	private String micromarketName;
	private String micromarketSlug;
	private Integer cityId;
	private String cityName;
	private String citySlug;
	private String description;
	private String seoTitle;
	private String seoDescription;
	private String pricingPlan;
	private Integer startingPrice;
	private Double latitude;
	private Double longitude;
	private String googleMapLink;
	private Boolean enabled;
	private String slug;
	private Integer fomoBedCount;
	private Double distanceFromPlace;
	private Integer preBookingAmount;
	private Integer preBookingModeId;
	private String residenceType;
	private String residenceOccupancies;
	private String residenceImages;
	private String residenceAddress;
	private String residenceNearbyLocations;
	private String facilities;
	private Integer sortOrder;
	private boolean soldOut;
	private String virtualTourImage;
	private String fomoTag;
	
}
