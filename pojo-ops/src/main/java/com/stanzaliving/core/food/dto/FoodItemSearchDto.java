package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.dto.PageAndSortDto;
import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;
import sun.jvm.hotspot.debugger.cdbg.EnumType;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 03-May-2020
 *
 */


@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemSearchDto extends AbstractDto {
	private String name;

	private FoodItemType itemType;

	private String defaultBrand;

	private boolean quantifiable;

	private String textColor;

	private String bgColor;

	private String category;

	private MealType mealType;

	private PageAndSortDto pageDto;
}
