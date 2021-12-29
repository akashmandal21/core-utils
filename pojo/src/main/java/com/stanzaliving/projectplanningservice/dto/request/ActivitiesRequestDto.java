package com.stanzaliving.projectplanningservice.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ActivitiesRequestDto {

    @NotBlank(message = "Activity name cannot be empty")
    private String activityName;

    @NotBlank(message = "Module id is required")
    private String moduleUuid;

    @NotBlank(message = "Module background color code cannot be empty")
    private String colorCode;

    @NotBlank(message = "Module text color code cannot be empty")
    private String textColorCode;
}
