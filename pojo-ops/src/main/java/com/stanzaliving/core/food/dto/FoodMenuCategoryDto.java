/**
 * 
 */
package com.stanzaliving.core.food.dto;

import java.util.List;

import com.stanzaliving.core.base.common.dto.AbstractDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 22-Apr-2020
 *
 **/
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuCategoryDto extends AbstractDto {

	private String categoryName;

	private String cityId;

	private String cityName;

	private List<ResidenceConfigDto> residences;

	private boolean menuRulesSatisfied;

	private boolean stanzaKitchenCategory;
	
	private List<ResidenceConfigDto> mappedResidences;
}