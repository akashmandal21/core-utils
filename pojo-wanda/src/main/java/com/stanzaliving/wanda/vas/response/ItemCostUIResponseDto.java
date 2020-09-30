/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.vas.response;

import com.stanzaliving.core.enums.UnitOfMeasurement;
import com.stanzaliving.core.food.enums.FoodItemType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ItemCostUIResponseDto {

	private String itemId;
	private String itemName;
	private FoodItemType itemType;
	private String itemTypeName;
	private ItemPriceUIDto prices;
	private Integer itemWeight;
	private Integer itemQty;
	private UnitOfMeasurement unit;
	private String unitName;
	private String imageUrl;
	private String itemWeightUnitString;

	@Builder.Default
	private Boolean quantifiable = Boolean.FALSE;

}
