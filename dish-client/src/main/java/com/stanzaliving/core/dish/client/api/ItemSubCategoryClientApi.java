package com.stanzaliving.core.dish.client.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.food.dto.ItemSubCategoryCountDto;
import com.stanzaliving.core.food.dto.ItemSubCategoryDto;
import com.stanzaliving.core.food.dto.MenuItemDto;
import com.stanzaliving.core.food.dto.ResidentFoodItemFeedbackDto;
import com.stanzaliving.core.food.dto.response.FoodPreferenceComboItemDto;

import lombok.extern.log4j.Log4j2;

/**
 * @author Manish.Pareek
 *
 * @version 1.0
 *
 * @since 28-Jul-2021
 */

@Log4j2
public class ItemSubCategoryClientApi {

	private final StanzaRestClient restClient;

	public ItemSubCategoryClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
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
	
	public List<ItemSubCategoryDto> getItemSubCategoryByCategoryId(String categoryId) {

		String path = UriComponentsBuilder.fromPath("/internal/item/subcategory/categoryId").build().toUriString();

		TypeReference<ResponseDto<List<ItemSubCategoryDto>>> returnType = new TypeReference<ResponseDto<List<ItemSubCategoryDto>>>() {
		};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("categoryId", categoryId);

		ResponseDto<List<ItemSubCategoryDto>> responseDto = null;

		try {
			responseDto = restClient.post(path, queryParams, null, null, null, returnType,
					MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting ItemSubCategory by categoryId ", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : new ArrayList<>();
	}
	
	public Set<String> getItemSubCategoryIds(String categoryId) {

		String path = UriComponentsBuilder.fromPath("/internal/item/subcategory/itemSubCategoryIds").build().toUriString();

		TypeReference<ResponseDto<Set<String>>> returnType = new TypeReference<ResponseDto<Set<String>>>() {
		};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("categoryId", categoryId);

		ResponseDto<Set<String>> responseDto = null;

		try {
			responseDto = restClient.post(path, queryParams, null, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting ItemSubCategory by categoryId ", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : new HashSet<>();
	}
	
	public List<ItemSubCategoryDto> getItemSubCategories() {

		String path = UriComponentsBuilder.fromPath("/internal/item/subcategory/listing").build().toUriString();

		TypeReference<ResponseDto<List<ItemSubCategoryDto>>> returnType = new TypeReference<ResponseDto<List<ItemSubCategoryDto>>>() {
		};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		ResponseDto<List<ItemSubCategoryDto>> responseDto = null;

		try {
			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting ItemSubCategory listing ", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : new ArrayList<>();
	}
	
	
	public Map<String, ItemSubCategoryDto> getSubCategoryMapByFoodPreferenceComboItem(List<FoodPreferenceComboItemDto> itemDtos) {

		String path = UriComponentsBuilder.fromPath("/internal/item/subcategory/foodPreferenceComboItemDto").build().toUriString();

		TypeReference<ResponseDto<Map<String, ItemSubCategoryDto>>> returnType = new TypeReference<ResponseDto<Map<String, ItemSubCategoryDto>>>() {
		};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		ResponseDto<Map<String, ItemSubCategoryDto>> responseDto = null;

		try {
			responseDto = restClient.post(path, queryParams, itemDtos, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting ItemSubCategory listing ", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : new HashMap<>();
	}
	

	public Map<String, ItemSubCategoryDto> getSubCategoryMap() {

		String path = UriComponentsBuilder.fromPath("/internal/item/subcategory/subCategoryMap").build().toUriString();

		TypeReference<ResponseDto<Map<String, ItemSubCategoryDto>>> returnType = new TypeReference<ResponseDto<Map<String, ItemSubCategoryDto>>>() {
		};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		ResponseDto<Map<String, ItemSubCategoryDto>> responseDto = null;

		try {
			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting ItemSubCategory listing ", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : new HashMap<>();
	}
	
	
	

	
}

