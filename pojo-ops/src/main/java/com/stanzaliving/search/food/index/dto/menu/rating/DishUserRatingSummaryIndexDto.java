package com.stanzaliving.search.food.index.dto.menu.rating;

import com.stanzaliving.core.base.common.dto.AbstractSearchIndexDto;
import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 2.0
 *
 * @since 25-Feb-2021
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DishUserRatingSummaryIndexDto extends AbstractSearchIndexDto {

	private String residenceFoodMenuId;

	private String cityId;

	private String micromarketId;

	private String menuCategoryId;

	private String residenceId;

	private LocalDate menuDate;

	private MealType mealType;

	private String itemId;

	private String userId;

	private float rating;
}
