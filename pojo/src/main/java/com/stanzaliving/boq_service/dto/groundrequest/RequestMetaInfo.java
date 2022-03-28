package com.stanzaliving.boq_service.dto.groundrequest;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestMetaInfo {
    private Integer totalFilteredItems;

    private Long lastUpdatedAt;
}
