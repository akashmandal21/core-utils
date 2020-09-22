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

    private List<DropDownDto> equipmentListOptions = new ArrayList<>();
    @Builder.Default
    private List<EquipmentType> selectedEquipmentType = new ArrayList<>();

    private List<DropDownDto> acTypeOptions = new ArrayList<>();

    List<AcAmcCostSlotDto> acAmcCostSlotDtos = new ArrayList<>();
    private int acAmcCost;
    List<AmcCostSlotDto> dgAmcCostSlotDtos = new ArrayList<>();
    private int dgAmcCost;
    List<AmcCostSlotDto> liftAmcCostSlotDtos = new ArrayList<>();
    private int liftAmcCost;
    List<AmcCostSlotDto> centralHeatersAmcCostSlotDtos = new ArrayList<>();
    private int centralHeaterAmcCost;
    List<AmcCostSlotDto> roAmcCostSlotDtos = new ArrayList<>();
    private int roAmcCost;
    List<ManPowerAmcCostSlotDto> manPowerAmcCostSlotDtos = new ArrayList<>();
    private int manPowerAmcCost;
    List<AmcCostSlotDto> washingMachineAmcCostSlotDtos = new ArrayList<>();
    private int washingMachineAmcCost;
    List<AmcCostSlotDto> fireExtinguisherAmcCostSlotDtos = new ArrayList<>();
    private int fireExtinguisherAmcCost;
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
    private int highMaterialCostComplaints;
    private double highMaterialCostPerTicket;
    private int highMaterialCostPerBedPerMonth;

    private double mediumMaterialCostComplaintPerBedPerMonth;
    private int mediumMaterialCostComplaints;
    private double mediumMaterialCostPerTicket;
    private int mediumMaterialCostPerBedPerMonth;

    private double lowMaterialCostComplaintPerBedPerMonth;
    private int lowMaterialCostComplaints;
    private double lowMaterialCostPerTicket;
    private int lowMaterialCostPerBedPerMonth;

    private int totalMaterialCostPerBedPerMonth;

    private int totalCostPerBedPerMonth;

}
