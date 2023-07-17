package com.stanzaliving.sfr.dto.question;

import com.stanzaliving.sfr.annotation.constraint.EmptyOrNull;
import com.stanzaliving.sfr.dto.questionTemplate.conditions.MandatoryConditionDto;
import com.stanzaliving.sfr.dto.questionTemplate.conditions.VisibilityConditionDto;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QuestionDto {
    private String uuid;
    @EmptyOrNull(message = "Type cannot be null or empty")
    private String type;
    private List<String> variableName;
    @Size(max = 120)
    private String helpText;
    @NotNull(message = "Display order cannot be null")
    @Positive
    private Integer displayOrder;
    @EmptyOrNull(message = "Status cannot be empty or null")
    private String status;
    @Size(max = 120)
    private String errorText;
    private HelperImageDto helperImage;
    private String questionType;
    @NotNull(message = "Mandatory Condition cannot be empty or null")
    private VisibilityConditionDto visibilityCondition;
    @NotNull(message = "Mandatory Condition cannot be empty or null")
    private MandatoryConditionDto mandatoryCondition;
    private Object questionDetails;
    private boolean duplicate;
}
