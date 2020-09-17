package com.stanzaliving.core.opscalculator.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class FloorCleaningDto extends CategoryDto{
    private double noOfDaysRequired;
    private int frequencyPerYear;
    private int machineRentalPerMonth;
    private int roomsCleanedPerDay;
    private double manPowerCost;
    private int manPowerCount;
    private double chemicalCostPerBed;
    private int totalMachineCost;
    private int totalManPowerCost;
    private int totalChemicalsCost;
    private int totalCost;
    private int costPerMonthPerAvailableBed;

}
