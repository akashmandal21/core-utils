package com.stanzaliving.core.paymentPlan.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceGenerationRequestDto {
    private String bookingUuid;
    private String residentUuid;
    private String residenceUuid;
}
