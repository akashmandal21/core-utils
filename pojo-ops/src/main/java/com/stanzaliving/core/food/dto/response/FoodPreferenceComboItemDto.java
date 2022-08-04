package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.food.enums.FoodItemType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodPreferenceComboItemDto implements Serializable {

	private String itemId;
	private String categoryId;
	private String subCategoryId;
	private String itemName;
	private Integer stdQty;
	private Integer stdWeight;
	private ListingDto units;
	private FoodItemType itemType;
	private boolean quantifiable;
	private boolean hideGrammage;
	private boolean hybridBuffetItem;

}
