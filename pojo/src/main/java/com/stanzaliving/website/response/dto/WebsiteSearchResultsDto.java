package com.stanzaliving.website.response.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.stanzaliving.core.base.common.dto.PageResponse;
import com.stanzaliving.website.elasticsearch.index.dto.WebsitePlaceIndexDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class WebsiteSearchResultsDto extends PageResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonInclude(value = Include.NON_NULL)
	private List<ResidenceListingCardDto> residenceResponseShortDTOsPg;
	
	@JsonInclude(value = Include.NON_NULL)
	private List<ResidenceListingCardDto> residenceResponseShortDTOsCoLiving;
	
	@JsonInclude(value = Include.NON_NULL)
	private List<ApartmentListingCardDto> apartments;

	private boolean isApartmentPage;
	
	private WebsitePlaceIndexDto placeIndexDto;
}
