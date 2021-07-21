package com.stanzaliving.foodservice.client.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.food.enums.FoodItemBasePreference;
import com.stanzaliving.core.food.enums.FoodRegion;
import com.stanzaliving.core.food.enums.FoodServeType;
import com.stanzaliving.food.v2.common.dto.ThaliMasterDto;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class FoodServiceThaliMasterClientApi {

    private StanzaRestClient restClient;

    public FoodServiceThaliMasterClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

   
	public Map<String, String> getThaliNameMap() {
		ResponseDto<Map<String, String>> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/v2/common/thali/master/thaliNameMap").build()
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
			log.error("Error while get thaliNameMap", e);
		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: new HashMap<>();

	}
	
	public Map<String, ThaliMasterDto> getThaliMap() {
		ResponseDto<Map<String, ThaliMasterDto>> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/v2/common/thali/master/thaliMap").build()
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Map<String, ThaliMasterDto>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, ThaliMasterDto>>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept,
					returnType);
		} catch (Exception e) {
			log.error("Error while get thaliNameMap", e);
		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: new HashMap<>();

	}
	
	public List<ThaliMasterDto> findAllCached() {
		ResponseDto<List<ThaliMasterDto>> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/v2/common/thali/master/all").build()
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<ThaliMasterDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ThaliMasterDto>>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept,
					returnType);
		} catch (Exception e) {
			log.error("Error while get thaliNameMap", e);
		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: new ArrayList<>();

	}
	
	public Map<Pair<FoodRegion, FoodItemBasePreference>, ThaliMasterDto> getThaliMapper() {
		ResponseDto<Map<Pair<FoodRegion, FoodItemBasePreference>, ThaliMasterDto>> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/v2/common/thali/master/thaliMap").build()
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Map<Pair<FoodRegion, FoodItemBasePreference>, ThaliMasterDto>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<Pair<FoodRegion, FoodItemBasePreference>, ThaliMasterDto>>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept,
					returnType);
		} catch (Exception e) {
			log.error("Error while get thaliNameMap", e);
		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: new HashMap<>();
	}
	
	public String getDefaultThaliId(FoodServeType foodServeType) {
		ResponseDto<String> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/v2/common/thali/master/defaultThaliId").build()
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("foodServeType",foodServeType.toString());
		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept,
					returnType);
		} catch (Exception e) {
			log.error("Error while get defaultThaliId", e);
		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: StringUtils.EMPTY;

	}
	
	

}