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

    private String propertyCapex;

    private String propertyBoiCapexPerBed;

    private String propertyGCCapexPerBed;

    private Integer numberOfBeds;
}
