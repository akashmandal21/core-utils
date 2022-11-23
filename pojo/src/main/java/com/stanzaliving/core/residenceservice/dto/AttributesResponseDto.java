package com.stanzaliving.core.residenceservice.dto;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AttributesResponseDto implements Serializable {

    private String label;
    private String value;
    private String image;
}
