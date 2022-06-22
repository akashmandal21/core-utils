package com.stanzaliving.core.opscalculator.V2.dto;


import com.stanzaliving.core.opscalculator.V2.enums.HouseKeepingType;
import com.stanzaliving.core.opscalculator.V2.enums.SecurityGuardType;
import com.stanzaliving.core.opscalculator.dto.CategoryDto;

import lombok.AllArgsConstructor;
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
public class PersonnelCategoryV2Dto extends CategoryDto{

    private int hk12HrCount;
    private HouseKeepingType hkType;
    private double hk12HrRate;
    private int hk12HrSuggestedCount;
	private String hk12HrSuggestedReason;
    private int sgCount;
    private SecurityGuardType sgType;
    private double sgRate;
    private int sgSuggestedCount;
	private String sgSuggestedReason;
    private int jrRcCount;
    private int jrRcSuggestedCount;
   	private String jrRcSuggestedReason;
    private double jrRcRate;
    private int rcCount;
    private int rcSuggestedCount;
   	private String rcSuggestedReason;
    private double rcRate;
    private double releiverJrRc;
    
    
    public double hk12HrCostPerBed;
	public double sgCostPerBed;
	public double rcCostPerBed;
	public double jrRcCostPerBed;
	public double releiverCostPerBed;
	
	
	private int noOfEmployees;
	private int suggestedNoOfEmployees;
	private String suggestedNoOfEmployeesReason;
	
	private double employeeRatePerMonth;

}
