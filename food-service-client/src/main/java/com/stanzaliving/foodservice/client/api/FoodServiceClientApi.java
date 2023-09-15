package com.stanzaliving.foodservice.client.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import com.stanzaliving.core.food.dto.*;
import com.stanzaliving.food.v2.staycuration.StayCurationLiveResidenceDto;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.enums.DateFormat;
import com.stanzaliving.core.base.exception.ApiValidationException;
import com.stanzaliving.core.base.exception.PreconditionFailedException;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.base.utils.DateUtil;
import com.stanzaliving.core.cafe.order.dto.CafeOrderRDto;
import com.stanzaliving.core.food.dto.request.FullCategoryDto;
import com.stanzaliving.core.food.dto.response.FoodMenuCategoryBasicDetailsDto;
import com.stanzaliving.core.food.dto.response.RecentMealDto;
import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.core.opscalculator.dto.OccupiedBedDto;
import com.stanzaliving.core.security.dto.FoodCafeRequestDto;
import com.stanzaliving.core.security.dto.FoodScanRequestDto;
import com.stanzaliving.core.user.dto.response.UserContactDetailsResponseDto;
import com.stanzaliving.food.v2.common.dto.MealDto;
import com.stanzaliving.food.v2.common.dto.MealTypeAndGroupIdDto;
import com.stanzaliving.food.v2.menu.dto.ResidenceFoodMenuItemIdProjectionDto;
import com.stanzaliving.food.v2.menu.dto.ResidenceMenuDto;
import com.stanzaliving.food.v2.vendor.dto.FoodVendorDTO;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class FoodServiceClientApi {

    private StanzaRestClient restClient;

    public FoodServiceClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }


	public ResidenceMealPlanDto getMeal(String residenceUuid){
		String path =
				UriComponentsBuilder.fromPath(
								"/internal/residence/meal/plan/get/" + residenceUuid )
						.build()
						.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		TypeReference<ResponseDto<ResidenceMealPlanDto>> returnType =
				new TypeReference<ResponseDto<ResidenceMealPlanDto>>() {};

		ResponseDto<ResidenceMealPlanDto> responseDto = null;
		try {
			responseDto =
					restClient.request(
							path,
							HttpMethod.GET,
							queryParams,
							residenceUuid,
							headerParams,
							accept,
							returnType,
							MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.info("Error while fetching meal data");
			throw new ApiValidationException(
					"Some error occurred. Please try again after some time.");
		}

		if (!responseDto.isStatus()) {

			throw new PreconditionFailedException(responseDto.getMessage());
		}

		return responseDto.getData();


	}

	public ResidenceDayLevelMealDto getMealTimings(String residenceUuid) {
		String path =
				UriComponentsBuilder.fromPath(
								"/internal/residence/meal/plan/" + residenceUuid + "/next")
						.build()
						.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		List<String> eventDateTimes = new ArrayList<>();
		eventDateTimes.add(
				DateUtil.customDateFormatter(
						LocalDateTime.of(LocalDate.now(), LocalTime.of(00, 00, 00)),
						DateFormat.ELASTIC_SEARCH));
		queryParams.put("eventDateTime", eventDateTimes);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		TypeReference<ResponseDto<ResidenceDayLevelMealDto>> returnType =
				new TypeReference<ResponseDto<ResidenceDayLevelMealDto>>() {};

		ResponseDto<ResidenceDayLevelMealDto> responseDto = null;
		try {
			responseDto =
					restClient.request(
							path,
							HttpMethod.GET,
							queryParams,
							residenceUuid,
							headerParams,
							accept,
							returnType,
							MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.info("Error while fetching meal timing");
			throw new ApiValidationException(
					"Some error occurred. Please try again after some time.");
		}

		if (!responseDto.isStatus()) {

			throw new PreconditionFailedException(responseDto.getMessage());
		}

		return responseDto.getData();
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
            log.error("Error while fetching menu category details for id: {}", id, e);
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

	public ResidenceConfigDto getResidenceConfig(String residenceId) {

		String path = UriComponentsBuilder.fromPath("/internal/v2/common/residence/config").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("residenceId",residenceId);

		TypeReference<ResponseDto<ResidenceConfigDto>> returnType = new TypeReference<ResponseDto<ResidenceConfigDto>>() {};

		ResponseDto<ResidenceConfigDto> responseDto = null;

		try {

			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting residence configuration", e);

		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : null;

	}
	
	public List<FoodVendorDTO> getFoodVendorList(){

		String path = UriComponentsBuilder.fromPath("/internal/v2/vendor/list").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
	
		TypeReference<ResponseDto<List<FoodVendorDTO>>> returnType = new TypeReference<ResponseDto<List<FoodVendorDTO>>>() {};

		ResponseDto<List<FoodVendorDTO>> responseDto = null;

		try {

			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting vendors", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new ArrayList<>();

	}
	
	public List<LastQrScanResponseDto> getLastQrScan(List<String> userIds){

		String path = UriComponentsBuilder.fromPath("/internal/qr/last/scan").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
	
		TypeReference<ResponseDto<List<LastQrScanResponseDto>>> returnType = new TypeReference<ResponseDto<List<LastQrScanResponseDto>>>() {};

		ResponseDto<List<LastQrScanResponseDto>> responseDto = null;

		try {

			responseDto = restClient.post(path, queryParams, userIds, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting lastQrScan", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new ArrayList<>();

	}
	
	public List<QrScanSummaryResponseDto> getQrScanSummary(FoodScanRequestDto foodScanRequestDto){

		String path = UriComponentsBuilder.fromPath("/internal/qr/scan/summary").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		TypeReference<ResponseDto<List<QrScanSummaryResponseDto>>> returnType = new TypeReference<ResponseDto<List<QrScanSummaryResponseDto>>>() {};

		ResponseDto<List<QrScanSummaryResponseDto>> responseDto = null;

		try {

			responseDto = restClient.post(path, queryParams, foodScanRequestDto, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting qrscansummary", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new ArrayList<>();

	}
	
	public List<CafeOrderRDto> getCafeOrderSummary(FoodCafeRequestDto foodCafeRequestDto){

		String path = UriComponentsBuilder.fromPath("/internal/cafe/order/summary").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		TypeReference<ResponseDto<List<CafeOrderRDto>>> returnType = new TypeReference<ResponseDto<List<CafeOrderRDto>>>() {};

		ResponseDto<List<CafeOrderRDto>> responseDto = null;

		try {

			responseDto = restClient.post(path, queryParams, foodCafeRequestDto, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting cafe order summary", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new ArrayList<>();

	}

	public ResponseDto<List<DateFoodMenuDto>> getFoodMenuByTransformationUuid(LocalDate startDate, LocalDate endDate, String transformationUuid){
		try {
			String path = UriComponentsBuilder.fromPath("/internal/residence/food/menu").build().toUriString();
			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
			if (StringUtils.isNotBlank(transformationUuid))
				queryParams.add("residenceId", transformationUuid);
			if (Objects.nonNull(startDate))
				queryParams.add("startDate", String.valueOf(startDate));
			if (Objects.nonNull(endDate))
				queryParams.add("endDate", String.valueOf(endDate));
			final HttpHeaders headerParams = new HttpHeaders();
			final String[] accepts = { "*/*" };
			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
			ParameterizedTypeReference<ResponseDto<List<DateFoodMenuDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<DateFoodMenuDto>>>() {
			};
			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception caught while fetching food menu.", e);
			return null;
		}
	}

	public StayCurationLiveResidenceDto getStayCurationResidences() {
		String path = UriComponentsBuilder.fromPath("/internal/staycuration/live/residences").build().toUriString();
		TypeReference<ResponseDto<StayCurationLiveResidenceDto>> returnType = new TypeReference<ResponseDto<StayCurationLiveResidenceDto>>() {
		};
		ResponseDto<StayCurationLiveResidenceDto> responseDto = null;
		try {
			responseDto = restClient.get(path, null, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while getting residence ids", e);
		}
		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : StayCurationLiveResidenceDto.builder().residenceIds(null).build();
	}

}