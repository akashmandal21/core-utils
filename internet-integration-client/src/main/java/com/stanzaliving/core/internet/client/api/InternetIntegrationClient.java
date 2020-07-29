package com.stanzaliving.core.internet.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.stanzaliving.internet.dto.UserLastUsageDetailsDto;
import com.stanzaliving.transformations.pojo.StateMetadataDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.constants.SecurityConstants;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.versioning.dto.VersionListRequestDto;
import com.stanzaliving.versioning.dto.VersioningRequestDto;
import com.stanzaliving.versioning.dto.VersioningResponseDto;

public class InternetIntegrationClient {

	private StanzaRestClient restClient;

	public InternetIntegrationClient(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public ResponseDto<List<UserLastUsageDetailsDto>> getLastIntenetUsageData() {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/spectra/user/consumption/lastUsage").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<UserLastUsageDetailsDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<UserLastUsageDetailsDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}
}