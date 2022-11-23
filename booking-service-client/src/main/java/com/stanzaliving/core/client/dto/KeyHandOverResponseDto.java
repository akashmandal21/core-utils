package com.stanzaliving.core.client.dto;

import com.stanzaliving.core.client.enums.KeyHandOver;
import lombok.*;

import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KeyHandOverResponseDto {

    private LocalDate keyHandoverDate;

    private KeyHandOver keyHandOverStatus;

    private Double keyLostCharges;

    private String bookingUuid;

    private String propertyUuid;
}
