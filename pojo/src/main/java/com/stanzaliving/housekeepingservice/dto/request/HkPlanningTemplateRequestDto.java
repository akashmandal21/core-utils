package com.stanzaliving.housekeepingservice.dto.request;

import com.stanzaliving.generictaskservice.dto.ShiftAllocationDto;
import com.stanzaliving.housekeepingservice.enums.HKPlanningTemplateStatus;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * @author Vikas S T
 * @date 23-Sep-21
 **/

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@ToString
@NoArgsConstructor
public class HkPlanningTemplateRequestDto {
    @NotBlank(message = "Template name is mandatory")
    private String templateName;

    @NotBlank(message = "Micro cluster uuid is mandatory")
    private String microClusterUuid;

    @NotEmpty(message = "Entities uuid is mandatory")
    private List<String> applicableEntities;

    private List<String> tags;

    private List<ShiftAllocationDto> shiftsAllocationDtos;

    private HKPlanningTemplateStatus templateStatus;
}
