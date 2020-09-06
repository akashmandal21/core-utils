package com.stanzaliving.wanda.login;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.stanzaliving.core.utilservice.annotations.EnsureNumber;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class OtpValidationRequest {

	@NotBlank(message = "OTP cannot be blank")
	@Size(min = 4, max = 6, message = "OTP must be of 4-6 charaters")
	@EnsureNumber(message = "OTP must contain only numbers", fieldName = "OTP")
	private String otp;

	@NotBlank(message = "Mobile Number is Mandatory for Login")
	@EnsureNumber(message = "Mobile must contain only numbers", fieldName = "mobile")
	private String mobileNumber;
}
