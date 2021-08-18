package com.stanzaliving.generictaskservice.dto;

import lombok.*;

import java.util.List;
import java.util.Map;

/**
 * @author anudeep.alevoor
 *
 *
 * Task History Timeline Dto class for Task Service History.
 *
 */

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskTimelineDto {

    String taskName;

    String taskId;

    String taskOwner;

    String subTaskStatus;

    String subTaskSubStatus;

    String taskStatus;

    String taskSubStatus;

    private List<String> comments;

    Map<String, Object> metaDataChanges;

}
