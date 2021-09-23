package com.stanzaliving.projectplanningservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class StatusDto {

    private String statusName;
    private String NoOfTask;
    private String statusPercent;

}
