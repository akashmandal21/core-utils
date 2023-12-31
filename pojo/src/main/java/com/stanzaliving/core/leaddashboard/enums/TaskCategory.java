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

	TASK("#58CCB6","#58CCB6","Task"),
	MEETING("#007AFF","#C7CEEA","Meeting");
	
	private String taskCategoryColor;
	private String taskCategoryColorV3;
	private String label;
}
