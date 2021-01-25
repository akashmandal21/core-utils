/**
 * 
 */
package com.stanzaliving.taskservice.request.dto;

import com.stanzaliving.taskservice.enums.TaskStatus;

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
public class TaskUpdateRequestDto {

	private String taskUuid;
	private TaskStatus taskStatus;
}
