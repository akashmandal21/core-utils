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
    private List<GenericTaskResponseDto> todaysTasks;
    private List<GenericTaskResponseDto> pendingTasks;
    private List<GenericTaskResponseDto> notStartedTasks;

}
