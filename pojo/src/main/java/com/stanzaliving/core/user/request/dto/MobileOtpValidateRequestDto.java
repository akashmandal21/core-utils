/**
 * 
 */
package com.stanzaliving.core.user.request.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

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
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MobileOtpValidateRequestDto extends MobileOtpRequestDto {

	@NotBlank(message = "OTP cannot be blank")
	@Size(min = 4, max = 6, message = "OTP must be of 4-6 charaters")
	@EnsureNumber(message = "OTP must contain only numbers", fieldName = "OTP")
	private String otp;

}