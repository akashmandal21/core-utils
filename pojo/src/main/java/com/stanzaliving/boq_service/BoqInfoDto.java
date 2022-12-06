package com.stanzaliving.boq_service;

import com.stanzaliving.boq_service.dto.BoqItemsDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoqInfoDto {
    
    private List<BoqItemsDto> boqItemsDto;
    
    private BigDecimal totalCapex;

    private BigDecimal boiCapex;

    private BigDecimal gcCapex;
    
}
