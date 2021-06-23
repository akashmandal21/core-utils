package com.stanzaliving.website.response.dto;

import java.time.LocalDateTime;

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
public class SeoUrlMappingResponseDto {

	private Long id;
	
	private String sourceUrl;
	
	private String destinationUrl;
	
	private boolean status;

	private String createdBy;

	private LocalDateTime createdAt;

	private LocalDateTime updatedAt;

	private String updatedBy;
}
