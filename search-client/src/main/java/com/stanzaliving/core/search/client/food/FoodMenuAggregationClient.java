package com.stanzaliving.core.search.client.food;

import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.search.food.search.dto.request.MenuMealItemRequestDto;
import com.stanzaliving.search.food.search.dto.response.menu.rating.MealItemRatingResponseDto;

import java.util.List;

public interface FoodMenuAggregationClient {

	List<MealItemRatingResponseDto> aggregateMenuItemsRating(StanzaRestClient restClient, MenuMealItemRequestDto requestDto);
}
