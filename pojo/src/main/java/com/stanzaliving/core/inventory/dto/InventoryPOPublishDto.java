package com.stanzaliving.core.inventory.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class InventoryPOPublishDto {
    private String poUuid;
    private Map<String,BigDecimal> availableQuantities;
}
