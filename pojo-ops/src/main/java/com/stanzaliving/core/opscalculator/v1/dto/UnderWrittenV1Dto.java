package com.stanzaliving.core.opscalculator.v1.dto;

import java.util.List;

import com.stanzaliving.core.opscalculator.dto.PropertyInfoDto;
import com.stanzaliving.core.opscalculator.dto.SMLevelDto;
import com.stanzaliving.core.opscalculator.dto.UnderwrittenCostCategoryDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class UnderWrittenV1Dto {
    protected PropertyInfoDto propertyInfoDto;
    
    protected FoodCategoryV1Dto foodCategoryV1Dto;
    protected PersonnelCategoryV1Dto personnelCategoryV1Dto;
	private UtilitiesElectricityCategoryV1Dto utilitiesElectricityCategoryV1Dto;
	private UtilitiesWaterCategoryV1Dto utilitiesWaterCategoryV1Dto;
	private UtilitiesDgCategoryV1Dto utilitiesDgCategoryV1Dto;
	protected SuppliesCategoryV1Dto suppliesCategoryV1Dto;
    protected InternetCategoryV1Dto internetCategoryV1Dto ;
    protected LaundryCategoryV1Dto laundryCostCategoryV1Dto;
    private RepairCategoryV1Dto repairCategoryV1Dto;
    private BuildMaintenanceCategoryV1Dto buildMaintenanceCategoryV1Dto;
    private AuditCategoryV1Dto auditCategoryV1Dto;
    protected UniformCategoryV1Dto uniformCategoryV1Dto;
    private IncentiveCategoryV1Dto incentiveCategoryV1Dto;
    protected CxCategoryV1Dto cxCategoryV1Dto;
    protected TransportCategoryV1Dto transportCategoryV1Dto;
    
    
    protected UnderwrittenCostCategoryDto underwrittenCostCategoryDto;
    
    
   

    private double underWrittenDurationAmount;
    private double underWrittenDurationInDays;
    List<SMLevelDto> smLevelDtoList;

}
