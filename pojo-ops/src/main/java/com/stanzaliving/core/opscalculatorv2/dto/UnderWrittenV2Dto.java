package com.stanzaliving.core.opscalculatorv2.dto;

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
public class UnderWrittenV2Dto {
	private PropertyInfoDto propertyInfoDto;
	private FoodCategoryV2Dto foodCategoryV2Dto;
	private PersonnelCategoryV2Dto personnelCategoryV2Dto;
	private UtilitiesElectricityCategoryV2Dto utilitiesElectricityCategoryV2Dto;
	private UtilitiesWaterCategoryV2Dto utilitiesWaterCategoryV2Dto;
	private UtilitiesDgCategoryV2Dto utilitiesDgCategoryV2Dto;
	private SuppliesCategoryV2Dto suppliesCategoryV2Dto;
	private InternetCategoryV2Dto internetCategoryV2Dto;
	private LaundryCategoryV2Dto laundryCategoryV2Dto;
	private RepairCategoryV2Dto repairCategoryV2Dto;
	private BuildMaintenanceCategoryV2Dto buildMaintenanceCategoryV2Dto;
	private AuditCategoryV2Dto auditCategoryV2Dto;
	private UniformCategoryV2Dto uniformCategoryV2Dto;
	private IncentiveCategoryV2Dto incentiveCategoryV2Dto;
	private CxCategoryV2Dto cxCategoryV2Dto;
	private TransportCategoryV2Dto transportCategoryV2Dto;
	private EquipmentRentalCategoryV2Dto equipRentalCategoryV2Dto;
	protected UnderwrittenCostCategoryDto underwrittenCostCategoryDto;
	private double underWrittenDurationAmount;
	private double underWrittenDurationInDays;
	List<SMLevelDto> smLevelDtoList;

}
