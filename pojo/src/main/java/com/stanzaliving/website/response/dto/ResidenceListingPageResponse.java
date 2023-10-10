package com.stanzaliving.website.response.dto;

import java.io.Serializable;
import java.util.List;

import com.stanzaliving.core.base.common.dto.PageResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ResidenceListingPageResponse extends PageResponse<ResidenceListingPageResponse> implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<ResidenceListingCardDto> residenceResponseShortDTOs;

	private Integer recommendationCardsSize;

	private Integer insertRecommendationsSectionAfterCount;

	private List<Integer> residenceIdsToShowMapPin;
}
