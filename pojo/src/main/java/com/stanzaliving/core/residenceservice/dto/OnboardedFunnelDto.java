package com.stanzaliving.core.residenceservice.dto;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OnboardedFunnelDto {
    private String label;
    private Double count;
    private String description;
    private String displayType;
    private Boolean isClickable;
}

