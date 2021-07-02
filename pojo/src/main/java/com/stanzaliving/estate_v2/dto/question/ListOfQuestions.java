package com.stanzaliving.estate_v2.dto.question;

import com.stanzaliving.estate_v2.annotation.constraint.EmptyOrNull;
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
