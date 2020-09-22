/**
 * 
 */
package com.stanzaliving.core.food.dto.request;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.stanzaliving.core.food.dto.MealFoodMenuDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author naveen.kumar
 *
 * @date 14 Jul, 2020
 *
 **/
@Getter
@Setter
@Builder
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class ComboMenuRuleCheckRequestDto {

	@NotBlank(message = "Menu Group is mandatory")
	private String menuGroupId;

	@NotEmpty(message = "Menus are mandatory to validate for rules")
	private List<MealFoodMenuDto> menuDtos;
}