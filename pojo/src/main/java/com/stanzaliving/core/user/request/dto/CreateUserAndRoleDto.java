/**
 * 
 */
package com.stanzaliving.core.user.request.dto;

import com.stanzaliving.core.user.acl.request.dto.AddUserDeptLevelRoleRequestDto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class CreateUserAndRoleDto {

	private AddUserRequestDto addUserRequestDto;
	
	private AddUserDeptLevelRoleRequestDto addUserDeptLevelRoleDto;
}
