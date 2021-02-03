package com.stanzaliving.core.food.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.util.List;

/**
 *
 * @author piyush srivastava
 *
 * @date 09-May-2020
 *
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DayWiseFoodMenuDto implements Serializable {

	private DayOfWeek dayOfWeek;

	private List<MealWiseFoodMenuDto> mealWiseFoodMenus;
}