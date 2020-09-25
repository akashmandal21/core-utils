package com.stanzaliving.core.food.dto.request;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

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
public class UserMenuPreferencesUpdateDto {

	@NotBlank(message = "User Id Cannot be blank")
	private String userId;

	@NotEmpty(message = "Menu preferences selection are mandatory")
	private List<UserMenuPreferenceAddDto> menuPreferences;

}