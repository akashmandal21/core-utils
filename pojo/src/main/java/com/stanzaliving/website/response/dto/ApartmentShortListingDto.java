package com.stanzaliving.website.response.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApartmentShortListingDto {

	private List<ApartmentShortResponseDto> apartments;
	
	private Integer count;
}
