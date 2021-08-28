package com.stanzaliving.food.v2.category.dto;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.stanzaliving.core.food.dto.request.MenuItemSearchRequestDto;
import com.stanzaliving.core.food.enums.RecipeType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MenuItemSearchPdto extends MenuItemSearchRequestDto {
	private String menuCategoryId;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ratingDate;
	private boolean dataComplete;
	private boolean status;
	private List<RecipeType> recipeTypes;
	private boolean receipeExists;
}

