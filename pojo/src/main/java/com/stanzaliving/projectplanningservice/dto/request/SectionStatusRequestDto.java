package com.stanzaliving.projectplanningservice.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

/**
 * @author Pradeep Naik R
 * @description DTO for Section Details
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class SectionStatusRequestDto {

    @NotBlank(message = "Uuid is required")
    private String uuid;

    /*
     Status of the task
     */
    @NotBlank(message = "Task status uuid is required")
    private String taskStatusUuid;
}
