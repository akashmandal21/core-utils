package com.stanzaliving.core.security.interceptor;

import lombok.extern.log4j.Log4j2;
import org.apache.http.HttpHeaders;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Base64;
import java.util.Objects;

@Log4j2
public class ThirdPartyStanzaInterceptor extends HandlerInterceptorAdapter {

    @Value("${stanza.client.id:OdXk79uXMUJgpCMq6ApwjHbSSmRlEGBqHKyvuAEH}")
    private String clientId;

    @Value("${stanza.client.secret:GuEVdBrvqEizm0TDeK3MRokTaE11OS8rTF09PyF4}")
    private String clientSecret;

    private String encodedKey;

    public void init() {

        String key = "Authorization: Basic " + clientId + ":" + clientSecret;

        encodedKey = Base64.getEncoder().encodeToString(key.getBytes());

    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {

        String authHeader = request.getHeader(HttpHeaders.AUTHORIZATION);

        log.info("Getting authorization header: {}", authHeader);

        if (Objects.nonNull(authHeader) && encodedKey.equals(authHeader))
            return Boolean.TRUE;

        response.setStatus(HttpStatus.UNAUTHORIZED.value());

        return Boolean.FALSE;
    }

}
