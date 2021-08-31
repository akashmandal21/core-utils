package com.stanzaliving.estate_v2.dto.questionTemplate.conditions;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ConditionResponseDto {
    private String groupUuid;
    private String pageUuid;
    private String questionUuid;
}
