package com.stanzaliving.website.response.dto;

import com.stanzaliving.core.base.common.dto.PageResponse;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
public class ApartmentLocationListingCardsPageResponse extends PageResponse<ApartmentLocationListingCardsPageResponse> implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<ApartmentLocationListingCardDto> apartments;

    private List<Integer> residenceIdsToShowMapPin;
}
