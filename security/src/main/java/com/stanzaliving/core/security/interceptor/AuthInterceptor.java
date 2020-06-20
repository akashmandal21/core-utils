package com.stanzaliving.core.security.interceptor;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotNull;

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.util.Assert;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.exception.StanzaHttpException;
import com.stanzaliving.core.base.exception.StanzaSecurityException;
import com.stanzaliving.core.pojo.CurrentUser;
import com.stanzaliving.core.security.context.SecurityContextHolder;
import com.stanzaliving.core.security.validation.RequestValidator;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class AuthInterceptor extends HandlerInterceptorAdapter {

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
			log.debug("CORS request!");
			return true;
		}

		try {

			log.debug("Authentication Started");

			CurrentUser user = null;

			for (RequestValidator validator : validations) {
				user = validator.validate(request, response, user);
			}

			if (Objects.nonNull(user)) {
				SecurityContextHolder.setCurrentUser(user);
			}

			return true;

		} catch (StanzaHttpException ex) {
			log.error("Found StanzaHttpException: {}", (ex.getMessage() != null ? ex.getMessage() : ""));
			ResponseDto<Void> res = ResponseDto.failure("We are facing some internal issue, please try after sometime.");

			if (ex.getStatusCode() > 0) {
				response.setStatus(ex.getStatusCode());
				res.setMessage(ex.getMessage());
			} else {
				response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
			}

			setResponse(request, response, res);

		} catch (StanzaSecurityException ex) {
			log.error("Found StanzaSecurityException: {}", (ex != null ? ex.getMessage() : ""));
			returnError(request, response, ex);
		}

		return false;
	}

	private void returnError(HttpServletRequest request, HttpServletResponse response, StanzaSecurityException ex) throws IOException {

		String message = ex != null ? ex.getMessage() : "Token Is Invalid";

		ResponseDto<Void> res = ResponseDto.failure(message);

		if (ex != null) {
			response.setStatus(ex.getStatusCode());
		} else {
			response.setStatus(HttpStatus.UNAUTHORIZED.value());
		}

		setResponse(request, response, res);
	}

	private void setResponse(HttpServletRequest request, HttpServletResponse response, ResponseDto<Void> res) throws JsonProcessingException, IOException {
		response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		response.setHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE);

		try (PrintWriter writer = response.getWriter()) {
			writer.print(objectMapper.writeValueAsString(res));
		}
	}

}