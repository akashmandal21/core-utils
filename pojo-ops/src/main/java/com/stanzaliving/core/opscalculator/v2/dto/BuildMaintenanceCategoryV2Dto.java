package com.stanzaliving.core.opscalculator.V2.dto;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.opscalculator.dto.DropDownDto;
import com.stanzaliving.core.opscalculator.enums.ServiceType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class BuildMaintenanceCategoryV2Dto extends CategoryV2Dto {
    public boolean pestControlApplicable;
    public boolean overheadTankCleaningInfoApplicable;
    public boolean underGroundTankCleaningInfoApplicable;
    public boolean facadeCleaningApplicable;
    public boolean fumigationPerBedBugsApplicable;
    public boolean garbageCostApplicable;

    @Builder.Default
    private List<DropDownDto> serviceTypeOptions = new ArrayList<>();
    @Builder.Default
    private List<ServiceType> selectedServiceType= new ArrayList<>();

    public double pestControlRatePerRoomPerMonth;
    public double pestCostPerMonthPerAvailableBed;

    public int underGroundTankCleaningSizeOfTank;
    public int underGroundTankCleaningTankCount;
    public int underGroundTankCleaningRatePerTank;
    public int underGroundTankCleaningFrequencyPerYear;
    public double underGroundTankCleaningCostPerYear;
    
    public int overheadTankCleaningSizeOfTank;
    public int overheadTankCleaningTankCount;
    public int overheadTankCleaningRatePerTank;
    public int overheadTankCleaningFrequencyPerYear;
    public double overheadTankCleaningCostPerYear;
      
    
    public int totalCostForOverHeadTankCleaningPerYear;
    public int totalCostForUnderGroundTankCleaningPerYear;
    public int overHeadTankCleaningCostPerBedPerMonth;
    public int underGroundTankCleaningCostPerBedPerMonth;

    public int facadeAreaInSquareFeet;
    public double facadeCleaningRatePerSquareFeet;
    public int facadeCleaningFrequencyPerYear;
    public double facadeCleaningCostPerBedPerMonth;

    public double fumigationPerBedBugsRatePerRoomPerMonth;
    public double fumigationPerBedBugsCostPerMonthPerAvailableBed;

    public double garbageCostPerMonth;
    public double garbageCostPerBedPerMonth;
}
