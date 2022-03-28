package com.stanzaliving.boq_service.dto.groundrequest;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestMetaInfo {
    private Integer totalFilteredItems;

    private Date lastUpdatedAt;
}
