package com.stanzaliving.ledger.dto;

import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AutoRefundDto {
    @NotEmpty(message = "Current bookingUuid can't be empty")
    private String currentBookingUuid;

    @NotNull(message = "Amount to be processed can't be empty")
    @Min(value = 1L,message = "Amount to be processed can't be less than or equal to 0")
    private double amount;

}
