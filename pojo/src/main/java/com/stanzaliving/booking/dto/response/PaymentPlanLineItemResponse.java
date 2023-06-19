package com.stanzaliving.booking.dto.response;

import com.stanzaliving.booking.enums.PaymentPlanType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentPlanLineItemResponse {

    private PaymentPlanType type;

    private String label;

    private double amount;

    private String period;

    private LocalDate fromDate;

    private LocalDate toDate;
}
