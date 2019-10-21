package com.stanzaliving.core.security.validation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.stanzaliving.core.pojo.CurrentUser;
import com.stanzaliving.core.security.service.AuthService;

public class UrlAuthorizationValidator implements RequestValidator {

	private static final Logger logger = Logger.getLogger(UrlAuthorizationValidator.class);

	private AuthService authService;

	public UrlAuthorizationValidator(AuthService authService) {
		this.authService = authService;
	}

	@Override
	public CurrentUser validate(HttpServletRequest request, HttpServletResponse response, CurrentUser user) {

		logger.debug("UrlAuthorizationValidator:: Validating ACL for User: " + user.getUserId());

		authService.validateUrlPermission(user.getUserId(), getValidationUri(request));

		return user;
	}

	private String getValidationUri(HttpServletRequest request) {

		String requestedUri = request.getHeader("uri");
		String accessUri = request.getRequestURI();

		logger.debug("UrlAuthorizationValidator:: [RequestedURI: " + requestedUri + ", AccessURI: " + accessUri + ", Referrer: " + request.getHeader("referer") + "]");

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