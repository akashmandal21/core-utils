package com.stanzaliving.search.food.index.dto.ingredient;

import com.stanzaliving.core.base.common.dto.AbstractSearchIndexDto;
import com.stanzaliving.core.enums.IngredientType;
import com.stanzaliving.core.enums.UnitOfMeasurement;
import com.stanzaliving.core.generic.enums.GSTSlabs;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 * @version 1.0
 * @since 06-Jan-2021
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
	private GSTSlabs gstSlabs;
	private String itemUuid;

}