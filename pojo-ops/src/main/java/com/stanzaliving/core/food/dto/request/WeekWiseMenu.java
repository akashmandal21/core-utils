package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.food.dto.DayWiseFoodMenuDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
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
public class WeekWiseMenu {

	private Integer weekNumber;

	private List<DayWiseFoodMenuDto> dayWiseFoodMenu;

}