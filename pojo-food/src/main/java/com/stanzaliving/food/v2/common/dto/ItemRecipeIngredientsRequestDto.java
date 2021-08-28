package com.stanzaliving.food.v2.common.dto;

import java.util.List;

import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public class ItemRecipeIngredientsRequestDto {

private static final long serialVersionUID = -4474329770997971449L;
private String itemId;
private List<ItemRecipeIngredientsDto> itemRecipeIngredients; 
private String recipeId;
	
}
