package com.stanzaliving.website.request.dto;

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
public class CityRequestDTO {

	private int cityId;
	private String name;
	private String iconImageUrl;
	private double latitude;
	private double longitude;
	private String imageAltTag;
	private String phone;
	private int websiteDisplayOrder;
	private String cityImgUrl;
}
