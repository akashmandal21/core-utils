package com.stanzaliving.core.food.dto.grammage.request;

import com.stanzaliving.core.food.enums.ThaliOption;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

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
public class GrammageMasterThaliRequestDto {

	@NotNull(message = "Thali Selection is mandatory")
	private ThaliOption thaliName;

	@Valid
	@NotEmpty(message = "Meal wise grammage selection is mandatory")
	private List<MealGrammageRequestDto> mealGrammages;
}
