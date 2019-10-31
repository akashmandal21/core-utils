package com.stanzaliving.core.security.validation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stanzaliving.core.pojo.CurrentUser;
import com.stanzaliving.core.security.service.AuthService;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class UrlAuthorizationValidator implements RequestValidator {

	private AuthService authService;

	public UrlAuthorizationValidator(AuthService authService) {
		this.authService = authService;
	}

	@Override
	public CurrentUser validate(HttpServletRequest request, HttpServletResponse response, CurrentUser user) {

		log.debug("UrlAuthorizationValidator:: Validating ACL for User: " + user.getUserId());

		authService.validateUrlPermission(user.getUserId(), getValidationUri(request));

		return user;
	}

	private String getValidationUri(HttpServletRequest request) {

		String requestedUri = request.getHeader("uri");
		String accessUri = request.getRequestURI();

		log.debug("UrlAuthorizationValidator:: [RequestedURI: " + requestedUri + ", AccessURI: " + accessUri + ", Referrer: " + request.getHeader("referer") + "]");

		if (requestedUri != null) {
			requestedUri = requestedUri.toLowerCase();
		}

		if (accessUri != null) {
			accessUri = accessUri.toLowerCase();
		}

		if (requestedUri == null) {
			return accessUri;

		}
		return requestedUri;
	}
}