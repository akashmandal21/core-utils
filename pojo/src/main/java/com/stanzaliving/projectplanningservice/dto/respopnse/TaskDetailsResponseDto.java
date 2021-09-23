package com.stanzaliving.projectplanningservice.dto.respopnse;

import com.stanzaliving.generictaskservice.dto.response.GenericTaskResponseDto;
import com.stanzaliving.projectplanningservice.dto.StatusDto;
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
    private String totalProperty;
    private List<StatusDto> taskStatus;
}
