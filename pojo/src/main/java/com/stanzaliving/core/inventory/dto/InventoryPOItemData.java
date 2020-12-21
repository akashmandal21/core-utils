package com.stanzaliving.core.inventory.dto;

import java.math.BigDecimal;


public class InventoryPOItemData {
    private String itemUuid;
    private String addressUuid;
    private BigDecimal availableQuantity;
    private BigDecimal blockedQuantity;
    private BigDecimal consumedQuantity;
}
