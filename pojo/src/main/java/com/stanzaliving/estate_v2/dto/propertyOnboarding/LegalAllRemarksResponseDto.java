package com.stanzaliving.estate_v2.dto.propertyOnboarding;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
public class LegalAllRemarksResponseDto {
    private String variableName;
    private String remarks;
    private String status;
    private String title;
}
