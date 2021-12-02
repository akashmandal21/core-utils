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
public class HideReasonsRequestDto {

    @NotBlank(message = "Property uuid is required")
    private String propertyUuid;

    @NotBlank(message = "Current task uuid is required")
    private String currentTaskUuid;

    @NotBlank(message = "Reason is required")
    private String hideReason;

    @NotBlank(message = "Current task name is required")
    private String currentTaskName;
}
