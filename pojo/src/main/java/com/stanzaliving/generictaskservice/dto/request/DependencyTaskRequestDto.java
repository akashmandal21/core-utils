package com.stanzaliving.generictaskservice.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

/**
 * @author Vikas S T
 * @date 02-Sep-21
 **/

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DependencyTaskRequestDto {

    @NotBlank(message = "Task uuid cannot be blank")
    private String taskUuid;

    @NotBlank(message = "Dependent task uuid cannot be blank")
    private String dependentTaskUuid;

    @NotBlank(message = "Dependent task status uuid cannot be blank")
    private String dependentTaskStatusUuid;

}
