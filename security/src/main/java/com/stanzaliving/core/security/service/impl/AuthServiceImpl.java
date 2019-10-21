package com.stanzaliving.core.security.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
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
import com.stanzaliving.core.security.context.SecurityContextHolder;
import com.stanzaliving.core.security.helper.UserMicroserviceHelper;
import com.stanzaliving.core.security.service.AuthService;
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

	@Override
	public ResponseDto<UserDto> validateToken(String token) {
		logger.debug("Validating token: " + token);
		return getUserByToken(token);
	}

	@Override
	public void validateUrlPermission(String userId, String uri) {
		// CasaHttpClient httpClient = new CasaHttpClient(UserMicroserviceHelper.VALIDATE_URL_PERMISSION);
		//
		// httpClient.addHeader(CasaSecurityConstant.USER_ID_CAMALCASE, userId);
		// httpClient.addHeader(CasaSecurityConstant.URI, uri);
		//
		// try (CloseableHttpResponse httpResponse = httpClient.executeGet()) {
		// StatusLine statusLine = httpResponse.getStatusLine();
		//
		// if (statusLine.getStatusCode() != 200) {
		// throw new CasaSecurityException(statusLine.getReasonPhrase(), statusLine.getStatusCode());
		// }
		// } catch (IOException e) {
		// throw new CasaSecurityException("Internal server error", 500);
		// }

	}

	private ResponseDto<UserDto> getUserByToken(String token) {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath(UserMicroserviceHelper.URL_TOKEN_VALIDATION).buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();
		headerParams.add(SecurityConstants.TOKEN_HEADER_NAME, token);

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<UserDto>> returnType = new ParameterizedTypeReference<ResponseDto<UserDto>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	private ResponseDto<UserProfileDto> getUserProfileByToken(String token) {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath(UserMicroserviceHelper.URL_GET_CURRENT_USER_PROFILE).buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();
		headerParams.add(SecurityConstants.TOKEN_HEADER_NAME, token);

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<UserProfileDto>> returnType = new ParameterizedTypeReference<ResponseDto<UserProfileDto>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

}