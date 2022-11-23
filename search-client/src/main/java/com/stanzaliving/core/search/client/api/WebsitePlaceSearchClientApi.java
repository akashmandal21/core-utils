package com.stanzaliving.core.search.client.api;

import java.util.List;
import java.util.Objects;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.exception.ApiValidationException;
import com.stanzaliving.core.base.exception.PreconditionFailedException;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.website.elasticsearch.index.dto.WebsitePlaceIndexDto;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class WebsitePlaceSearchClientApi {

	private final StanzaRestClient restClient;

	public WebsitePlaceSearchClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public List<WebsitePlaceIndexDto> searchWebsitePlace(String place, Integer cityId) {

		String path = UriComponentsBuilder.fromPath("/internal/website/place/search").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		queryParams.add("place", place);
		
		if (Objects.nonNull(cityId))
			queryParams.add("cityId", cityId.toString());

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		TypeReference<ResponseDto<List<WebsitePlaceIndexDto>>> returnType = new TypeReference<ResponseDto<List<WebsitePlaceIndexDto>>>() {};

		ResponseDto<List<WebsitePlaceIndexDto>> responseDto = new ResponseDto<>();

		try {

			responseDto = restClient.request(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while searching for website place", e);

			throw new ApiValidationException("Some error occurred. Please try again after some time.");
		}

		if (!responseDto.isStatus()) {

			throw new PreconditionFailedException(responseDto.getMessage());

		}

		return responseDto.getData();
	}
	
	public void saveOrUpdateIndexDocuments(List<WebsitePlaceIndexDto> places) {

		String path = UriComponentsBuilder.fromPath("/internal/index/website/update/place").build().toUriString();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		TypeReference<ResponseDto<Void>> returnType = new TypeReference<ResponseDto<Void>>() {};

		ResponseDto<Void> responseDto = new ResponseDto<>();

		try {
			responseDto = restClient.request(path, HttpMethod.POST, null, places, headerParams, accept, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while updating website places on elastic search", e);

			throw new ApiValidationException("Some error occurred. Please try again after some time.");
		}

		if (!responseDto.isStatus()) {

			throw new PreconditionFailedException(responseDto.getMessage());

		}
	}
}

