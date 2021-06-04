package com.stanzaliving.estate_v2.dto.question;

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
public class QuestionDto {
    private String questionId;
    @EmptyOrNull(message = "Question name cannot be null or empty")
    @Size(max = 30)
    private String questionName;
    @EmptyOrNull(message = "Variable name cannot be null or empty")
    @Size(max = 30)
    private String variableName;
    @Size(max = 120)
    private String helpText;
    @NotNull(message = "Display order cannot be null")
    @Positive
    private Integer displayOrder;
    @EmptyOrNull(message = "Status cannot be null")
    private String status;
    @EmptyOrNull(message = "ErrorText cannot be null")
    private String errorText;
    private HelperImageDto helperImage;
    private String questionType;
    private VisibilityConditionDto visibilityCondition;
    private MandatoryConditionDto mandatoryCondition;
    private Object questionDetails;
}
