package com.stanzaliving.core.food.dto.grammage.request;

import com.stanzaliving.core.food.enums.ThaliOption;
import com.stanzaliving.core.operations.enums.MealType;
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

	@NotBlank(message = "Sub Category Selection is mandatory")
	private String subCategoryId;

	private boolean quantifiable;

	@NotNull(message = "Value selection is mandatory")
	@Min(value = 1, message = "Value must be an integer value greater than 0")
	private Integer value;

	@NotEmpty(message = "Applicable meals selection is mandatory")
	private Set<MealType> applicableMeals;

	@NotEmpty(message = "Applicable Thalis Selection is mandatory")
	private Set<ThaliOption> applicableThalis;

}
