package com.stanzaliving.estate_v2.dto.propertyOnboarding;

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
