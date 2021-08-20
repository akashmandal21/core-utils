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
import lombok.experimental.SuperBuilder;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class WebsitePlaceNearByPropertiesResponseDTO {

	@JsonInclude(value = Include.NON_NULL)
	private List<ResidenceResponseShortDTO> residenceResponseShortDTOs;
	
	@Builder.Default
	private Integer residenceCount = 0;

	
	@JsonInclude(value = Include.NON_NULL)
	private List<ApartmentResponseDto> apartments;
	
	@Builder.Default
	private Integer apartmentCount = 0;
	
	
	@Builder.Default
	private Boolean isApartmentPage = false;
}
