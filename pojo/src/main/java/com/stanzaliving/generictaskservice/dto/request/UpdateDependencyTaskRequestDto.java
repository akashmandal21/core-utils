package com.stanzaliving.generictaskservice.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

/**
 * @author Vikas S T
 * @date 03-Sep-21
 **/

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateDependencyTaskRequestDto {

    @NotBlank(message = "Uuid cannot be blank")
    private String uuid;

    @NotBlank(message = "Dependent task status uuid cannot be blank")
    private String dependentTaskStatusUuid;

}
