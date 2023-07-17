package com.stanzaliving.boq_service.dto.groundrequest;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ListingResponseDto {
    private RequestMetaInfo requestMetaInfo;

    private List<ListingDto> listingDto;

}
