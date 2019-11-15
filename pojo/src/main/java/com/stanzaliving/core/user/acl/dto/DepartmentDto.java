/**
 * 
 */
package com.stanzaliving.core.user.acl.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;

import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author naveen.kumar
 *
 * @date 13-Nov-2019
 *
 **/
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDto extends AbstractDto {

	private String departmentName;
}