package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class KitchenOrderMealRequestDto {

	@NotNull(message = "stanzaStaffCount cannot be null")
	private Integer stanzaStaffCount;

	@NotNull(message = "nonStanzaStaffCount cannot be null")
	private Integer nonStanzaStaffCount;
	private MealType mealType;

}
