package com.stanzaliving.ventaAudit.dto;

import com.stanzaliving.ventaAudit.enums.KeyHandOver;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KeyHandOverResponseDto {
    private LocalDate keyHandoverDate;
    private KeyHandOver keyHandOverStatus;
    private Double keyLostCharges;
    private String bookingUuid;
    private String propertyUuid;
}

