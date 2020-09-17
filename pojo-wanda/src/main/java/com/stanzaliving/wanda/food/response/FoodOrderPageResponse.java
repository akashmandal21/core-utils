package com.stanzaliving.wanda.food.response;

import java.time.LocalTime;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.tuple.Pair;

import com.stanzaliving.wanda.response.FoodCardDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class FoodOrderPageResponse {

	private Map<String, FoodOrderPageDto> foodMenu;
	
	private LocalTime orderCloseTime;
	
	private boolean isOldOrder;
	
	private boolean hasNonVeg;
	
}