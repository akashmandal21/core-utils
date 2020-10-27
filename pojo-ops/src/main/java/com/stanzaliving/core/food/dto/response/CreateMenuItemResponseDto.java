package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.food.enums.FoodItemBasePreference;
import com.stanzaliving.core.food.enums.FoodRegion;
import com.stanzaliving.core.user.enums.EnumListing;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Set;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 23-Oct-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CreateMenuItemResponseDto {

	private FoodRegion foodRegion;

	private FoodItemBasePreference basePreference;

	private List<MenuItemDetailsDto> successItems;

	private Set<String> failedItems;

	private String failedItemsMsg;

}
