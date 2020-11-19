package com.stanzaliving.core.inventory.dto;

import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class InventoryItemQuantityPrice {
    @EqualsAndHashCode.Include
    private String itemUuid;
    private BigDecimal effectivePrice;
    private BigDecimal quantity;
}
