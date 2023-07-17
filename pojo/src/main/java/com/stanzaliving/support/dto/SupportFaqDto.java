package com.stanzaliving.support.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class SupportFaqDto{


    private String faqUuid;
    private String question;
    private String answer;
    private Integer sequence;
    private String residenceUuid;
    private String categoryUuid;
    private String categoryName;
    private Boolean visible;

//    @Builder.Default
//    private Boolean commonlyAskedQuestion = Boolean.FALSE;
//
    @Builder.Default
    private Boolean status = Boolean.TRUE;

}

