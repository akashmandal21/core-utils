package com.stanzaliving.core.user.dto;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.base.enums.Department;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AccessLevelRoleRequestDto {
	
	private String accessLevelUuid;

	private String roleName;
	
	private Department department;
	
	private AccessLevel accessLevel;

}
