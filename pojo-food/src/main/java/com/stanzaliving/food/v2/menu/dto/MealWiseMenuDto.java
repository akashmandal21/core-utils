package com.stanzaliving.food.v2.menu.dto;

import com.stanzaliving.food.v2.common.dto.MealDto;
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
public class MealWiseMenuDto extends MealDto {
	private Double cogs;
	private Double budgeted;
	private List<MealOptionDto> mealOptions;

}
