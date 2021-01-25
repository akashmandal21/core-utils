/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.opscalculator.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.stanzaliving.core.opscalculator.constants.Constants;

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
public class SubscriptionAndSuppliesCategoryDto extends CategoryDto {

	private boolean isSuppliesApplicable;
	private boolean isDthApplicable;

	private int tvsCount;
	private int dthRechargeCostPerMonth;
	private int dthCost;
	private int dthCostPerBedPerMonth;

	private int fixedGeneralSupplies;
	private int variableGeneralSupplies;
	private int totalGeneralSupplies;

	private int fixedCleaningChemical;
	private int variableCleaningChemical;
	private int totalCleaningChemical;

	private int fixedCleaningEquipment;
	private int variableCleaningEquipment;
	private int totalCleaningEquipment;


	private int totalCleaningCostPerMonth;
}
