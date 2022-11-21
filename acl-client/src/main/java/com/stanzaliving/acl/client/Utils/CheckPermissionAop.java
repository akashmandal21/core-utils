package com.stanzaliving.acl.client.Utils;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.acl.client.AttributeDto;
import com.stanzaliving.acl.client.Permissions;
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

import java.util.*;

@Aspect
@Component
public class CheckPermissionAop {

    @Around("@annotation(com.stanzaliving.acl.client.annotation.CheckPermission)")
    public Object pcp(ProceedingJoinPoint joinPoint) throws Exception {
        MethodSignature methodSignature=(MethodSignature) joinPoint.getSignature();
        Permissions[] permissions=methodSignature.getMethod().getAnnotation(CheckPermission.class).permissions();
        String resource=methodSignature.getMethod().getAnnotation(CheckPermission.class).resource();
        Class<? extends AttributeValueProvider> className=methodSignature.getMethod().getAnnotation(CheckPermission.class).attributeValueProvider();

        //get attribute value provider from abac resources.

        AttributeValueProvider attributeValueProvider= null;
        try {
            attributeValueProvider = className.getConstructor().newInstance();
        } catch (Exception e){
            e.printStackTrace();
        }

        String token=PermissionInterceptor.token;

        AttributeDto attributeDto=attributeValueProvider.fillAttributeValues(null);

        ObjectMapper objectMapper=new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        HashMap<String,Object> attributes= (HashMap<String, Object>) objectMapper.convertValue(attributeDto, Map.class);

        RestTemplate restTemplate = new RestTemplate();
        MultiValueMap<String,String> conditionHeaders=new LinkedMultiValueMap<>();
        conditionHeaders.put("Accept", Collections.singletonList(MediaType.ALL_VALUE));

        HttpEntity<ConditionContextDto> conditionRequest = new HttpEntity<>(
                new ConditionContextDto(resource, Arrays.asList(permissions),attributes,token),
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
            if(conditionResponse.getBody()){
                throw new ApiValidationException("User doesn't have the relevant role or permissions");
            }
            return joinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }

        return true;
    }
}
