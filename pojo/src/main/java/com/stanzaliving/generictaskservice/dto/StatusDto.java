package com.stanzaliving.generictaskservice.dto;

import com.stanzaliving.core.base.enums.Department;
import lombok.*;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class StatusDto {

    private String uuid;

    private String statusName;

    private String parentStatusUuid;

    private Department department;

    private List<StatusDto> subStatusList;
}
