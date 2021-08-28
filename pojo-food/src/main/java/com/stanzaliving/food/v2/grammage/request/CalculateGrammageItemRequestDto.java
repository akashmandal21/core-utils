package com.stanzaliving.food.v2.grammage.request;

import com.stanzaliving.core.food.enums.FoodServeType;
import com.stanzaliving.food.v2.menu.dto.ResidenceMenuDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 23-Jul-2021
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CalculateGrammageItemRequestDto {
	@NotBlank(message = "MenuCategory Version Id is mandatory")
	private String menuCategoryVersionId;

	@NotEmpty(message = "Items are mandatory")
	private Set<String> itemIds;

	@NotNull(message = "Menu Dto is required")
	private ResidenceMenuDto menu;

	@NotNull(message = "Food Serve type is mandatory")
	private FoodServeType foodServeType;

}
