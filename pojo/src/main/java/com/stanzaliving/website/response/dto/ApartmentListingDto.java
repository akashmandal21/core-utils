package com.stanzaliving.website.response.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApartmentListingDto {

	private List<List<ApartmentResponseDto>> apartments;
	
	private Integer countAfterGrouping;
	
	private Integer totalCount;
}
