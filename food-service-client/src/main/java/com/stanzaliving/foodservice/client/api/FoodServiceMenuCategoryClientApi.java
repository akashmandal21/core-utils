package com.stanzaliving.foodservice.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.food.enums.FoodServeType;
import com.stanzaliving.food.v2.grammage.category.request.MenuCategoryVersionDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Objects;

@Log4j2
public class FoodServiceMenuCategoryClientApi {

    private StanzaRestClient restClient;

    public FoodServiceMenuCategoryClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }
	
	public MenuCategoryVersionDto getActiveMenuCategoryVersionByUuid(String versionId){
		
		ResponseDto<MenuCategoryVersionDto> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/v2/menu/category/active").build()
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("versionId", versionId);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<MenuCategoryVersionDto>> returnType = new ParameterizedTypeReference<ResponseDto<MenuCategoryVersionDto>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept,
					returnType);
		} catch (Exception e) {
			log.error("Error while getMenuCategoryVersionByUuid", e);
		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: MenuCategoryVersionDto.builder().build();

	}

	public FoodServeType getFoodServeType(String residenceMenuId) {

		ResponseDto<FoodServeType> responseDto = null;

		String path = UriComponentsBuilder.fromPath("/internal/v2/menu/foodServeType").build()
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("residenceMenuId", residenceMenuId);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<FoodServeType>> returnType = new ParameterizedTypeReference<ResponseDto<FoodServeType>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept,
					returnType);
		} catch (Exception e) {
			log.error("Error while getMenuCategoryVersionByUuid", e);
		}

		return (Objects.nonNull(responseDto)) ? responseDto.getData() : null;
	}
}