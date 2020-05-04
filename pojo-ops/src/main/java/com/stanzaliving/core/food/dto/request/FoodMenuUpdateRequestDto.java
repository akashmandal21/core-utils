/**
 * 
 */
package com.stanzaliving.core.food.dto.request;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.stanzaliving.core.food.dto.DateWiseFoodMenuDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 04-May-2020
 *
 **/
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuUpdateRequestDto {

	@NotBlank(message = "Menu group id is mandatory")
	private String menuGroupId;

	private boolean stanzaKitchenCategory;

	private boolean compositionRulesSatisfied;

	private boolean budgetUtilizationInLimit;

	private boolean vendorSelected;

	@NotEmpty(message = "Date wise food menus are mandatory")
	private List<DateWiseFoodMenuDto> dateWiseFoodMenus;

}