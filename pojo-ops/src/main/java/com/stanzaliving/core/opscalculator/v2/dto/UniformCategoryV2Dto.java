/**
 * @author manish.pareek
 *
 */
package com.stanzaliving.core.opscalculator.V2.dto;

import com.stanzaliving.core.opscalculator.dto.CategoryDto;

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
@ToString(callSuper = true)
public class UniformCategoryV2Dto extends CategoryDto {

	public boolean hkUniformRequired;
	public boolean rcUniformRequired;
	public boolean rmUniformRequired;
	public int hkUniformRate;
	public int rcUniformRate;
	public int rmUniformRate;
	public int hkEmployeeCount;
	public int rcEmployeeCount;
	public int rmEmployeeCount;
	
	public int hkUniformCost;
	public int rcUniformCost;
	public int rmUniformCost;
}
