package com.stanzaliving.gamificationservice.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ContestTaskResponseDto {
    @JsonProperty("task_progress")
    private int taskProgress;

    @JsonProperty("completed_task")
    private int completedTask;

    @JsonProperty("total_task")
    private int totalTask;

    @JsonProperty("task_name")
    private String taskName;

    @JsonProperty("contestsUuid")
    private String contestsUuid;

}
