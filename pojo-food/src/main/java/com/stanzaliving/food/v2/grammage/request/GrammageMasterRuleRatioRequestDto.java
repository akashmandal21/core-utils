package com.stanzaliving.food.v2.grammage.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 20-Apr-2021
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class GrammageMasterRuleRatioRequestDto {
	@NotEmpty(message = "Controlling category can not be empty")
	private Set<String> controllingSubCategoryId;

	@NotEmpty(message = "Derived category can not be empty")
	private Set<String> derivedSubCategoryId;

	@NotNull(message = "Controlling ratio is mandatory")
	private Double controllingRatio;

	@NotNull(message = "Derived ratio is mandatory")
	private Double derivedRatio;

	@NotEmpty(message = "Applicable Meals are mandatory")
	private Set<String> applicableMeals;

	@NotEmpty(message = "Applicable Thalis are mandatory")
	private Set<String> applicableThalis;
}
