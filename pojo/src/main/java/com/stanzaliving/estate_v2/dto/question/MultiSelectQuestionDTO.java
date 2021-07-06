package com.stanzaliving.estate_v2.dto.question;

import com.stanzaliving.estate_v2.enumeration.question.card.CardPosition;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class MultiSelectQuestionDTO implements QuestionDetails {
    private String questionName;
    private String displayType;
    private boolean random;
    private List<QuestionComponentDto> questionComponents;
    private String cardType;
    private String position;
    private String onSelectionCardColor;
    private String onSelectionIconColor;
    private String imageAndRemark;
}
