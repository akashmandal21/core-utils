package com.stanzaliving.foodservice.client.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.food.enums.FoodServeType;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Objects;

@Log4j2
public class FoodServiceMenuCategoryClientApi {

	private StanzaRestClient restClient;

	public FoodServiceMenuCategoryClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public FoodServeType getFoodServeType(String residenceMenuId) {

		String path = UriComponentsBuilder.fromPath("/internal/v2/menu/foodServeType").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("residenceMenuId", residenceMenuId);

		TypeReference<ResponseDto<FoodServeType>> returnType = new TypeReference<ResponseDto<FoodServeType>>() {};

		ResponseDto<FoodServeType> responseDto = null;

		try {

			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting food serve type", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
}