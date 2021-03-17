package com.stanzaliving.core.search.client.api.food;

import com.stanzaliving.core.base.common.dto.PageResponse;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.food.dto.FoodItemSearchDto;
import com.stanzaliving.search.food.index.dto.dishmaster.DishMasterSearchIndexDto;

import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 17-Mar-2021
 */

public interface FoodDishMasterService {
	PageResponse<DishMasterSearchIndexDto> searchDishMaster(StanzaRestClient restClient, FoodItemSearchDto searchDto);

	List<String> autoSuggestDishName(StanzaRestClient restClient, String text);
}
