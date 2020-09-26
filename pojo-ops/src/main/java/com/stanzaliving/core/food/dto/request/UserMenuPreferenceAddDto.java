package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.food.enums.FoodItemType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 09-Sep-2020
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserMenuPreferenceAddDto {

	@NotBlank(message = "Residence Food Menu Id Cannot be blank")
	private String residenceFoodMenuId;

	@NotNull(message = "Food Preference Selection is mandatory")
	private FoodItemType foodPreference;
}