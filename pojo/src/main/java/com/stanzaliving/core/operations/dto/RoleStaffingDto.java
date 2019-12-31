/**
 * 
 */
package com.stanzaliving.core.operations.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 2-Dec-2019
 *
 **/
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class RoleStaffingDto {

	private String requirementId;

	private String roleId;

	private String roleName;

	private int requirement;

	private int available;

	private List<OpsUserMetadata> userMetadatas;
}