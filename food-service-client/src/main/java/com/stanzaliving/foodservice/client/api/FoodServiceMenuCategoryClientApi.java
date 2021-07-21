package com.stanzaliving.foodservice.client.api;

import java.util.List;
import java.util.Objects;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.food.dto.response.FoodMenuCategoryBasicDetailsDto;
import com.stanzaliving.food.v2.grammage.category.request.MenuCategoryVersionDto;
import com.stanzaliving.food.v2.menu.dto.WeeklyMenuDto;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class FoodServiceMenuCategoryClientApi {

    private StanzaRestClient restClient;

    public FoodServiceMenuCategoryClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }
	
	public MenuCategoryVersionDto getActiveMenuCategoryVersionByUuid(String uuid){
		
		ResponseDto<MenuCategoryVersionDto> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/v2/common/food/menu/category/active").build()
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("uuid", uuid);

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
	

	public FoodMenuCategoryBasicDetailsDto getMenuCategoryByUuid(String uuid){

		ResponseDto<FoodMenuCategoryBasicDetailsDto> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/v2/common/food/menu/category/get").build()
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("uuid", uuid);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<FoodMenuCategoryBasicDetailsDto>> returnType = new ParameterizedTypeReference<ResponseDto<FoodMenuCategoryBasicDetailsDto>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept,
					returnType);
		} catch (Exception e) {
			log.error("Error while getMenuCategoryVersionByUuid", e);
		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: FoodMenuCategoryBasicDetailsDto.builder().build();

	}
	
	public WeeklyMenuDto getWeeklyMenuByUuid(String uuid){

		ResponseDto<WeeklyMenuDto> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/v2/menu/get").build()
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("uuid", uuid);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<WeeklyMenuDto>> returnType = new ParameterizedTypeReference<ResponseDto<WeeklyMenuDto>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept,
					returnType);
		} catch (Exception e) {
			log.error("Error while getMenuCategoryVersionByUuid", e);
		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: WeeklyMenuDto.builder().build();

	}
	
}