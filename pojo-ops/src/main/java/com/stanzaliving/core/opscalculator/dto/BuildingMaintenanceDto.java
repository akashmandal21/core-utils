package com.stanzaliving.core.opscalculator.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@ToString(callSuper = true)
public class BuildingMaintenanceDto extends CategoryDto{

    int ratePerRoomPerMonth = 40;

    int frequencyPerYear = 4;

    int sizeOfTank = 50000;     //In Litres

    int numberOfTanks = 2;

    int ratePerCleaning = 1000;

    int facadeArea = 2000;

    int ratePerSquareFeet = 5;

    int garbageCostPerMonth =2000;

}
