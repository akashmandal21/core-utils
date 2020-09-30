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

	SYSTEM_GENERATED("System Generated", "#E02020"),
	SELF_CREATED("Self Created", "#6DD400");
	
	private String taskTypeDesc;
	private String colorCode;
}
