package com.stanzaliving.boq_service.dto.groundrequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RequestItemMetaInfoDto {
    private String itemUUid;

    private BigDecimal quantity;

    private boolean isExtra;
}
