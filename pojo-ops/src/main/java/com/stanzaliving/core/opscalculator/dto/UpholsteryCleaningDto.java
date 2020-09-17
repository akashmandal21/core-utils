package com.stanzaliving.core.opscalculator.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class UpholsteryCleaningDto extends CategoryDto {
    private int oneSeaterSofaSetCount;
    private int twoSeaterSofaSetCount;
    private int threeSeaterSofaSetCount;
    private int fourSeaterSofaSetCount;

    private double ratePerSeat;
    private double frequencyPerYear;
    private int costPerAvailableBedPerMonth;
}
