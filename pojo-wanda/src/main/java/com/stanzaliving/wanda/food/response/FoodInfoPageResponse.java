package com.stanzaliving.wanda.food.response;

import java.util.List;
import java.util.Map;

import com.stanzaliving.wanda.response.FoodCardDto;
import com.stanzaliving.wanda.response.FoodHomeScreenResponse;

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
public class FoodInfoPageResponse {

	private Map<String, List<FoodCardDto>> foodMenu;
	
	private FoodHomeScreenResponse homeScreenResponse;
}
