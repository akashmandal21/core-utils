package com.stanzaliving.website.response.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class WebsitePlaceNearByPropertiesResponseDTO {

	@JsonInclude(value = Include.NON_NULL)
	private List<ResidenceResponseShortDTO> residenceResponseShortDTOs;
	
	@JsonInclude(value = Include.NON_NULL)
	private List<ApartmentResponseDto> apartments;
	
	private int count;
	
	@Builder.Default
	private Boolean isApartmentPage = false;
}
