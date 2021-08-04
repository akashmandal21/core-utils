package com.stanzaliving.core.dish.client.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.collections.MapUtils;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.food.dto.FoodItemDto;
import com.stanzaliving.core.food.dto.ItemCategoryDto;
import com.stanzaliving.core.food.dto.ItemSubCategoryCountDto;
import com.stanzaliving.core.food.dto.ItemSubCategoryDto;
import com.stanzaliving.core.food.dto.MenuItemDto;
import com.stanzaliving.core.food.dto.ResidentFoodItemFeedbackDto;
import com.stanzaliving.core.food.dto.response.ItemCategoryCountDto;
import com.stanzaliving.core.food.dto.response.MealItemCategoryCountDto;

import lombok.extern.log4j.Log4j2;

/**
 * @author Manish.Pareek
 *
 * @version 1.0
 *
 * @since 28-Jul-2021
 */

@Log4j2
public class ItemCategoryAndSubCategoryClientApi {

	private final StanzaRestClient restClient;

	public ItemCategoryAndSubCategoryClientApi(StanzaRestClient stanzaRestClient) {
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
	
	public Map<String, ItemCategoryDto> getItemCategory(Collection<String> categories) {

		String path = UriComponentsBuilder.fromPath("/internal/food/item/integration/category").build().toUriString();

		TypeReference<ResponseDto<Map<String, ItemCategoryDto>>> returnType = new TypeReference<ResponseDto<Map<String, ItemCategoryDto>>>() {
		};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		ResponseDto<Map<String, ItemCategoryDto>> responseDto = null;

		try {
			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting item category count", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : new HashMap<>();

	}
	
	public Map<String, ItemSubCategoryDto> getSubCategory(Collection<String> categories) {

		String path = UriComponentsBuilder.fromPath("/internal/food/item/integration/subcategory").build().toUriString();

		TypeReference<ResponseDto< Map<String, ItemSubCategoryDto>>> returnType = new TypeReference<ResponseDto<Map<String, ItemSubCategoryDto>>>() {
		};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		ResponseDto<Map<String, ItemSubCategoryDto>> responseDto = null;

		try {
			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting item category count", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : new HashMap<>();

	}
	
	
	public Map<String, ItemCategoryDto> getItemCategoryMapByFeedbackDto(List<ResidentFoodItemFeedbackDto> itemFeedbackDtos) {

		String path = UriComponentsBuilder.fromPath("/internal/v2/common/item/category/mapByFeedback").build().toUriString();

		TypeReference<ResponseDto<Map<String, ItemCategoryDto>>> returnType = new TypeReference<ResponseDto<Map<String, ItemCategoryDto>>>() {};

		ResponseDto<Map<String, ItemCategoryDto>> responseDto = null;

		try {

			responseDto = restClient.post(path, null, itemFeedbackDtos, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting item category map", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: new HashMap<>();

	}
	
	public Map<String, ItemSubCategoryDto> getItemSubCategoryMapByFeedbackDto(List<ResidentFoodItemFeedbackDto> itemFeedbackDtos) {

		String path = UriComponentsBuilder.fromPath("/internal/v2/common/item/subcategory/mapByFeedback").build().toUriString();

		TypeReference<ResponseDto<Map<String, ItemSubCategoryDto>>> returnType = new TypeReference<ResponseDto<Map<String, ItemSubCategoryDto>>>() {};

		ResponseDto<Map<String, ItemSubCategoryDto>> responseDto = null;

		try {

			responseDto = restClient.post(path, null, itemFeedbackDtos, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting item subcategory map", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: new HashMap<>();

	}
	
	public List<ItemCategoryCountDto> getItemCategoryCount() {

		String path = UriComponentsBuilder.fromPath("/internal/item/category/count").build().toUriString();

		TypeReference<ResponseDto<List<ItemCategoryCountDto>>> returnType = new TypeReference<ResponseDto<List<ItemCategoryCountDto>>>() {
		};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		ResponseDto<List<ItemCategoryCountDto>> responseDto = null;

		try {
			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting item category count", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : new ArrayList<>();

	}
	
	
	public List<ItemSubCategoryCountDto> getItemSubCategoryCount() {

		String path = UriComponentsBuilder.fromPath("/internal/item/subcategory/count").build().toUriString();

		TypeReference<ResponseDto<List<ItemSubCategoryCountDto>>> returnType = new TypeReference<ResponseDto<List<ItemSubCategoryCountDto>>>() {
		};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		ResponseDto<List<ItemSubCategoryCountDto>> responseDto = null;

		try {
			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting item subcategory count", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : new ArrayList<>();

	}
	
	public List<MealItemCategoryCountDto> getItemCategoryCountByMeal() {

		String path = UriComponentsBuilder.fromPath("/internal/item/meal/category/count").build().toUriString();

		TypeReference<ResponseDto<List<MealItemCategoryCountDto>>> returnType = new TypeReference<ResponseDto<List<MealItemCategoryCountDto>>>() {
		};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		ResponseDto<List<MealItemCategoryCountDto>> responseDto = null;

		try {
			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting category wise item listing for meal", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : new ArrayList<>();

	}
	
	
	
	public Map<String, ItemCategoryDto> getItemCategoryMap(Collection<MenuItemDto> menuItemDtos){
		
		String path = UriComponentsBuilder.fromPath("/internal/item/category/getItemCategoryMap").build().toUriString();

		TypeReference<ResponseDto<Map<String, ItemCategoryDto>>> returnType = new TypeReference<ResponseDto<Map<String, ItemCategoryDto>>>() {
		};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		ResponseDto<Map<String, ItemCategoryDto>> responseDto = null;

		try {
			responseDto = restClient.post(path, queryParams, menuItemDtos, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting category wise item listing for meal", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : new HashMap<>();
	}
	
	public Map<String, ItemSubCategoryDto> getItemSubCategoryMap(Collection<MenuItemDto> menuItemDtos) {

		String path = UriComponentsBuilder.fromPath("/internal/item/subcategory/getItemSubCategoryMap").build().toUriString();

		TypeReference<ResponseDto<Map<String, ItemSubCategoryDto>>> returnType = new TypeReference<ResponseDto<Map<String, ItemSubCategoryDto>>>() {
		};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		ResponseDto<Map<String, ItemSubCategoryDto>> responseDto = null;

		try {
			responseDto = restClient.post(path, queryParams, menuItemDtos, null, null, returnType,
					MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting category wise item listing for meal", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : new HashMap<>();
	}
	
}

