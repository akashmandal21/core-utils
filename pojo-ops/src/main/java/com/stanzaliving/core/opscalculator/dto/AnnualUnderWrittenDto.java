package com.stanzaliving.core.opscalculator.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class AnnualUnderWrittenDto  {
    protected PropertyInfoDto propertyInfoDto;
    protected FoodCategoryDto foodCategoryDto;
    protected UtilitiesCategoryDto utilitiesCategoryDto;
    protected InternetCategoryDto internetCategoryDto;
    protected HouseKeepingCategoryDto houseKeepingCategoryDto;
    protected SecurityCategoryDto securityCategoryDto;
    protected PersonnelCategoryDto personnelCategoryDto;
    protected AuditCategoryDto auditCategoryDto;
    protected UniformCostsCategoryDto uniformCostsCategoryDto;
    protected EquipmentRentalCategoryDto equipmentRentalCategoryDto;
    protected LaundryCostCategoryDto laundryCostCategoryDto;
    protected SubscriptionAndSuppliesCategoryDto subscriptionAndSuppliesCategoryDto;
    protected RepairAndMaintenanceCategoryDto repairAndMaintenanceCategoryDto;
    protected TransportCategoryDto transportCategoryDto;
    protected UnderwrittenCostCategoryDto underwrittenCostCategoryDto;
}
