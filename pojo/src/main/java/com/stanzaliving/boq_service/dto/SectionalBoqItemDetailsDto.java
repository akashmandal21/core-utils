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
public class SectionalBoqItemDetailsDto {
    
    private String itemCode;
    
    private String itemName;
    
    private BigDecimal itemQuantity;

    private BigDecimal itemCost;
    
}
