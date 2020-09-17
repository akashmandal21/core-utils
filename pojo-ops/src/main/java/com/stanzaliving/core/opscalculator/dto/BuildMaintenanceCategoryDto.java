package com.stanzaliving.core.opscalculator.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class BuildMaintenanceCategoryDto extends CategoryDto {
    private boolean pestControlApplicable;
    private boolean floorCleaningApplicable;
    private boolean tankCleaningInfoApplicable;
    private boolean facadeCleaningApplicable;
    private boolean upholsteryCleaningApplicable;
    private boolean fumigationPerBedBugsApplicable;
    private boolean garbageCostApplicable;

    private int pestControlRatePerRoomPerMonth;
    private int pestCostPerMonthPerAvailableBed;

    private double noOfDaysRequired;
    private int floorCleaningFrequencyPerYear;
    private int floorCleaningMachineRentalPerMonth;
    private int floorCleaningRoomsCleanedPerDay;
    private double floorCleaningManPowerCost;
    private int floorCleaningManPowerCount;
    private double floorCleaningChemicalCostPerBed;
    private int floorCleaningTotalMachineCost;
    private int floorCleaningTotalManPowerCost;
    private int floorCleaningTotalChemicalsCost;
    private int floorCleaningTotalCost;
    private int floorCleaningCostPerMonthPerAvailableBed;

    List<TankCleaningSlotDto> tankCleaningSlotDtos = new ArrayList<>();
    private int totalCostForTankCleaningPerYear;
    private int tankCleaningCostPerBedPerMonth;

    private int facadeAreaInSquareFeet;
    private double facadeCleaningRatePerSquareFeet;
    private double facadeCleaningFrequencyPerYear;
    private int facadeCleaningCostPerBedPerMonth;

    private int oneSeaterSofaSetCount;
    private int twoSeaterSofaSetCount;
    private int threeSeaterSofaSetCount;
    private int fourSeaterSofaSetCount;
    private double upholsteryCleaningRatePerSeat;
    private double upholsteryCleaningFrequencyPerYear;
    private int upholsteryCleaningCostPerAvailableBedPerMonth;

    private int fumigationPerBedBugsRatePerRoomPerMonth;
    private int fumigationPerBedBugsCostPerMonthPerAvailableBed;

    private int garbageCostPerMonth;
    private int garbageCostPerBedPerMonth;
    
    private int buildingMaintenanceCostPerBed;
}
