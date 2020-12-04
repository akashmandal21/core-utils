/**
 * 
 */
package com.stanzaliving.core.user.request.dto;

import javax.validation.constraints.NotBlank;

import com.stanzaliving.core.user.enums.UserType;
import com.stanzaliving.core.utilservice.annotations.EnsureNumber;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen
 *
 * @date 09-Oct-2019
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequestDto {

	@NotBlank(message = "ISO Code is Mandatory for Login")
	private String isoCode;

	@NotBlank(message = "Mobile Number is Mandatory for Login")
	@EnsureNumber(message = "Mobile must contain only numbers", fieldName = "mobile")
	private String mobile;
	
	private UserType userType;
	
}