/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.opscalculator.v2.dto;

import com.stanzaliving.core.opscalculator.dto.CategoryDto;

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
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class LaundryCategoryV2Dto extends CategoryDto {

	private int clothesPerPersonPerMonth;
	private double weightPerCloth;
	private double costPerKg;
	private int utilizationPercent;
	private boolean leninLaundryInclude;
	private double leninCost;

}
