package com.stanzaliving.website.response.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApartmentListingDto {

	private List<ApartmentResponseDto> apartments;
	
	@Builder.Default
	private Integer apartmentCount = 0;
	
	@Builder.Default
	private Integer residenceCount = 0;
}
