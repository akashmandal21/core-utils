package com.stanzaliving.core.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.wanda.venta.response.AgreementResponseDto;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class AgreementClientApi {

	private StanzaRestClient restClient;

	public AgreementClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public ResponseDto<AgreementResponseDto> getAgreementLink(String referenceId) {

		try {
			Object postBody = null;

			log.info("get User details by userUuid is {} ", referenceId);

			final Map<String, Object> uriVariables = new HashMap<>();

			uriVariables.put("referenceId", referenceId);

			String path = UriComponentsBuilder.fromPath("/internal/get/{referenceId}").buildAndExpand(uriVariables)
					.toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<ResponseDto<AgreementResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<AgreementResponseDto>>() {
			};

			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("error while fetching the user details " + e);
		}

		return null;

	}
}
