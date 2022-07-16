package com.stanzaliving.core.user.client.api;

import java.util.List;
import java.util.Objects;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.base.utils.ObjectMapperUtil;
import com.stanzaliving.core.user.enums.OtpType;
import com.stanzaliving.core.user.enums.UserType;
import com.stanzaliving.core.user.request.dto.MobileEmailOtpRequestDto;
import com.stanzaliving.core.user.request.dto.MobileOtpRequestDto;
import com.stanzaliving.core.user.request.dto.MobileOtpValidateRequestDto;

import lombok.extern.log4j.Log4j2;

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
	
	public ResponseDto<Void> resendOtpV2(String mobile, UserType userType, OtpType otpType, String isoCode) {
		String path = UriComponentsBuilder.fromPath("/internal/otp/mobile/resent/v2").toUriString();

		return sendOtpRequest(mobile, userType, path, otpType, isoCode);
	}

	private ResponseDto<Void> sendOtpRequest(String mobile, UserType userType, String path, OtpType otpType, String isoCode) {

		if (StringUtils.isBlank(mobile) || Objects.isNull(userType)) {
			throw new IllegalArgumentException("Please check all the provided params!!");
		}

		MobileOtpRequestDto postBody = prepareMobileOtpRequestDto(mobile.trim(), userType, otpType, isoCode);

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<Void> validateOtp(String mobile, UserType userType, String otp, OtpType otpType, String isoCode) {
		String path = UriComponentsBuilder.fromPath("/internal/otp/mobile/validate").toUriString();

		if (StringUtils.isBlank(mobile) || Objects.isNull(userType) || StringUtils.isBlank(otp)) {
			throw new IllegalArgumentException("Please check all the provided params!!");
		}

		MobileOtpValidateRequestDto postBody = prepareMobileOtpValidationDto(mobile.trim(), userType, otp.trim(), otpType, isoCode);

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
		};
		
		log.info("Otp verify request body: {}", ObjectMapperUtil.getString(postBody));

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<Void> sendOtpRequest(String mobile, UserType userType, OtpType otpType, String isoCode, String email) {

		if (StringUtils.isBlank(email)) {
			return sendOtpRequest(mobile, userType, otpType, isoCode);
		}

		try {
			return sendOtpOnMobileAndEmail(mobile, userType, otpType, isoCode, email);
		} catch (Exception e) {
			log.error("Exception while sending otp on mobile and email", e);
			return sendOtpRequest(mobile, userType, otpType, isoCode);
		}
	}

	private ResponseDto<Void> sendOtpOnMobileAndEmail(String mobile, UserType userType, OtpType otpType, String isoCode, String email) {

		String path = UriComponentsBuilder.fromPath("/internal/otp/request").toUriString();

		if (StringUtils.isBlank(mobile) || StringUtils.isBlank(email) || Objects.isNull(userType)) {
			throw new IllegalArgumentException("Please check all the provided params!!");
		}

		MobileEmailOtpRequestDto postBody =
				MobileEmailOtpRequestDto.builder()
						.mobile(mobile.trim())
						.isoCode(isoCode)
						.email(email.trim())
						.userType(userType)
						.otpType(otpType)
						.build();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

}