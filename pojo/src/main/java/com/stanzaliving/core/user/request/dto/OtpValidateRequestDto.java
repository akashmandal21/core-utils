/**
 * 
 */
package com.stanzaliving.core.user.request.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.stanzaliving.core.utilservice.annotations.EnsureNumber;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen
 *
 * @date 09-Oct-2019
 */
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class OtpValidateRequestDto extends LoginRequestDto {

	@NotBlank(message = "OTP cannot be blank")
	@Size(min = 4, max = 6, message = "OTP must be of 4-6 charaters")
	@EnsureNumber(message = "OTP must contain only numbers", fieldName = "OTP")
	private String otp;
}
