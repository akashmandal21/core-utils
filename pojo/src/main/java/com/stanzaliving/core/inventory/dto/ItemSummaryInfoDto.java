package com.stanzaliving.core.inventory.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemSummaryInfoDto {
    private BigDecimal currentStockValue;
    private BigDecimal currentStockQty;
    private BigDecimal blockedStockValue;
    private BigDecimal blockedStockQty;
    private BigDecimal consumedStockQty;
    private BigDecimal quantity;
    private String stanzaBatchId;
    private String awlBatchId;
    private BigDecimal availStockValue;
    private BigDecimal availStockQty;
    private BigDecimal expiryStockValue;
    private Long itemsNearParLevel;
    private String itemUuid;
    private String addressUuid;
    private String fifoUuid;
}