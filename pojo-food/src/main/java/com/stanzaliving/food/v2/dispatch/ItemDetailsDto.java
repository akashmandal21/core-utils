package com.stanzaliving.food.v2.dispatch;

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
public class ItemDetailsDto {

	private String itemId;

	private String itemName;

	private FoodItemType foodItemType;

	private String foodItemTypeName;

	private Integer groupNumber;

	private String grammage;

	private Double grammageValue;

	private String unitOfMeasurement;

	private String quantity;

	private Integer quantityValue;

	private boolean isTiffinItem;

	private boolean isDefault;
	
	private Double defaultGrammageValue;
	
	private Double defaultQuantityValue;

}
