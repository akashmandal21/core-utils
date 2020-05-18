/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.operations.dto.opscalculator;

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
	private InternCategoryDto internCategoryDto;
	private AuditCategoryDto auditCategoryDto;
	private UnderwrittenCostCategoryDto underwrittenCostCategoryDto;

}
