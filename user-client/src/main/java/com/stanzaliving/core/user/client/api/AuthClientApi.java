/**
 * 
 */
package com.stanzaliving.core.user.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestClientException;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.constants.SecurityConstants;
import com.stanzaliving.core.base.exception.StanzaHttpException;
import com.stanzaliving.core.base.exception.StanzaSecurityException;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.user.acl.request.dto.UserAccessDto;
import com.stanzaliving.core.user.dto.UserProfileDto;

import lombok.extern.log4j.Log4j2;

@Log4j2
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

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = restClient.getBasePath() + UriComponentsBuilder.fromPath("/details").buildAndExpand(uriVariables).toUriString();

		String tokenCookie = SecurityConstants.TOKEN_HEADER_NAME + "=" + token;

		final MultiValueMap<String, String> headerParams = new HttpHeaders();
		headerParams.add(SecurityConstants.COOKIE_HEADER_NAME, tokenCookie);

		HttpEntity<String> req = new HttpEntity<>(headerParams);

		ResponseEntity<String> responseEntity = null;
		try {

			log.debug("Calling API: {}", path);

			responseEntity = restClient.getRestTemplate().exchange(path, HttpMethod.GET, req, String.class);

		} catch (RestClientException e) {

			if (!StringUtils.isEmpty(e.getMessage()) && e.getMessage().contains("401")) {
				responseEntity = new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
			} else {

				log.error("Exception caught while making rest call: ", e);
				throw new StanzaHttpException(e.getMessage(), e);
			}
		}

		return parseResponse(path, responseEntity);
	}

	private ResponseDto<UserProfileDto> parseResponse(String path, ResponseEntity<String> responseEntity) {

		HttpStatus statusCode = responseEntity.getStatusCode();

		log.debug("API: {}, Response: {}", path, statusCode);

		if (isSuccessCode(statusCode)) {
			try {

				log.debug("Response from API: {}", responseEntity);

				TypeReference<ResponseDto<UserProfileDto>> responseType = new TypeReference<ResponseDto<UserProfileDto>>() {
				};

				return restClient.getObjectMapper().readValue(responseEntity.getBody(), responseType);
			} catch (Exception e) {
				log.error("Error reading response: ", e);
				throw new StanzaHttpException("Error while reading response", statusCode.value(), e);
			}
		}

		if (HttpStatus.NO_CONTENT == responseEntity.getStatusCode()) {
			return null;
		}

		if (isAccessDenied(statusCode)) {
			throw new StanzaSecurityException("Access Denied for User", statusCode.value());
		} else {
			// The error handler built into the RestTemplate should handle 400 and 500 series errors.
			throw new StanzaHttpException("API returned " + statusCode + " and it wasn't handled by the RestTemplate error handler", statusCode.value());
		}
	}

	private boolean isSuccessCode(HttpStatus httpStatus) {
		return HttpStatus.OK == httpStatus || HttpStatus.CREATED == httpStatus || HttpStatus.ACCEPTED == httpStatus;
	}

	private boolean isAccessDenied(HttpStatus httpStatus) {
		return HttpStatus.UNAUTHORIZED == httpStatus || HttpStatus.FORBIDDEN == httpStatus;
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