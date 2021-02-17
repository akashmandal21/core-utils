package com.stanzaliving.core.food.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class KitchenFoodOrderRequestDto {

	private String vendorId;

	private LocalDate orderDate;

	private List<KitchenOrderMealRequestDto> meals;

}
