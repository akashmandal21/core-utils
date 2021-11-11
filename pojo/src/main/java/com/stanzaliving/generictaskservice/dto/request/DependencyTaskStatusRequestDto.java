package com.stanzaliving.generictaskservice.dto.request;

import com.stanzaliving.core.base.enums.Department;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
public class DependencyTaskStatusRequestDto {
    @NotBlank(message = "Dependency task status Name Cannot be blank")
    private String dependencyTaskStatusName;

    @NotNull(message = "department is mandatory")
    private Department department;

    private String parentDependencyTaskStatusUuid;
}
