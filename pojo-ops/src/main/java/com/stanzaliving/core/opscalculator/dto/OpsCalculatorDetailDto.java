/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.opscalculator.dto;

import com.stanzaliving.core.enums.ResidenceBrand;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class OpsCalculatorDetailDto {

	@Builder.Default
	private ResidenceBrand residenceBrand = ResidenceBrand.PRIMA;

	@Builder.Default
	private ResidenceBrand[] allResidenceBrands = ResidenceBrand.values();

	private String residenceId;
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
