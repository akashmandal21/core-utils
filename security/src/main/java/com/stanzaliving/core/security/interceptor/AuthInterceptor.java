package com.stanzaliving.core.security.interceptor;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotNull;

import org.apache.log4j.Logger;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.util.Assert;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.exception.StanzaHttpException;
import com.stanzaliving.core.base.exception.StanzaSecurityException;
import com.stanzaliving.core.pojo.CurrentUser;
import com.stanzaliving.core.security.context.SecurityContextHolder;
import com.stanzaliving.core.security.validation.RequestValidator;

public class AuthInterceptor extends HandlerInterceptorAdapter {

	private static final Logger logger = Logger.getLogger(AuthInterceptor.class);

	private ObjectMapper objectMapper;
	private boolean corsSupport;
	private List<RequestValidator> validations;

	public AuthInterceptor(@NotNull ObjectMapper objectMapper) {
		this(objectMapper, new ArrayList<>());
	}

	public AuthInterceptor(@NotNull ObjectMapper objectMapper, @NotNull List<RequestValidator> validations) {
		Assert.notNull(validations, "validations can't be null");
		this.objectMapper = objectMapper;
		this.validations = validations;
	}

	public void setCorsSupport(boolean corsSupport) {
		this.corsSupport = corsSupport;
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {

		if (corsSupport && HttpMethod.OPTIONS.name().equals(request.getMethod())) {
			logger.debug("CORS request!");
			return true;
		}

		try {

			logger.debug("Authentication Started");

			CurrentUser user = null;

			for (RequestValidator validator : validations) {
				user = validator.validate(request, response, user);
			}

			SecurityContextHolder.setCurrentUser(user);
			return true;

		} catch (StanzaHttpException ex) {
			ResponseDto<Void> res = ResponseDto.failure("We are facing some internal issue, please try after sometime.");

			PrintWriter writer = response.getWriter();
			writer.print(objectMapper.writeValueAsString(res));

			response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
			response.setHeader("Content-Type", "application/json");
			response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
			writer.close();

		} catch (StanzaSecurityException ex) {
			returnError(request, response, ex);
		}

		return false;
	}

	private void returnError(HttpServletRequest request, HttpServletResponse response, StanzaSecurityException ex) throws IOException {
		String message = ex != null ? ex.getMessage() : "Token Is Invalid";

		ResponseDto<Void> res = ResponseDto.failure(message);

		if (ex != null) {
			response.setStatus(ex.getStatusCode());
		}

		response.setHeader("Content-Type", "application/json");
		response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));

		try (PrintWriter writer = response.getWriter()) {
			writer.print(objectMapper.writeValueAsString(res));
		}
	}

}