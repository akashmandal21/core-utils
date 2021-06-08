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
    ITEMDESCRIPTION("itemData.itemDescription"),
    GST("itemData.gst.label"),
    ITEMRATE("itemData.globalRate"),
    RENTALRATE("itemData.rentalRate"),
    STATUS("itemData.itemStatus"),

    //RecipeTag Collection
    RECIPETAGNAME("itemData.recipeTagName"),
    COUNTOFMAPPING("itemData.countOfMapping"),
    RECIPETAGUOM("itemData.recipeTagUom");


    private String dbKey;
}