package com.stanzaliving.search.food.search.dto.request;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Collection;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 16-Mar-2021
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MenuItemRatingFilterDto {

	private LocalDate fromDate;

	private LocalDate toDate;

	private String micromarketId;

	private String menuCategoryId;

	private MealType mealType;

	private Collection<String> itemIds;

	private Collection<String> residenceIds;

}
