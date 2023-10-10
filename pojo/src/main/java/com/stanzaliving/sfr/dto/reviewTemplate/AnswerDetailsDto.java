package com.stanzaliving.sfr.dto.reviewTemplate;

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
    private String userUuid;
    private Boolean status;
}
