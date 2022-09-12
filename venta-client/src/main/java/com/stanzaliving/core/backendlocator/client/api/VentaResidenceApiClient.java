package com.stanzaliving.core.backendlocator.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.residence.dto.ResidencePropertyCardDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2
public class VentaResidenceApiClient {

	private StanzaRestClient restClient;

	public VentaResidenceApiClient(StanzaRestClient restClient) {
		this.restClient = restClient;
	}

	public List<String> getRoomNumberList(String residenceUuid) {
		Object postBody = null;

		List<String> roomNumberList = new ArrayList<>();
		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("residenceUuid", residenceUuid);
		String path = UriComponentsBuilder.fromPath("/api/v1/residence-rooms/{residenceUuid}").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<List<String>> returnType = new ParameterizedTypeReference<List<String>>() {
		};

		try {
			roomNumberList = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept,
					returnType);
		} catch (Exception e) {
			log.error("Exception while fetching room numbers list for residence {} ", residenceUuid);
		}

		return roomNumberList;
	}

	public ResponseDto<ResidencePropertyCardDto> getResidencePropertyCard(String residenceUuid) {
		Object postBody = null;
		ResponseDto<ResidencePropertyCardDto> residencePropertyCardDtoResponseDto = new ResponseDto<>();
		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("residenceUuid", residenceUuid);
		String path = UriComponentsBuilder.fromPath("/internal/residence-property-card/{residenceUuid}").buildAndExpand(uriVariables)
			.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<ResidencePropertyCardDto>> returnType = new ParameterizedTypeReference<ResponseDto<ResidencePropertyCardDto>>() {
		};

		try {
			residencePropertyCardDtoResponseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept,
				returnType);
		} catch (Exception e) {
			log.error("Exception while fetching residence property card for residence {} ", residenceUuid);
		}

		return residencePropertyCardDtoResponseDto;
	}


}
