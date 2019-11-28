/**
 * 
 */
package com.stanzaliving.core.user.acl.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.base.enums.Department;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen
 *
 * @date 21-Oct-2019
 */
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class RoleDto extends AbstractDto {

	private String roleName;

	private Department department;

	private AccessLevel accessLevel;

}