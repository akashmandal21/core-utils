/**
 * @author manish.pareek
 *
 */
package com.stanzaliving.core.opscalculator.V2.dto;

import com.stanzaliving.core.opscalculator.dto.CategoryDto;

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
public class LaundryCategoryV2Dto extends CategoryDto {

	private int clothesPerPersonPerMonth;
	private double weightPerCloth;
	private double costPerKg;
	private int utilizationPercent;
	private boolean leninLaundryInclude;
	private double leninCost;

}
