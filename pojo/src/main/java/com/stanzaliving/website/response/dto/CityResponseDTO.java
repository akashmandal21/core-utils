package com.stanzaliving.website.response.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
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

}
