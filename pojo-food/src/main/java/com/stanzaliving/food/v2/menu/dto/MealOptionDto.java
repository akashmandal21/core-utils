package com.stanzaliving.food.v2.menu.dto;

import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.food.dto.MenuItemDto;
import com.stanzaliving.core.food.enums.Action;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MealOptionDto extends ListingDto {
	private String thaliId;
	private String thaliVariant;
	private String thaliName;
	private String variantName;
	private Double cogs;
	private Double budgeted;
	private Action action;
	private List<MenuItemDto> menuItems;

}
