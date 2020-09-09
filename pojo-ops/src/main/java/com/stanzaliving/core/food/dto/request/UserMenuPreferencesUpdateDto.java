package com.stanzaliving.core.food.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

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

	@NotNull(message = "Menu preferences selection are mandatory")
	List<UserMenuPreferenceAddDto> menuPreferences;

}
