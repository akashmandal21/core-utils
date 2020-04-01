/**
 * 
 */
package com.stanzaliving.taskservice.response.dto;

import com.stanzaliving.taskservice.enums.TaskContextName;
import com.stanzaliving.taskservice.enums.TaskType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class TaskResponseDto {

	private String contextUuid;
	private TaskContextName taskContextName;
	private String statusName;
	private String userUuid;
	private String taskUuid;
	private TaskType taskType;
	private String role;
}
