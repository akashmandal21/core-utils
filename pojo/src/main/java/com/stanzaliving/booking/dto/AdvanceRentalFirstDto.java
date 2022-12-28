package com.stanzaliving.booking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdvanceRentalFirstDto {
    private LocalDate startDate;

    private LocalDate endDate;

    private int advanceRentalMonths;

    private Double advanceRentalMonthsAmount;
}
