package com.stanzaliving.core.search.client.api;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.PageResponse;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.exception.ApiValidationException;
import com.stanzaliving.core.base.exception.PreconditionFailedException;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.search.medulla.dtos.AssetSearchRequestDto;
import com.stanzaliving.search.medulla.dtos.PoSearchRequetDto;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class SearchClientApi {

	private final StanzaRestClient restClient;

	public SearchClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public PageResponse<Map<String,Object>> searchPOs(PoSearchRequetDto requestDto) {

		log.info("Hitting Search Service to Fetch POs for requestBody {}", requestDto);
		String path = UriComponentsBuilder.fromPath("/internal/search/po/master/search").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		TypeReference<ResponseDto<PageResponse<Map<String,Object>>>> returnType = new TypeReference<ResponseDto<PageResponse<Map<String,Object>>>>() {};

		ResponseDto<PageResponse<Map<String,Object>>> responseDto = new ResponseDto<>();

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

	public PageResponse<Object> searchAssets(AssetSearchRequestDto requestDto, Boolean searchUuids) {

		log.info("Hitting Search Service to Fetch Assets for requestBody {}", requestDto);
		String path = UriComponentsBuilder.fromPath("/internal/search/asset/master/search").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		if (Objects.nonNull(searchUuids)) {
			queryParams.add("searchUuids", searchUuids.toString());
		}

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		TypeReference<ResponseDto<PageResponse<Object>>> returnType = new TypeReference<ResponseDto<PageResponse<Object>>>() {
		};

		ResponseDto<PageResponse<Object>> responseDto = new ResponseDto<>();

		try {

			responseDto = restClient.request(path, HttpMethod.POST, queryParams, requestDto, headerParams, accept, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while searching Assets from search service.", e);

			throw new ApiValidationException("Some error occurred. Please try again after some time.");

		}

		if (!responseDto.isStatus()) {

			throw new PreconditionFailedException(responseDto.getMessage());

		}

		return responseDto.getData();
	}
}

