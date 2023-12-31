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

    @Builder.Default
    private List<DropDownDto> serviceTypeOptions = new ArrayList<>();
    @Builder.Default
    private List<ServiceType> selectedServiceType= new ArrayList<>();

    private double pestControlRatePerRoomPerMonth;
    private int pestCostPerMonthPerAvailableBed;

    private double noOfDaysRequired;
    private int floorCleaningFrequencyPerYear;
    private int floorCleaningMachineRentalPerMonth;
    private int floorCleaningRoomsCleanedPerDay;
    private int floorCleaningManPowerCost;
    private double floorCleaningManPowerCount;
    private double floorCleaningChemicalCostPerBed;
    private int floorCleaningTotalMachineCost;
    private int floorCleaningTotalManPowerCost;
    private int floorCleaningTotalChemicalsCost;
    private int floorCleaningTotalCost;
    private int floorCleaningCostPerMonthPerAvailableBed;

    @Builder.Default
    List<TankCleaningSlotDto> overheadTankCleaningSlotDtos = new ArrayList<>();
    @Builder.Default
    List<TankCleaningSlotDto> underGroundTankCleaningSlotDtos = new ArrayList<>();
    private int totalCostForOverHeadTankCleaningPerYear;
    private int totalCostForUnderGroundTankCleaningPerYear;
    private int overHeadTankCleaningCostPerBedPerMonth;
    private int underGroundTankCleaningCostPerBedPerMonth;

    private int facadeAreaInSquareFeet;
    private double facadeCleaningRatePerSquareFeet;
    private int facadeCleaningFrequencyPerYear;
    private int facadeCleaningCostPerBedPerMonth;

    private int oneSeaterSofaSetCount;
    private int twoSeaterSofaSetCount;
    private int threeSeaterSofaSetCount;
    private int fourSeaterSofaSetCount;
    private double upholsteryCleaningRatePerSeat;
    private int upholsteryCleaningFrequencyPerYear;
    private int upholsteryCleaningCostPerAvailableBedPerMonth;

    private double fumigationPerBedBugsRatePerRoomPerMonth;
    private int fumigationPerBedBugsCostPerMonthPerAvailableBed;

    private int garbageCostPerMonth;
    private int garbageCostPerBedPerMonth;
    
    private int buildingMaintenanceCostPerBed;
}
