package com.stanzaliving.foodservice.client.api;

import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
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
import com.stanzaliving.food.v2.menu.dto.ResidenceFoodMenuItemIdProjectionDto;
import com.stanzaliving.food.v2.menu.dto.ResidenceMenuDto;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;
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
		String path = UriComponentsBuilder.fromPath("/internal/v2/common/meal/master/mealGroupSequenceMap").build()
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Map<String, Integer>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, Integer>>>() {};

		ResponseDto<Map<String, Integer>> responseDto = null;
		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept,
					returnType);
		} catch (Exception e) {
			log.error("Error while getMealGroupMap", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new HashMap<>();

	}
	
	public Map<String, String> getMealGroupNameIdMap() {
		ResponseDto<Map<String, String>> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/v2/common/meal/master/nameIdMap").build()
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Map<String, String>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, String>>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept,
					returnType);
		} catch (Exception e) {
			log.error("Error while getMealGroupMap", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: new HashMap<>();

	}
	
	public Map<Pair<MealType, String>, MealDto> getMealMap() {
		ResponseDto<Map<Pair<MealType, String>, MealDto>> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/v2/common/meal/master/mealMap").build()
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Map<Pair<MealType, String>, MealDto>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<Pair<MealType, String>, MealDto>>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept,
					returnType);
		} catch (Exception e) {
			log.error("Error while getMealGroupMap", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: new HashMap<>();

	}
	
	public Map<String, String> getMealNameMap() {
		ResponseDto<Map<String, String>> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/v2/common/meal/master/mealNameMap").build()
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Map<String, String>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, String>>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept,
					returnType);
		} catch (Exception e) {
			log.error("Error while getMealGroupMap", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: new HashMap<>();

	}
	
	public Map<String, String> getMealGroupNameMap() {
		ResponseDto<Map<String, String>> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/v2/common/meal/master/mealGroupNameMap").build()
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Map<String, String>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, String>>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept,
					returnType);
		} catch (Exception e) {
			log.error("Error while getMealGroupMap", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: new HashMap<>();

	}
	
	public Map<String, MealDto> getMealMasterMap() {
		ResponseDto<Map<String, MealDto>> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/v2/common/meal/master/mealMasterMap").build()
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Map<String, MealDto>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, MealDto>>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept,
					returnType);
		} catch (Exception e) {
			log.error("Error while getMealGroupMap", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: new HashMap<>();

	}
	
	public Set<Pair<MealType, String>> getMeals() {
		ResponseDto<Set<Pair<MealType, String>>> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/v2/common/meal/master/getMeals").build()
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Set<Pair<MealType, String>>>> returnType = new ParameterizedTypeReference<ResponseDto<Set<Pair<MealType, String>>>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept,
					returnType);
		} catch (Exception e) {
			log.error("Error while getMeals", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: new HashSet<>();

	}
	
	public List<MealDto> getAllMeals() {
		ResponseDto<List<MealDto>> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/v2/common/meal/master/getAllMeals").build()
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<MealDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<MealDto>>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept,
					returnType);
		} catch (Exception e) {
			log.error("Error while getAllMeals", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: new ArrayList<>();
	}
	
	public Map<MealType, Map<String, MealDto>> getFirstByMealTypeAndGroup() {
		ResponseDto<Map<MealType, Map<String, MealDto>>> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/v2/common/meal/master/firstByMealTypeAndGroup").build()
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Map<MealType, Map<String, MealDto>>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<MealType, Map<String, MealDto>>>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept,
					returnType);
		} catch (Exception e) {
			log.error("Error while getAllMeals", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: new HashMap<>();

	}
	
	public List<ItemSubCategoryDto> getItemSubCategories() {
		ResponseDto<List<ItemSubCategoryDto>> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/v2/common/item/subcategory/listing").build()
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<ItemSubCategoryDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ItemSubCategoryDto>>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept,
					returnType);
		} catch (Exception e) {
			log.error("Error while getMealGroupMap", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: new ArrayList<>();

	}
	
	
	public Map<String, ItemSubCategoryDto> getItemSubCategoriesMap() {
		ResponseDto<Map<String, ItemSubCategoryDto>> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/v2/common/item/subcategory/map").build()
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Map<String, ItemSubCategoryDto>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, ItemSubCategoryDto>>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept,
					returnType);
		} catch (Exception e) {
			log.error("Error while getMealGroupMap", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: new HashMap<>();

	}
	
	public Set<String> getItemSubCategoryIds(String categoryId) {
		ResponseDto<Set<String>> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/v2/common/item/subcategory/set").build()
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("categoryId",categoryId);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Set<String>>> returnType = new ParameterizedTypeReference<ResponseDto<Set<String>>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept,
					returnType);
		} catch (Exception e) {
			log.error("Error while getItemSubCategoryIds", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: new HashSet<>();

	}
	
	public Map<String, ItemCategoryDto> getItemCategoriesMap() {
		ResponseDto<Map<String, ItemCategoryDto>> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/v2/common/item/category/map").build()
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Map<String, ItemCategoryDto>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, ItemCategoryDto>>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept,
					returnType);
		} catch (Exception e) {
			log.error("Error while getMealGroupMap", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: new HashMap<>();

	}
	
	
	
	public List<ResidenceMenuDto> findByResidenceIdAndMenuDateBetween(String residenceId, LocalDate startDate, LocalDate endDate){
		ResponseDto<List<ResidenceMenuDto>> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/residence/food/menu/dateBetween").build()
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("residenceId",residenceId);
		queryParams.add("startDate",startDate.toString());
		queryParams.add("endDate",endDate.toString());

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<ResidenceMenuDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ResidenceMenuDto>>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept,
					returnType);
		} catch (Exception e) {
			log.error("Error while getItemSubCategoryIds", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: new ArrayList<>();

	}
	
	
	public List<ResidenceFoodMenuItemIdProjectionDto> getFoodMenusItemProjection(Collection<String> residenceMenuIds){
		ResponseDto<List<ResidenceFoodMenuItemIdProjectionDto>> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/residence/food/menu/item/foodMenusItemProjection").build()
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<ResidenceFoodMenuItemIdProjectionDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ResidenceFoodMenuItemIdProjectionDto>>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.POST, queryParams, residenceMenuIds, headerParams, accept,
					returnType);
		} catch (Exception e) {
			log.error("Error while foodMenusItemProjection", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: new ArrayList<>();
	}
	
	public Map<Object, Object> getFoodItemMap() {
		ResponseDto<Map<Object, Object>> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/v2/common/item/foodItemMap").build()
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Map<Object, Object>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<Object, Object>>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept,
					returnType);
		} catch (Exception e) {
			log.error("Error while get foodItemMap", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: new HashMap<>();

	}
	
	public String getResidenceName(String residenceId) {
		ResponseDto<String> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/v2/common/item/category/foodItemMap").build()
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("residenceId",residenceId);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept,
					returnType);
		} catch (Exception e) {
			log.error("Error while get foodItemMap", e);
		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: StringUtils.EMPTY;

	}
	
	
}