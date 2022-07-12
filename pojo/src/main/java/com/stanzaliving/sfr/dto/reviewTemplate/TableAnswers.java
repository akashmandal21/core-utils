package com.stanzaliving.sfr.dto.reviewTemplate;

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
