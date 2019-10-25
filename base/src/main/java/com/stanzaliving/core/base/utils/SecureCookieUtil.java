package com.stanzaliving.core.base.utils;

import java.util.Optional;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import com.stanzaliving.core.base.constants.SecurityConstants;

import lombok.experimental.UtilityClass;

@UtilityClass
public class SecureCookieUtil {

	public static Cookie create(String key, String value, Optional<Boolean> isLocalFrontEnd) {
		Cookie cookie = new Cookie(key, value);

		if (isLocalFrontEnd.isPresent() && isLocalFrontEnd.get()) {
			// Setting this externally because secure cookies are not accessible in local/Cross Site JavaScript
			cookie.setSecure(false);
			cookie.setHttpOnly(false);
		} else {
			cookie.setDomain(SecurityConstants.STANZA_DOMAIN);
			cookie.setSecure(true);
			cookie.setHttpOnly(true);
		}

		cookie.setPath("/");
		return cookie;
	}

	public static Cookie expire(Cookie cookie, boolean isLocalFrontEnd) {
		cookie.setMaxAge(0);
		cookie.setValue(null);
		cookie.setPath("/");

		if (!isLocalFrontEnd) {
			cookie.setDomain(SecurityConstants.STANZA_DOMAIN);
		}

		return cookie;
	}

	public static void handleLogOutResponse(HttpServletRequest request, HttpServletResponse response) {

		String frontEnv = request.getHeader(SecurityConstants.FRONT_ENVIRONMENT);
		boolean isLocalFrontEnd = StringUtils.isNotBlank(frontEnv) && SecurityConstants.FRONT_ENVIRONMENT_LOCAL.equals(frontEnv);

		Cookie[] cookies = request.getCookies();

		if (cookies != null) {
			for (Cookie cookie : cookies) {

				if (SecurityConstants.TOKEN_HEADER_NAME.equals(cookie.getName())) {
					response.addCookie(SecureCookieUtil.expire(cookie, isLocalFrontEnd));
				}
			}
		}
	}

}