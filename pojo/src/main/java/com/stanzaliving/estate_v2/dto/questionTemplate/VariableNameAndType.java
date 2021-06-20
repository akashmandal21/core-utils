package com.stanzaliving.estate_v2.dto.questionTemplate;


import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VariableNameAndType {
    private String questionId;
    private String name;
    private String type;
    private String sectionId;
    private String subSectionId;
    private String pageId;

}

