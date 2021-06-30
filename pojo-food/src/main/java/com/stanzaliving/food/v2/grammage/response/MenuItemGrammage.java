package com.stanzaliving.food.v2.grammage.response;

import com.stanzaliving.core.dto.KeyValuePairDto;
import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 05-Jun-2021
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MenuItemGrammage {

	private String itemId;
	private KeyValuePairDto item;

	private KeyValuePairDto category;

	private KeyValuePairDto subCategory;

	private EnumListing<FoodItemType> itemType;

	private Integer grammage;

	private Integer quantity;

}
