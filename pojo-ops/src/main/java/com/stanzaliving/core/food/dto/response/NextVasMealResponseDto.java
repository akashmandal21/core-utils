package com.stanzaliving.core.food.dto.response;


import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 04-Sep-2020
 */


@Getter
@Setter
@SuperBuilder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class NextVasMealResponseDto {
	private MealType nextMeal;

	private String nextMealName;

	private long nextMealItemsCount;

	private LocalDate mealDate;

	private List<VasMealItemResponseDto> items;

}
