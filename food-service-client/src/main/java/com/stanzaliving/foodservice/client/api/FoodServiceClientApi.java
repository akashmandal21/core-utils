package com.stanzaliving.foodservice.client.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.food.dto.FoodItemDto;
import com.stanzaliving.core.food.dto.IngredientUsageDto;
import com.stanzaliving.core.food.dto.ItemCategoryDto;
import com.stanzaliving.core.food.dto.ItemSubCategoryDto;
import com.stanzaliving.core.food.dto.request.FullCategoryDto;
import com.stanzaliving.core.food.dto.response.FoodMenuCategoryBasicDetailsDto;
import com.stanzaliving.core.food.dto.response.RecentMealDto;
import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.core.opscalculator.dto.OccupiedBedDto;
import com.stanzaliving.core.user.dto.response.UserContactDetailsResponseDto;
import com.stanzaliving.food.v2.common.dto.MealDto;
import com.stanzaliving.food.v2.common.dto.MealTypeAndGroupIdDto;
import com.stanzaliving.food.v2.menu.dto.ResidenceFoodMenuItemIdProjectionDto;
import com.stanzaliving.food.v2.menu.dto.ResidenceMenuDto;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@Log4j2
public class FoodServiceClientApi {

    private StanzaRestClient restClient;

    public FoodServiceClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public FoodMenuCategoryBasicDetailsDto getMenuCategory(String id) {

        ResponseDto<FoodMenuCategoryBasicDetailsDto> responseDto = null;
        String path = UriComponentsBuilder.fromPath("/internal/menu/category/getById/{id}").buildAndExpand(id).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<FoodMenuCategoryBasicDetailsDto>> returnType = new ParameterizedTypeReference<ResponseDto<FoodMenuCategoryBasicDetailsDto>>() {
        };

        try {
            responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Error while fetching basic details for menu category: {}", id, e);
        }

        return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : null;

    }

    public FoodMenuCategoryBasicDetailsDto getMenuCategoryByCityIdAndName(String cityId, String name) {
        ResponseDto<FoodMenuCategoryBasicDetailsDto> responseDto = null;
        String path = UriComponentsBuilder.fromPath("/internal/menu/category/getByCityIdAndName").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.put("cityId", Arrays.asList(cityId));
        queryParams.put("name", Arrays.asList(name));

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<FoodMenuCategoryBasicDetailsDto>> returnType = new ParameterizedTypeReference<ResponseDto<FoodMenuCategoryBasicDetailsDto>>() {
        };

        try {
            responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Error while seaching menu categories for city: {} with name: {}", cityId, name, e);
        }

        return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : null;

    }

    public List<ListingDto> getFoodItemTags() {
        ResponseDto<List<ListingDto>> responseDto = null;
        String path = UriComponentsBuilder.fromPath("/internal/tag/get/listing").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<ListingDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ListingDto>>>() {
        };

        try {
            responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Error while fetching list of tags: ", e);
        }

        return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : null;

    }

    public FullCategoryDto getFullCategoryById(String id) {
        ResponseDto<FullCategoryDto> responseDto = null;
        String path = UriComponentsBuilder.fromPath("/internal/menu/category/getFullCategoryById").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.put("categoryId", Arrays.asList(id));

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<FullCategoryDto>> returnType = new ParameterizedTypeReference<ResponseDto<FullCategoryDto>>() {
        };

        try {
            responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Error while fetching menu category details for id: {}", id);
        }

        return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : null;

    }

    public FullCategoryDto getFullCategoryByName(String name) {
        ResponseDto<FullCategoryDto> responseDto = null;
        String path = UriComponentsBuilder.fromPath("/internal/menu/category/getFullCategoryByName").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.put("categoryName", Arrays.asList(name));

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<FullCategoryDto>> returnType = new ParameterizedTypeReference<ResponseDto<FullCategoryDto>>() {
        };

        try {
            responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Error while fetching menu category details by name: {}", name, e);
        }

        return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : null;

    }

    public Map<String, Integer> getMenuCategoryResidenceCountMap() {
        ResponseDto<Map<String, Integer>> responseDto = null;
        String path = UriComponentsBuilder.fromPath("/internal/menu/category/getResidenceCountMap").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Map<String, Integer>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, Integer>>>() {
        };

        try {
            responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Error while getMenuCategoryResidenceCountMap", e);
        }

        return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new HashMap<>();

    }


    public void initiateWeeklyMenuVendorApproval(String menuGroupId, List<UserContactDetailsResponseDto> mailCc) {
        String path = UriComponentsBuilder.fromPath("/internal/menu/approval/initiate/vendor-approval").build().toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("menuGroupId", menuGroupId);
        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
        };

        try {
            restClient.invokeAPI(path, HttpMethod.POST, queryParams, mailCc, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Error while initiating vendor approval for {}",menuGroupId, e);
        }
    }

    public Boolean isIngredientUsed(String ingredientId) {
        String path = UriComponentsBuilder.fromPath("/internal/ingredients/{ingredientId}/used").buildAndExpand(ingredientId).toUriString();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<IngredientUsageDto>> returnType = new ParameterizedTypeReference<ResponseDto<IngredientUsageDto>>() {
        };

        try {
            ResponseDto<IngredientUsageDto> responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
            return Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData()) && responseDto.getData().isUsed();
        }catch (Exception e) {
            log.error("Error while initiating request for ingredient used for ingredient {}",ingredientId, e);
            return null;
        }
    }

    public List<OccupiedBedDto> getOccupiedBedDetails(String residenceUuid, LocalDate fromDate, LocalDate toDate) {
        Object postBody = null;

        List<OccupiedBedDto> occupiedBedDtoList = new ArrayList<>();
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/food/attendance/getOccupiedRoomDetails").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("residenceId", residenceUuid);
        queryParams.add("startDate", fromDate.toString());
        queryParams.add("endDate", toDate.toString());

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<OccupiedBedDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<OccupiedBedDto>>>() {
        };

        try {
            occupiedBedDtoList = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType).getData();
        } catch (Exception e) {
            log.error("Exception while fetching dead bed details for residence {} ", residenceUuid);
        }

        return occupiedBedDtoList;
    }

    public RecentMealDto getRecentMealWithNoFeedback(String userId) {

        ResponseDto<RecentMealDto> responseDto = null;
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/resident/food/feedback/getRecentMealWithNoFeedback")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("userId",userId);

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<RecentMealDto>> returnType = new ParameterizedTypeReference<ResponseDto<RecentMealDto>>() {
        };

        try {
            responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Error while fetching recent meal for user with id: {}", userId, e);
        }

        return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : null;

    }

	public Map<String, Integer> getMealGroupSequenceMap() {

		String path = UriComponentsBuilder.fromPath("/internal/v2/common/meal/master/mealGroupSequenceMap").build().toUriString();

		TypeReference<ResponseDto<Map<String, Integer>>> returnType = new TypeReference<ResponseDto<Map<String, Integer>>>() {};

		ResponseDto<Map<String, Integer>> responseDto = null;

		try {

			responseDto = restClient.get(path, null, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting meal group sequence map", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new HashMap<>();

	}
	
	public Map<String, String> getMealGroupNameIdMap() {

		String path = UriComponentsBuilder.fromPath("/internal/v2/common/meal/master/nameIdMap").build().toUriString();

		TypeReference<ResponseDto<Map<String, String>>> returnType =
				new TypeReference<ResponseDto<Map<String, String>>>() {};

		ResponseDto<Map<String, String>> responseDto = null;

		try {

			responseDto = restClient.get(path, null, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting meal master name map", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new HashMap<>();

	}
	
	public Map<MealTypeAndGroupIdDto, MealDto> getMealMap() {

		String path = UriComponentsBuilder.fromPath("/internal/v2/common/meal/master/mealMap").build().toUriString();

		TypeReference<ResponseDto<Map<MealTypeAndGroupIdDto, MealDto>>> returnType =
				new TypeReference<ResponseDto<Map<MealTypeAndGroupIdDto, MealDto>>>() {};

		ResponseDto<Map<MealTypeAndGroupIdDto, MealDto>> responseDto = null;

		try {

			responseDto = restClient.get(path, null, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting meal type and meal group name map", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new HashMap<>();
	}
	
	public Map<String, String> getMealNameMap() {

		String path = UriComponentsBuilder.fromPath("/internal/v2/common/meal/master/mealNameMap").build().toUriString();

		TypeReference<ResponseDto<Map<String, String>>> returnType =
				new TypeReference<ResponseDto<Map<String, String>>>() {};

		ResponseDto<Map<String, String>> responseDto = null;

		try {

			responseDto = restClient.get(path, null, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting meal master name map", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new HashMap<>();

	}
	
	public Map<String, String> getMealGroupNameMap() {

		String path = UriComponentsBuilder.fromPath("/internal/v2/common/meal/master/mealGroupNameMap").build().toUriString();

		TypeReference<ResponseDto<Map<String, String>>> returnType = new TypeReference<ResponseDto<Map<String, String>>>() {};

		ResponseDto<Map<String, String>> responseDto = null;

		try {

			responseDto = restClient.get(path, null, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting mealGroupNameMap", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new HashMap<>();

	}
	
	public Map<String, MealDto> getMealMasterMap() {

    	String path = UriComponentsBuilder.fromPath("/internal/v2/common/meal/master/mealMasterMap").build().toUriString();

		TypeReference<ResponseDto<Map<String, MealDto>>> returnType =
				new TypeReference<ResponseDto<Map<String, MealDto>>>() {};

		ResponseDto<Map<String, MealDto>> responseDto = null;

		try {

			responseDto = restClient.get(path, null, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting mealMasterMap", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new HashMap<>();

	}

	public Set<Map<MealType, String>> getMeals() {

		String path = UriComponentsBuilder.fromPath("/internal/v2/common/meal/master/getMeals").build().toUriString();

		TypeReference<ResponseDto<Set<Map<MealType, String>>>> returnType = new TypeReference<ResponseDto<Set<Map<MealType, String>>>>() {};

		ResponseDto<Set<Map<MealType, String>>> responseDto = null;

		try {

			responseDto = restClient.get(path, null, null, null, returnType, MediaType.APPLICATION_JSON);
			log.info("responseDto Data {}", responseDto.getData());

		} catch (Exception e) {

			log.error("Error while getting meals set", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new HashSet<>();

	}
	
	public List<MealDto> getAllMeals() {

		String path = UriComponentsBuilder.fromPath("/internal/v2/common/meal/master/getAllMeals").build().toUriString();

		TypeReference<ResponseDto<List<MealDto>>> returnType = new TypeReference<ResponseDto<List<MealDto>>>() {};

		ResponseDto<List<MealDto>> responseDto = null;

		try {

			responseDto = restClient.get(path, null, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting all meals", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: new ArrayList<>();
	}

	public List<ItemSubCategoryDto> getItemSubCategories() {

		String path = UriComponentsBuilder.fromPath("/internal/v2/common/item/subcategory/listing").build().toUriString();

		TypeReference<ResponseDto<List<ItemSubCategoryDto>>> returnType = new TypeReference<ResponseDto<List<ItemSubCategoryDto>>>() {};

		ResponseDto<List<ItemSubCategoryDto>> responseDto = null;

		try {

			responseDto = restClient.get(path, null, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting sub category listing", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new ArrayList<>();

	}
	
	
	public Map<String, ItemSubCategoryDto> getItemSubCategoriesMap() {

		String path = UriComponentsBuilder.fromPath("/internal/v2/common/item/subcategory/map").build().toUriString();

		TypeReference<ResponseDto<Map<String, ItemSubCategoryDto>>> returnType = new TypeReference<ResponseDto<Map<String, ItemSubCategoryDto>>>() {};

		ResponseDto<Map<String, ItemSubCategoryDto>> responseDto = null;

		try {

			responseDto = restClient.get(path, null, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting dish subcategory map ", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new HashMap<>();

	}
	
	public Set<String> getItemSubCategoryIds(String categoryId) {

		String path = UriComponentsBuilder.fromPath("/internal/v2/common/item/subcategory/set").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("categoryId",categoryId);

		TypeReference<ResponseDto<Set<String>>> returnType = new TypeReference<ResponseDto<Set<String>>>() {};

		ResponseDto<Set<String>> responseDto = null;

		try {

			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getItemSubCategoryIds", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new HashSet<>();

	}
	
	public Map<String, ItemCategoryDto> getItemCategoriesMap() {

		String path = UriComponentsBuilder.fromPath("/internal/v2/common/item/category/map").build().toUriString();

		TypeReference<ResponseDto<Map<String, ItemCategoryDto>>> returnType = new TypeReference<ResponseDto<Map<String, ItemCategoryDto>>>() {};

		ResponseDto<Map<String, ItemCategoryDto>> responseDto = null;

		try {

			responseDto = restClient.get(path, null, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting item subcategory map", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: new HashMap<>();

	}

	public List<ResidenceMenuDto> findByResidenceIdAndMenuDateBetween(String residenceId, LocalDate startDate, LocalDate endDate){

		String path = UriComponentsBuilder.fromPath("/internal/residence/food/menu/dateBetween").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("residenceId",residenceId);
		queryParams.add("startDate",startDate.toString());
		queryParams.add("endDate",endDate.toString());

		TypeReference<ResponseDto<List<ResidenceMenuDto>>> returnType = new TypeReference<ResponseDto<List<ResidenceMenuDto>>>() {};

		ResponseDto<List<ResidenceMenuDto>> responseDto = null;

		try {

			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting menu dtos", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new ArrayList<>();

	}
	
	
	public List<ResidenceFoodMenuItemIdProjectionDto> getFoodMenusItemProjection(Collection<String> residenceMenuIds){

    	String path = UriComponentsBuilder.fromPath("/internal/residence/food/menu/item/foodMenusItemProjection").build().toUriString();

		TypeReference<ResponseDto<List<ResidenceFoodMenuItemIdProjectionDto>>> returnType = new TypeReference<ResponseDto<List<ResidenceFoodMenuItemIdProjectionDto>>>() {};

		ResponseDto<List<ResidenceFoodMenuItemIdProjectionDto>> responseDto = null;

		try {

			responseDto = restClient.post(path, null, residenceMenuIds, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting food Menus Items Projection", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new ArrayList<>();
	}
	
	public Map<String, FoodItemDto> getFoodItemMap() {

		String path = UriComponentsBuilder.fromPath("/internal/v2/common/item/foodItemMap").build().toUriString();

		TypeReference<ResponseDto<Map<String, FoodItemDto>>> returnType = new TypeReference<ResponseDto<Map<String, FoodItemDto>>>() {};

		ResponseDto<Map<String, FoodItemDto>> responseDto = null;

		try {

			responseDto = restClient.get(path, null, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting foodItemMap", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && MapUtils.isNotEmpty(responseDto.getData())) ? responseDto.getData() : new HashMap<>();

	}
	
	public String getResidenceName(String residenceId) {

		String path = UriComponentsBuilder.fromPath("/internal/v2/common/residence/name").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("residenceId",residenceId);

		TypeReference<ResponseDto<String>> returnType = new TypeReference<ResponseDto<String>>() {};

		ResponseDto<String> responseDto = null;

		try {

			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting residence name", e);

		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : StringUtils.EMPTY;

	}
	
	
}