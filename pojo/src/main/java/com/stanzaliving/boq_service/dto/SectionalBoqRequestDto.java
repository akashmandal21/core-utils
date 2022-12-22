package com.stanzaliving.boq_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SectionalBoqRequestDto {
    
    private String sectionName;
    
    private List<SectionalBoqItemDetailsDto> items;

    //private List<SectionalItemDetailsQcDto> items;

    private Integer roomCount;

    private Integer bedCount;

    //private BigDecimal boiCapex;

    //private BigDecimal gcCapex;

    //private BigDecimal totalCapex;

    //private BigDecimal qcPercent;
    
}
