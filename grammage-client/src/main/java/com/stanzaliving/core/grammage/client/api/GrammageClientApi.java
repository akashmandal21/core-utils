package com.stanzaliving.core.grammage.client.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.food.enums.FoodServeType;
import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.food.v2.grammage.category.response.CategoryGrammageBaseResponseDto;
import com.stanzaliving.food.v2.grammage.request.CalculateGrammageDayMapRequestDto;
import com.stanzaliving.food.v2.grammage.request.CalculateGrammageItemRequestDto;
import com.stanzaliving.food.v2.grammage.request.CalculateGrammageMapRequestDto;
import com.stanzaliving.food.v2.grammage.request.CalculateGrammageOptionRequestDto;
import com.stanzaliving.food.v2.grammage.request.CalculateGrammageThaliRequestDto;
import com.stanzaliving.food.v2.grammage.request.ThaliGrammageCalculatorRequestDto;
import com.stanzaliving.food.v2.grammage.response.MenuItemGrammage;
import com.stanzaliving.food.v2.grammage.response.MenuOptionGrammage;
import com.stanzaliving.food.v2.menu.dto.ResidenceMenuDto;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * @author Manish.Pareek
 *
 * @version 1.0
 *
 * @since 20-Jul-2021
 */

@Log4j2
public class GrammageClientApi {

	private final StanzaRestClient restClient;

	public GrammageClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public void copyMenuCategory(String fromVersionId, String toVersionId){

		String path = UriComponentsBuilder.fromPath("/internal/category/grammage/copy/version").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("fromVersionId", fromVersionId);
		queryParams.add("toVersionId", toVersionId);

		TypeReference<ResponseDto<Void>> returnType = new TypeReference<ResponseDto<Void>>() {};

		try {
			restClient.post(path, queryParams, null, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while copy", e);
		}

	}

	public Boolean isGrammageDefined(String versionId) {

		String path = UriComponentsBuilder.fromPath("/internal/category/grammage/exists").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("menuCategoryVersionId", versionId);

		TypeReference<ResponseDto<Boolean>> returnType = new TypeReference<ResponseDto<Boolean>>() {};

		ResponseDto<Boolean> responseDto = null;

		try {
			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while checking isGrammageDefined", e);
		}

		return Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData()) ? responseDto.getData() : null;
	}

	public Map<String, Map<LocalDate, Map<String, MenuOptionGrammage>>> calculateGrammage(
			String versionId, FoodServeType foodServeType,
			Map<String, Map<LocalDate, Map<String, Collection<String>>>> optionWiseItemMap) {

		String path = UriComponentsBuilder.fromPath("/internal/category/grammage/calculate").build().toUriString();

		CalculateGrammageMapRequestDto requestDto = CalculateGrammageMapRequestDto.builder()
				.menuCategoryVersionId(versionId)
				.foodServeType(foodServeType)
				.mealThaliItemMap(optionWiseItemMap)
				.build();

		TypeReference<ResponseDto<Map<String, Map<LocalDate, Map<String, MenuOptionGrammage>>>>> returnType =
				new TypeReference<ResponseDto<Map<String, Map<LocalDate, Map<String, MenuOptionGrammage>>>>>() {};

		ResponseDto<Map<String, Map<LocalDate, Map<String, MenuOptionGrammage>>>> responseDto = null;

		try {
			 responseDto = restClient.post(path, null, requestDto, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while calculateGrammage ", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && MapUtils.isNotEmpty(responseDto.getData())) ? responseDto.getData() : new HashMap<>();
	}

	public Map<String, Map<DayOfWeek, Map<String, MenuOptionGrammage>>> getGrammagesForMenu(
			String menuCategoryVersionId, FoodServeType foodServeType,
			Map<String, Map<DayOfWeek, Map<String, Collection<String>>>> mealThaliItemMap) {

		String path = UriComponentsBuilder.fromPath("/internal/category/grammage/calculate/menu").build().toUriString();

		CalculateGrammageDayMapRequestDto requestDto = CalculateGrammageDayMapRequestDto.builder()
				.menuCategoryVersionId(menuCategoryVersionId)
				.foodServeType(foodServeType)
				.mealThaliItemMap(mealThaliItemMap)
				.build();

		TypeReference<ResponseDto<Map<String, Map<DayOfWeek, Map<String, MenuOptionGrammage>>>>> returnType =
				new TypeReference<ResponseDto<Map<String, Map<DayOfWeek, Map<String, MenuOptionGrammage>>>>>() {};

		ResponseDto<Map<String, Map<DayOfWeek, Map<String, MenuOptionGrammage>>>> responseDto = null;

		try {
			 responseDto = restClient.post(path, null, requestDto, null, null, returnType, MediaType.APPLICATION_JSON);
		}catch (Exception e) {
			log.error("Error while calculateGrammage ", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && MapUtils.isNotEmpty(responseDto.getData())) ? responseDto.getData() : new HashMap<>();
	}

	public Map<String, MenuItemGrammage> calculateGrammageForResidenceMenu(
			String menuCategoryVersionId, FoodServeType foodServeType, Set<String> itemIds, ResidenceMenuDto menuDto) {

		String path = UriComponentsBuilder.fromPath("/internal/category/grammage/calculate/residence/menu").build().toUriString();

		CalculateGrammageItemRequestDto requestDto = CalculateGrammageItemRequestDto.builder()
				.menuCategoryVersionId(menuCategoryVersionId)
				.foodServeType(foodServeType)
				.itemIds(itemIds)
				.menu(menuDto)
				.build();

		TypeReference<ResponseDto<Map<String, MenuItemGrammage>>> returnType = new TypeReference<ResponseDto<Map<String, MenuItemGrammage>>>() {};

		ResponseDto<Map<String, MenuItemGrammage>> responseDto = null;

		try {
			responseDto = restClient.post(path, null, requestDto, null, null, returnType, MediaType.APPLICATION_JSON);
		}catch (Exception e) {
			log.error("Error while calculateGrammage ", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && MapUtils.isNotEmpty(responseDto.getData())) ? responseDto.getData() : new HashMap<>();
	}

	public List<CategoryGrammageBaseResponseDto> getGrammageVariationDetails(String menuCategoryVersionId) {

		String path = UriComponentsBuilder.fromPath("/internal/category/grammage/variation").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("menuCategoryVersionId", menuCategoryVersionId);

		TypeReference<ResponseDto<List<CategoryGrammageBaseResponseDto>>> returnType =
				new TypeReference<ResponseDto<List<CategoryGrammageBaseResponseDto>>>() {};

		ResponseDto<List<CategoryGrammageBaseResponseDto>> responseDto = null;

		try {
			 responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		}catch (Exception e) {
			log.error("Error while calculateGrammage ", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && CollectionUtils.isNotEmpty(responseDto.getData())) ? responseDto.getData() : new ArrayList<>();
	}

	public void deleteGrammages(String menuCategoryVersionId) {
		String path = UriComponentsBuilder.fromPath("/internal/category/grammage/delete").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("menuCategoryVersionId", menuCategoryVersionId);

		TypeReference<ResponseDto<Void>> returnType = new TypeReference<ResponseDto<Void>>() {};

		try {
			restClient.delete(path, queryParams, null, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while deleting grammages", e);
		}
	}

	public void copyGrammageFromBase(String versionId) {

		String path = UriComponentsBuilder.fromPath("/internal/category/grammage/copy/grammageMaster").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.add("menuCategoryVersionId", versionId);

		TypeReference<ResponseDto<Void>> returnType = new TypeReference<ResponseDto<Void>>() {};

		try {
			restClient.post(path, queryParams, null, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while copy", e);
		}

	}

	public Map<MealType, Collection<String>> getThalis(String versionId) {

		String path = UriComponentsBuilder.fromPath("/internal/category/grammage/thalis").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.add("menuCategoryVersionId", versionId);

		TypeReference<ResponseDto<Map<MealType, Collection<String>>>> returnType =
				new TypeReference<ResponseDto<Map<MealType, Collection<String>>>>() {};

		ResponseDto<Map<MealType, Collection<String>>> responseDto = null;

		try {
			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		}catch (Exception e) {
			log.error("Error while getting thalis", e);
		}

		return Objects.nonNull(responseDto) && responseDto.isStatus() && MapUtils.isNotEmpty(responseDto.getData()) ? responseDto.getData() : new HashMap<>();

	}

	public MenuOptionGrammage calculateGrammage(String versionId, String thaliId, String mealId, FoodServeType foodServeType, Set<String> itemIds) {

		String path = UriComponentsBuilder.fromPath("/internal/category/grammage/calculate/option").build().toUriString();

		CalculateGrammageOptionRequestDto requestDto = CalculateGrammageOptionRequestDto.builder()
				.menuCategoryVersionId(versionId)
				.foodServeType(foodServeType)
				.itemIds(itemIds)
				.thaliId(thaliId)
				.mealId(mealId)
				.build();

		TypeReference<ResponseDto<MenuOptionGrammage>> returnType = new TypeReference<ResponseDto<MenuOptionGrammage>>() {};

		ResponseDto<MenuOptionGrammage> responseDto = null;

		try {
			responseDto = restClient.post(path, null, requestDto, null, null, returnType, MediaType.APPLICATION_JSON);
		}catch (Exception e) {
			log.error("Error while calculateGrammage ", e);
		}
		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : null;
	}

	public Map<String, Map<DayOfWeek, Map<String, MenuOptionGrammage>>> calculateGrammage(String versionId,
			Map<String, Map<DayOfWeek, Map<String, ThaliGrammageCalculatorRequestDto>>> optionWiseItemMap) {

		String path = UriComponentsBuilder.fromPath("/internal/category/grammage/calculate/menu/new").build().toUriString();

		CalculateGrammageThaliRequestDto requestDto =
				CalculateGrammageThaliRequestDto.builder()
				.menuCategoryVersionId(versionId)
				.itemsMap(optionWiseItemMap)
				.build();

		TypeReference<ResponseDto<Map<String, Map<DayOfWeek, Map<String, MenuOptionGrammage>>>>> returnType =
				new TypeReference<ResponseDto<Map<String, Map<DayOfWeek, Map<String, MenuOptionGrammage>>>>>() {};

		ResponseDto<Map<String, Map<DayOfWeek, Map<String, MenuOptionGrammage>>>> responseDto = null;

		try {
			responseDto = restClient.post(path, null, requestDto, null, null, returnType, MediaType.APPLICATION_JSON);
		}catch (Exception e) {
			log.error("Error while calculateGrammage ", e);
		}
		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new HashMap<>();
	}
}

