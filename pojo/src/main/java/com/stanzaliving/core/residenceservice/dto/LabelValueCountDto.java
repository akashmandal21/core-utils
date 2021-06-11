package com.stanzaliving.core.residenceservice.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LabelValueCountDto {

    private String label;
    private String value;
    private Integer count;
}

