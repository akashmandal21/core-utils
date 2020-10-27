package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.enums.UnitOfMeasurement;
import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.user.enums.EnumListing;
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

	private EnumListing<FoodItemType> foodType;

	private ItemPriceDto prices;

	private boolean quantifiable;

	private Integer itemWeight;

	private Double grammagePerPax;

	private Integer itemQty;

	private Integer quantityPerPax;

	private UnitOfMeasurement unit;
	
	private String unitName;

	private EnumListing<UnitOfMeasurement> uom;

	private String imageUrl;
}