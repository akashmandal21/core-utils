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
public class SectionQcQuantityRequestDto {

    private String propertyUuid;

    private String sectionName;

    private BigDecimal qcQuantity;

    private String itemCode;
}
