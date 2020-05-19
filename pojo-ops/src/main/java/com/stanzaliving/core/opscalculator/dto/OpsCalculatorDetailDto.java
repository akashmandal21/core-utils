/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.opscalculator.dto;

import com.stanzaliving.core.enums.ResidenceBrand;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class OpsCalculatorDetailDto {

	private String residenceId;
	private ResidenceBrand residenceBrand;
	private PropertyInfoDto propertyInfoDto;
	private FoodCategoryDto foodCategoryDto;
	private UtilitiesCategoryDto utilitiesCategoryDto;
	private HouseKeepingCategoryDto houseKeepingCategoryDto;
	private SecurityCategoryDto securityCategoryDto;
	private RepairAndMaintenanceCategoryDto repairAndMaintenanceCategoryDto;
	private SubscriptionAndSuppliesCategoryDto subscriptionAndSuppliesCategoryDto;
	private LaundryCostCategoryDto laundryCostCategoryDto;
	private EquipmentRentalCategoryDto equipmentRentalCategoryDto;
	private PersonnelCategoryDto personnelCategoryDto;
	private AuditCategoryDto auditCategoryDto;
	private UniformCostsCategoryDto uniformCostsCategoryDto;
	private UnderwrittenCostCategoryDto underwrittenCostCategoryDto;
	
}
