package com.stanzaliving.core.dish.client.api;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import org.apache.commons.collections.MapUtils;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.PageResponse;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.food.dto.FoodItemDto;
import com.stanzaliving.core.food.dto.MenuItemDto;
import com.stanzaliving.core.food.dto.response.DishMasterSearchResponseDto;
import com.stanzaliving.core.food.enums.RecipeType;
import com.stanzaliving.food.v2.category.dto.MenuItemSearchPdto;

import lombok.extern.log4j.Log4j2;

/**
 * @author Manish.Pareek
 *
 * @version 1.0
 *
 * @since 28-Jul-2021
 */

@Log4j2
public class DishClientApi {

	private final StanzaRestClient restClient;

	public DishClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public Map<String, FoodItemDto> getFoodItemMap() {

		String path = UriComponentsBuilder.fromPath("/internal/common/food/item/integration").build().toUriString();

		TypeReference<ResponseDto<Map<String, FoodItemDto>>> returnType = new TypeReference<ResponseDto<Map<String, FoodItemDto>>>() {};

		ResponseDto<Map<String, FoodItemDto>> responseDto = null;

		try {

			responseDto = restClient.get(path, null, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting foodItemMap", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && MapUtils.isNotEmpty(responseDto.getData())) ? responseDto.getData() : new HashMap<>();
	}
	
	public Map<String, MenuItemDto> getItemDetails(Collection<String> itemIds) {

		String path = UriComponentsBuilder.fromPath("/internal/common/food/item/integration/itemDetails").build().toUriString();

		TypeReference<ResponseDto<Map<String, MenuItemDto>>> returnType = new TypeReference<ResponseDto<Map<String, MenuItemDto>>>() {};
		
		ResponseDto<Map<String, MenuItemDto>> responseDto = null;

		try {
			 responseDto = restClient.post(path, null, itemIds, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while adding food item", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	public Map<String, FoodItemDto> getFoodItemDtoMap(Collection<String> itemIds) {

		String path = UriComponentsBuilder.fromPath("/internal/item/foodItemDtoMap").build().toUriString();

		TypeReference<ResponseDto<Map<String, FoodItemDto>>> returnType = new TypeReference<ResponseDto<Map<String, FoodItemDto>>>() {};
		
		ResponseDto<Map<String, FoodItemDto>> responseDto = null;

		try {
			 responseDto = restClient.post(path, null, itemIds, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while getting fooditemdtomap", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	public PageResponse<DishMasterSearchResponseDto> searchItems(int pageNo, int limit, MenuItemSearchPdto searchPdto, boolean dataComplete, boolean status, List<RecipeType> recipeTypes, boolean receipeExists ) {
		String path = UriComponentsBuilder.fromPath("/internal/item/search/light/name/{pageNo}/{limit}").build().toUriString();

		TypeReference<ResponseDto<PageResponse<DishMasterSearchResponseDto>>> returnType = new TypeReference<ResponseDto<PageResponse<DishMasterSearchResponseDto>>>() {};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		searchPdto.setDataComplete(dataComplete);
		searchPdto.setStatus(status);
		searchPdto.setRecipeTypes(recipeTypes);
		searchPdto.setReceipeExists(receipeExists);
		
		ResponseDto<PageResponse<DishMasterSearchResponseDto>> responseDto = null;

		try {
			 responseDto = restClient.post(path, queryParams, searchPdto, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while searching food item", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
		
	}
	
	public Map<String, String> getImageUrl(Set<String> itemIds) {
		
		String path = UriComponentsBuilder.fromPath("/internal/dish/imageUrlMap").build().toUriString();

		TypeReference<ResponseDto<Map<String, String>>> returnType = new TypeReference<ResponseDto<Map<String, String>>>() {};

		
		ResponseDto<Map<String, String>> responseDto = null;

		try {

			responseDto = restClient.post(path, null, itemIds, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting imageUrlMap", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && MapUtils.isNotEmpty(responseDto.getData())) ? responseDto.getData() : new HashMap<>();
	}
	

	
}

