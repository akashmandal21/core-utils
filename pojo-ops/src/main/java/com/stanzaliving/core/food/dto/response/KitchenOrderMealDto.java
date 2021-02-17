package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class KitchenOrderMealDto {

	private Integer stanzaStaffCount;
	private Integer nonStanzaStaffCount;
	private Double stanzaCost;
	private Double nonStanzaCost;
	private LocalTime cutOffTime;
	private String mealType;
}
