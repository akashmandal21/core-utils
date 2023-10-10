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
public class ListOfQuestions {
    @EmptyOrNull(message = "Template Id cannot be empty or null")
    private String templateId;
    private List<@Valid ListOfQuestion> questions;
}
