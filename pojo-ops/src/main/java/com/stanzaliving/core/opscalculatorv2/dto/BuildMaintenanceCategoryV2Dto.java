package com.stanzaliving.core.opscalculatorv2.dto;

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
    @Builder.Default
    public boolean pestControlApplicable = true;
    @Builder.Default
    public boolean overheadTankCleaningInfoApplicable = true;
    @Builder.Default
    public boolean underGroundTankCleaningInfoApplicable = true;
    @Builder.Default
    public boolean facadeCleaningApplicable = true;
    @Builder.Default
    public boolean fumigationPerBedBugsApplicable = true;
    @Builder.Default
    public boolean garbageCostApplicable = true;
    @Builder.Default
    public boolean floorCleaningApplicable = true;

	@Builder.Default
	private List<DropDownDto> serviceTypeOptions = new ArrayList<>();
	@Builder.Default
	private List<ServiceType> selectedServiceType = new ArrayList<>();

	public double pestControlRatePerRoomPerMonth;
	public double pestCostPerMonthPerAvailableBed;

	public double underGroundTankCleaningSizeOfTank;
	public double underGroundTankCleaningTankCount;
	public double underGroundTankCleaningRatePerTank;
	public double underGroundTankCleaningFrequencyPerYear;
	public double underGroundTankCleaningCostPerYear;

	public double overheadTankCleaningSizeOfTank;
	public double overheadTankCleaningTankCount;
	public double overheadTankCleaningRatePerTank;
	public double overheadTankCleaningFrequencyPerYear;
	public double overheadTankCleaningCostPerYear;
	public double totalCostForOverHeadTankCleaningPerYear;
	public double totalCostForUnderGroundTankCleaningPerYear;
	public double overHeadTankCleaningCostPerBedPerMonth;
	public double underGroundTankCleaningCostPerBedPerMonth;
	public double facadeAreaInSquareFeet;
	public double facadeCleaningRatePerSquareFeet;
	public double facadeCleaningFrequencyPerYear;
	public double facadeCleaningCostPerBedPerMonth;
	public double fumigationPerBedBugsRatePerRoomPerMonth;
	public double fumigationPerBedBugsCostPerMonthPerAvailableBed;
	public double garbageCostPerMonth;
	public double garbageCostPerBedPerMonth;
	public double floorCleaningMachineRatePerRoomPerMonth;
	public double floorCleaningMachineCostPerMonthPerAvailableBed;
	public double floorCleaningManPowerRatePerRoomPerMonth;
	public double floorCleaningManPowerCostPerMonthPerAvailableBed;
	private double upholsteryCleaningRatePerSeat;
	private double tankCleaningTankSize;
	private double tankCleaningOneTimeRate;
}
