package com.stanzaliving.website.response.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.stanzaliving.core.enums.PropertyEntityType;
import com.stanzaliving.website.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class WebsiteMapCardDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int residenceId;

	private String name;

	private String slug;

	private Gender gender;
	
	private String genderName;

	private int micromarketId;

	private String micromarketName;

	@JsonInclude(value = Include.NON_NULL)
	private String micromarketSlug;

	private int cityId;

	private String cityName;

	@JsonInclude(value = Include.NON_NULL)
	private String citySlug;

	private int startingPrice;

	private String pricingPlan;
	
	private String googleMapLink;

	private double latitude;

	private double longitude;
	
	private String imageUrl;
	
	
	private PropertyEntityType propertyEntityType;
	
	@JsonInclude(value = Include.NON_NULL)
	private String apartmentMMSlug;

	@JsonInclude(value = Include.NON_NULL)
	private String apartmentCitySlug;
	
	@JsonInclude(value = Include.NON_NULL)
	private String roomId;
}
