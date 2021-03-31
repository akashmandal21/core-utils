package com.stanzaliving.core.grsi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ToResponseDto {
    private String toNumber;
    private String receivingLocationName;
    private String receivingLocationAddressUuid;
}
