package com.stanzaliving.boq_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SectionalBoqCapexDto {

    private BigDecimal boiCapex;

    private BigDecimal gcCapex;

    private BigDecimal totalCapex;
}
