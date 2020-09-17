package com.stanzaliving.core.opscalculator.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class FacadeCleaningDto extends CategoryDto {
    private int facadeAreaInSquareFeet;
    private double ratePerSquareFeet;
    private double frequencyPerYear;
    private int costPerBedPerMonth;
}
