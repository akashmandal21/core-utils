package com.stanzaliving.generictaskservice.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalTime;

/**
 * @author Vikas S T
 * @date 26-Oct-21
 **/

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class GarbageCollectionRequestDto {

    @NotNull(message = "Default duration is mandatory")
    private LocalTime duration;

    @NotBlank(message = "Module is required")
    private String module;

    @NotBlank(message = "Residence uuid is required")
    private String residenceUuid;
}
