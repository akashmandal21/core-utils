/**
 * 
 */
package com.stanzaliving.core.operations.dto;

import java.util.Set;

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
public class StaffingUpdateDto {

	private String requirementId;

	private Set<String> usersAdded;
	
	private Set<String> usersRemoved;
}