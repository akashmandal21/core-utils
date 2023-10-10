package com.stanzaliving.sfr.dto.question;

import com.stanzaliving.sfr.annotation.constraint.EmptyOrNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class ListOfQuestion {

    private String pageId;
    private String sectionId;
    private String subSectionId;
    @EmptyOrNull(message = "Type cannot be empty or null")
    private String type;
    private List<@Valid QuestionDto> questionDto;
}
