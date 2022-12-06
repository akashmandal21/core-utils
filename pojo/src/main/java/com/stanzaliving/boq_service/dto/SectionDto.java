package com.stanzaliving.boq_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SectionDto {
    
    List<SectionalBoqDto> sectionalBoqDtoList;
    
    Map<String, BigDecimal> itemQuantityLeft;
    
}
