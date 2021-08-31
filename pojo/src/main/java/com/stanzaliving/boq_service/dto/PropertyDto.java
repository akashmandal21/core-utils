package com.stanzaliving.boq_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PropertyDto {

    private String label;
    private String value;
    private String maxQuantity;
    private String error;
    private String quantity;
    private Boolean checked;
}
