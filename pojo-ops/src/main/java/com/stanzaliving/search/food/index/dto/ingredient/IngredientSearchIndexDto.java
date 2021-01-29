package com.stanzaliving.search.food.index.dto.ingredient;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.enums.IngredientType;
import com.stanzaliving.core.enums.UnitOfMeasurement;
import com.stanzaliving.core.user.enums.EnumListing;
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
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class IngredientSearchIndexDto extends AbstractDto {

	private String name;

	private EnumListing<IngredientType> type;

	private EnumListing<UnitOfMeasurement> unitOfMeasurement;
}