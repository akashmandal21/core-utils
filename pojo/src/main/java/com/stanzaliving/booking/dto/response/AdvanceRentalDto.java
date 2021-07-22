package com.stanzaliving.booking.dto.response;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdvanceRentalDto {


    private LocalDate startDate;

    private LocalDate endDate;

    private int advanceRentalMonths;

    private Double advanceRentalMonthsAmount;

}
