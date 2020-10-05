package com.stanzaliving.core.opscalculator.dto;

import com.stanzaliving.core.opscalculator.enums.EquipmentType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@ToString(callSuper = true)
public class RepairCategoryDto extends CategoryDto{
    private boolean  amcCostApplicable;
    private boolean manPowerApplicable;
    private boolean materialCostApplicable;

    private boolean acAmcCostApplicable;
    private boolean dgAmcCostApplicable;
    private boolean liftAmcCostApplicable;
    private boolean centralHeatersAmcCostApplicable;
    private boolean roAmcCostApplicable;
    private boolean manPowerAmcCostApplicable;
    private boolean washingMachineAmcCostApplicable;
    private boolean fireExtinguisherAmcCostApplicable;
    private boolean firePanelAmcCostApplicable;

    @Builder.Default
    private List<DropDownDto> equipmentListOptions = new ArrayList<>();
    @Builder.Default
    private List<EquipmentType> selectedEquipmentType = new ArrayList<>();

    @Builder.Default
    private List<DropDownDto> acTypeOptions = new ArrayList<>();

    @Builder.Default
    List<AcAmcCostSlotDto> acAmcCostSlotDtos = new ArrayList<>();
    private int acAmcCost;
    @Builder.Default
    List<AmcCostSlotDto> dgAmcCostSlotDtos = new ArrayList<>();
    private int dgAmcCost;
    @Builder.Default
    List<AmcCostSlotDto> liftAmcCostSlotDtos = new ArrayList<>();
    private int liftAmcCost;
    @Builder.Default
    List<AmcCostSlotDto> centralHeatersAmcCostSlotDtos = new ArrayList<>();
    private int centralHeaterAmcCost;
    @Builder.Default
    List<AmcCostSlotDto> roAmcCostSlotDtos = new ArrayList<>();
    private int roAmcCost;
    @Builder.Default
    List<ManPowerAmcCostSlotDto> manPowerAmcCostSlotDtos = new ArrayList<>();
    private int manPowerAmcCost;
    @Builder.Default
    List<AmcCostSlotDto> washingMachineAmcCostSlotDtos = new ArrayList<>();
    private int washingMachineAmcCost;
    @Builder.Default
    List<AmcCostSlotDto> fireExtinguisherAmcCostSlotDtos = new ArrayList<>();
    private int fireExtinguisherAmcCost;
    @Builder.Default
    List<AmcCostSlotDto> firePanelAmcCostSlotDtos = new ArrayList<>();
    private int firePanelAmcCost;
    private int totalAmcCostPerBedPerMonth;

    private double complaintPerBedPerMonth;
    private double complaintPerPersonPerMonth;
    private int salaryPerPersonPerMonth;
    private int manPowerCost;
    private int totalManPowerCostPerBedPerMonth;

    private boolean highMaterialCostApplicable;
    private boolean mediumMaterialCostApplicable;
    private boolean lowMaterialCostApplicable;

    private double highMaterialCostComplaintPerBedPerMonth;
    private double highMaterialCostComplaints;
    private int highMaterialCostPerTicket;
    private int highMaterialCostPerBedPerMonth;

    private double mediumMaterialCostComplaintPerBedPerMonth;
    private double mediumMaterialCostComplaints;
    private int mediumMaterialCostPerTicket;
    private int mediumMaterialCostPerBedPerMonth;

    private double lowMaterialCostComplaintPerBedPerMonth;
    private double lowMaterialCostComplaints;
    private int lowMaterialCostPerTicket;
    private int lowMaterialCostPerBedPerMonth;

    private int totalMaterialCostPerBedPerMonth;

    private int totalCostPerBedPerMonth;

}
