package com.stanzaliving.item_master.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SortSpecs {
    ITEMCODE("itemCode"),
    COSTHEAD("itemData.costHead.label"),
    CATEGORY("itemData.itemCategory.label"),
    SUBCATEGORY("itemData.itemSubCategory.label"),
    ITEMNAME("itemData.itemName"),
    UOM("itemData.unitOfMeasurement.label"),
    LASTUPDATEDAT("updatedAt"),
    ITEMDESCRIPTION("itemData.itemDescription");


    private String dbKey;
}