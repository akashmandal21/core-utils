package com.stanzaliving.website.response.dto;

import com.stanzaliving.website.enums.FomoTag;
import com.stanzaliving.website.enums.Gender;
import com.stanzaliving.website.response.dto.ResidenceListResponseDTO.ResidenceListResponseDTOBuilder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class MicromarketResponseDTO {

	private int micromarketId;
	private String name;
	private int cityId;
	private String cityName;
	private double latitude;
	private double longitude;
	private String slug;
	private boolean enabled = true;
	private String seoTitle;
	private String seoDescription;
	private String phone;
	private String micromarketDescription;

}
