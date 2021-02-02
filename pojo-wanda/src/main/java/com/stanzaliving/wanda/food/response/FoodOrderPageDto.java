package com.stanzaliving.wanda.food.response;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.stanzaliving.wanda.response.FoodCardDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@ToString
public class FoodOrderPageDto {

	private List<FoodCardDto> foodCardDtos;

	private String userFoodResidenceMenuId;

	private LocalDate cutoffDate;

	private LocalTime cutoffTime;
}
