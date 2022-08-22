package com.stanzaliving.sfr.dto.propertyOnboarding;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PropertyListDto {
    private String label;
    private String value;
    private String id;
}
