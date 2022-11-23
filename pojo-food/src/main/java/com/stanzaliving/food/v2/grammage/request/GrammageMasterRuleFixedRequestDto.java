package com.stanzaliving.food.v2.grammage.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 19-Apr-2021
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class GrammageMasterRuleFixedRequestDto {

	@NotBlank(message = "Sub-Category selection is mandatory")
	private String subCategoryId;

	private boolean quantifiable;

	@NotNull(message = "Value selection is mandatory")
	@Min(value = 1, message = "Value must be an integer value greater than 0")
	private Integer value;

	@NotEmpty(message = "Applicable meals selection is mandatory")
	private Set<String> applicableMeals;

	@NotEmpty(message = "Applicable thalis selection is mandatory")
	private Set<String> applicableThalis;

}
