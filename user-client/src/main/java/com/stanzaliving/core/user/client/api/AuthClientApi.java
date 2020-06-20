/**
 * 
 */
package com.stanzaliving.core.user.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.constants.SecurityConstants;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.user.acl.request.dto.UserAccessDto;
import com.stanzaliving.core.user.dto.UserProfileDto;

public class AuthClientApi {

	private StanzaRestClient restClient;

	public AuthClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public ResponseDto<UserProfileDto> getUserProfileByToken(String token) {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/profile").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		String tokenCookie = SecurityConstants.TOKEN_HEADER_NAME + "=" + token;

		final HttpHeaders headerParams = new HttpHeaders();
		headerParams.add(SecurityConstants.COOKIE_HEADER_NAME, tokenCookie);

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		TypeReference<ResponseDto<UserProfileDto>> returnType = new TypeReference<ResponseDto<UserProfileDto>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<UserProfileDto> getUserByToken(String token) {
		return getUserByToken(token);
	}

	public ResponseDto<Boolean> checkUrlPermission(String userId, String url) {

		UserAccessDto accessDto = UserAccessDto.builder().userId(userId).url(url).build();

		Object postBody = accessDto;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/acl/check").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		TypeReference<ResponseDto<Boolean>> returnType = new TypeReference<ResponseDto<Boolean>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}
}