package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FaqDto {

    private String question;
    private String answer;
    private String uuid;
    private Integer sequence;
    private String categoryUuid;
    private String categoryName;
}