package com.stanzaliving.generictaskservice.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.util.List;

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

    private String dependentTaskUuid;

    private String dependentTaskStatusUuid;

    private List<String> dependentTaskUuidList;

}
