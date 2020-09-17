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
    private PropertyInfoDto propertyInfoDto;
    private FoodCategoryDto foodCategoryDto;
    private UtilitiesCategoryDto utilitiesCategoryDto;
    private InternetCategoryDto internetCategoryDto;
    private HouseKeepingCategoryDto houseKeepingCategoryDto;
    private SecurityCategoryDto securityCategoryDto;
    private PersonnelCategoryDto personnelCategoryDto;
    private AuditCategoryDto auditCategoryDto;
    private UniformCostsCategoryDto uniformCostsCategoryDto;
    private EquipmentRentalCategoryDto equipmentRentalCategoryDto;
    private LaundryCostCategoryDto laundryCostCategoryDto;
    private SubscriptionAndSuppliesCategoryDto subscriptionAndSuppliesCategoryDto;
    private RepairAndMaintenanceCategoryDto repairAndMaintenanceCategoryDto;
    private TransportCategoryDto transportCategoryDto;
    private UnderwrittenCostCategoryDto underwrittenCostCategoryDto;
}
