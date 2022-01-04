package com.stanzaliving.generictaskservice.dto;

import com.stanzaliving.core.base.enums.Department;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author Vikas S T
 * @date 02-Sep-21
 **/

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@ToString
@NoArgsConstructor
public class DependencyTaskStatusFilterDto {

    private Department department;

    private String dependencyTaskStatusName;
}
