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

    private String taskName;

    private String taskId;

    private String taskOwner;

    private String subTaskStatus;

    private String subTaskSubStatus;

    private String taskStatus;

    private String taskSubStatus;

    private List<String> comments;

    private Map<String, Object> metaDataChanges;

}
