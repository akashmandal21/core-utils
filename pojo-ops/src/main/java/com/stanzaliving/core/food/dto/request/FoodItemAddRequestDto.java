/**
 * 
 */
package com.stanzaliving.core.food.dto.request;

import java.util.List;
import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 21-Apr-2020
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemAddRequestDto {

	@NotBlank(message = "Item Name is Mandatory")
	private String name;

	@NotNull(message = "Item Type is Mandatory")
	private FoodItemType itemType;

	private String defaultBrand;

	private Set<String> tagIds;

	@NotNull(message = "Item Quantifiable flag is mandatory")
	private Boolean quantifiable;

	@NotBlank(message = "Item Text Color is Mandatory")
	private String textColor;

	@NotBlank(message = "Item Background Color is Mandatory")
	private String bgColor;

	@NotBlank(message = "Item Category is Mandatory")
	private String category;

	private List<MealType> meals;
}