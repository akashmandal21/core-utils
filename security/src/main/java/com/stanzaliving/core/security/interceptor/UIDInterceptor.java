package com.stanzaliving.core.security.interceptor;

import com.stanzaliving.core.base.http.interceptor.BaseUIDInterceptor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpHeaders;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Log4j2
public class UIDInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
		log.info("Request URL {}",request.getRequestURI());
		log.info("Remote URL {}, remote method {} and origin {}",request.getHeader("X-Forwarded-For"),request.getMethod(),request.getHeader(HttpHeaders.ORIGIN));
		return new BaseUIDInterceptor().preHandle(request, response, handler);
	}

	public boolean postHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
		return new BaseUIDInterceptor().postHandle(request, response, handler);
	}

}
