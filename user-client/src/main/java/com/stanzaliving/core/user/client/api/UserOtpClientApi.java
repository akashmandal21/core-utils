package com.stanzaliving.core.user.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.user.enums.OtpType;
import com.stanzaliving.core.user.enums.UserType;
import com.stanzaliving.core.user.request.dto.MobileOtpRequestDto;
import com.stanzaliving.core.user.request.dto.MobileOtpValidateRequestDto;
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
	private final StanzaRestClient restClient;

	public UserOtpClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}


	private MobileOtpRequestDto prepareMobileOtpRequestDto(String mobile, UserType userType, OtpType otpType, String isoCode) {
		return MobileOtpRequestDto.builder()
				.mobile(mobile)
				.userType(userType)
				.otpType(otpType)
				.isoCode(isoCode)
				.build();
	}

	private MobileOtpValidateRequestDto prepareMobileOtpValidationDto(String mobile, UserType userType, String otp, OtpType otpType, String isoCode) {
		return MobileOtpValidateRequestDto.builder()
				.mobile(mobile)
				.userType(userType)
				.otpType(otpType)
				.isoCode(isoCode)
				.otp(otp)
				.build();
	}

	public ResponseDto<Void> sendOtpRequest(String mobile, UserType userType, OtpType otpType, String isoCode) {
		String path = UriComponentsBuilder.fromPath("/internal/otp/mobile/request").toUriString();

		return sendOtpRequest(mobile, userType, path, otpType, isoCode);
	}

	public ResponseDto<Void> resendOtp(String mobile, UserType userType, OtpType otpType, String isoCode) {
		String path = UriComponentsBuilder.fromPath("/internal/otp/mobile/resend").toUriString();

		return sendOtpRequest(mobile, userType, path, otpType, isoCode);
	}

	private ResponseDto<Void> sendOtpRequest(String mobile, UserType userType, String path, OtpType otpType, String isoCode) {

		if (StringUtils.isBlank(mobile) || Objects.isNull(userType)) {
			throw new IllegalArgumentException("Please check all the provided params!!");
		}

		MobileOtpRequestDto postBody = prepareMobileOtpRequestDto(mobile, userType, otpType, isoCode);

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<Void> validateOtp(String mobile, UserType userType, String otp, OtpType otpType, String isoCode) {
		String path = UriComponentsBuilder.fromPath("/internal/otp/mobile/validate").toUriString();

		if (StringUtils.isBlank(mobile) || Objects.isNull(userType)) {
			throw new IllegalArgumentException("Please check all the provided params!!");
		}

		MobileOtpValidateRequestDto postBody = prepareMobileOtpValidationDto(mobile, userType, otp, otpType, isoCode);

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}


}
