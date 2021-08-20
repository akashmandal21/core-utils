package com.stanzaliving.food.v2.menu.dto;


import com.stanzaliving.food.v2.category.dto.MealWiseMenuDto;
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
public class MenuHistoryDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<MealWiseMenuDto> mealWiseMenu;
}
