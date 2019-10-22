/**
 * 
 */
package com.stanzaliving.core.user.acl.request.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;

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
public class AssignUserRoleDto {

	@NotBlank(message = "User Id is mandatory to assign roles")
	private String userId;

	private List<String> roleIds;
}