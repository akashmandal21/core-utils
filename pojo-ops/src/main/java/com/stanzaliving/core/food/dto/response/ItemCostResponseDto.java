package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.enums.UnitOfMeasurement;
import com.stanzaliving.core.food.enums.FoodItemType;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 04-Sep-2020
 */

@Getter
@Setter
@SuperBuilder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ItemCostResponseDto {

	private String itemId;

	private String itemName;

	private FoodItemType itemType;

	private String itemTypeName;

	private ItemPriceDto prices;

	private boolean quantifiable;

	private Integer itemWeight;

	private Integer itemQty;

	private UnitOfMeasurement unit;
	
	private String unitName;

	private String imageUrl;
}