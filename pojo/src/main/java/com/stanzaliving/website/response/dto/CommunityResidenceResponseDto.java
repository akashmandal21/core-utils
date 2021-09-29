package com.stanzaliving.website.response.dto;

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
public class CommunityResidenceResponseDto {

	private String residenceUuid;
	private String name;
	private String gmbLink;
	private String line1;
	private String line2;
	private int zipCode;
	private String cityName;
	private int cityId;
	private String StateName;
	private Long stateId;

}
