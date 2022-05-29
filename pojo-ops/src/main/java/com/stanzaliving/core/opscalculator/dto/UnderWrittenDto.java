package com.stanzaliving.core.opscalculator.dto;

import java.util.List;

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
public class UnderWrittenDto {
    protected PropertyInfoDto propertyInfoDto;
    protected FoodCategoryDto foodCategoryDto;
    protected UtilitiesCategoryDto utilitiesCategoryDto;
    protected InternetCategoryDto internetCategoryDto;
    public HouseKeepingCategoryDto houseKeepingCategoryDto;
    protected SecurityCategoryDto securityCategoryDto;
    protected PersonnelCategoryDto personnelCategoryDto;
    public AuditCategoryDto auditCategoryDto;
    protected UniformCostsCategoryDto uniformCostsCategoryDto;
    protected EquipmentRentalCategoryDto equipmentRentalCategoryDto;
    protected LaundryCostCategoryDto laundryCostCategoryDto;
    protected SubscriptionAndSuppliesCategoryDto subscriptionAndSuppliesCategoryDto;
    protected RepairAndMaintenanceCategoryDto repairAndMaintenanceCategoryDto;
    protected TransportCategoryDto transportCategoryDto;
    protected UnderwrittenCostCategoryDto underwrittenCostCategoryDto;
    protected CxCategoryDto cxCategoryDto;
    protected BuildingMaintenanceDto buildingMaintenanceDto;
    private RepairCategoryDto repairCategoryDto;
    private IncentiveCategoryDto incentiveCategoryDto;

    private double underWrittenDurationAmount;
    private double underWrittenDurationInDays;
    List<SMLevelDto> smLevelDtoList;
    
    public PropertyAttributeInfoDto propertyAttributeInfoDto;
    public double multiplyFactor;

}
