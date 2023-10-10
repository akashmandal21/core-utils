package com.stanzaliving.sfr.dto.propertyOnboarding;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class MobilePropertyTypesListDto {
    private String label;
    private String value;
    private String description;
    private boolean duplicatePropertyFlag;
}
