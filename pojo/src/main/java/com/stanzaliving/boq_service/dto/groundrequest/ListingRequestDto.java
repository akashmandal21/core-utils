package com.stanzaliving.boq_service.dto.groundrequest;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ListingRequestDto {
    private String groupBy;

    private String propertyUuid;
}
