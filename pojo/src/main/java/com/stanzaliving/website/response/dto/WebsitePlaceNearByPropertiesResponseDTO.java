package com.stanzaliving.website.response.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.stanzaliving.website.elasticsearch.index.dto.WebsitePlaceIndexDto;

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
public class WebsitePlaceNearByPropertiesResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonInclude(value = Include.NON_NULL)
	private List<ResidenceResponseShortDTO> residenceResponseShortDTOsPg;
	
	@JsonInclude(value = Include.NON_NULL)
	private List<ResidenceResponseShortDTO> residenceResponseShortDTOsCoLiving;
	
	@JsonInclude(value = Include.NON_NULL)
	private List<ApartmentResponseDto> apartments;
	
	@JsonInclude(value = Include.NON_NULL)
	private List<ResidenceResponseShortDTO> residenceResponseShortDTOs;

	@JsonInclude(value = Include.NON_NULL)
	private List<PropertyLocationListingCardDto> propertyLocationListingCardDTOs;
	
	@Builder.Default
	private Integer residenceCount = 0;

	@Builder.Default
	private Integer apartmentCount = 0;

	@Builder.Default
	private Integer propertyLocationCount = 0;
	
	@Builder.Default
	private Boolean isApartmentPage = false;
	
	private WebsitePlaceIndexDto placeIndexDto;
}
