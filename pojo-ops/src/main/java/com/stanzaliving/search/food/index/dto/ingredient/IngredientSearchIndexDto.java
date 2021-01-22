package com.stanzaliving.search.food.index.dto.ingredient;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.enums.IngredientType;
import com.stanzaliving.core.enums.UnitOfMeasurement;
import com.stanzaliving.core.food.dto.request.IngredientRequestDto;
import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class IngredientSearchIndexDto extends AbstractDto {
	private static final long serialVersionUID = 9675334434L;

	private String name;

	private String nameSuggest;

	private String nameKeyword;

	private IngredientType ingredientType;

	private UnitOfMeasurement unitOfMeasurement;
}