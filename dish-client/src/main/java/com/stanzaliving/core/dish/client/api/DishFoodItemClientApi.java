package com.stanzaliving.core.dish.client.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.PageResponse;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.dto.KeyValuePairDto;
import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.core.food.dto.DishRecipeDetailsDto;
import com.stanzaliving.core.food.dto.FoodItemDto;
import com.stanzaliving.core.food.dto.ItemCategoryDto;
import com.stanzaliving.core.food.dto.ItemSubCategoryCountDto;
import com.stanzaliving.core.food.dto.ItemSubCategoryDto;
import com.stanzaliving.core.food.dto.RecipePriceCalculatorPDto;
import com.stanzaliving.core.food.dto.request.FoodItemAddRequestDto;
import com.stanzaliving.core.food.dto.request.FoodItemUpdateRequestDto;
import com.stanzaliving.core.food.dto.response.CategoryWiseMealItems;
import com.stanzaliving.core.food.dto.response.FoodItemSearchDataCountDto;
import com.stanzaliving.core.food.dto.response.FoodItemSearchLightResponseDto;
import com.stanzaliving.core.food.dto.response.ItemCategoryCountDto;
import com.stanzaliving.core.food.dto.response.MealItemCategoryCountDto;
import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.food.enums.FoodRegion;
import com.stanzaliving.core.food.enums.FoodServeType;
import com.stanzaliving.core.food.enums.GrammageHeavynessLevel;
import com.stanzaliving.core.food.enums.MenuCategoryType;
import com.stanzaliving.core.food.enums.MenuType;
import com.stanzaliving.core.food.enums.RecipeType;
import com.stanzaliving.core.operations.enums.MealType;

import lombok.extern.log4j.Log4j2;

/**
 * @author Manish.Pareek
 *
 * @version 1.0
 *
 * @since 28-Jul-2021
 */

@Log4j2
public class DishFoodItemClientApi {

	private final StanzaRestClient restClient;

	public DishFoodItemClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public FoodItemDto addFoodItem(FoodItemAddRequestDto itemAddRequestDto) {

		String path = UriComponentsBuilder.fromPath("/internal/item/add").build().toUriString();

		TypeReference<ResponseDto<FoodItemDto>> returnType = new TypeReference<ResponseDto<FoodItemDto>>() {};

		ResponseDto<FoodItemDto> responseDto = null;

		try {
			 responseDto = restClient.post(path, null, itemAddRequestDto, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while adding food item", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}

	public FoodItemDto updateFoodItem(FoodItemUpdateRequestDto itemUpdateRequestDto) {

		String path = UriComponentsBuilder.fromPath("/internal/item/update").build().toUriString();

		TypeReference<ResponseDto<FoodItemDto>> returnType = new TypeReference<ResponseDto<FoodItemDto>>() {};

		ResponseDto<FoodItemDto> responseDto = null;

		try {
			 responseDto = restClient.post(path, null, itemUpdateRequestDto, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while updating food item", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}

	public FoodItemDto getFoodItem(String itemId) {

		String path = UriComponentsBuilder.fromPath("/internal/item/{item}").build().toUriString();

		TypeReference<ResponseDto<FoodItemDto>> returnType = new TypeReference<ResponseDto<FoodItemDto>>() {};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ResponseDto<FoodItemDto> responseDto = null;

		try {
			 responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while adding food item", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	public FoodItemDto getFoodItemfromCache(String itemId) {

		String path = UriComponentsBuilder.fromPath("/internal/item/cache/{item}").build().toUriString();

		TypeReference<ResponseDto<FoodItemDto>> returnType = new TypeReference<ResponseDto<FoodItemDto>>() {};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ResponseDto<FoodItemDto> responseDto = null;

		try {
			 responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while adding food item", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	public List<String> autoSuggest(String name) {

		String path = UriComponentsBuilder.fromPath("/internal/item/search/autosuggest").build().toUriString();

		TypeReference<ResponseDto<List<String>>> returnType = new TypeReference<ResponseDto<List<String>>>() {};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("name", name);

		ResponseDto<List<String>> responseDto = null;

		try {
			 responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while auto suggest", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : new ArrayList<>();
	}
	
	public PageResponse<FoodItemDto> searchFoodItems(int pageNo, int limit, String itemName, String tagName, 
			String category, FoodItemType itemType, MealType mealType, String subCategory, 
			String colour, Boolean dataComplete, RecipeType recipeType, Boolean active, 
			Boolean recipeExists) {
		
		String path = UriComponentsBuilder.fromPath("/internal/item/search/{pageNo}/{limit}").build().toUriString();

		TypeReference<ResponseDto<PageResponse<FoodItemDto>>> returnType = new TypeReference<ResponseDto<PageResponse<FoodItemDto>>>() {};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("itemName", itemName);
		queryParams.add("tagName", tagName);
		queryParams.add("category", category);
		queryParams.add("itemType", itemType.toString());
		queryParams.add("mealType", mealType.toString());
		queryParams.add("subCategory", subCategory);
		queryParams.add("colour", colour);
		queryParams.add("dataComplete", dataComplete.toString());
		queryParams.add("recipeType", recipeType.toString());
		queryParams.add("active", active.toString());
		queryParams.add("recipeExists", recipeExists.toString());
		
		ResponseDto<PageResponse<FoodItemDto>> responseDto = null;

		try {
			 responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while searching food item", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
		
	}


	public PageResponse<FoodItemDto> searchFoodItemByName(int pageNo, int limit, String name, MenuCategoryType categoryType, 
			ResidenceBrand foodBrand, FoodServeType foodServeType, FoodRegion foodRegion, 
			MenuType menuType, MealType mealType, GrammageHeavynessLevel heavynessLevel, String foodItemBasePreference) {
		
		String path = UriComponentsBuilder.fromPath("/internal/item/search/name/{pageNo}/{limit}").build().toUriString();

		TypeReference<ResponseDto<PageResponse<FoodItemDto>>> returnType = new TypeReference<ResponseDto<PageResponse<FoodItemDto>>>() {};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("name", name);
		queryParams.add("categoryType", categoryType.toString());
		queryParams.add("foodBrand", foodBrand.toString());
		queryParams.add("foodServeType", foodServeType.toString());
		queryParams.add("foodRegion", foodRegion.toString());
		queryParams.add("menuType", menuType.toString());
		queryParams.add("mealType", mealType.toString());
		queryParams.add("heavynessLevel", heavynessLevel.toString());
		queryParams.add("foodItemBasePreference", foodItemBasePreference);

		
		ResponseDto<PageResponse<FoodItemDto>> responseDto = null;

		try {
			 responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while searching food item", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
		
	}

	
	public PageResponse<FoodItemSearchLightResponseDto> search(int pageNo, int limit, String name,
			FoodItemType itemType, Boolean dataComplete, List<RecipeType> recipeType) {
		
		String path = UriComponentsBuilder.fromPath("/internal/item/search/light/name/{pageNo}/{limit}").build().toUriString();

		TypeReference<ResponseDto<PageResponse<FoodItemSearchLightResponseDto>>> returnType = new TypeReference<ResponseDto<PageResponse<FoodItemSearchLightResponseDto>>>() {};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("name", name);
		queryParams.add("itemType", itemType.toString());
		queryParams.add("dataComplete", dataComplete.toString());
		
		ResponseDto<PageResponse<FoodItemSearchLightResponseDto>> responseDto = null;

		try {
			 responseDto = restClient.post(path, queryParams, recipeType, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while searching food item", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
		
	}

	public void downloadSampleCsv(HttpServletResponse res) {
		
		String path = UriComponentsBuilder.fromPath("/internal/item/add/items/samplecsv").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		TypeReference<ResponseDto<Void>> returnType = new TypeReference<ResponseDto<Void>>() {};

		try {
			restClient.post(path, queryParams, res, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while copy", e);
		}

	}
	
	public FoodItemSearchDataCountDto getListingDataCount(String category, MealType mealType, String itemName, 
			String subCategory, String colour, Boolean active) {
		
		String path = UriComponentsBuilder.fromPath("/internal/item/listing/datacount").build().toUriString();

		TypeReference<ResponseDto<FoodItemSearchDataCountDto>> returnType = new TypeReference<ResponseDto<FoodItemSearchDataCountDto>>() {};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("category", category);
		queryParams.add("mealType", mealType.toString());
		queryParams.add("itemName", itemName);
		queryParams.add("subCategory", subCategory);
		queryParams.add("colour", colour);
		queryParams.add("active", active.toString());
		
		ResponseDto<FoodItemSearchDataCountDto> responseDto = null;

		try {
			 responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while searching food item", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
		
	}
	
	
	public List<CategoryWiseMealItems> getCategoryWiseItemListingForMeal(MealType mealType) {
		
		String path = UriComponentsBuilder.fromPath("/internal/item/meal/{mealType}").build().toUriString();

		TypeReference<ResponseDto<List<CategoryWiseMealItems>>> returnType = new TypeReference<ResponseDto<List<CategoryWiseMealItems>>>() {};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("mealType", mealType.toString());

		ResponseDto<List<CategoryWiseMealItems>> responseDto = null;

		try {
			 responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting category wise item listing for meal", e);
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
	
	
	public Long tagCountByStatus(Boolean status) {

		String path = UriComponentsBuilder.fromPath("/internal/tag/count").build().toUriString();

		TypeReference<ResponseDto<Long>> returnType = new TypeReference<ResponseDto<Long>>() {
		};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("status", status.toString());

		ResponseDto<Long> responseDto = null;

		try {
			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting item subcategory count", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : 0;

	}

	public void updateDataComplete() {

		String path = UriComponentsBuilder.fromPath("/internal/item/update/datacomplete").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		TypeReference<ResponseDto<Void>> returnType = new TypeReference<ResponseDto<Void>>() {
		};

		try {
			restClient.post(path, queryParams, null, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while update data complete", e);
		}

	}

	public List<KeyValuePairDto> getFeedbackOptionsListing() {

		String path = UriComponentsBuilder.fromPath("/internal/feedback/listing").build().toUriString();

		TypeReference<ResponseDto<List<KeyValuePairDto>>> returnType = new TypeReference<ResponseDto<List<KeyValuePairDto>>>() {
		};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
	
		ResponseDto<List<KeyValuePairDto>> responseDto = null;

		try {
			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting feedback options listing", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;

	}
	
	public void resetCacheItemsUuidsEligibleForMenu() {

		String path = UriComponentsBuilder.fromPath("/internal/item/reset/cache/menu-eligible-uuids").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		TypeReference<ResponseDto<Void>> returnType = new TypeReference<ResponseDto<Void>>() {
		};

		try {
			restClient.post(path, queryParams, null, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while reset cache of menu eligible uuids", e);
		}

	}
	
	
	public DishRecipeDetailsDto calculateRecipePrice(RecipePriceCalculatorPDto calculatorPDto) {

		String path = UriComponentsBuilder.fromPath("/internal/item/recipe/price").build().toUriString();

		TypeReference<ResponseDto<DishRecipeDetailsDto>> returnType = new TypeReference<ResponseDto<DishRecipeDetailsDto>>() {
		};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
	
		ResponseDto<DishRecipeDetailsDto> responseDto = null;

		try {
			responseDto = restClient.post(path, queryParams, calculatorPDto, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while calculating recipe price", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;

	}
	
	
	public void resetAllItemRecipeCost() {

		String path = UriComponentsBuilder.fromPath("/internal/item/cache/reset/recipeCost").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		TypeReference<ResponseDto<Void>> returnType = new TypeReference<ResponseDto<Void>>() {
		};

		try {
			restClient.post(path, queryParams, null, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while reset all item recipe cost", e);
		}

	}
	
	public void resetItemRecipeCost(@RequestBody Collection<String> itemIds) {

		String path = UriComponentsBuilder.fromPath("/internal/item/cache/reset/recipeCost").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		TypeReference<ResponseDto<Void>> returnType = new TypeReference<ResponseDto<Void>>() {
		};

		try {
			restClient.post(path, queryParams, itemIds, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while reset item recipe cost", e);
		}

	}
	
	public void evictFoodItemCache() {

		String path = UriComponentsBuilder.fromPath("/internal/item/cache/evict/itemsDto").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		TypeReference<ResponseDto<Void>> returnType = new TypeReference<ResponseDto<Void>>() {
		};

		try {
			restClient.post(path, queryParams, null, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while evict food item cache", e);
		}

	}

}



