package com.stanzaliving.foodservice.client.api;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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

		ParameterizedTypeReference<ResponseDto<FoodMenuCategoryBasicDetailsDto>> returnType = new ParameterizedTypeReference<ResponseDto<FoodMenuCategoryBasicDetailsDto>>() {};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("exception while listing internet plans", e);
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

		ParameterizedTypeReference<ResponseDto<FoodMenuCategoryBasicDetailsDto>> returnType = new ParameterizedTypeReference<ResponseDto<FoodMenuCategoryBasicDetailsDto>>() {};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("exception while listing internet plans", e);
		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : null;

	}
	
	public List<ListingDto> getServiceMixEnabledFoodItemTags() {
		ResponseDto<List<ListingDto>> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/tag/get/serviceMixListing").build().toUriString();
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<ListingDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ListingDto>>>() {};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("exception while listing internet plans", e);
		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : null;

	}
	
}
