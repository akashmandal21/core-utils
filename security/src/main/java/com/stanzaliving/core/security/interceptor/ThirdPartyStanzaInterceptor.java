package com.stanzaliving.core.security.interceptor;

import com.stanzaliving.core.security.constants.HeaderConstant;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Objects;

@Log4j2
public class ThirdPartyStanzaInterceptor extends HandlerInterceptorAdapter {

    @Value("${stanza.client.id:client_id}")
    private String clientId;

    @Value("${stanza.client.secret:client_secret}")
    private String clientSecret;

    @Value("${stanza.admin.email:admin_email}")
    private String adminEmail;

    private String encodedKey;

    public void init() {

        String key = "Authorization: Basic " + clientId + ":" + clientSecret;

        encodedKey = Base64.getEncoder().encodeToString(key.getBytes());

    }

    /*@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {

        String authHeader = request.getHeader(HttpHeaders.AUTHORIZATION);

        log.info("Getting authorization header: {}", authHeader);

        if (Objects.nonNull(authHeader) && encodedKey.equals(authHeader))
            return Boolean.TRUE;

        response.setStatus(HttpStatus.UNAUTHORIZED.value());

        return Boolean.FALSE;
    }*/

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {

        String timestamp = request.getHeader(HeaderConstant.TIMESTAMP);

        String hash = request.getHeader(HeaderConstant.HASH);

        log.info("Getting timestamp:{}, hash:{}", timestamp, hash);

        String valueForHash = adminEmail + clientSecret + timestamp;

        try {

            MessageDigest md = MessageDigest.getInstance("SHA-512");

            byte[] messageDigest = md.digest(valueForHash.getBytes());

            BigInteger no = new BigInteger(1, messageDigest);

            String hashtext = no.toString(16);

            while (hashtext.length() < 32)
                hashtext = "0" + hashtext;

            log.info("Generated authorization header: {}", hashtext);

            if (Objects.nonNull(hashtext) && hashtext.toLowerCase().equals(hash))
                return Boolean.TRUE;

        } catch (Exception e) {
            log.error("Getting exception while authorization", e);
        }

        response.setStatus(HttpStatus.UNAUTHORIZED.value());

        return Boolean.FALSE;
    }

}
