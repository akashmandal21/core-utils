package com.stanzaliving.boq_service.dto;

import com.stanzaliving.item_master.enums.ItemType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SectionalItemDetailsQcDto {

    private String itemCode;

    private String itemName;

    private BigDecimal itemQuantity;

    private BigDecimal itemCost;

    private BigDecimal grnQuantity;

    private BigDecimal qcQuantity;

    private BigDecimal totalItemQuantity;

    private BigDecimal totalItemCost;

    private ItemType itemType;

}
