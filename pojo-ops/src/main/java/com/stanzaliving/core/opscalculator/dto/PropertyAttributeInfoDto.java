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
    public Integer availableBedCount;
    public Integer roomCount;
    public Integer daysInMonth;

    public Integer daysForCalculation;
    public LocalDate calculationFromDate;
    public LocalDate calculationToDate;
    public LocalDate sessionFromDate;
    public LocalDate sessionToDate;
    public int sessionHolidays;
    public int calculationHolidays;
    public String serviceMixUuid;
    public String residenceUuid;

    @Builder.Default
    public boolean annualUnderWritten = true;


    public PropertyAttributeInfoDto(int availableBedCount, int roomCount) {
        this.availableBedCount = availableBedCount;
        this.roomCount = roomCount;
    }
}
