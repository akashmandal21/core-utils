package com.stanzaliving.item_master.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemCostDto {
    private String cityUuid;
    private BigDecimal rate;
    private BigDecimal rentalRate;
}
