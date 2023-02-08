package com.stanzaliving.acl.client.annotationProcessors;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.acl.client.AttributeDto;
import com.stanzaliving.acl.client.enums.EvaluationType;
import com.stanzaliving.acl.client.exception.ApiValidationException;
import com.stanzaliving.acl.client.Utils.AttributeValueProvider;
import com.stanzaliving.acl.client.dto.ConditionContextDto;
import com.stanzaliving.acl.client.Utils.SecurityConstants;
import com.stanzaliving.acl.client.annotation.CheckPermission;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Aspect
@Component
public class CheckPermissionProcessor {

    @Around("@annotation(com.stanzaliving.acl.client.annotation.CheckPermission)")
    public Object process(ProceedingJoinPoint joinPoint) throws Exception {
        MethodSignature methodSignature=(MethodSignature) joinPoint.getSignature();
        String[] permissions=methodSignature.getMethod().getAnnotation(CheckPermission.class).permissions();
        String resource=methodSignature.getMethod().getAnnotation(CheckPermission.class).resource();
        Class<? extends AttributeValueProvider> className=methodSignature.getMethod().getAnnotation(CheckPermission.class).attributeValueProvider();
        EvaluationType evaluationType=methodSignature.getMethod().getAnnotation(CheckPermission.class).evaluationType();

        AttributeValueProvider attributeValueProvider= null;
        HttpServletRequest request=null;
        try {
            attributeValueProvider = className.getConstructor().newInstance();
            request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        String token=extractTokenFromRequest(request);

        AttributeDto attributeDto=attributeValueProvider.fillAttributeValues(request);

        ObjectMapper objectMapper=new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        HashMap<String,Object> attributes= (HashMap<String, Object>) objectMapper.convertValue(attributeDto, Map.class);

        RestTemplate restTemplate = new RestTemplate();
        MultiValueMap<String,String> conditionHeaders=new LinkedMultiValueMap<>();
        conditionHeaders.put("Accept", Collections.singletonList(MediaType.ALL_VALUE));

        HttpEntity<ConditionContextDto> conditionRequest = new HttpEntity<>(
                new ConditionContextDto(resource, Arrays.asList(permissions),attributes,evaluationType,token),
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
            if(!conditionResponse.getBody()){
                throw new ApiValidationException("User doesn't have the relevant role or permissions");
            }
            return joinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
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
