package com.stanzaliving.search.food.index.dto.menu.rating;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.operations.enums.MealType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 2.0
 *
 * @since 27-Jan-2021
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MealUserRatingSummaryIndexDto extends AbstractDto {

	private String residenceFoodMenuId;

	private String cityId;

	private String micromarketId;

	private String menuCategoryId;

	private String residenceId;

	private LocalDate menuDate;

	private MealType mealType;

	private String userId;

	private float rating;
}
