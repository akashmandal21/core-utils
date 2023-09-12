package com.stanzaliving.website.response.dto;

import com.stanzaliving.core.base.common.dto.PageResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PropertyLocationListingCardsPageResponse extends PageResponse<PropertyLocationListingCardsPageResponse> implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<PropertyLocationListingCardDto> propertyLocations;

    private Integer recommendationCardsSize;

    private Integer insertRecommendationsSectionAfterCount;

    private List<Long> propertyLocationIdsToShowMapPin;
}
