package com.stanzaliving.core.security.validation;

import java.util.Optional;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.constants.SecurityConstants;
import com.stanzaliving.core.base.exception.StanzaSecurityException;
import com.stanzaliving.core.base.utils.SecureCookieUtil;
import com.stanzaliving.core.pojo.CurrentUser;
import com.stanzaliving.core.security.service.AuthService;
import com.stanzaliving.core.user.dto.UserDto;

public class TokenAuthenticationValidator implements RequestValidator {

	private final Logger logger = Logger.getLogger(getClass());

	private AuthService authService;

	public TokenAuthenticationValidator(AuthService authService) {
		this.authService = authService;
	}

	@Override
	public CurrentUser validate(HttpServletRequest request, HttpServletResponse response, CurrentUser user) {

		String token = null;

		Cookie[] cookies = request.getCookies();

		if (StringUtils.isBlank(token) && cookies != null) {

			for (Cookie cookie : cookies) {

				if (SecurityConstants.TOKEN_HEADER_NAME.equals(cookie.getName())) {
					token = cookie.getValue();
					break;
				}
			}
		}

		logger.debug("Auth Requested For Token: " + token);

		if (StringUtils.isNotBlank(token)) {
			ResponseDto<UserDto> responseDto = authService.validateToken(token);

			if (responseDto.isStatus()) {

				UserDto dto = responseDto.getData();

				logger.debug("User Fetched after Authentication: " + dto);

				request.setAttribute("userId", dto.getUuid());

				String frontEnv = request.getHeader(SecurityConstants.FRONT_ENVIRONMENT);
				boolean isLocalFrontEnd = StringUtils.isNotBlank(frontEnv) && SecurityConstants.FRONT_ENVIRONMENT_LOCAL.equals(frontEnv);

				response.addCookie(SecureCookieUtil.create(SecurityConstants.TOKEN_HEADER_NAME, token, Optional.of(isLocalFrontEnd)));

				return CurrentUser.builder()
						.token(token)
						.userId(dto.getUuid())
						.mobile(dto.getMobile())
						.isoCode(dto.getIsoCode())
						.build();

			}
		}

		throw new StanzaSecurityException("Invalid token or User Session has expired", HttpStatus.UNAUTHORIZED.value());
	}

}