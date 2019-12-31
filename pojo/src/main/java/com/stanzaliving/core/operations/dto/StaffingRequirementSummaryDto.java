/**
 * 
 */
package com.stanzaliving.core.operations.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author naveen.kumar
 *
 * @date 03-Dec-2019
 *
 **/
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StaffingRequirementSummaryDto {

	private int assigned;

	private int configured;

	private String roleId;

	private String roleName;

	private List<String> users;
}