/**
 * @author manish.pareek
 *
 */
package com.stanzaliving.core.opscalculatorv2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author manish.pareek
 *
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class LaundryCategoryV2Dto extends CategoryV2Dto {

	private int clothesPerPersonPerMonth;
	private int clothesPerPersonPerMonthSuggested;
	private String clothesPerPersonPerMonthSuggestedReason;
	private double weightPerCloth;
	private double costPerKg;
	private int utilizationPercent;
	private int utilizationPercentSuggested;
	private String utilizationPercentSuggestedReason;
	private boolean leninLaundryInclude;
	private double leninCost;
	private double laundryRatePerKg;

}
