package com.stanzaliving.website.response.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WebsiteTopLocalitiesDto {

	private String topLocalityName;

	private int cityId;
	private String cityName;
	private String citySlug;
	private String apartmentCitySlug;

	private int micromarketId;
	private String micromarketName;
	private String micromarketSlug;
	private String apartmentMMSlug;

}
