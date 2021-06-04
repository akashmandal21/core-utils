package com.stanzaliving.estate_v2.dto.question;

import com.stanzaliving.estate_v2.enumeration.question.ValidationDetail;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class ShortTextQuestionDTO implements QuestionDetails {
    private String displayType;
    private String imageAndRemark;
    private Integer maxFiles;
    private Integer maxSize;
    private String labelForUnitValue;
    private String labelForValueUnit;
    private boolean responseValid;
    private String validationDetail;
    private Object containsType;
    private String customErrorText;
    private String compareValue;

}
