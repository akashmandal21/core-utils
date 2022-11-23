package com.stanzaliving.core.residenceservice.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class OptionsWithNotesDto {

    private String label;
    private String value;
    private Integer count;
}
