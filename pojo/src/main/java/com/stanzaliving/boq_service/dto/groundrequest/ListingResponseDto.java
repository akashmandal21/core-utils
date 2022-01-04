package com.stanzaliving.boq_service.dto.groundrequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ListingResponseDto {
    private PropertyMetaInfoDto meta;

    private ListingRequestDto requestState;

    private List<ListingDataDto> listingData;

}
