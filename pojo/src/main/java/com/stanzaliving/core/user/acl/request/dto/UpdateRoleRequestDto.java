/**
 * 
 */
package com.stanzaliving.core.user.acl.request.dto;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.base.enums.Department;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

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
public class UpdateRoleRequestDto extends AddRoleRequestDto {

	@NotBlank(message = "Role Uuid is Mandatory")
	private String roleUuid;

	@NotBlank
	private Department department;

	@NotBlank
	private AccessLevel accessLevel;

}