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
public class ShortTextQuestionDTO implements QuestionDetails {
    private String displayType;
    private String questionName;
    private String labelForUnit;
    private String labelForValue;
    private List<String> unit;
    private String imageAndRemark;
    private Integer maxFiles;
    private Integer maxSize;
    private boolean responseValid;
    private String validationDetail;
    private Object containsType;
    private String customErrorText;
    private String compareValue;

}
