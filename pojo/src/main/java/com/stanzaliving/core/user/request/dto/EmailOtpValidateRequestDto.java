/**
 * 
 */
package com.stanzaliving.core.user.request.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.stanzaliving.core.utilservice.annotations.EnsureNumber;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author navratan.choudhary
 *
 * @date 04-Feb-2020
 */
@Getter
@Setter
@ToString(callSuper = true)
public class EmailOtpValidateRequestDto extends EmailVerificationRequestDto {

	@NotBlank(message = "OTP cannot be blank")
	@Size(min = 4, max = 6, message = "OTP must be of 4-6 charaters")
	@EnsureNumber(message = "OTP must contain only numbers", fieldName = "OTP")
	private String otp;
	
	@NotBlank(message = "user UUID is Mandatory for Email Verification By Otp And Updating the user details")
	private String userUuid;
	
	@NotBlank(message = "Email is Mandatory for Email Verification By Otp And Updating the user details")
	@Email(message = "Email Format is not correct")
	private String email;
	
	private String firstName;
	
	private String lastName;
}
