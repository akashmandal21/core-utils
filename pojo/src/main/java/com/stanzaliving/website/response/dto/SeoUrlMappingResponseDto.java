package com.stanzaliving.website.response.dto;

import java.util.Date;

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
	
	private Boolean status;

	private String createdBy;

	private Date createdAt;

	private Date updatedAt;

	private String updatedBy;
}
