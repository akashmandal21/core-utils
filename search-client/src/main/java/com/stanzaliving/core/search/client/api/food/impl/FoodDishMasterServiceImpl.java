package com.stanzaliving.core.search.client.api.food.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.PageResponse;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.exception.ApiValidationException;
import com.stanzaliving.core.base.exception.PreconditionFailedException;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.food.dto.FoodItemSearchDto;
import com.stanzaliving.core.search.client.api.food.FoodDishMasterService;
import com.stanzaliving.search.food.index.dto.dishmaster.DishMasterSearchIndexDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
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
public class FoodDishMasterServiceImpl implements FoodDishMasterService {

	@Override
	public PageResponse<DishMasterSearchIndexDto> searchDishMaster(StanzaRestClient restClient, FoodItemSearchDto searchDto) {

		String path = UriComponentsBuilder.fromPath("/internal/search/food/dish/master").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		TypeReference<ResponseDto<PageResponse<DishMasterSearchIndexDto>>> returnType = new TypeReference<ResponseDto<PageResponse<DishMasterSearchIndexDto>>>() {};

		ResponseDto<PageResponse<DishMasterSearchIndexDto>> responseDto = new ResponseDto<>();

		try {

			responseDto = restClient.request(path, HttpMethod.POST, queryParams, searchDto, headerParams, accept, returnType, MediaType.APPLICATION_JSON);

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
	public List<String> autoSuggestDishName(StanzaRestClient restClient, String text) {

		String path = UriComponentsBuilder.fromPath("/internal/search/food/dish/master/autosuggest").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("name", text);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		TypeReference<ResponseDto<List<String>>> returnType = new TypeReference<ResponseDto<List<String>>>() {};

		ResponseDto<List<String>> responseDto = new ResponseDto<>();

		try {

			responseDto = restClient.request(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType, MediaType.APPLICATION_JSON);

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
