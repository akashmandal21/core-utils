/**
 * 
 */
package com.stanzaliving.core.food.dto;

import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
 * @date 7 Sep, 2020
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ExtraFoodOrderRequestDto {

	@NotBlank(message = "Residence Id is Mandatory")
	private String residenceId;

	@NotNull(message = "Meal Type is mandatory")
	private MealType mealType;

	@NotNull(message = "Menu Date is mandatory")
	private LocalDate menuDate;

	@NotNull(message = "Veg Pax is mandatory")
	@Min(value = 0, message = "Veg Pax Value cannot be less than 0")
	private Integer vegPax;

	@NotNull(message = "Non Veg Pax is mandatory")
	@Min(value = 0, message = "Non Veg Pax Value cannot be less than 0")
	private Integer nonVegPax;

	@NotBlank(message = "Extra Food Order Reason is mandatory")
	@Size(min = 20, max = 200, message = "Reason must be between 20-200 characters")
	private String extraFoodOrderReason;
}