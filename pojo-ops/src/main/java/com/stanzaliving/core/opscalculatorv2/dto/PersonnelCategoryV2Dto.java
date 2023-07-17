package com.stanzaliving.core.opscalculatorv2.dto;


import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.opscalculator.dto.DropDownDto;
import com.stanzaliving.core.opscalculatorv2.enums.HouseKeepingType;
import com.stanzaliving.core.opscalculatorv2.enums.SecurityGuardType;
import com.stanzaliving.core.utilservice.annotations.ValidEnum;

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
public class PersonnelCategoryV2Dto extends CategoryV2Dto {

	private int hk12HrCount;
	private int hk12HrCountSuggested;
	private String hk12HrCountSuggestedReason;
	
	@ValidEnum(enumClass = HouseKeepingType.class, fieldName = "HouseKeepingType")
	private HouseKeepingType hkType;
	@ValidEnum(enumClass = HouseKeepingType.class, fieldName = "HouseKeepingType")
	private HouseKeepingType hkTypeSuggested;
	private String hkTypeSuggestedReason;

	private double hk12HrRate;
	private double hk12HrRateSuggested;
	private String hk12HrRateSuggestedReason;

	@Builder.Default
	public List<DropDownDto> hkTypeOptions = new ArrayList<>();

	private int sgCount;
	private int sgCountSuggested;
	private String sgCountSuggestedReason;

	@ValidEnum(enumClass = SecurityGuardType.class, fieldName = "HouseKeepingType")
	private SecurityGuardType sgType;
	@ValidEnum(enumClass = SecurityGuardType.class, fieldName = "HouseKeepingType")
	private SecurityGuardType sgTypeSuggested;
	private String sgTypeSuggestedReason;

	private double sgRate;
	private double sgRateSuggested;
	private String sgRateSuggestedReason;

	@Builder.Default
	public List<DropDownDto> sgTypeOptions = new ArrayList<>();

	private int jrRcCount;
	private int jrRcCountSuggested;
	private String jrRcCountSuggestedReason;

	private double jrRcRate;

	private int rcCount;
	private int rcCountSuggested;
	private String rcCountSuggestedReason;
	private double rcRate;
	private double releiverJrRc;

	public double hk12HrCostPerBed;
	public double sgCostPerBed;
	public double rcCostPerBed;
	public double jrRcCostPerBed;
	public double releiverCostPerBed;

	private int noOfEmployeesSuggested;
	private int noOfEmployees;
	private String noOfEmployeesSuggestedReason;

	private double employeeRatePerMonth;
	private double employeeRatePerMonthSuggested;
	private String employeeRatePerMonthSuggestedReason;

}
