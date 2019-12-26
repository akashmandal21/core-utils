/**
 * 
 */
package com.stanzaliving.core.user.acl.request.dto;

import com.stanzaliving.core.user.acl.enums.RoleAccessType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author naveen.kumar
 *
 * @date 23-Oct-2019
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AddRoleAccessDto {

	@NotBlank
	private String roleUuid;

	@NotBlank
	private String accessUuid;

	@NotNull
	private RoleAccessType roleAccessType;

}