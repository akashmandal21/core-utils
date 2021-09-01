package com.stanzaliving.core.dish.client.api;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

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
import com.stanzaliving.core.food.dto.FoodItemMealMappingDto;
import com.stanzaliving.core.food.dto.FoodItemMealMappingRequestDto;
import com.stanzaliving.core.food.dto.FoodItemRecipeCostDto;
import com.stanzaliving.core.food.dto.FoodMenuCategoryDto;
import com.stanzaliving.core.food.dto.MenuItemDto;
import com.stanzaliving.core.food.dto.RecipePriceCalculatorPDto;
import com.stanzaliving.core.food.dto.request.FoodItemAddRequestDto;
import com.stanzaliving.core.food.dto.request.FoodItemGetRequestDto;
import com.stanzaliving.core.food.dto.request.FoodItemSearchLightRequestDto;
import com.stanzaliving.core.food.dto.request.FoodItemUpdateRequestDto;
import com.stanzaliving.core.food.dto.response.CategoryWiseMealItems;
import com.stanzaliving.core.food.dto.response.FoodItemSearchDataCountDto;
import com.stanzaliving.core.food.dto.response.FoodItemSearchLightResponseDto;
import com.stanzaliving.core.food.enums.FoodItemBasePreference;
import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.food.enums.FoodRegion;
import com.stanzaliving.core.food.enums.FoodServeType;
import com.stanzaliving.core.food.enums.GrammageHeavynessLevel;
import com.stanzaliving.core.food.enums.MenuCategoryType;
import com.stanzaliving.core.food.enums.MenuType;
import com.stanzaliving.core.food.enums.RecipeType;
import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.core.user.enums.EnumListing;
import com.stanzaliving.food.v2.common.dto.FoodItemFeedbackSuggestionDto;
import com.stanzaliving.food.v2.common.dto.FoodItemQuantityCombinationDto;
import com.stanzaliving.food.v2.menu.dto.FoodItemQuantityCombinationRequest;
import com.stanzaliving.food.v2.menu.dto.ResidenceMenuDto;

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
	
	public void updateSearchIndex(Integer fromId, Integer toId) {

		String path = UriComponentsBuilder.fromPath("/internal/item/dish/index").build().toUriString();

		TypeReference<ResponseDto<Void>> returnType = new TypeReference<ResponseDto<Void>>() {};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("fromId", fromId.toString());
		queryParams.add("toId", toId.toString());

		try {
			 restClient.post(path, queryParams, null, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while updating food item", e);
		}
	}
	
	public FoodItemDto getFoodItem(String itemId) {

		String path = UriComponentsBuilder.fromPath("/internal/item/{item}").build().toUriString();

		TypeReference<ResponseDto<FoodItemDto>> returnType = new TypeReference<ResponseDto<FoodItemDto>>() {};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ResponseDto<FoodItemDto> responseDto = null;

		try {
			 responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while get food item", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	public List<FoodItemDto> getFoodItemByUuidIn(Collection<String> itemIds) {

		String path = UriComponentsBuilder.fromPath("/internal/item/findByUuidIn").build().toUriString();

		TypeReference<ResponseDto<List<FoodItemDto>>> returnType = new TypeReference<ResponseDto<List<FoodItemDto>>>() {};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ResponseDto<List<FoodItemDto>> responseDto = null;

		try {
			 responseDto = restClient.post(path, queryParams, itemIds, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while get food item", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : new ArrayList<>();
	}
	
	public List<FoodItemDto> getFoodItemByUuidInAndTypeIn(Collection<String> itemIds, Collection<FoodItemType> itemTypes) {

		String path = UriComponentsBuilder.fromPath("/internal/item/findByUuidInAndTypeIn").build().toUriString();

		TypeReference<ResponseDto<List<FoodItemDto>>> returnType = new TypeReference<ResponseDto<List<FoodItemDto>>>() {};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		FoodItemGetRequestDto foodItemGetRequestDto = FoodItemGetRequestDto.builder().itemIds(itemIds).itemTypes(itemTypes).build(); 
	
		ResponseDto<List<FoodItemDto>> responseDto = null;

		try {
			 responseDto = restClient.post(path, queryParams, foodItemGetRequestDto, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while get food item", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : new ArrayList<>();
	}
	
	public Boolean existsByUuidInAndFoodItemType(Collection<String> itemIds, Collection<FoodItemType> itemTypes) {

		String path = UriComponentsBuilder.fromPath("/internal/item/existsByUuidInAndFoodItemType").build().toUriString();

		TypeReference<ResponseDto<Boolean>> returnType = new TypeReference<ResponseDto<Boolean>>() {};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		FoodItemGetRequestDto foodItemGetRequestDto = FoodItemGetRequestDto.builder().itemIds(itemIds).itemTypes(itemTypes).build(); 
	
		ResponseDto<Boolean> responseDto = null;

		try {
			 responseDto = restClient.post(path, queryParams, foodItemGetRequestDto, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while get food item", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : false;
	}
	
	public Set<String> getFoodItemNameByUuidInAndItemTypeIn(Collection<String> itemIds, Collection<FoodItemType> itemTypes) {

		String path = UriComponentsBuilder.fromPath("/internal/item/findNameByUuidInAndTypeIn").build().toUriString();

		TypeReference<ResponseDto<Set<String>>> returnType = new TypeReference<ResponseDto<Set<String>>>() {};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		FoodItemGetRequestDto foodItemGetRequestDto = FoodItemGetRequestDto.builder().itemIds(itemIds).itemTypes(itemTypes).build();
	
		ResponseDto<Set<String>> responseDto = null;

		try {
			 responseDto = restClient.post(path, queryParams, foodItemGetRequestDto, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while get food item", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : new HashSet<>();
	}
	
	public Set<String> findItemsUuidsEligibleForMenu() {

		String path = UriComponentsBuilder.fromPath("/internal/item/eligibleForMenu").build().toUriString();

		TypeReference<ResponseDto<Set<String>>> returnType = new TypeReference<ResponseDto<Set<String>>>() {};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
	
		ResponseDto<Set<String>> responseDto = null;

		try {
			 responseDto = restClient.post(path, queryParams, null, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while get eligible food item for menu", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : new HashSet<>();
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
	
	public Long countByUuidInAndItemTypeIn(Set<String> itemIds, Set<FoodItemType> userFoodPreferences) {

		String path = UriComponentsBuilder.fromPath("/internal/item/countByUuidInAndItemTypeIn").build().toUriString();

		TypeReference<ResponseDto<Long>> returnType = new TypeReference<ResponseDto<Long>>() {};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ResponseDto<Long> responseDto = null;

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

	public Collection<MenuItemDto> getItemListingForMealType(MealType mealType) {

		String path = UriComponentsBuilder.fromPath("/internal/item/meal/{mealType}").build().toUriString();

		TypeReference<ResponseDto<Collection<MenuItemDto>>> returnType = new TypeReference<ResponseDto<Collection<MenuItemDto>>>() {};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		ResponseDto<Collection<MenuItemDto>> responseDto = null;

		try {
			 responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while auto suggest", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : new ArrayList<>();
	}
		
	public Map<String, FoodItemRecipeCostDto> getFoodItemCost(Collection<String> itemIds) {

		String path = UriComponentsBuilder.fromPath("/internal/item/cost").build().toUriString();

		TypeReference<ResponseDto<Map<String, FoodItemRecipeCostDto>>> returnType = new TypeReference<ResponseDto<Map<String, FoodItemRecipeCostDto>>>() {};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		ResponseDto<Map<String, FoodItemRecipeCostDto>> responseDto = null;

		try {
			 responseDto = restClient.post(path, queryParams, itemIds, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while get food item Cost", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : new HashMap<>();
	}
	
	public Map<String, FoodItemRecipeCostDto> getFoodItemCost(Collection<String> itemIds, LocalDate priceAt) {

		String path = UriComponentsBuilder.fromPath("/internal/item/cost/priceAt").build().toUriString();

		TypeReference<ResponseDto<Map<String, FoodItemRecipeCostDto>>> returnType = new TypeReference<ResponseDto<Map<String, FoodItemRecipeCostDto>>>() {};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		FoodItemGetRequestDto foodItemGetRequestDto = FoodItemGetRequestDto.builder().itemIds(itemIds).priceAt(priceAt).build();

		ResponseDto<Map<String, FoodItemRecipeCostDto>> responseDto = null;

		try {
			 responseDto = restClient.post(path, queryParams, foodItemGetRequestDto, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while get food item Cost", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : new HashMap<>();
	}
	
	
	public Boolean storeItemKitchenWisePrice() {

		String path = UriComponentsBuilder.fromPath("/internal/item/store/cost").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		TypeReference<ResponseDto<Boolean>> returnType = new TypeReference<ResponseDto<Boolean>>() {
		};

		ResponseDto<Boolean> responseDto = null;
		
		try {
			responseDto = restClient.post(path, queryParams, null, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while copy", e);
		}
		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	

	
	public PageResponse<FoodItemSearchLightResponseDto> search(int pageNo, int limit, String name,
			FoodItemType itemType, Boolean dataComplete, Collection<RecipeType> recipeType) {
		
		String path = UriComponentsBuilder.fromPath("/internal/item/search/light/name/{pageNo}/{limit}").build().toUriString();

		TypeReference<ResponseDto<PageResponse<FoodItemSearchLightResponseDto>>> returnType = new TypeReference<ResponseDto<PageResponse<FoodItemSearchLightResponseDto>>>() {};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		FoodItemSearchLightRequestDto lightRequestDto = FoodItemSearchLightRequestDto.builder().name(name).itemType(itemType).dataComplete(dataComplete).recipeType(recipeType).build();
		
		ResponseDto<PageResponse<FoodItemSearchLightResponseDto>> responseDto = null;

		try {
			 responseDto = restClient.post(path, queryParams, lightRequestDto, null, null, returnType, MediaType.APPLICATION_JSON);
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
	
	public List<FoodItemFeedbackSuggestionDto> findByItemIn(Collection<String> itemIds) {

		String path = UriComponentsBuilder.fromPath("/internal/feedback/findByUuidIn").build().toUriString();

		TypeReference<ResponseDto<List<FoodItemFeedbackSuggestionDto>>> returnType = new TypeReference<ResponseDto<List<FoodItemFeedbackSuggestionDto>>>() {};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ResponseDto<List<FoodItemFeedbackSuggestionDto>> responseDto = null;

		try {
			 responseDto = restClient.post(path, queryParams, itemIds, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while get food item", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : new ArrayList<>();
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
	
	
	public List<FoodItemQuantityCombinationDto> getItemsQuantitiesForCombination(MenuCategoryType menuCategoryType,
			ResidenceBrand residenceBrand, FoodRegion foodRegion, FoodServeType foodServeType, MealType mealType,
			FoodItemBasePreference preference, GrammageHeavynessLevel grammageHeavynessLevel,
			Collection<String> itemIds) {

		String path = UriComponentsBuilder.fromPath("/internal/item/quantity/list").build().toUriString();

		TypeReference<ResponseDto<List<FoodItemQuantityCombinationDto>>> returnType = new TypeReference<ResponseDto<List<FoodItemQuantityCombinationDto>>>() {
		};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		FoodItemQuantityCombinationRequest requestBody = FoodItemQuantityCombinationRequest.builder()
				.items(itemIds)
				.menuCategoryType(menuCategoryType)
				.residenceBrand(residenceBrand)
				.foodRegion(foodRegion)
				.foodServeType(foodServeType)
				.mealType(mealType)
				.foodItemBasePreference(preference)
				.grammageHeavynessLevel(grammageHeavynessLevel)
				.build();
		
		ResponseDto<List<FoodItemQuantityCombinationDto>> responseDto = null;

		try {
			responseDto = restClient.post(path, queryParams, requestBody, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while calculating recipe price", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;

	}
	
	public List<FoodItemQuantityCombinationDto> getItemQuantityCombinationForItemsAndMenu(Collection<String> items,
			ResidenceMenuDto menu, FoodMenuCategoryDto menuCategory) {

		String path = UriComponentsBuilder.fromPath("/internal/item/quantity/combination").build().toUriString();

		TypeReference<ResponseDto<List<FoodItemQuantityCombinationDto>>> returnType = new TypeReference<ResponseDto<List<FoodItemQuantityCombinationDto>>>() {
		};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		FoodItemQuantityCombinationRequest requestBody = FoodItemQuantityCombinationRequest.builder().items(items)
				.menu(menu).menuCategory(menuCategory).build();

		ResponseDto<List<FoodItemQuantityCombinationDto>> responseDto = null;

		try {
			responseDto = restClient.post(path, queryParams, requestBody, null, null, returnType,
					MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting ItemQuantityCombinationForItemsAndMenu", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;

	}
	
	public List<FoodItemMealMappingDto> getItemsForMeal(MealType mealType) {

		String path = UriComponentsBuilder.fromPath("/internal/item/meal/getItems").build().toUriString();

		TypeReference<ResponseDto<List<FoodItemMealMappingDto>>> returnType = new TypeReference<ResponseDto<List<FoodItemMealMappingDto>>>() {};

		ResponseDto<List<FoodItemMealMappingDto>> responseDto = null;

		try {
			 responseDto = restClient.post(path, null, mealType, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while get items for meal", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}

	public List<EnumListing<MealType>> addMealMappings(String itemId, Collection<MealType> meals) {

		String path = UriComponentsBuilder.fromPath("/internal/item/meal/mapping/add").build().toUriString();

		TypeReference<ResponseDto<List<EnumListing<MealType>>>> returnType = new TypeReference<ResponseDto<List<EnumListing<MealType>>>>() {};

		FoodItemMealMappingRequestDto mappingRequestDto = FoodItemMealMappingRequestDto.builder().itemId(itemId).meals(meals).build();
		
		ResponseDto<List<EnumListing<MealType>>> responseDto = null;

		try {
			 responseDto = restClient.post(path, null, mappingRequestDto, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while adding MealMappings", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	

}



