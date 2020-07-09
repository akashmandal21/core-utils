package com.stanzaliving.core.food.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.food.enums.FoodPreference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserMenuPreferenceUpdateDto {

	@NotBlank(message = "User Id Cannot be blank")
	private String userId;

	@NotBlank(message = "Residence Food Menu Id Cannot be blank")
	private String residenceFoodMenuId;

	private String userResidenceFoodMenuId;

	@NotNull(message = "Food Preference Selection is mandatory")
	private FoodPreference foodPreference;

}