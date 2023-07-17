package com.stanzaliving.website.response.dto;

import java.io.Serializable;
import java.util.List;

import com.stanzaliving.core.base.common.dto.PageResponse;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApartmentListingDto extends PageResponse<ApartmentListingDto> implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<ApartmentResponseDto> apartments;
	
	@Builder.Default
	private Integer apartmentCount = 0;
	
	@Builder.Default
	private Integer residenceCount = 0;
}
