package com.stanzaliving.core.opscalculator.dto;

import java.io.Serializable;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class MonthlyForcastCsvDto implements Serializable {
	@CsvBindByPosition(position = 0)
	@CsvBindByName(column = "City")
	private String city;

	@CsvBindByPosition(position = 1)
	@CsvBindByName(column = "MicroMarket")
	private String microMarket;

	@CsvBindByPosition(position = 2)
	@CsvBindByName(column = "ResidenceName")
	private String residenceName;

	@CsvBindByPosition(position = 3)
	@CsvBindByName(column = "Month")
	private String month;

	@CsvBindByPosition(position = 4)
	@CsvBindByName(column = "ActualOccupancy")
	private Double actualOccupancy;
	
	@CsvBindByPosition(position = 5)
	@CsvBindByName(column = "RoomOccupancy")
	private Double roomOccupancy;

	@CsvBindByPosition(position = 6)
	@CsvBindByName(column = "AopOccupancy")
	private Double aopOccupancy;

	@CsvBindByPosition(position = 7)
	@CsvBindByName(column = "Food")
	private Double food;

	@CsvBindByPosition(position = 8)
	@CsvBindByName(column = "FoodHolidays")
	private Double foodHolidays;

	@CsvBindByPosition(position = 9)
	@CsvBindByName(column = "FoodUtil")
	private Double foodUtil;

	@CsvBindByPosition(position = 10)
	@CsvBindByName(column = "FoodMenuPricePerDay")
	private Double foodMenuPricePerDay;

	@CsvBindByPosition(position = 11)
	@CsvBindByName(column = "Electricity")
	private Double electricity;

	@CsvBindByPosition(position = 12)
	@CsvBindByName(column = "ElectricityFixedCharges")
	private Double electricityFixedCharges;

	@CsvBindByPosition(position = 13)
	@CsvBindByName(column = "ElectricityVariableCharges")
	private Double electricityVariableCharges;

	@CsvBindByPosition(position = 14)
	@CsvBindByName(column = "Water")
	private Double water;

	@CsvBindByPosition(position = 15)
	@CsvBindByName(column = "WaterFixedCharges")
	private Double waterFixedCharges;

	@CsvBindByPosition(position = 16)
	@CsvBindByName(column = "WaterVariableCharges")
	private Double waterVariableCharges;

	@CsvBindByPosition(position = 17)
	@CsvBindByName(column = "DG")
	private Double dg;

	@CsvBindByPosition(position = 18)
	@CsvBindByName(column = "Housekeeping")
	private Double housekeeping;

	@CsvBindByPosition(position = 19)
	@CsvBindByName(column = "HousekeepingHK8hrs")
	private Double housekeepingHK8hrs;

	@CsvBindByPosition(position = 20)
	@CsvBindByName(column = "HousekeepingHK12hrs")
	private Double housekeepingHK12hrs;

	@CsvBindByPosition(position = 21)
	@CsvBindByName(column = "HousekeepingHKCT")
	private Double housekeepingHKCT;

	@CsvBindByPosition(position = 22)
	@CsvBindByName(column = "Security")
	private Double security;

	@CsvBindByPosition(position = 23)
	@CsvBindByName(column = "SecurityInHouseSecurity")
	private Double securityInHouseSecurity;

	@CsvBindByPosition(position = 24)
	@CsvBindByName(column = "SecurityInSecurity")
	private Double securityInSecurity;

	@CsvBindByPosition(position = 25)
	@CsvBindByName(column = "Personnel")
	private Double personnel;

	@CsvBindByPosition(position = 26)
	@CsvBindByName(column = "PersonnelRC")
	private Double personnelRC;

	@CsvBindByPosition(position = 27)
	@CsvBindByName(column = "PersonnelOE")
	private Double personnelOE;

	@CsvBindByPosition(position = 28)
	@CsvBindByName(column = "Internet")
	private Double internet;

	@CsvBindByPosition(position = 29)
	@CsvBindByName(column = "Laundry")
	private Double laundry;

	@CsvBindByPosition(position = 30)
	@CsvBindByName(column = "Supplies")
	private Double supplies;

	@CsvBindByPosition(position = 31)
	@CsvBindByName(column = "SuppliesDTH")
	private Double suppliesDTH;

	@CsvBindByPosition(position = 32)
	@CsvBindByName(column = "SuppliesGeneralSupplies")
	private Double suppliesGeneralSupplies;

	@CsvBindByPosition(position = 33)
	@CsvBindByName(column = "SuppliesCleaningChemicals")
	private Double suppliesCleaningChemicals;

	@CsvBindByPosition(position = 34)
	@CsvBindByName(column = "SuppliesCleaningEquipments")
	private Double suppliesCleaningEquipments;

	@CsvBindByPosition(position = 35)
	@CsvBindByName(column = "RepairAndMaintenance")
	private Double repairAndMaintenance;

	@CsvBindByPosition(position = 36)
	@CsvBindByName(column = "RepairAndMaintenance_AMCCost")
	private Double repairAndMaintenance_AMCCost;

	@CsvBindByPosition(position = 37)
	@CsvBindByName(column = "RepairAndMaintenanceManpower")
	private Double repairAndMaintenanceManpower;

	@CsvBindByPosition(position = 38)
	@CsvBindByName(column = "RepairAndMaintenanceMaterialCost")
	private Double repairAndMaintenanceMaterialCost;

	@CsvBindByPosition(position = 39)
	@CsvBindByName(column = "BuildingMaintenance")
	private Double buildingMaintenance;

	@CsvBindByPosition(position = 40)
	@CsvBindByName(column = "BuildingMaintenancePestControl")
	private Double buildingMaintenancePestControl;

	@CsvBindByPosition(position = 41)
	@CsvBindByName(column = "BuildingMaintenanceFloorCleaning")
	private Double buildingMaintenanceFloorCleaning;

	@CsvBindByPosition(position = 42)
	@CsvBindByName(column = "BuildingMaintenanceOverheadTankCleaning")
	private Double buildingMaintenanceOverheadTankCleaning;

	@CsvBindByPosition(position = 43)
	@CsvBindByName(column = "BuildingMaintenanceUndergroundTankCleaning")
	private Double buildingMaintenanceUndergroundTankCleaning;

	@CsvBindByPosition(position = 44)
	@CsvBindByName(column = "BuildingMaintenanceFascadeCleaning")
	private Double buildingMaintenanceFascadeCleaning;

	@CsvBindByPosition(position = 45)
	@CsvBindByName(column = "BuildingMaintenanceUpholestryCleaning")
	private Double buildingMaintenanceUpholestryCleaning;

	@CsvBindByPosition(position = 46)
	@CsvBindByName(column = "BuildingMaintenanceFumigationBedbugs")
	private Double buildingMaintenanceFumigationBedbugs;

	@CsvBindByPosition(position = 47)
	@CsvBindByName(column = "BuildingMaintenanceGarbageCollection")
	private Double buildingMaintenanceGarbageCollection;

	@CsvBindByPosition(position = 48)
	@CsvBindByName(column = "Audit")
	private Double audit;

	@CsvBindByPosition(position = 49)
	@CsvBindByName(column = "AuditCCTV")
	private Double auditCCTV;

	@CsvBindByPosition(position = 50)
	@CsvBindByName(column = "AuditPhysical")
	private Double auditPhysical;

	@CsvBindByPosition(position = 51)
	@CsvBindByName(column = "UniformCosts")
	private Double uniformCosts;

	@CsvBindByPosition(position = 52)
	@CsvBindByName(column = "UniformCostsHousekeeping")
	private Double uniformCostsHousekeeping;

	@CsvBindByPosition(position = 53)
	@CsvBindByName(column = "uniformCostsRC_OE")
	private Double uniformCostsRC_OE;

	@CsvBindByPosition(position = 54)
	@CsvBindByName(column = "Transport")
	private Double transport;

	@CsvBindByPosition(position = 55)
	@CsvBindByName(column = "EquipmentRental")
	private Double equipmentRental;

	@CsvBindByPosition(position = 56)
	@CsvBindByName(column = "EquipmentRentalRoomDTH")
	private Double equipmentRentalRoomDTH;

	@CsvBindByPosition(position = 57)
	@CsvBindByName(column = "EquipmentRentalVendingMachine")
	private Double equipmentRentalVendingMachine;

	@CsvBindByPosition(position = 58)
	@CsvBindByName(column = "EquipmentRentalCoffeeMachine")
	private Double equipmentRentalCoffeeMachine;

	@CsvBindByPosition(position = 59)
	@CsvBindByName(column = "EquipmentRentalWashingMachine")
	private Double equipmentRentalWashingMachine;

	@CsvBindByPosition(position = 60)
	@CsvBindByName(column = "EquipmentRentalMicrowave")
	private Double equipmentRentalMicrowave;

	@CsvBindByPosition(position = 61)
	@CsvBindByName(column = "EquipmentRentalSingleDoorFridge")
	private Double equipmentRentalSingleDoorFridge;

	@CsvBindByPosition(position = 62)
	@CsvBindByName(column = "EquipmentRentalDoubleDoorFridge")
	private Double equipmentRentalDoubleDoorFridge;

	@CsvBindByPosition(position = 63)
	@CsvBindByName(column = "EquipmentRentalWaterDispenser")
	private Double equipmentRentalWaterDispenser;

	@CsvBindByPosition(position = 64)
	@CsvBindByName(column = "EquipmentRentalDryer")
	private Double equipmentRentalDryer;

	@CsvBindByPosition(position = 65)
	@CsvBindByName(column = "EquipmentRentalAc")
	private Double equipmentRentalAc;

	@CsvBindByPosition(position = 66)
	@CsvBindByName(column = "EquipmentRentalCommonGeyser")
	private Double equipmentRentalCommonGeyser;

	@CsvBindByPosition(position = 67)
	@CsvBindByName(column = "EquipmentRentalRoomGeyser")
	private Double equipmentRentalRoomGeyser;

	@CsvBindByPosition(position = 68)
	@CsvBindByName(column = "EquipmentRentalPowerBackup")
	private Double equipmentRentalPowerBackup;

	@CsvBindByPosition(position = 69)
	@CsvBindByName(column = "EquipmentRentalTv")
	private Double equipmentRentalTv;

	@CsvBindByPosition(position = 70)
	@CsvBindByName(column = "EquipmentRentalRo")
	private Double equipmentRentalRo;

	@CsvBindByPosition(position = 71)
	@CsvBindByName(column = "EquipmentRentalSmartLock")
	private Double equipmentRentalSmartLock;

	@CsvBindByPosition(position = 72)
	@CsvBindByName(column = "EquipmentRentalFacialRecognition")
	private Double equipmentRentalFacialRecognition;

	@CsvBindByPosition(position = 73)
	@CsvBindByName(column = "EquipmentRentalTreadmill")
	private Double equipmentRentalTreadmill;

	@CsvBindByPosition(position = 74)
	@CsvBindByName(column = "EquipmentRentalMultiGym")
	private Double equipmentRentalMultiGym;

}
