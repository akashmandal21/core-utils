package com.stanzaliving.website.response.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApartmentShortListingDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<ApartmentShortResponseDto> apartments;
	
	private Integer count;
}
