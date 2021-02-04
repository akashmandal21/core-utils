package com.stanzaliving.core.opscalculator.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PropertyAttributeInfoDto {
    private Integer availableBedCount;
    private Integer roomCount;
    private Integer daysInMonth;
    private Integer daysForCalculation;
    private LocalDate calculationFromDate;
    private LocalDate calculationToDate;
    private LocalDate sessionFromDate;
    private LocalDate sessionToDate;
    private int sessionHolidays;

    @Builder.Default
    private boolean annualUnderWritten = true;


    public PropertyAttributeInfoDto(int availableBedCount, int roomCount) {
        this.availableBedCount = availableBedCount;
        this.roomCount = roomCount;
    }
}
