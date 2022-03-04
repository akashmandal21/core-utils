package com.stanzaliving.core.paymentPlan.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InitiateExitRequestDto {

    private String bookingUuid;
    private LocalDate moveOutDate;
}
