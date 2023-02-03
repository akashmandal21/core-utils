package com.stanzaliving.core.food.dto.response;

import java.io.Serializable;

import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.food.enums.FoodItemType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodPreferenceComboItemDto implements Serializable {

    private static final long serialVersionUID = -1523221974565668717L;
    private String itemId;
    private String categoryId;
    private String subCategoryId;
    private String itemName;
    private Integer stdQty;
    private Integer stdWeight;
    private Double itemCost;
    private ListingDto units;
    private FoodItemType itemType;
    private boolean quantifiable;
    private boolean hideGrammage;
    private boolean hybridBuffetItem;
    private CuisineTagsDto cuisineTagsDto;
    private String imageUrl;
	private boolean beverageItem;
}
