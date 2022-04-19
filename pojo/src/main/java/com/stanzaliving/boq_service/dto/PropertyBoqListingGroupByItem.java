package com.stanzaliving.boq_service.dto;

import com.stanzaliving.item_master.enums.ItemType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PropertyBoqListingGroupByItem {
    private String itemCode;

    private ItemType category;

    private String subCategory;

    private String itemName;

    private QuantityInfoDto quantityInfo;

    private BigDecimal totalAmount;

    private int numberOfBoqs;
}
