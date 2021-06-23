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
public class SeoUrlMappingRequestDto {
	
	private Long id;
	private String sourceUrl;
	private String destinationUrl;
	
	@Builder.Default
	private boolean status = true;
}
