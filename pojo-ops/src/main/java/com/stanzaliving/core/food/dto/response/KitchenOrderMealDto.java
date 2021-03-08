package com.stanzaliving.core.food.dto.response;

import java.util.Date;

import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
	private Date cutOffTime;
	private EnumListing<MealType> mealType;
}
