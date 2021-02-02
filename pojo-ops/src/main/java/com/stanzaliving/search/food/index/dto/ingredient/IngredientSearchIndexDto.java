package com.stanzaliving.search.food.index.dto.ingredient;

import com.stanzaliving.core.base.common.dto.AbstractSearchIndexDto;
import com.stanzaliving.core.enums.IngredientType;
import com.stanzaliving.core.enums.UnitOfMeasurement;
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
public class IngredientSearchIndexDto extends AbstractSearchIndexDto {
	private static final long serialVersionUID = 9675334434L;

	private String name;

	private String nameSuggest;

	private String nameKeyword;

	private IngredientType ingredientType;

	private UnitOfMeasurement unitOfMeasurement;
}