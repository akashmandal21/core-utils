package com.stanzaliving.core.food.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 29-July-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserOtpValidationDto {
	private String mobile;

	private String otp;
}
