package com.stanzaliving.estate_v2.dto.questionTemplate;

import com.stanzaliving.core.dto.AbstractMongoDto;
import com.stanzaliving.estate_v2.annotation.constraint.EmptyOrNull;
import com.stanzaliving.estate_v2.dto.question.ListOfQuestions;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class QuestionTemplateDto extends AbstractMongoDto {

    @Size(max = 30,message = "Template name should be less than 30 characters")
    @EmptyOrNull(message = "Template name cannot be empty or null")
    private String name;
    @NotNull(message = "status cannot be null")
    private String questionTemplateStatus;
    @NotNull(message = "Mapped Property Type cannot be null")
    private @Valid MappedPropertyTypeDto mappedPropertyType;
    @NotNull(message = "Applicable Status cannot be null")
    private List<ApplicableStatusesDto> applicableStatuses;
    private @Valid ListOfQuestions listOfQuestions;
    private List<GroupDto> groups;
}
