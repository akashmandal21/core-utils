package com.stanzaliving.estate_v2.dto.questionTemplate;

import com.stanzaliving.core.dto.AbstractMongoDto;
import com.stanzaliving.estate_v2.annotation.constraint.EmptyOrNull;
import com.stanzaliving.estate_v2.annotation.operation.PostGroup;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class QuestionTemplateDto extends AbstractMongoDto {

    @Size(max = 30,message = "Template name should be less than 30 characters",groups = PostGroup.class)
    @EmptyOrNull(message = "Template name cannot be empty or null", groups = PostGroup.class)
    private String name;
    @NotNull(message = "status cannot be null",groups = PostGroup.class)
    private String status;
    @NotNull(message = "Mapped Property Type cannot be null",groups = PostGroup.class)
    private String mappedPropertyType;
    @NotNull(message = "Applicable Status cannot be null",groups = PostGroup.class)
    private List<ApplicableStatusesDto> applicableStatuses;
}
