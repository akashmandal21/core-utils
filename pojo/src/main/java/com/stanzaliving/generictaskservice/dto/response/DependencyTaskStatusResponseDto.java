package com.stanzaliving.generictaskservice.dto.response;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.base.enums.Department;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author Vikas S T
 * @date 02-Sep-21
 **/

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DependencyTaskStatusResponseDto extends AbstractDto {

    private String dependencyTaskStatusName;

    private String dependencyTaskStatusParentUuid;

    private Department department;

    private List<DependencyTaskStatusResponseDto> dependencySubTaskStatus;

}
