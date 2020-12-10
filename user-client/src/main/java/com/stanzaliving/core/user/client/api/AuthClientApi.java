/**
 * 
 */
package com.stanzaliving.core.user.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.stanzaliving.core.base.exception.StanzaSecurityException;
import com.stanzaliving.core.user.enums.OtpType;
import com.stanzaliving.core.user.enums.UserType;
import com.stanzaliving.core.user.request.dto.LoginRequestDto;
import com.stanzaliving.core.user.request.dto.MobileOtpValidateRequestDto;
import com.stanzaliving.core.user.request.dto.OtpValidateRequestDto;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.ParameterizedTypeReference;
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

	private LoginRequestDto prepareLoginRequestDto(String mobile, UserType userType, String isoCode) {
		return LoginRequestDto.builder()
				.mobile(mobile)
				.userType(userType)
				.isoCode(isoCode)
				.build();
	}

	private OtpValidateRequestDto prepareOtpValidateRequestDto(String mobile, UserType userType, String otp, String isoCode) {
		return OtpValidateRequestDto.builder()
				.isoCode(isoCode)
				.mobile(mobile)
				.otp(otp)
				.userType(userType)
				.build();

	}


	public ResponseDto<UserProfileDto> getUserByToken(String token) {
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


	public ResponseDto<Void> login(String mobile, UserType userType, String isoCode) {
		String path = UriComponentsBuilder.fromPath("/auth/login").toUriString();

		return login(mobile, userType, path, isoCode);
	}

	public ResponseDto<Void> resendOtp(String mobile, UserType userType, String isoCode) {
		String path = UriComponentsBuilder.fromPath("/auth/resendOtp").toUriString();

		return login(mobile, userType, path, isoCode);
	}

	private ResponseDto<Void> login(String mobile, UserType userType, String path, String isoCode) {

		if (StringUtils.isBlank(mobile) || Objects.isNull(userType) || StringUtils.isBlank(isoCode)) {
			throw new IllegalArgumentException("Please check all the provided params!!");
		}

		LoginRequestDto postBody = prepareLoginRequestDto(mobile, userType, isoCode);

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<Void> validateOtp(String mobile, UserType userType, String otp, String isoCode) {
		String path = UriComponentsBuilder.fromPath("/auth/validateOtp").toUriString();

		if (StringUtils.isBlank(mobile) || Objects.isNull(userType) || StringUtils.isBlank(otp) || StringUtils.isBlank(isoCode)) {
			throw new IllegalArgumentException("Please check all the provided params!!");
		}

		OtpValidateRequestDto postBody = prepareOtpValidateRequestDto(mobile, userType, otp, isoCode);

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
		};

		ResponseDto<Void> response = restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

		if (!response.isStatus()) {
			throw new StanzaSecurityException(response.getMessage());
		}
		return response;
	}


}