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
public enum TaskCategory {

	TASK("#58CCB6","#58CCB6"),
	MEETING("#007AFF","#C7CEEA");
	
	private String taskCategoryColor;
	private String taskCategoryColorV3;
}
