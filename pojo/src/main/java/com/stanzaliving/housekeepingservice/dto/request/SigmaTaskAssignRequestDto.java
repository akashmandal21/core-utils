package com.stanzaliving.housekeepingservice.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

/**
 * @author Vikas S T
 * @date 25-Nov-21
 **/

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class SigmaTaskAssignRequestDto {
    @NotBlank(message = "Task uuid is mandatory")
    private String taskUuid;

    @NotBlank(message = "Pseudo person uuid is mandatory")
    private String pseudoPersonUuid;

    @NotBlank(message = "Hk beat person uuid is mandatory")
    private String hkBeatPersonUuid;

    @NotBlank(message = "Micro cluster uuid is mandatory")
    private String microClusterUuid;

    @NotBlank(message = "Residences uuid is mandatory")
    private String residenceUuid;
}
