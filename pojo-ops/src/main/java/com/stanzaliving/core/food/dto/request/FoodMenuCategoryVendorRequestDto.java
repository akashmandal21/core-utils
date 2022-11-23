package com.stanzaliving.core.food.dto.request;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 14-May-2020
 *
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuCategoryVendorRequestDto {

	@NotBlank(message = "Menu Category Id is Mandatory")
	private String menuCategoryId;

	@NotBlank(message = "Vendor Id is Mandatory")
	private String vendorId;

	@NotNull(message = "Category Active Status is mandatory")
	private Boolean categoryActive;

	@NotEmpty(message = "Meal Type Costs are mandatory")
	private List<FoodMenuCategoryVendorUpdateDto> mealCosts;
}