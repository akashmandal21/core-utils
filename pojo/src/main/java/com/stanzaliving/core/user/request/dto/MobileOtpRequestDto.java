/**
 * 
 */
package com.stanzaliving.core.user.request.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.user.enums.OtpType;
import com.stanzaliving.core.user.enums.UserType;
import com.stanzaliving.core.utilservice.annotations.EnsureNumber;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 28 Jul, 2020
 *
 **/

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MobileOtpRequestDto {

	@NotNull(message = "OTP Type is mandatory")
	private OtpType otpType;

	@NotBlank(message = "Mobile Number is Mandatory for Login")
	@EnsureNumber(message = "Mobile must contain only numbers", fieldName = "mobile")
	private String mobile;

	@NotBlank(message = "ISO Code is Mandatory for Login")
	private String isoCode;

	@NotNull(message = "User Type is mandatory")
	private UserType userType;
}