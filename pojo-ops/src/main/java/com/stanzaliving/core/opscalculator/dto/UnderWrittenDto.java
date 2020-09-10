package com.stanzaliving.core.opscalculator.dto;

import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.core.opscalculator.enums.UnderWrittenStatus;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UnderWrittenDto {
    private String underWrittenUuid;
    private String serviceMixUuid;
    private String residenceUuid;
    private String currentStatus;               //get
    private UnderWrittenStatus finalStatus;     //post


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
    private UnderwrittenCostCategoryDto underwrittenCostCategoryDto;
}
