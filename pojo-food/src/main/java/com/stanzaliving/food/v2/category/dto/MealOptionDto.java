package com.stanzaliving.food.v2.category.dto;

import com.stanzaliving.core.food.dto.MenuItemDto;
import com.stanzaliving.core.food.enums.Action;
import com.stanzaliving.food.v2.common.dto.OrderedListingDto;
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
public class MealOptionDto extends OrderedListingDto {
	private Double cogs;
	private Double budgeted;
	private Action action;
	private Double ratings;
	private List<MenuItemDto> menuItems;
	private Double grammage;
	private Double expectedGrammage;
	
	
}
