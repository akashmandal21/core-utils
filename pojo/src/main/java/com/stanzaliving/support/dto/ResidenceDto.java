package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceDto {
    private String name;

    private Long id;

    private String uuid;

    private String cityUuid;

    private int faqCount;
}
