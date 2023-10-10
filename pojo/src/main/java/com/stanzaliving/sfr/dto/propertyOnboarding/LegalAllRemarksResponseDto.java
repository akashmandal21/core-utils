package com.stanzaliving.sfr.dto.propertyOnboarding;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
public class LegalAllRemarksResponseDto {
    private String variableName;
    private String remarks;
    private String status;
}
