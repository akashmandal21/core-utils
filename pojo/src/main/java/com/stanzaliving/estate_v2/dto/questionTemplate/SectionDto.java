package com.stanzaliving.estate_v2.dto.questionTemplate;

import com.stanzaliving.estate_v2.annotation.constraint.EmptyOrNull;
import com.stanzaliving.estate_v2.dto.questionTemplate.conditions.MandatoryConditionDto;
import com.stanzaliving.estate_v2.dto.questionTemplate.conditions.VisibilityConditionDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SectionDto {

    @EmptyOrNull(message = "Section name cannot be null or empty")
    @Size(max = 50)
    private String name;
    @Size(max = 30)
    private String helpText;
    @NotNull(message = "Display order cannot be null")
    @Positive
    private Integer displayOrder;
    @EmptyOrNull(message = "Status cannot be null")
    private String status;
    @EmptyOrNull(message = "Type cannot be null")
    private String type;
    private VisibilityConditionDto visibilityCondition;
    private MandatoryConditionDto mandatoryCondition;
    private Object subSections;
    private Boolean visible;
    private Boolean childOf;
    private Boolean addSectionComponent;
}
