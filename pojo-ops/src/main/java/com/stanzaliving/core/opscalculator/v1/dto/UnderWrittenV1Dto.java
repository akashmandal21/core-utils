package com.stanzaliving.core.opscalculator.v1.dto;

import java.util.List;

import com.stanzaliving.core.opscalculator.dto.BuildingMaintenanceDto;
import com.stanzaliving.core.opscalculator.dto.CxCategoryDto;
import com.stanzaliving.core.opscalculator.dto.EquipmentRentalCategoryDto;
import com.stanzaliving.core.opscalculator.dto.FoodCategoryDto;
import com.stanzaliving.core.opscalculator.dto.HouseKeepingCategoryDto;
import com.stanzaliving.core.opscalculator.dto.IncentiveCategoryDto;
import com.stanzaliving.core.opscalculator.dto.LaundryCostCategoryDto;
import com.stanzaliving.core.opscalculator.dto.PersonnelCategoryDto;
import com.stanzaliving.core.opscalculator.dto.PropertyAttributeInfoDto;
import com.stanzaliving.core.opscalculator.dto.PropertyInfoDto;
import com.stanzaliving.core.opscalculator.dto.RepairAndMaintenanceCategoryDto;
import com.stanzaliving.core.opscalculator.dto.SMLevelDto;
import com.stanzaliving.core.opscalculator.dto.SecurityCategoryDto;
import com.stanzaliving.core.opscalculator.dto.SubscriptionAndSuppliesCategoryDto;
import com.stanzaliving.core.opscalculator.dto.UnderwrittenCostCategoryDto;
import com.stanzaliving.core.opscalculator.dto.UniformCostsCategoryDto;
import com.stanzaliving.core.opscalculator.dto.UtilitiesWaterCategoryDto;

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
    protected FoodCategoryV1Dto foodCategoryDto;
    
	private UtilitiesElectricityCategoryV1Dto utilitiesElectricityCategoryDto;
	private UtilitiesWaterCategoryDto utilitiesWaterCategoryDto;
	private UtilitiesDgCategoryV1Dto utilitiesDgCategoryDto;
    
    protected InternetCategoryV1Dto internetCategoryDto;
    public HouseKeepingCategoryV1Dto houseKeepingCategoryDto;
    protected SecurityCategoryDto securityCategoryDto;
    protected PersonnelCategoryDto personnelCategoryDto;
    public AuditCategoryV1Dto auditCategoryDto;
    protected UniformCostsCategoryDto uniformCostsCategoryDto;
    protected EquipmentRentalCategoryDto equipmentRentalCategoryDto;
    protected LaundryCostCategoryDto laundryCostCategoryDto;
    protected SubscriptionAndSuppliesCategoryDto subscriptionAndSuppliesCategoryDto;
    protected RepairAndMaintenanceCategoryDto repairAndMaintenanceCategoryDto;
    protected TransportCategoryV1Dto transportCategoryDto;
    protected UnderwrittenCostCategoryDto underwrittenCostCategoryDto;
    protected CxCategoryDto cxCategoryDto;
    protected BuildingMaintenanceDto buildingMaintenanceDto;
    private RepairCategoryV1Dto repairCategoryDto;
    private IncentiveCategoryDto incentiveCategoryDto;

    private double underWrittenDurationAmount;
    private double underWrittenDurationInDays;
    List<SMLevelDto> smLevelDtoList;

}
