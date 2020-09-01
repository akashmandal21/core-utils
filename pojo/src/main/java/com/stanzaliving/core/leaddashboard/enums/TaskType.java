/**
 * 
 */
package com.stanzaliving.core.leaddashboard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author raj.kumar
 *
 */
@Getter
@AllArgsConstructor
public enum TaskType {

	SYSTEM_GENERATED("System Generated"),
	SELF_CREATED("Self Created");
	
	private String taskTypeDesc;
}
