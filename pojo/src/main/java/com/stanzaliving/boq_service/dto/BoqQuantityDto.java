package com.stanzaliving.boq_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoqQuantityDto {
    private String label;

    private BigDecimal slQty;

    private BigDecimal llQty;

    private BigDecimal gcQty;
}
