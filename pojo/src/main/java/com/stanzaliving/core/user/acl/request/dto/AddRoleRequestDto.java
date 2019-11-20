/**
 * 
 */
package com.stanzaliving.core.user.acl.request.dto;

import javax.validation.constraints.NotBlank;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.base.enums.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 22-Oct-2019
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AddRoleRequestDto {

	@NotBlank(message = "Role Name is Mandatory")
	private String roleName;

	@NotBlank
	private Department department;

	@NotBlank
	private AccessLevel accessLevel;

}