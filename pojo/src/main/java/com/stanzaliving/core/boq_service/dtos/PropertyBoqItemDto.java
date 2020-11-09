package com.stanzaliving.core.boq_service.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PropertyBoqItemDto {
    String itemUuid;
    String itemCode;
    BigDecimal quantity;
}
