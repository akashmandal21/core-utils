package com.stanzaliving.wanda.food.response;

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
}
