package com.stanzaliving.sfr.dto.question;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class SingleSelectQuestionDTO implements QuestionDetails {
    private String displayType;
    private String questionName;
    private boolean random;
    private List<QuestionComponentDto> questionComponents;
    private String cardType;
    private String position;
    private String onSelectionCardColor;
    private String onSelectionIconColor;
    private String imageAndRemark;
}
