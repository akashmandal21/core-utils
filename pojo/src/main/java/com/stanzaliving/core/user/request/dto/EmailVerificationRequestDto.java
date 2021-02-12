/**
 * 
 */
package com.stanzaliving.core.user.request.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author navratan.choudhary
 *
 * @date 04-Feb-2020
 */
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmailVerificationRequestDto {

	@NotBlank(message = "Email is Mandatory for Email Verification By Otp")
	@Email(message = "Email Format is not correct")
	private String email;
	
	@NotBlank(message = "User Uuid is Mandatory for email verification")
	private String userUuid;
}