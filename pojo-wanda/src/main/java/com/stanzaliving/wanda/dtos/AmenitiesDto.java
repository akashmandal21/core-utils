package com.stanzaliving.wanda.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class AmenitiesDto {
	
	private String amenityName;
	
	private String amenityImage;
}
