package com.stanzaliving.website.response.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.stanzaliving.core.base.common.dto.PageResponse;
import com.stanzaliving.website.elasticsearch.index.dto.WebsitePlaceIndexDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class WebsiteSearchResultsDto extends PageResponse<WebsiteSearchResultsDto> implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonInclude(value = Include.NON_NULL)
	private List<ResidenceListingCardDto> residenceResponseShortDTOs;

	@JsonInclude(value = Include.NON_NULL)
	private List<ResidenceListingCardDto> residenceResponseShortDTOsPg;
	
	@JsonInclude(value = Include.NON_NULL)
	private List<ResidenceListingCardDto> residenceResponseShortDTOsCoLiving;
	
	@JsonInclude(value = Include.NON_NULL)
	private List<ApartmentListingCardDto> apartments;

	@JsonInclude(value = Include.NON_NULL)
	private List<PropertyLocationListingCardDto> propertyLocations;

	private boolean isApartmentPage;

	private List<Integer> residenceIdsToShowMapPin;

	private List<Long> propertyLocationIdsToShowMapPin;
	
	private WebsitePlaceIndexDto placeIndexDto;
}
