package com.stanzaliving.core.opscalculator.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class MonthlyForcastCsvDto {
    private String city;
    private String microMarket;
    private String residenceName;
    private String month;
    private Double bedOccupancy;
    private Double roomOccupancy;
   
    private Double food;
    private Double foodHolidays;
    private Double foodUtil;
    private Double foodMenuPricePerDay;
    
    private Double electricity;
    private Double electricityFixedCharges;
    private Double electricityVariableCharges;
    
    private Double water;
    private Double waterFixedCharges;
    private Double waterVariableCharges;
    
    private Double dG;
    
    private Double housekeeping;
    private Double housekeepingHK8hrs;
    private Double housekeepingHK12hrs;
    private Double housekeepingHKCT;
    
    private Double security;
    private Double securityInHouseSecurity;
    private Double securityInSecurity;
    
    
    private Double personnel;
    private Double personnelRC;
    private Double personnelOE;
    
    private Double internet;
    
    private Double laundry;
    
    private Double supplies;
    private Double suppliesDTH;
    private Double suppliesGeneralSupplies;
    private Double suppliesCleaningChemicals;
    
    
    
    
    
 
    
    
   
    
    
    
}
