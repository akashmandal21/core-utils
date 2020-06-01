package com.stanzaliving.core.food.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush srivastava
 *
 * @date 09-May-2020
 *
 **/

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuTemplateGroupDto {
	private String menuCategoryId;

	private int weekNumber;

	private boolean compositionRulesSatisfied;

}
