package com.stanzaliving.core.search.client.food.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.exception.ApiValidationException;
import com.stanzaliving.core.base.exception.PreconditionFailedException;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.search.client.food.FoodMenuAggregationClient;
import com.stanzaliving.search.food.search.dto.request.MenuMealItemRequestDto;
import com.stanzaliving.search.food.search.dto.request.MenuMealResidenceItemRequestDto;
import com.stanzaliving.search.food.search.dto.response.menu.rating.FoodMenuMicromarketRatingResponseDto;
import com.stanzaliving.search.food.search.dto.response.menu.rating.MealItemRatingResponseDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 17-Mar-2021
 */

@Log4j2
@Service
public class FoodMenuAggregationClientImpl implements FoodMenuAggregationClient {

	@Override
	public List<MealItemRatingResponseDto> aggregateMenuItemsRating(StanzaRestClient restClient, MenuMealItemRequestDto requestDto) {

		String path = UriComponentsBuilder.fromPath("/internal/aggregate/food/menu/item/rating").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		TypeReference<ResponseDto<List<MealItemRatingResponseDto>>> returnType = new TypeReference<ResponseDto<List<MealItemRatingResponseDto>>>() {};

		ResponseDto<List<MealItemRatingResponseDto>> responseDto = new ResponseDto<>();

		try {

			responseDto = restClient.request(path, HttpMethod.POST, queryParams, requestDto, headerParams, accept, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while searching from search service.", e);

			throw new ApiValidationException("Some error occurred. Please try again after some time.");

		}

		if (!responseDto.isStatus()) {

			throw new PreconditionFailedException(responseDto.getMessage());

		}

		return responseDto.getData();
	}

	@Override
	public List<MealItemRatingResponseDto> aggregateMenuItemsRating(StanzaRestClient restClient, MenuMealResidenceItemRequestDto requestDto) {

		String path = UriComponentsBuilder.fromPath("/internal/aggregate/food/menu/item/rating/residence").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		TypeReference<ResponseDto<List<MealItemRatingResponseDto>>> returnType = new TypeReference<ResponseDto<List<MealItemRatingResponseDto>>>() {};

		ResponseDto<List<MealItemRatingResponseDto>> responseDto = new ResponseDto<>();

		try {

			responseDto = restClient.request(path, HttpMethod.POST, queryParams, requestDto, headerParams, accept, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while searching from search service.", e);

			throw new ApiValidationException("Some error occurred. Please try again after some time.");

		}

		if (!responseDto.isStatus()) {

			throw new PreconditionFailedException(responseDto.getMessage());

		}

		return responseDto.getData();
	}

	@Override
	public FoodMenuMicromarketRatingResponseDto aggregateWeeklyMenuItemsRating(StanzaRestClient restClient, MenuMealItemRequestDto requestDto) {

		String path = UriComponentsBuilder.fromPath("/internal/aggregate/food/menu/item/weekly/rating/summary").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		TypeReference<ResponseDto<FoodMenuMicromarketRatingResponseDto>> returnType = new TypeReference<ResponseDto<FoodMenuMicromarketRatingResponseDto>>() {};

		ResponseDto<FoodMenuMicromarketRatingResponseDto> responseDto = new ResponseDto<>();

		try {

			responseDto = restClient.request(path, HttpMethod.POST, queryParams, requestDto, headerParams, accept, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while searching from search service.", e);

			throw new ApiValidationException("Some error occurred. Please try again after some time.");

		}

		if (!responseDto.isStatus()) {

			throw new PreconditionFailedException(responseDto.getMessage());

		}

		return responseDto.getData();
	}

	@Override
	public FoodMenuMicromarketRatingResponseDto aggregateWeeklyMenuItemsRating(StanzaRestClient restClient, MenuMealResidenceItemRequestDto requestDto) {
		String path = UriComponentsBuilder.fromPath("/internal/aggregate/food/menu/item/weekly/rating/residence/summary").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		TypeReference<ResponseDto<FoodMenuMicromarketRatingResponseDto>> returnType = new TypeReference<ResponseDto<FoodMenuMicromarketRatingResponseDto>>() {};

		ResponseDto<FoodMenuMicromarketRatingResponseDto> responseDto = new ResponseDto<>();

		try {

			responseDto = restClient.request(path, HttpMethod.POST, queryParams, requestDto, headerParams, accept, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while searching from search service.", e);

			throw new ApiValidationException("Some error occurred. Please try again after some time.");

		}

		if (!responseDto.isStatus()) {

			throw new PreconditionFailedException(responseDto.getMessage());

		}

		return responseDto.getData();
	}
}
