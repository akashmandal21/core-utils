package com.stanzaliving.core.security.service.impl;

import org.springframework.http.HttpStatus;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.exception.StanzaHttpException;
import com.stanzaliving.core.base.exception.StanzaSecurityException;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.security.context.SecurityContextHolder;
import com.stanzaliving.core.security.service.AuthService;
import com.stanzaliving.core.user.client.api.AuthClientApi;
import com.stanzaliving.core.user.dto.UserProfileDto;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class AuthServiceImpl implements AuthService {

	private AuthClientApi authClientApi;

	public AuthServiceImpl(String basePath) {
		authClientApi = new AuthClientApi(new StanzaRestClient(basePath));
	}

	@Override
	public ResponseDto<UserProfileDto> getUserProfile() {
		return getUserByToken(SecurityContextHolder.getCurrentUser().getToken());
	}

	@Override
	public ResponseDto<UserProfileDto> validateToken(String token) {
		return getUserByToken(token);
	}

	private ResponseDto<UserProfileDto> getUserByToken(String token) {

		ResponseDto<UserProfileDto> responseDto = null;

		try {
			responseDto = authClientApi.getUserByToken(token);
		} catch (StanzaSecurityException
				| StanzaHttpException e) {
			throw e;
		} catch (Exception e) {
			log.error("Error getting user by token: ", e);
		}

		return responseDto;
	}

	@Override
	public void validateUrlPermission(String userId, String uri) {

		ResponseDto<Boolean> responseDto = checkUrlPermission(userId, uri);

		if (responseDto == null || !responseDto.getData()) {
			throw new StanzaSecurityException("You are not allowed to access this url", HttpStatus.FORBIDDEN.value());
		}

	}

	private ResponseDto<Boolean> checkUrlPermission(String userId, String url) {

		ResponseDto<Boolean> responseDto = null;

		try {
			responseDto = authClientApi.checkUrlPermission(userId, url);
		} catch (StanzaSecurityException
				| StanzaHttpException e) {
			throw e;
		} catch (Exception e) {
			log.error("Error checking user permission for url: ", e);
		}

		return responseDto;
	}
}