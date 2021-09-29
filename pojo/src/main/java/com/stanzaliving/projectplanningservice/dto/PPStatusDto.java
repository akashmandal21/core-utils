package com.stanzaliving.projectplanningservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class PPStatusDto {

    private String statusName;
    private int totalTasks;
    private double statusPercent;

}
