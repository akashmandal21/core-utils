/**
 * 
 */
package com.stanzaliving.taskservice.request.dto;

import com.stanzaliving.taskservice.enums.TaskContextName;

import lombok.Getter;
import lombok.ToString;
import lombok.Setter;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class TaskRequestDto {

	private String contextUuid;
	private TaskContextName taskContextName;
	private String statusName;
	private String userUuid;
	
}
