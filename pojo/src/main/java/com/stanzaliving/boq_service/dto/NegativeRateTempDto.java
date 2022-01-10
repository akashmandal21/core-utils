package com.stanzaliving.boq_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NegativeRateTempDto {
    private String itemBoqUuid;

    private String boqStatus;

    private BigDecimal quantity;

    private BigDecimal rate;

    private BigDecimal block;
}
