package com.stanzaliving.core.security.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.constants.SecurityConstants;
import com.stanzaliving.core.base.exception.StanzaSecurityException;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.security.context.SecurityContextHolder;
import com.stanzaliving.core.security.helper.UserMicroserviceHelper;
import com.stanzaliving.core.security.service.AuthService;
import com.stanzaliving.core.user.acl.request.dto.UserAccessDto;
import com.stanzaliving.core.user.dto.UserDto;
import com.stanzaliving.core.user.dto.UserProfileDto;

public class AuthServiceImpl implements AuthService {

	private static final Logger logger = Logger.getLogger(AuthServiceImpl.class);

	private StanzaRestClient restClient;

	public AuthServiceImpl(String basePath) {
		restClient = new StanzaRestClient(basePath);
	}

	@Override
	public ResponseDto<UserProfileDto> getUserProfile() {
		return getUserProfileByToken(SecurityContextHolder.getCurrentUser().getToken());
	}

	private ResponseDto<UserProfileDto> getUserProfileByToken(String token) {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath(UserMicroserviceHelper.URL_GET_CURRENT_USER_PROFILE).buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		String tokenCookie = SecurityConstants.TOKEN_HEADER_NAME + "=" + token;

		final HttpHeaders headerParams = new HttpHeaders();
		headerParams.add(SecurityConstants.COOKIE_HEADER_NAME, tokenCookie);

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<UserProfileDto>> returnType = new ParameterizedTypeReference<ResponseDto<UserProfileDto>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	@Override
	public ResponseDto<UserDto> validateToken(String token) {
		logger.debug("Validating token: " + token);
		return getUserByToken(token);
	}

	private ResponseDto<UserDto> getUserByToken(String token) {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath(UserMicroserviceHelper.URL_TOKEN_VALIDATION).buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		String tokenCookie = SecurityConstants.TOKEN_HEADER_NAME + "=" + token;

		final HttpHeaders headerParams = new HttpHeaders();
		headerParams.add(SecurityConstants.COOKIE_HEADER_NAME, tokenCookie);

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<UserDto>> returnType = new ParameterizedTypeReference<ResponseDto<UserDto>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	@Override
	public void validateUrlPermission(String userId, String uri) {

		ResponseDto<Boolean> responseDto = checkUrlPermission(userId, uri);

		if (responseDto == null || !responseDto.getData()) {
			throw new StanzaSecurityException("You are not allowed to access this url", HttpStatus.FORBIDDEN.value());
		}

	}

	private ResponseDto<Boolean> checkUrlPermission(String userId, String url) {

		UserAccessDto accessDto = UserAccessDto.builder().userId(userId).url(url).build();

		Object postBody = accessDto;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath(UserMicroserviceHelper.URL_VALIDATE_PERMISSION).buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}
}