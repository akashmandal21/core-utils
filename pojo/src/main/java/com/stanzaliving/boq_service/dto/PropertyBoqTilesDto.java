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
public class PropertyBoqTilesDto {

    private String propertyName;

    private BigDecimal propertyCapex;

    private BigDecimal propertyBoiCapexPerBed;

    private BigDecimal propertyGCCapexPerBed;

    private Integer numberOfBeds;
}
