package com.stanzaliving.boq_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NegativeRateInfoTempDto {
    private BigDecimal rate;

    private Map<String,BigDecimal> blockedItemUuids;

    private Map<String,BigDecimal> masterBlockedUuids;
}
