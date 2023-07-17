package com.stanzaliving.residenceservice.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AttributesResponseDto {

    private String label;
    private String value;
    private String image;

}