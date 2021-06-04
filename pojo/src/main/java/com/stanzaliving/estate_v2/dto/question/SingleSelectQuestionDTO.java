package com.stanzaliving.estate_v2.dto.question;

import com.stanzaliving.estate_v2.enumeration.question.ImageAndRemark;
import com.stanzaliving.estate_v2.enumeration.question.card.CardPosition;
import com.stanzaliving.estate_v2.enumeration.question.card.CardType;
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
    private boolean random;
    private List<Object> components;
    private CardType type;
    private String imageLink;
    private CardPosition position;
    private String onSelectionCardColor;
    private String onSelectionIconColor;
    private ImageAndRemark imageAndRemark;
    private Integer maxFiles;
    private Integer maxSize;
}
