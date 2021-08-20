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
    RECIPETAGNAME("recipeTagName"),
    COUNTOFMAPPING("countOfMapping"),
    RECIPETAGUOM("recipeTagUom"),
    RECIPETAGCREATEDBY("createdAt"), //for front end sorting by createdBy should be done on createdAt
    RECIPETAGLASTUPDATEDBY("updatedAt"), //for front end sorting by updatedBy should be done on updatedAt
    RECIPETAGSTATUS("status");


    private String dbKey;
}