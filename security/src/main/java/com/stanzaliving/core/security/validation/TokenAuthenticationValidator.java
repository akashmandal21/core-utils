package com.stanzaliving.core.security.validation;

import java.util.Objects;
import java.util.Optional;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stanzaliving.core.base.StanzaConstants;
import org.apache.commons.lang3.StringUtils;
import org.jboss.logging.MDC;
import org.springframework.http.HttpStatus;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.constants.SecurityConstants;
import com.stanzaliving.core.base.exception.StanzaSecurityException;
import com.stanzaliving.core.base.utils.SecureCookieUtil;
import com.stanzaliving.core.pojo.CurrentUser;
import com.stanzaliving.core.security.service.AuthService;
import com.stanzaliving.core.user.dto.UserProfileDto;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TokenAuthenticationValidator implements RequestValidator {

	private AuthService authService;

	public TokenAuthenticationValidator(AuthService authService) {
		this.authService = authService;
	}

	@Override
	public CurrentUser validate(HttpServletRequest request, HttpServletResponse response, CurrentUser user) {

		String token = null;

		Cookie[] cookies = request.getCookies();
		String domainName = request.getHeader("origin");
		if(StringUtils.isNotBlank(domainName)) {
			if(domainName.trim().contains("://"))
				domainName = domainName.substring(domainName.indexOf("://") + 3);
		}
		log.info("domainName {}", domainName);

		if (cookies != null) {

			for (Cookie cookie : cookies) {

				if (SecurityConstants.TOKEN_HEADER_NAME.equals(cookie.getName())) {
					token = cookie.getValue();
					break;
				}
			}
		}
		if (token == null) {
			token = request.getHeader(SecurityConstants.AUTHORIZATION_HEADER);
			if (token != null && token.startsWith(SecurityConstants.VENTA_TOKEN_PREFIX)) {		//only if it follows bearer schema, then we would consider valid token
				token = token.replace(SecurityConstants.VENTA_TOKEN_PREFIX, "");
			} else {
				token = null;
			}
		}

		log.info("Auth Requested For Token: {}", token);

		if (StringUtils.isNotBlank(token)) {
			ResponseDto<UserProfileDto> responseDto = authService.validateToken(token);

			if (Objects.nonNull(responseDto) && responseDto.isStatus()) {

				UserProfileDto dto = responseDto.getData();
				MDC.put(StanzaConstants.REQ_UID, dto.getUuid());
				MDC.put(StanzaConstants.REQ_MOBILE, dto.getMobile());
				log.debug("User Fetched after Authentication: {}", dto.getUuid());

				request.setAttribute("userId", dto.getUuid());

				String frontEnv = request.getHeader(SecurityConstants.FRONT_ENVIRONMENT);
				boolean isLocalFrontEnd = StringUtils.isNotBlank(frontEnv) && SecurityConstants.FRONT_ENVIRONMENT_LOCAL.equals(frontEnv);

				String appEnv = request.getHeader(SecurityConstants.APP_ENVIRONMENT);
				boolean isApp = StringUtils.isNotBlank(appEnv) && SecurityConstants.APP_ENVIRONMENT_TRUE.equals(appEnv);

//				response.addCookie(SecureCookieUtil.create(SecurityConstants.TOKEN_HEADER_NAME, token, Optional.of(isLocalFrontEnd), Optional.of(isApp), domainName));

				return CurrentUser.builder()
						.token(token)
						.userId(dto.getUuid())
						.mobile(dto.getMobile())
						.isoCode(dto.getIsoCode())
						.userType(dto.getUserType())
						.firstName(dto.getFirstName())
						.lastName(dto.getLastName())
						.email(dto.getEmail())
						.userUuid(dto.getUuid())
						.department(dto.getDepartment())
						.build();

			}
		}

		throw new StanzaSecurityException("Invalid token or User Session has expired", HttpStatus.UNAUTHORIZED.value());
	}

}