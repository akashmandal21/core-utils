package com.stanzaliving.search.food.index.dto.dishmaster;

import com.stanzaliving.search.food.index.dto.ingredient.IngredientSearchIndexDto;
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
 * @since 06-Jan-2021
 *
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DishMasterRecipeIngredientSearchIndexDto {

	private String ingredientId;

	private Double grammageAmount;

}
