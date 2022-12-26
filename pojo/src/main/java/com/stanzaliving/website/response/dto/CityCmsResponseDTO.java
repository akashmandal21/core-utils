package com.stanzaliving.website.response.dto;

import java.util.List;

import com.stanzaliving.core.user.enums.EnumListing;
import com.stanzaliving.website.enums.Status;
import com.stanzaliving.website.request.dto.AttributeDto;

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
public class CityCmsResponseDTO {

	private int cityId;
	private String name;
	private String code;
	private String iconImageUrl;
	private String seoTitle;
	private String seoDescription;
	private int websiteDisplayOrder;
	private double latitude;
	private double longitude;
	private boolean enabled;
	private String slug;
	private String phone;
	private String campaignSlug;
	private String description;
	private String imageAltTag;
	private String iconImageUrlAltTag;
	private String cityImgUrl;
	EnumListing<Status> status;
	private Long reviewCount;
	private Double rating;
	private Long minPriceValue;
	
	private List<AttributeDto> attributeDto;
	
	private String apartmentCitySlug;
	private Double apartmentRating;
	private Long apartmentReviewCount;
	private Long apartmentMinPriceValue;
	private String apartmentSeoTitle;
	private String apartmentSeoDescription;
	private String apartmentCityDescription;
}
