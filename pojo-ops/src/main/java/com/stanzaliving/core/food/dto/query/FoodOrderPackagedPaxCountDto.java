package com.stanzaliving.core.food.dto.query;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 11-july-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodOrderPackagedPaxCountDto {
	private LocalDate menuDate;

	private String vendorId;

	private String residenceId;

	private MealType mealType;

	private Integer vegPaxCount;

	private Integer nonVegPaxCount;

	private Integer stanzaStaffVegPaxCount;

	private Integer nonStanzaStaffVegPaxCount;

	private boolean comboOrder;
}
