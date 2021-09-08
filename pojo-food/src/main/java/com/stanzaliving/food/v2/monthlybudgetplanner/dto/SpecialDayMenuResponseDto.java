package com.stanzaliving.food.v2.monthlybudgetplanner.dto;

import com.stanzaliving.food.v2.category.dto.DayWiseCogsDto;
import com.stanzaliving.food.v2.category.dto.MealWiseMenuDto;
import com.stanzaliving.food.v2.menu.dto.MenuWiseMenuSearchRDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class SpecialDayMenuResponseDto extends MenuWiseMenuSearchRDto {

	private EventsDemographicsDetailsDto eventsDemographicsDetailsDto;
	private List<MealWiseMenuDto> mealWiseMenus;
	private DayWiseCogsDto eventdayCogs;

}
