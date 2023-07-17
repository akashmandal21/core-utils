package com.stanzaliving.legal_v2.DTO.Property;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PropertyStatusDto {

    private String propertyId;
    private String propertyStatus;
    private String propertyUuid;
    private String statusDescription;
}
