package com.stanzaliving.core.food.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class KitchenFoodOrderDto {

	private String vendorId;

	private String mealType;

	private LocalDate orderDate;

	private KitchenOrderDto breakfast;

	private KitchenOrderDto lunch;

	private KitchenOrderDto snacks;

	private KitchenOrderDto dinner;


}
