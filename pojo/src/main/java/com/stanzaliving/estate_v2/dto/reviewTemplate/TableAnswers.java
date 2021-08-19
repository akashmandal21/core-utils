package com.stanzaliving.estate_v2.dto.reviewTemplate;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TableAnswers {
    private List<String> answers;
    private List<AnswerDetailsDto> answerDetails;
}
