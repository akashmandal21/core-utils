package com.stanzaliving.boq_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PropertyDto {

    private String label;

    @NotBlank
    private String value;

    private String maxQuantity;

    private String error;

    @NotBlank
    private String quantity;

    @NotBlank
    private Boolean checked;
}
