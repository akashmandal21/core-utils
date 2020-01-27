package com.stanzaliving.website.response.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MicromarketResponseDTO {

	private int micromarketId;
	private String name;
	private int cityId;
	private String cityName;
	private double latitude;
	private double longitude;
	private String slug;
	private boolean enabled = true;

}
