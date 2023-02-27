package com.stanzaliving.core.paymentPlan.dto;

import com.stanzaliving.booking.enums.PaymentTerm;
import com.stanzaliving.booking.enums.ResidenceAgreementType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

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
    private boolean fixSeries;
    private boolean ignoreRefundCheck;
    private LocalDate executionDate;
    private LocalDate moveOutDate;
    private boolean realiseBookingAmount = Boolean.FALSE;
    private ResidenceAgreementType residenceAgreementType;
    private LocalDate chargedTillDate;
}
