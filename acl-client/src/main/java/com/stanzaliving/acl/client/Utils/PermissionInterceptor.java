package com.stanzaliving.acl.client.Utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.acl.client.AttributeDto;
import com.stanzaliving.acl.client.Permissions;
import com.stanzaliving.acl.client.annotation.Attribute;
import com.stanzaliving.acl.client.annotation.CheckPermission;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.*;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;


@Component
public class PermissionInterceptor implements HandlerInterceptor {
    public static String token;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        if(((HandlerMethod) handler).getMethod().getAnnotation(CheckPermission.class)!=null) {
            Permissions[] permissions = ((HandlerMethod) handler).getMethod().getAnnotation(CheckPermission.class).permissions();
            String resource = ((HandlerMethod) handler).getMethod().getAnnotation(CheckPermission.class).resource();
            Class<? extends AttributeValueProvider> className = ((HandlerMethod) handler).getMethod().getAnnotation(CheckPermission.class).attributeValueProvider();

            //get attribute value provider from abac resources.

            AttributeValueProvider attributeValueProvider = null;
            try {
                attributeValueProvider = className.getConstructor().newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }

            PermissionInterceptor.token = extractTokenFromRequest(request);

            AttributeDto attributeDto = attributeValueProvider.fillAttributeValues(request);

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

            HashMap<String, Object> attributes = (HashMap<String, Object>) objectMapper.convertValue(attributeDto, Map.class);

            RestTemplate restTemplate = new RestTemplate();
            MultiValueMap<String, String> conditionHeaders = new LinkedMultiValueMap<>();
            conditionHeaders.put("Accept", Collections.singletonList(MediaType.ALL_VALUE));

            HttpEntity<ConditionContextDto> conditionRequest = new HttpEntity<>(
                    new ConditionContextDto(resource, Arrays.asList(permissions), attributes, token),
                    conditionHeaders
            );

            List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
            MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
            converter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON));
            messageConverters.add(converter);
            restTemplate.setMessageConverters(messageConverters);
            try {
                ResponseEntity<Boolean> conditionResponse = restTemplate.exchange("https://dev.stanzaliving.com/userv2/internal/eval/permission",
                        HttpMethod.POST, conditionRequest, Boolean.class);
                if (!conditionResponse.getBody()) {
                    throw new ApiValidationException("User doesn't have the relevant role or permissions");
                }
                return conditionResponse.getBody();
            } catch (Exception e) {
            }

            return false;
        }
        return true;
    }

    private String extractTokenFromRequest(HttpServletRequest request) {
        String token = null;

        if (request.getCookies() != null) {
            for (Cookie cookie : request.getCookies()) {
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
        return token;
    }
}
