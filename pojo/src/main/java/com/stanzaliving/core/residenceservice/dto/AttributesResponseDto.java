package com.stanzaliving.core.residenceservice.dto;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AttributesResponseDto {

    private String label;
    private String value;
    private String image;
}
