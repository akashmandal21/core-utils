package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.food.enums.FoodItemBasePreference;
import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 30-June-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MultiMenuComboPaxCount {
	private LocalDate menuDate;

	private String vendorId;

	private String residenceId;

	private MealType mealType;

	private FoodItemBasePreference basePreference;

	private Double vegPaxCount;

	private Double nonVegPaxCount;

	private Double stanzaStaffVegPaxCount;

	private Double nonStanzaStaffPaxCount;
}
