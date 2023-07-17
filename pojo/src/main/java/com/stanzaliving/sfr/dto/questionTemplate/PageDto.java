package com.stanzaliving.sfr.dto.questionTemplate;

import com.stanzaliving.sfr.annotation.constraint.EmptyOrNull;
import com.stanzaliving.sfr.dto.questionTemplate.conditions.MandatoryConditionDto;
import com.stanzaliving.sfr.dto.questionTemplate.conditions.VisibilityConditionDto;
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
public class PageDto {
    @Size(max = 30, message = "Page Name should be less than 30 characters")
    @EmptyOrNull(message = "Page name cannot be empty or null")
    private String name;
    @Size(max = 120, message = "Help Text should be less than 120 characters")
    private String helpText;
    @Min(value = 1, message = "The Display Order cannot be 0 or negative Values")
    @NotNull(message = "Display Order cannot be empty or null")
    private Integer displayOrder;
    @EmptyOrNull(message = "Status cannot be empty or null")
    private String status;
    private String pageIcon;
    @Size(min = 1, message = "Mandatory to choose atleast 1 Applicable Status")
    @NotNull(message = "Applicable Status cannot be null")
    private List<ApplicableStatusesDto> applicableStatuses;
    private VisibilityConditionDto visibilityCondition;
    private MandatoryConditionDto mandatoryCondition;
    private PrivilegeDto privileges;
    @NotNull(message = "PageComponent cannot be null")
    private Object pageComponent;
}