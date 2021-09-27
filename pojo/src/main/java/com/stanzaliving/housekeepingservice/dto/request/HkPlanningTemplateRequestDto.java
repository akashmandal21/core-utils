package com.stanzaliving.housekeepingservice.dto.request;

import com.stanzaliving.housekeepingservice.enums.HKPlanningTemplateStatus;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author Vikas S T
 * @date 23-Sep-21
 **/

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class HkPlanningTemplateRequestDto {

    @NotBlank(message = "Template name is mandatory")
    private String templateName;

    @NotBlank(message = "Micro cluster uuid is mandatory")
    private String microClusterUuid;

    private HKPlanningTemplateStatus templateStatus;

    private List<ShiftAllocationRequestDto> shiftsAllocationDtos;

    @NotNull(message = "Entities uuid is mandatory")
    private List<String> applicableEntities;

    private List<String> tags;
}
