package com.stanzaliving.core.dish.client.api;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.food.dto.DishRecipeDetailsDto;
import com.stanzaliving.core.food.dto.FoodItemDto;
import com.stanzaliving.core.food.dto.FoodItemRecipeCostDto;
import com.stanzaliving.core.food.dto.FoodItemRecipeCostRequestDto;
import com.stanzaliving.core.food.dto.request.ItemRecipeRequestDto;
import com.stanzaliving.core.food.dto.request.ItemRecipeRequestDtoAndFoodItemDto;
import com.stanzaliving.core.food.dto.response.IngredientPriceDto;
import com.stanzaliving.food.v2.common.dto.ItemRecipeDto;
import com.stanzaliving.food.v2.common.dto.ItemRecipeDtoAndFoodItemDto;
import com.stanzaliving.food.v2.common.dto.ItemRecipeIngredientsDto;
import com.stanzaliving.food.v2.common.dto.ItemRecipeIngredientsRequestDto;
import com.stanzaliving.search.food.index.dto.dishmaster.DishMasterRecipeSearchIndexDto;

import lombok.extern.log4j.Log4j2;

/**
 * @author Manish.Pareek
 *
 * @version 1.0
 *
 * @since 28-Jul-2021
 */

@Log4j2
public class ItemRecipeClientApi {

	private final StanzaRestClient restClient;

	public ItemRecipeClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}
	
	public DishRecipeDetailsDto getRecipeForItem(String itemId) {
		String path = UriComponentsBuilder.fromPath("/internal/recipe/item").build().toUriString();

		TypeReference<ResponseDto<DishRecipeDetailsDto>> returnType = new TypeReference<ResponseDto<DishRecipeDetailsDto>>() {
		};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("itemId", itemId);
		
		ResponseDto<DishRecipeDetailsDto> responseDto = null;

		try {

			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting RecipeForItem", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}

	public List<ItemRecipeDto> getRecipeByItemIdIn(Collection<String> itemIds) {
		String path = UriComponentsBuilder.fromPath("/internal/recipe/findByItemIdIn").build().toUriString();

		TypeReference<ResponseDto<List<ItemRecipeDto>>> returnType = new TypeReference<ResponseDto<List<ItemRecipeDto>>>() {
		};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ResponseDto<List<ItemRecipeDto>> responseDto = null;

		try {

			responseDto = restClient.post(path, queryParams, itemIds, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting RecipeByItemIdIn", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	public List<ItemRecipeIngredientsDto> getItemRecipeIngredientsByItemRecipeIdIn(Collection<String> itemIds) {
		String path = UriComponentsBuilder.fromPath("/internal/recipe/ingredients").build().toUriString();
		
		TypeReference<ResponseDto<List<ItemRecipeIngredientsDto>>> returnType = new TypeReference<ResponseDto<List<ItemRecipeIngredientsDto>>>() {
		};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ResponseDto<List<ItemRecipeIngredientsDto>> responseDto = null;

		try {

			responseDto = restClient.post(path, queryParams, itemIds, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting ItemRecipeIngredients By ItemRecipeIdIn", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}

	
	public DishMasterRecipeSearchIndexDto getRecipeByItemForSearchIndex(String itemId) {
		String path = UriComponentsBuilder.fromPath("/internal/recipe/itemDetails/map").build().toUriString();

		TypeReference<ResponseDto<DishMasterRecipeSearchIndexDto>> returnType = new TypeReference<ResponseDto<DishMasterRecipeSearchIndexDto>>() {
		};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("itemId", itemId);
		
		ResponseDto<DishMasterRecipeSearchIndexDto> responseDto = null;

		try {

			responseDto = restClient.post(path, queryParams, null, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting Recipe By Item ForSearchIndex", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}

	public String addRecipe(ItemRecipeRequestDto recipeRequestDto, FoodItemDto foodItem) {
		String path = UriComponentsBuilder.fromPath("/internal/recipe/addRecipe").build().toUriString();

		TypeReference<ResponseDto<String>> returnType = new TypeReference<ResponseDto<String>>() {
		};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ItemRecipeRequestDtoAndFoodItemDto itemRecipeAndFoodItemRequestDto = ItemRecipeRequestDtoAndFoodItemDto.builder().foodItem(foodItem).recipeRequestDto(recipeRequestDto).build();
		ResponseDto<String> responseDto = null;

		try {

			responseDto = restClient.post(path, queryParams, itemRecipeAndFoodItemRequestDto, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while adding Recipe", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}

	public String saveItemRecipe(ItemRecipeDto itemRecipe, String itemId) {
		String path = UriComponentsBuilder.fromPath("/internal/recipe/saveRecipe").build().toUriString();

		TypeReference<ResponseDto<String>> returnType = new TypeReference<ResponseDto<String>>() {
		};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ItemRecipeDtoAndFoodItemDto itemRecipeDtoAndFoodItemDto = ItemRecipeDtoAndFoodItemDto.builder().itemRecipe(itemRecipe).itemId(itemId).build();
		
		ResponseDto<String> responseDto = null;

		try {

			responseDto = restClient.post(path, queryParams, itemRecipeDtoAndFoodItemDto, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while save ItemRecipe", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}

	
	public void saveItemRecipeIngredients(String itemId, List<ItemRecipeIngredientsDto> itemRecipeIngredients,
			String recipeId) {
		String path = UriComponentsBuilder.fromPath("/internal/recipe/saveRecipe/ingredients").build().toUriString();

		TypeReference<ResponseDto<Void>> returnType = new TypeReference<ResponseDto<Void>>() {
		};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		ItemRecipeIngredientsRequestDto itemRecipeIngredientsRequestDto = ItemRecipeIngredientsRequestDto.builder()
				.itemRecipeIngredients(itemRecipeIngredients).itemId(itemId).recipeId(recipeId).build();

		try {

			restClient.post(path, queryParams, itemRecipeIngredientsRequestDto, null, null, returnType,
					MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting save ItemRecipeIngredients", e);

		}

	}
	
	public void substituteIngredient(String fromIngredientId, String toIngredientId) {
		String path = UriComponentsBuilder.fromPath("/internal/recipe/substituteIngredient").build().toUriString();

		TypeReference<ResponseDto<Void>> returnType = new TypeReference<ResponseDto<Void>>() {
		};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("fromIngredientId", fromIngredientId);
		queryParams.add("toIngredientId", toIngredientId);

		try {

			restClient.post(path, queryParams, null, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while substituteIngredient", e);

		}
		
	}

	public FoodItemRecipeCostDto getRecipeCost(String itemId, LocalDate costDate) {
		String path = UriComponentsBuilder.fromPath("/internal/recipe/cost").build().toUriString();

		TypeReference<ResponseDto<FoodItemRecipeCostDto>> returnType = new TypeReference<ResponseDto<FoodItemRecipeCostDto>>() {
		};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		FoodItemRecipeCostRequestDto recipeCostRequestDto = FoodItemRecipeCostRequestDto.builder().itemId(itemId).costDate(costDate).build();
		
		ResponseDto<FoodItemRecipeCostDto> responseDto = null;

		try {

			responseDto = restClient.post(path, queryParams, recipeCostRequestDto, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting Recipe cost", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}

	
	public FoodItemRecipeCostDto getRecipeCost(String itemId, LocalDate costDate, Map<String, Map<String, List<IngredientPriceDto>>> ingredientVendorPriceMap) {
		String path = UriComponentsBuilder.fromPath("internal/recipe/cost/vendorPriceMap").build().toUriString();

		TypeReference<ResponseDto<FoodItemRecipeCostDto>> returnType = new TypeReference<ResponseDto<FoodItemRecipeCostDto>>() {
		};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		FoodItemRecipeCostRequestDto recipeCostRequestDto = FoodItemRecipeCostRequestDto.builder().itemId(itemId).costDate(costDate).ingredientVendorPriceMap(ingredientVendorPriceMap).build();
		
		ResponseDto<FoodItemRecipeCostDto> responseDto = null;

		try {

			responseDto = restClient.post(path, queryParams, recipeCostRequestDto, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting Recipe cost", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
}

