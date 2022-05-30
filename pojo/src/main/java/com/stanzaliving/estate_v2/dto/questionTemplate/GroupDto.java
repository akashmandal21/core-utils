package com.stanzaliving.estate_v2.dto.questionTemplate;

import com.stanzaliving.estate_v2.annotation.constraint.EmptyOrNull;
import com.stanzaliving.estate_v2.dto.questionTemplate.conditions.MandatoryConditionDto;
import com.stanzaliving.estate_v2.dto.questionTemplate.conditions.VisibilityConditionDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GroupDto {
    @Size(max = 30,message = "Group Name should be less than 30 characters")
    @EmptyOrNull(message = "Group name cannot be empty or null")
    private String name;
    @Size(max = 120,message = "Help Text should be less than 120 characters")
    private String helpText;
    @Min(value = 1, message = "The Display Order cannot be 0 or negative Values")
    @NotNull(message = "Display Order cannot be empty or null")
    private Integer displayOrder;
    @EmptyOrNull(message = "Status cannot be empty or null")
    private String status;
    @Size(min = 1,message = "Mandatory to choose at-least 1 Applicable Status")
    @NotNull(message = "Applicable Status cannot be null")
    private List<ApplicableStatusesDto> applicableStatuses;
    private List<ApplicableStatusesDto> submitStatuses;
    private List<ApplicableStatusesDto> approveStatuses;
    private VisibilityConditionDto visibilityCondition;
    private MandatoryConditionDto mandatoryCondition;
    private PrivilegeDto privileges;
    @NotNull(message = "Page cannot be null")
    private List<PagesDto> pages;
}
