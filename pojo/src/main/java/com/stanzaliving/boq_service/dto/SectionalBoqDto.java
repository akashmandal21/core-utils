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

    private Integer roomCount;

    private Integer bedCount;

    private BigDecimal boiCapex;

    private BigDecimal gcCapex;

    private BigDecimal totalCapex;

    private BigDecimal qcPercent;

    private Date updatedOn;
    
}
