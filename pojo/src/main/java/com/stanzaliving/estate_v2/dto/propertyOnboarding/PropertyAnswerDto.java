package com.stanzaliving.estate_v2.dto.propertyOnboarding;

import com.stanzaliving.core.dto.AbstractMongoDto;
import com.stanzaliving.estate_v2.annotation.constraint.EmptyOrNull;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PropertyAnswerDto extends AbstractMongoDto {
    @EmptyOrNull(message = "Property Id cannot be empty or null")
    private String propertyUuid;
    @EmptyOrNull(message = "Question Id cannot be empty or null")
    private String questionUuid;
    @EmptyOrNull(message = "Variable Name cannot be empty or null")
    private String variableName;
    private List<String> answers;
    private List<String> imageUrls;
    @NotNull(message = "Remarks cannot be null")
    private String remarks;
    private String suggestedLanguage;

    public static PropertyAnswerDto makePropertyAnswerDto(String propertyId, String variableName, String answer) {
        return makePropertyAnswerDto(propertyId, variableName, Collections.singletonList(answer));
    }

    public static PropertyAnswerDto makePropertyAnswerDto(String propertyId, String variableName, List<String> answers) {
        return PropertyAnswerDto.builder()
                .questionUuid("")
                .remarks("")
                .propertyUuid(propertyId)
                .variableName(variableName)
                .answers(answers)
                .build();
    }
}