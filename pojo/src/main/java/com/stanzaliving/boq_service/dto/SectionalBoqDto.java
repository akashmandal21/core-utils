package com.stanzaliving.boq_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SectionalBoqDto {
    
    private String sectionName;
    
    //private List<SectionalBoqItemDetailsDto> sectionBoqItems;

    private List<SectionalItemDetailsQcDto> items;

    @Builder.Default
    private Integer roomCount = 0;

    @Builder.Default
    private Integer bedCount = 0;

    @Builder.Default
    private BigDecimal boiCapex = BigDecimal.ZERO;

    @Builder.Default
    private BigDecimal gcCapex = BigDecimal.ZERO;

    @Builder.Default
    private BigDecimal totalCapex = BigDecimal.ZERO;

    private BigDecimal qcPercent;

    private Date updatedOn;

    private Integer totalFilteredItems;
    
}
