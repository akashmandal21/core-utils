package com.stanzaliving.core.opscalculator.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class UnderWrittenCalculateResponseDto {
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
    protected BuildingMaintenanceDto buildingMaintenanceDto;
    protected CxCategoryDto cxCategoryDto;
    protected PersonnelCategoryDtoV2 personnelCategoryDtoV2;
    private double underWrittenDurationAmount;
    private double underWrittenDurationInDays;
    List<SMLevelDto> smLevelDtoList;
    
    public PropertyAttributeInfoDto propertyAttributeInfoDto;
    public double multiplyFactor;

}
