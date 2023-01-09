package com.stanzaliving.core.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserExitAnswerAndTypeResponseDto {

    private String type;
    private String answer;
    private String source;
    private String questionUuid;
    private List<String> options;

}