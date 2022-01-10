package com.stanzaliving.gamificationservice.dto.mock;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ContestTaskDto {

 @JsonProperty("task_progress")
 private String taskProgress;

 @JsonProperty("completed_task")
 private String completedTask;

 @JsonProperty("total_task")
 private String totalTask;

 @JsonProperty("task_name")
 private String taskName;
}
