package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.dto.SortDto;
import com.stanzaliving.core.food.dto.OperatorValueDto;
import com.stanzaliving.core.food.enums.DishRegion;
import com.stanzaliving.core.operations.enums.MealType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Set;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 2.0
 *
 * @since 15-Jan-2021
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MenuItemSearchRequestDto {

	private Set<String> itemIds;

	private MealType mealType;

	private DishRegion dishRegion;

	private String categoryId;

	private String subCategoryId;

	private String dishName;

	private OperatorValueDto<Float> rating;

	private SortDto sort;
}
