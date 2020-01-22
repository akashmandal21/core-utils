/**
 * 
 */
package com.stanzaliving.core.user.request.dto;

import javax.validation.constraints.NotBlank;

import com.stanzaliving.core.user.enums.UserManagerMappingType;

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
public class UserManagerMappingRequestDto {

	@NotBlank(message = "UserId is mandatory to create mapping")
	private String userId;
	
	@NotBlank(message = "ManagerId is mandatory to create mapping")
	private String managerId;
	
	@NotBlank(message = "UserManagerMappingType cannot be blank")
	private UserManagerMappingType userManagerMappingType;
	
	private String changedBy;
}
