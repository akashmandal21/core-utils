package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.rule.engine.dto.ConditionDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author piyush srivastava
 *
 * @date 12-May-2020
 *
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DaywiseWeeklyRuleMealResponseDto extends ConditionDto {

	private boolean passed;

	private List<WeeklyDaywiseMealResponseDto> daywiseMeals;
}
