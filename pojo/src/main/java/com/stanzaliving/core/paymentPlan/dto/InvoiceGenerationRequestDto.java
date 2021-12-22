package com.stanzaliving.core.paymentPlan.dto;

import com.stanzaliving.booking.enums.PaymentTerm;
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
    private PaymentTerm paymentTerm;
    private boolean completeInvoice;
}
