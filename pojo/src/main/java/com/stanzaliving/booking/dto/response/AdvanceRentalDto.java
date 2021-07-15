package com.stanzaliving.booking.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

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
