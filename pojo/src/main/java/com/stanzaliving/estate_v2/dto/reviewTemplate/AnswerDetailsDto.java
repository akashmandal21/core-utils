package com.stanzaliving.estate_v2.dto.reviewTemplate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AnswerDetailsDto {
    private String id;
    private String questionUuid;
    private String variableName;
    private String userUuid;
    private Boolean status;
    private Boolean isEditable;
    private Boolean isComment;
}
