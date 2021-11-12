package com.stanzaliving.generictaskservice.dto.response;

import com.stanzaliving.generictaskservice.dto.GenericTaskDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author Vikas S T
 * @date 02-Sep-21
 **/

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DependencyTaskResponseDto{

    private String taskUuid;

    private GenericTaskDto task;

    private DependencyTaskStatusResponseDto dependencyStatus;

    private String dependentTaskUuid;

    private String dependentTaskStatusUuid;

}
