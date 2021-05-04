package com.stanzaliving.core.food.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodOrderMenuCategoryDto {

	private String menuCategoryId;

	private String menuCategoryName;

			// group Id, shortCode() already existing method.

	@NotEmpty(message = "Meal Orders are mandatory")
	private List<FoodOrderDetailDto> foodOrderDetailDtoList;

}
