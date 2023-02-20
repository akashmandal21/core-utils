package com.stanzaliving.acl.client.Utils;


import com.stanzaliving.acl.client.AbacResources;
import com.stanzaliving.acl.client.dto.ResourceDto;
import com.stanzaliving.acl.client.exception.ApiValidationException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@Component
public class AttributesAndPermissionsSynchronizer {

    @PostConstruct
    public void updateAttributesAndPermissions() {
        RestTemplate restTemplate = new RestTemplate();
        ResourceDto resourceDto=new ResourceDto();
        resourceDto.setResourceAttributeMap((HashMap<String, List<String>>) AbacResources.resourceAttributeMap);
        resourceDto.setResourcePermissionsMap((HashMap<String, List<String>>) AbacResources.resourcePermissionMap);
        HttpEntity<ResourceDto> request = new HttpEntity<>(resourceDto);
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.APPLICATION_JSON));
        messageConverters.add(converter);
        restTemplate.setMessageConverters(messageConverters);
        try {
            restTemplate.exchange("https://userv2.stanzaliving.com/userv2/internal/resource/AttributesAndPermisions", HttpMethod.POST, request, ResourceDto.class);
        }
        catch (Exception e){
            throw new ApiValidationException("Not able to push permissions and attributes");
        }
    }
}
