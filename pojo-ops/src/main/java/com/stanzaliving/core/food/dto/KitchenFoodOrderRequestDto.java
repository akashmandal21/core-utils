package com.stanzaliving.core.food.dto;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class KitchenFoodOrderRequestDto {

	@NotBlank(message = "Vendor Id Cannot be blank")
	private String vendorId;

	@NotNull(message = "Order Date is mandatory")
	private LocalDate orderDate;

	@NotEmpty(message = "Meal orders are mandatory")
	private List<@Valid KitchenOrderMealRequestDto> meals;

}