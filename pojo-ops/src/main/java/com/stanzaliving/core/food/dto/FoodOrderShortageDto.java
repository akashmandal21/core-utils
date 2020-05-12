package com.stanzaliving.core.food.dto;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.NotEmpty;

import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodOrderShortageDto {

	private MealType meal;

	private LocalDate date;

	private String orderId;

	@NotEmpty(message = "item shortage can not be empty")
	private List<FoodOrderItemShortageDto> foodOrderItemShortageDtos;

}
