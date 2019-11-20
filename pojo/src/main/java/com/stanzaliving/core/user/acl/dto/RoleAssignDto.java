/**
 * 
 */
package com.stanzaliving.core.user.acl.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.user.acl.enums.AssignmentType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

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
public class RoleAssignDto extends AbstractDto {

	@NotBlank
	private String roleUuid;

	@NotBlank
	private String assignedUuid;

	@NotBlank
	private AssignmentType assignmentType;

}