package com.stanzaliving.food.v2.monthlybudgetplanner.dto;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class SpecialDayMenuRequestDto implements Serializable {

	private static final long serialVersionUID = -1514284428718051364L;

	private MealType mealType;
	private List<String> mealGroupIdList;

}
