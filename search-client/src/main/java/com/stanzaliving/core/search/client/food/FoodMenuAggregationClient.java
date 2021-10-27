package com.stanzaliving.core.search.client.food;

import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.search.food.search.dto.request.MenuMealItemRequestDto;
import com.stanzaliving.search.food.search.dto.request.MenuMealResidenceItemRequestDto;
import com.stanzaliving.search.food.search.dto.response.menu.rating.FoodMenuMicromarketRatingResponseDto;
import com.stanzaliving.search.food.search.dto.response.menu.rating.MealItemRatingResponseDto;

import java.util.List;

public interface FoodMenuAggregationClient {

	List<MealItemRatingResponseDto> aggregateMenuItemsRating(StanzaRestClient restClient, MenuMealItemRequestDto requestDto);

	List<MealItemRatingResponseDto> aggregateMenuItemsRating(StanzaRestClient restClient, MenuMealResidenceItemRequestDto requestDto);

	FoodMenuMicromarketRatingResponseDto aggregateWeeklyMenuItemsRating(StanzaRestClient restClient, MenuMealItemRequestDto requestDto);

	FoodMenuMicromarketRatingResponseDto aggregateWeeklyMenuItemsRating(StanzaRestClient restClient, MenuMealResidenceItemRequestDto requestDto);
}
