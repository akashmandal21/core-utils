package com.stanzaliving.estate_v2.dto.propertyType;

import lombok.*;


@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
public class ParentUuidNameDto {
    private String uuid;
    private String name;
}
