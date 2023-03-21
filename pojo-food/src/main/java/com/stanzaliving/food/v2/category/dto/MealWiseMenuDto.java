package com.stanzaliving.food.v2.category.dto;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.Builder;
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
public class MealWiseMenuDto implements Serializable {
	private static final long serialVersionUID = 8221908042191780009L;
	private MealType mealType;
	private Double cogs;
	private Double budgeted;

	private List<DayWiseMenuDto> dayWiseMenu;

	@Builder.Default
	private boolean isBeverageRuleSatisfied = true;
}
