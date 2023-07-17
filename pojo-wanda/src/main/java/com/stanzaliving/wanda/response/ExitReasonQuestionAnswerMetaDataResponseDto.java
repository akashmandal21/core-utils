package com.stanzaliving.wanda.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExitReasonQuestionAnswerMetaDataResponseDto {
    private String questionUuid; // current question
    private String question;
    private String questionType;
    private List<String> options;
    private Boolean isCity;
}
