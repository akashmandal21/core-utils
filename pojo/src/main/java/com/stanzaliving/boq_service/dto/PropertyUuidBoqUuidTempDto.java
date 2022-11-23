package com.stanzaliving.boq_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PropertyUuidBoqUuidTempDto {
    private String propertyUuid;

    private String boqUuid;
}
