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
public class BinaryQuestionDTO implements QuestionDetails {
    private String displayType;
    private String questionName;
    private List<Object> tag;
    private String remarks;
    private String shortDescription;
    private String longDescription;

}
