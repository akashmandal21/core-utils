package com.stanzaliving.core.security.interceptor;

import com.stanzaliving.core.base.StanzaConstants;
import lombok.extern.log4j.Log4j2;
import org.slf4j.MDC;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.UUID;

@Log4j2
public class UIDInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {

		String guid = UUID.randomUUID().toString().replace("-", ""); // globally unique identifier
		String luid = UUID.randomUUID().toString().replace("-", ""); // locally unique identifier

		guid = (null != request.getHeader(StanzaConstants.GUID)) ? request.getHeader(StanzaConstants.GUID) : guid;

        MDC.put(StanzaConstants.GUID, guid);
        MDC.put(StanzaConstants.LUID, luid);
		MDC.put(StanzaConstants.GUID, guid);
		MDC.put(StanzaConstants.LUID, luid);
		MDC.put(StanzaConstants.REQUEST_PATH, request.getRequestURI());
		MDC.put(StanzaConstants.QUERY_STRING, request.getQueryString());

		log.info("RequestReceived URI {} QueryString {} AppVersion {}", request.getRequestURI(), request.getQueryString(), request.getHeader("appversion"));
		
		Enumeration<String> headers = request.getHeaderNames();
		
		while (headers.hasMoreElements()) {
			
			String headerName = (String) headers.nextElement();
			
			log.info("header {} value is {}",request.getHeader(headerName));
			
		}
		
		request.setAttribute(StanzaConstants.GUID, guid);
		request.setAttribute(StanzaConstants.LUID, luid);

		return true;
	}

	public boolean postHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {

		log.info("ResponseSent Code " + response.getStatus());

		MDC.remove(StanzaConstants.GUID);
		MDC.remove(StanzaConstants.LUID);
		MDC.remove(StanzaConstants.REQUEST_PATH);
		MDC.remove(StanzaConstants.QUERY_STRING);

		return true;
	}

}