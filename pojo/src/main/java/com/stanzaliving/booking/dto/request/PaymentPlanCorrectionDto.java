package com.stanzaliving.booking.dto.request;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentPlanCorrectionDto {

    @NotEmpty(message = "bookingUuid cannot be null or blank")
    private String bookingUuid;

    private LocalDate fromDate;

    private LocalDate toDate;
}
