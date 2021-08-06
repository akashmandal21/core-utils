/**
 * 
 */
package com.stanzaliving.food.v2.menu.dto;

import java.util.Collection;

import com.stanzaliving.core.food.dto.FoodMenuCategoryDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author manish.pareek
 *
 * @date 3rd Aug, 2021
 *
 **/
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemQuantityCombinationRequest {

	private Collection<String> items;
	private ResidenceMenuDto menu; 
	private FoodMenuCategoryDto menuCategory;
}