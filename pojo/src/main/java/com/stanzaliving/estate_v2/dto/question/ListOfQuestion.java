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
public class ListOfQuestion {

    private String pageId;
    private String sectionId;
    private String subSectionId;
    private String type;
    private List<QuestionDto> questionDto;
}
