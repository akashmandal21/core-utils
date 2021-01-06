package com.stanzaliving.website.response.dto;

import com.stanzaliving.core.user.enums.EnumListing;
import com.stanzaliving.website.enums.Status;

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
public class CityResponseDTO {

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
	private String cityResidenceTypeText;
	private String phone;
	private String description;
	private String imageAltTag;
	private String cityImgUrl;
	EnumListing<Status> status;
	

}
