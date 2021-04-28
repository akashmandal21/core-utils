package com.stanzaliving.core.opscalculator.dto;

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
public class MonthlyForcastCsvDto {
	@CsvBindByPosition(position = 0)
	@CsvBindByName(column = "City")
	private String city;
	
	@CsvBindByPosition(position = 1)
	@CsvBindByName(column = "MicroMarket")
	private String microMarket;
	
	@CsvBindByPosition(position = 2)
	@CsvBindByName(column = "residenceName")
	private String residenceName;
	
	@CsvBindByPosition(position = 3)
	@CsvBindByName(column = "Month")
	private String month;
	
	@CsvBindByPosition(position = 4)
	@CsvBindByName(column = "BedOccupancy")
	private Double bedOccupancy;
	
	@CsvBindByPosition(position = 5)
	@CsvBindByName(column = "RoomOccupancy")
	private Double roomOccupancy;
   
	@CsvBindByPosition(position = 6)
	@CsvBindByName(column = "Food")
    private Double food;
	
	@CsvBindByPosition(position = 7)
	@CsvBindByName(column = "FoodHolidays")
    private Double foodHolidays;
	
	@CsvBindByPosition(position = 8)
	@CsvBindByName(column = "FoodUtil")
    private Double foodUtil;
	
	@CsvBindByPosition(position = 9)
	@CsvBindByName(column = "FoodMenuPricePerDay")
    private Double foodMenuPricePerDay;
    
	@CsvBindByPosition(position = 10)
	@CsvBindByName(column = "Electricity")
    private Double electricity;
	
	@CsvBindByPosition(position = 11)
	@CsvBindByName(column = "ElectricityFixedCharges")
    private Double electricityFixedCharges;
	
	@CsvBindByPosition(position = 12)
	@CsvBindByName(column = "ElectricityVariableCharges")
    private Double electricityVariableCharges;
    
	@CsvBindByPosition(position = 13)
	@CsvBindByName(column = "Water")
    private Double water;
	
	@CsvBindByPosition(position = 14)
	@CsvBindByName(column = "WaterFixedCharges")
    private Double waterFixedCharges;
	
	@CsvBindByPosition(position = 15)
	@CsvBindByName(column = "WaterVariableCharges")
    private Double waterVariableCharges;
    
	@CsvBindByPosition(position = 16)
	@CsvBindByName(column = "DG")
    private Double dg;
    
	@CsvBindByPosition(position = 17)
	@CsvBindByName(column = "Housekeeping")
    private Double housekeeping;
	
	@CsvBindByPosition(position = 18)
	@CsvBindByName(column = "HousekeepingHK8hrs")
    private Double housekeepingHK8hrs;
    
    @CsvBindByPosition(position = 19)
	@CsvBindByName(column = "HousekeepingHK12hrs")
    private Double housekeepingHK12hrs;
    
    @CsvBindByPosition(position = 20)
	@CsvBindByName(column = "HousekeepingHKCT")
    private Double housekeepingHKCT;
    
    @CsvBindByPosition(position = 21)
	@CsvBindByName(column = "Security")
    private Double security;
    
    @CsvBindByPosition(position = 22)
	@CsvBindByName(column = "SecurityInHouseSecurity")
    private Double securityInHouseSecurity;
    
    @CsvBindByPosition(position = 23)
	@CsvBindByName(column = "SecurityInSecurity")
    private Double securityInSecurity;
    
    @CsvBindByPosition(position = 24)
	@CsvBindByName(column = "Personnel")
    private Double personnel;
    
    @CsvBindByPosition(position = 25)
	@CsvBindByName(column = "PersonnelRC")
    private Double personnelRC;
    
    @CsvBindByPosition(position = 26)
	@CsvBindByName(column = "PersonnelOE")
    private Double personnelOE;
    
    @CsvBindByPosition(position = 27)
	@CsvBindByName(column = "Internet")
    private Double internet;
    
    @CsvBindByPosition(position = 28)
	@CsvBindByName(column = "Laundry")
    private Double laundry;
    
    @CsvBindByPosition(position = 29)
	@CsvBindByName(column = "Supplies")
    private Double supplies;
    
    @CsvBindByPosition(position = 30)
	@CsvBindByName(column = "SuppliesDTH")
    private Double suppliesDTH;
    
    @CsvBindByPosition(position = 31)
	@CsvBindByName(column = "SuppliesGeneralSupplies")
    private Double suppliesGeneralSupplies;
    
    @CsvBindByPosition(position = 32)
	@CsvBindByName(column = "SuppliesCleaningChemicals")
    private Double suppliesCleaningChemicals; 
    
}
