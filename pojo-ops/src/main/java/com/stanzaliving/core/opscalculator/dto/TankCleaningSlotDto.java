package com.stanzaliving.core.opscalculator.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class TankCleaningSlotDto {
    private int sizeOfTank;
    private int tankCount;
    private double ratePerTank;
    private double frequencyPerYear;
    private int costPerYear;
}
