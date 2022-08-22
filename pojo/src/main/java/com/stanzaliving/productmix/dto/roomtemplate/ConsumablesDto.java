package com.stanzaliving.productmix.dto.roomtemplate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConsumablesDto {

    @NotBlank(message = "Uuid cannot be blank")
    private String uuid;

    @NotBlank(message = "Label cannot be blank")
    private String label;

    @NotNull(message = "Quantity can not be null")
    private BigDecimal quantity;
}
