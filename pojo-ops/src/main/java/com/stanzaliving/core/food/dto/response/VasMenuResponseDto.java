package com.stanzaliving.core.food.dto.response;

import java.util.List;
import java.util.Map;

import com.stanzaliving.core.operations.enums.MealType;

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
 * @since 07-Oct-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VasMenuResponseDto {
	private EnumListing<MealType> meal;

	private List<ItemCategoryCountDto> categoryCount;

	List<VasMenuItemResponseDto> items;
}
