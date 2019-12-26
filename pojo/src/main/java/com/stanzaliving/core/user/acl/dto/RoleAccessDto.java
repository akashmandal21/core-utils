/**
 * 
 */
package com.stanzaliving.core.user.acl.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.user.acl.enums.RoleAccessType;
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
public class RoleAccessDto extends AbstractDto {

	@NotBlank
	private String roleUuid;

	@NotBlank
	private RoleAccessType roleAccessType;

	@NotBlank
	private String accessUuid;

}