package com.stanzaliving.core.food.dto;

import java.util.List;

import com.stanzaliving.core.food.dto.MealPacksInfoDto;

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
public class FoodBudgetOrderDto {

	private Integer hostelId;

	private String orderDate;

	private List<MealPacksInfoDto> dayMealPacksInfoDto;

	private List<MealPacksInfoDto> weekMealPacksInfoDtos;

}
