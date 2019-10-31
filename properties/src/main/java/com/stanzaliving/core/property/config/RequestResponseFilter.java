package com.stanzaliving.core.property.config;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class RequestResponseFilter implements Filter {

	private static final String NON_HTTP_REQ_MSG = "Not available. Non-http request.";
	private static final String NON_HTTP_RES_MSG = "Not available. Non-http response.";

	/**
	 * The logger for this class.
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest hRequest = null;
		HttpServletResponse hResponse = null;

		if (request instanceof HttpServletRequest) {
			hRequest = (HttpServletRequest) request;
		}
		if (response instanceof HttpServletResponse) {
			hResponse = (HttpServletResponse) response;
		}

		LocalDateTime startTime = LocalDateTime.now();
		// Log pre-service information
		String str = this.join("START TIME : ", startTime.toString());

		if (hRequest == null) {
			str = this.join(str, "RequestURI : ", NON_HTTP_REQ_MSG);
			str = this.join(str, "AuthType : ", NON_HTTP_REQ_MSG);
		} else {
			str = this.join(str, "RequestURI : ", hRequest.getRequestURI());
			str = this.join(str, "AuthType : ", hRequest.getAuthType());
		}

		str = this.join(str, "CharacterEncoding : ", request.getCharacterEncoding());
		str = this.join(str, "ContentLength : ", Long.toString(request.getContentLengthLong()));
		str = this.join(str, "ContentType : ", request.getContentType());

		if (hRequest == null) {
			str = this.join(str, "ContextPath : ", NON_HTTP_REQ_MSG);
			str = this.join(str, "Cookie : ", NON_HTTP_REQ_MSG);
			str = this.join(str, "Header : ", NON_HTTP_REQ_MSG);
		} else {
			str = this.join(str, "ContextPath : ", hRequest.getContextPath());
			Cookie cookies[] = hRequest.getCookies();
			if (cookies != null) {
				for (int i = 0; i < cookies.length; i++) {
					str = this.join(str, "Cookie : ", cookies[i].getName() + "=" + cookies[i].getValue());
				}
			}
			Enumeration<String> hnames = hRequest.getHeaderNames();
			while (hnames.hasMoreElements()) {
				String hname = hnames.nextElement();
				Enumeration<String> hvalues = hRequest.getHeaders(hname);
				while (hvalues.hasMoreElements()) {
					String hvalue = hvalues.nextElement();
					str = this.join(str, "Header : ", hname + "=" + hvalue);
				}
			}
		}

		str = this.join(str, "Locale : ", request.getLocale().toString());

		if (hRequest == null) {
			str = this.join(str, "Method : ", NON_HTTP_REQ_MSG);
		} else {
			str = this.join(str, "Method : ", hRequest.getMethod());
		}

		Enumeration<String> pnames = request.getParameterNames();
		while (pnames.hasMoreElements()) {
			String pname = pnames.nextElement();
			String[] pvalues = request.getParameterValues(pname);
			StringBuilder result = new StringBuilder(pname);
			result.append('=');
			for (int i = 0; i < pvalues.length; i++) {
				if (i > 0) {
					result.append(", ");
				}
				result.append(pvalues[i]);
			}
			str = this.join(str, "Parameter : ", result.toString());
		}

		if (hRequest == null) {
			str = this.join(str, "PathInfo : ", NON_HTTP_REQ_MSG);
		} else {
			str = this.join(str, "PathInfo : ", hRequest.getPathInfo());
		}

		str = this.join(str, "Protocol : ", request.getProtocol());

		if (hRequest == null) {
			str = this.join(str, "QueryString : ", NON_HTTP_REQ_MSG);
		} else {
			str = this.join(str, "QueryString : ", hRequest.getQueryString());
		}

		str = this.join(str, "RemoteAddr : ", request.getRemoteAddr());
		str = this.join(str, "RemoteHost : ", request.getRemoteHost());

		if (hRequest == null) {
			str = this.join(str, "RemoteUser : ", NON_HTTP_REQ_MSG);
			str = this.join(str, "RequestedSessionId", NON_HTTP_REQ_MSG);
		} else {
			str = this.join(str, "RemoteUser : ", hRequest.getRemoteUser());
			str = this.join(str, "RequestedSessionId", hRequest.getRequestedSessionId());
		}

		str = this.join(str, "Scheme : ", request.getScheme());
		str = this.join(str, "ServerName : ", request.getServerName());
		str = this.join(str, "ServerPort : ", Integer.toString(request.getServerPort()));

		if (hRequest == null) {
			str = this.join(str, "ServletPath : ", NON_HTTP_REQ_MSG);
		} else {
			str = this.join(str, "ServletPath : ", hRequest.getServletPath());
		}

		str = this.join(str, "isSecure : ", Boolean.toString(request.isSecure()));

		// Perform the request
		chain.doFilter(request, response);

		// Log post-service information
		if (hRequest == null) {
			str = this.join(str, "AuthType : ", NON_HTTP_REQ_MSG);
		} else {
			str = this.join(str, "AuthType : ", hRequest.getAuthType());
		}

		str = this.join(str, "ContentType : ", response.getContentType());

		if (hResponse == null) {
			str = this.join(str, "Header : ", NON_HTTP_RES_MSG);
		} else {
			Iterable<String> rhnames = hResponse.getHeaderNames();
			for (String rhname : rhnames) {
				Iterable<String> rhvalues = hResponse.getHeaders(rhname);
				for (String rhvalue : rhvalues) {
					str = this.join(str, "Header : ", rhname + "=" + rhvalue);
				}
			}
		}

		if (hRequest == null) {
			str = this.join(str, "RemoteUser : ", NON_HTTP_REQ_MSG);
		} else {
			str = this.join(str, "RemoteUser : ", hRequest.getRemoteUser());
		}

		if (hResponse == null) {
			str = this.join(str, "Status : ", NON_HTTP_RES_MSG);
		} else {
			str = this.join(str, "Status : ", Integer.toString(hResponse.getStatus()));
		}

		LocalDateTime endTime = LocalDateTime.now();

		long millies = ChronoUnit.MILLIS.between(startTime, endTime);
		str = this.join(str, "END TIME:", endTime.toString());
		str = this.join(str, "total time : ", "" + millies);
		log.info(str);
	}

	private String join(String... strings) {
		return String.join("", strings) + " | ";
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// NOOP
	}

	@Override
	public void destroy() {
		// NOOP
	}
}