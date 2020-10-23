/**
 * 
 */
package com.stanzaliving.core.user.request.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * 
 * @author naveen.kumar
 *
 * @date 19-Oct-2020
 *
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MobileEmailOtpRequestDto extends MobileOtpRequestDto {

	@NotBlank(message = "Email is mandatory")
	@Email(message = "Email must be valid")
	private String email;

}