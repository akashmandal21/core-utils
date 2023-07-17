package com.stanzaliving.generictaskservice.dto.request;

import com.stanzaliving.core.base.enums.Department;
import lombok.*;

/**
 * @author anudeep.alevoor
 *
 * @date 29-Nov-2021
 *
 **/

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskStatusRequestDto {
    private String uuid;

    private String statusName;

    private Department department;

    private String module;
}
