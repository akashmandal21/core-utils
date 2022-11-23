package com.stanzaliving.website.request.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class FeatureRequestDTO {

	private Integer featureId;
	
	private String name;
	
	private String iconImageUrl;
	
	@Default
	private boolean enabled = true;
	
	private String iconImageUrlAltTag;
}
