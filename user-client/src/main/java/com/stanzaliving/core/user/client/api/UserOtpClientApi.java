package com.stanzaliving.core.user.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.user.enums.OtpType;
import com.stanzaliving.core.user.enums.UserType;
import com.stanzaliving.core.user.request.dto.MobileOtpRequestDto;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Objects;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 28-July-2020
 */

@Log4j2
public class UserOtpClientApi {
	private StanzaRestClient restClient;

	public UserOtpClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}


	private MobileOtpRequestDto prepareMobileOtpRequestDto(String mobile, UserType userType) {
		return MobileOtpRequestDto.builder()
				.mobile(mobile)
				.userType(userType)
				.otpType(OtpType.MOBILE_VERIFICATION)
				.isoCode("IN")
				.build();
	}

	public ResponseDto<Void> sendOtpRequest(String mobile, UserType userType) {
		String path = UriComponentsBuilder.fromPath("/internal/otp/mobile/request").toUriString();

		return sendOtpRequest(mobile, userType, path);
	}

	public ResponseDto<Void> resendOtp(String mobile, UserType userType) {
		String path = UriComponentsBuilder.fromPath("/internal/otp/mobile/resend").toUriString();

		return sendOtpRequest(mobile, userType, path);
	}

	public ResponseDto<Void> validateOtp(String mobile, UserType userType) {
		String path = UriComponentsBuilder.fromPath("/internal/otp/mobile/validate").toUriString();

		return sendOtpRequest(mobile, userType, path);
	}

	public ResponseDto<Void> sendOtpRequest(String mobile, UserType userType, String path) {

		if (StringUtils.isBlank(mobile) || Objects.isNull(userType)) {
			throw new IllegalArgumentException("Please check all the provided params!!");
		}

		Object postBody = prepareMobileOtpRequestDto(mobile, userType);

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

}
