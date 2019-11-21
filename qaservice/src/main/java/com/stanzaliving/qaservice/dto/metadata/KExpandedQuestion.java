package com.stanzaliving.qaservice.dto.metadata;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.qaservice.dto.QuestionRequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KExpandedQuestion {
    String quesCount;
    List<QuestionRequestDto> questions = new ArrayList<>();

    public KExpandedQuestion(String quesCount) {
        this.quesCount = quesCount;
    }
}
