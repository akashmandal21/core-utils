package com.stanzaliving.core.opscalculator.v1.dto;


import com.stanzaliving.core.opscalculator.dto.CategoryDto;
import com.stanzaliving.core.opscalculator.v1.enums.HouseKeepingType;
import com.stanzaliving.core.opscalculator.v1.enums.SecurityGuardType;

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
public class PersonnelCategoryV1Dto extends CategoryDto{

    private int hk12HrCount;
    private HouseKeepingType hkType;
    private double hk12HrRate;
    private int sgCount;
    private SecurityGuardType sgType;
    private double sgRate;
    private int jrRcCount;
    private double jrRcRate;
    private int rcCount;
    private double rcRate;
    private double releiverJrRc;
    
    
    public double hk12HrCostPerBed;
	public double sgCostPerBed;
	public double rcCostPerBed;
	public double jrRcCostPerBed;
	public double releiverCostPerBed;

}
