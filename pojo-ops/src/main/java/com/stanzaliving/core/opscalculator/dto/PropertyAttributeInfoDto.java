package com.stanzaliving.core.opscalculator.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PropertyAttributeInfoDto {
    private Integer availableBedCount;
    private Integer roomCount;
    private Integer daysInMonth;
    private Integer daysForCalculation;
    @Builder.Default
    private boolean annualUnderWritten = true;


    public PropertyAttributeInfoDto(int availableBedCount, int roomCount) {
        this.availableBedCount = availableBedCount;
        this.roomCount = roomCount;
    }
}
