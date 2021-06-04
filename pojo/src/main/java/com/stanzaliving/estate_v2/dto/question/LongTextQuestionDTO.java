package com.stanzaliving.estate_v2.dto.question;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class LongTextQuestionDTO implements QuestionDetails {

    private String displayType;
    private String placeHolderText;
    private String richTextEditor;
    private String imageAndRemark;
    private Integer maxFiles;
    private Integer maxSize;
    private boolean responseValid;
    private String validationDetail;
    private Object containsType;
    private String customErrorText;
    private String compareValue;
}
