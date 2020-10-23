package com.stanzaliving.core.food.dto.response;

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
 * @since 08-Oct-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VasMenuItemResponseDto {
	private String vasMasterId;

	private String vasItemName;

	private EnumListing<FoodItemType> foodType;

	private boolean eggPresent;

	private boolean featured;

	private Double price;

}