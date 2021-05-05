package com.stanzaliving.food.v2.menu.dto;


import com.stanzaliving.core.food.dto.MealFoodMenuDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MenuHistoryDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<DayWiseMenuDto> dayWiseMenu;
}
