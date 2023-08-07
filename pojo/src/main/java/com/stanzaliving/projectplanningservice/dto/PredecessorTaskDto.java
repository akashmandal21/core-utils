package com.stanzaliving.projectplanningservice.dto;

import com.stanzaliving.projectplanningservice.enums.Duration;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class PredecessorTaskDto {

    private String taskUuid;

    private String taskName;

    private int duration;

    private Duration durationUnit;
}
