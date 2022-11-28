package com.stanzaliving.boq_service.dto;

import com.stanzaliving.item_master.enums.ItemType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoqItemsDto {
    
    private String itemCode;

    private String itemUuid;
    
    private String itemName;
    
    private BigDecimal totalItemQuantity;

    private BigDecimal totalItemCost;

    private ItemType itemType;
    
}
