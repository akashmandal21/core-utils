package com.stanzaliving.foodservice.client.api;

import java.time.LocalDate;
import java.util.*;

import com.stanzaliving.core.food.dto.response.RecentMealDto;
import com.stanzaliving.core.opscalculator.dto.OccupiedBedDto;
import com.stanzaliving.core.food.dto.IngredientUsageDto;
import com.stanzaliving.core.user.dto.response.UserContactDetailsResponseDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.food.dto.request.FullCategoryDto;
import com.stanzaliving.core.food.dto.response.FoodMenuCategoryBasicDetailsDto;

import lombok.extern.log4j.Log4j2;

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

        return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : null;

    }
}