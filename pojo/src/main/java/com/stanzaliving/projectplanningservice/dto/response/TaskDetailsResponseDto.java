package com.stanzaliving.projectplanningservice.dto.response;

import com.stanzaliving.generictaskservice.dto.response.GenericTaskResponseDto;
import com.stanzaliving.projectplanningservice.dto.PPStatusDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class TaskDetailsResponseDto {

    private List<GenericTaskResponseDto> tasks;

    private List<PPStatusDto> statusDtoList;

    /* According to change request */
    // private List<TaskDetailsWithPropertyResponseDto> todaysTasks;
    private List<TaskDetailsWithPropertyResponseDto> wipTasks;

    private Integer wipTasksCount;

    // private List<TaskDetailsWithPropertyResponseDto> pendingTasks;
    private List<TaskDetailsWithPropertyResponseDto> upcomingTasks;

    private Integer upcomingTasksCount;

    // private List<TaskDetailsWithPropertyResponseDto> notStartedTasks;
    private List<TaskDetailsWithPropertyResponseDto> delayedTasks;

    private Integer delayedTasksCount;

    private List<TaskDetailsWithPropertyResponseDto> myTasks;

    private Integer myTasksCount;
}
