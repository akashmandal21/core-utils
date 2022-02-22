package com.stanzaliving.core.security.interceptor;

import com.stanzaliving.core.security.annotation.RequestLogging;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpHeaders;
import org.springframework.lang.Nullable;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Log4j2
public class RequestLoggingInterceptor implements HandlerInterceptor {

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {

        if(((HandlerMethod)handler).getMethod().isAnnotationPresent(RequestLogging.class)) {
            log.info("Request Attributes : Remote IP : {} , Method : {}, Origin : {} ",request.getHeader("X-Forwarded-For"),request.getMethod(),request.getHeader(HttpHeaders.ORIGIN));
        }

    }


}
