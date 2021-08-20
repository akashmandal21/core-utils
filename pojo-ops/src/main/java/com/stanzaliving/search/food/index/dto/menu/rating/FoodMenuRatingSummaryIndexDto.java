package com.stanzaliving.search.food.index.dto.menu.rating;

import com.stanzaliving.core.base.common.dto.AbstractSearchIndexDto;
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
 * @version 1.0
 *
 * @since 21-Jan-2021
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuRatingSummaryIndexDto extends AbstractSearchIndexDto {

	private static final long serialVersionUID = -9098999978776565L;

	private String residenceFoodMenuId;

	private LocalDate menuDate;

	private String cityId;

	private String micromarketId;

	private String residenceId;

	private String menuCategoryId;

	private MealType mealType;

	private Integer totalScanned;

	private Integer totalOrderedPax;

	private Integer mir;

	private Integer totalRating;

	private Integer totalRatingCount;

	private Double avgRating;

	private Integer delightedCount;

	private Integer disgustedCount;

	private Integer fpsCount;

	private String mealId;

	private String mealGroupId;

	private String thaliId;

	private String thaliVariant;
}
