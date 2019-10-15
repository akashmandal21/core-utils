/**
 * 
 */
package com.stanzaliving.core.user.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.user.enums.UserType;

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
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto extends AbstractDto {

	private String isoCode;

	private String mobile;

	private Boolean mobileVerified;

	private String email;

	private Boolean emailVerified;

	private UserType userType;

}