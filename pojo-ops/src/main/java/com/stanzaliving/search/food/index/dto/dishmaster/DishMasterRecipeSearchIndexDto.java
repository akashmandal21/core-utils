package com.stanzaliving.search.food.index.dto.dishmaster;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

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
public class DishMasterRecipeSearchIndexDto {

	private int cookQuantity;

	private Double standardQuantity;

	private Integer quantityPerPax;

	private List<DishMasterRecipeIngredientSearchIndexDto> ingredients;

}
