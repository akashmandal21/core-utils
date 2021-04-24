package com.stanzaliving.core.grsi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ToResponseDto {
    private String toNumber;
    private String receivingLocationName;
    private String receivingLocationAddressUuid;
    private String sourceLocationName;
    private String sourceLocationAddressUuid;
}