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

	SYSTEM_GENERATED("System Generated", "#E02020", "#60C3AD"),
	SELF_CREATED("Self Created", "#6DD400", "#5FC4F5");
	private String taskTypeDesc;
	private String colorCode;
	private String colorCodeV3;
}
