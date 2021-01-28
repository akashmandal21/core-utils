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
public class FoodMenuItemRatingSummaryIndexDto extends AbstractDto {

	private static final long serialVersionUID = -9787756546772827L;

	private LocalDate menuDate;

	private String residenceFoodMenuId;

	private String cityId;

	private String micromarketId;

	private String menuCategoryId;

	private String residenceId;

	private MealType mealType;

	private String itemId;

	private Integer totalRating;

	private Integer totalRatingCount;

	private Float avgRating;

	private Integer delightedCount;

	private Integer disgustedCount;

	private Integer fpsCount;

}
