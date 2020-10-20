package com.stanzaliving.core.opscalculator.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class UnderWrittenDto {
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
    protected double underWrittenDurationAmount;
    protected double underWrittenDurationInDays;
    protected List<LocalDate> weekDays;
    protected List<LocalDate> weekendDays;
    protected List<LocalDate> holidays;
    protected List<LocalDate> specialDays;
}
