package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class KitchenOrderMealRequestDto {

	private Integer stanzaStaffCount;
	private Integer nonStanzaStaffCount;
	private MealType mealType;

}
