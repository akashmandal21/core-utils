package com.stanzaliving.estate_v2.dto.question;

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
    private List<Object> questionComponents;
}
