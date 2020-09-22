package com.stanzaliving.core.opscalculator.dto;

import com.stanzaliving.core.opscalculator.enums.ServiceType;
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
    private boolean overheadTankCleaningInfoApplicable;
    private boolean underGroundTankCleaningInfoApplicable;
    private boolean facadeCleaningApplicable;
    private boolean upholsteryCleaningApplicable;
    private boolean fumigationPerBedBugsApplicable;
    private boolean garbageCostApplicable;

    private List<DropDownDto> serviceTypeOptions = new ArrayList<>();
    @Builder.Default
    private List<ServiceType> selectedServiceType= new ArrayList<>();

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

    List<TankCleaningSlotDto> overheadTankCleaningSlotDtos = new ArrayList<>();
    List<TankCleaningSlotDto> underGroundTankCleaningSlotDtos = new ArrayList<>();
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
