/**
 * 
 */
package com.stanzaliving.core.user.acl.request.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.user.acl.enums.AssignmentType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

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
public class AddRoleAssignDto {

	@NotBlank
	private String roleUuid;

	@NotBlank
	private String assignedUuid;

	@NotBlank
	private AssignmentType assignmentType;

}