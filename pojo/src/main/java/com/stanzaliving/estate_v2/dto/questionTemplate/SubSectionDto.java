package com.stanzaliving.estate_v2.dto.questionTemplate;

import com.stanzaliving.estate_v2.annotation.constraint.EmptyOrNull;
import com.stanzaliving.estate_v2.dto.questionTemplate.conditions.MandatoryConditionDto;
import com.stanzaliving.estate_v2.dto.questionTemplate.conditions.VisibilityConditionDto;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubSectionDto {

    @EmptyOrNull(message = "Type cannot be null")
    private String type;
    @EmptyOrNull(message = "Section name cannot be null or empty")
    @Size(max = 30)
    private String name;
    @Size(max = 120)
    private String helpText;
    @NotNull(message = "Display order cannot be null")
    @Positive
    private Integer displayOrder;
    @EmptyOrNull(message = "Status cannot be null")
    private String status;
    @NotNull(message = "Display-Type cannot be null")
    private String displayType;
    private Object displayTypeDetails;
    @EmptyOrNull(message = "SubSection-Repeat cannot be null")
    private String subSectionRepeat;
    private String attribute;
    private VisibilityConditionDto visibilityCondition;
    private MandatoryConditionDto mandatoryCondition;
    private Boolean visible;
    private Boolean childOf;
}
