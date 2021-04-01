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
public class SeoUrlRequestDto {
	private int seoUrlId;
	private String sourceUrl;
	private String destinationUrl;
	private boolean enabled;
	private String userName;
}
