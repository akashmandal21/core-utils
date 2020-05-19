package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.food.dto.CompositionRuleDto;
import com.stanzaliving.core.food.dto.DayWiseFoodMenuDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 18-May-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DayWiseFoodCategoryMenuRulesDto {
	@NotNull(message = "composition Rules can't be blank")
	private CompositionRuleDto rules;

	@NotNull(message = "meal is required.")
	List<DayWiseFoodMenuDto> dayWiseFoodMenuDtos;
}
