package com.stanzaliving.core.version.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.leadership.dto.PropertyNamingDto;

public class LeadershipClientApi {

    private StanzaRestClient restClient;

    public LeadershipClientApi( StanzaRestClient stanzaRestClient){
        this.restClient=stanzaRestClient;
    }

    public ResponseDto<PropertyNamingDto> getPropertyName(Long estateId) {

       /* if (StringUtils.isBlank(token)) {
            throw new IllegalArgumentException("Token missing for getting all versions ");
        }*/

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("estateId", estateId);

        String path = UriComponentsBuilder.fromPath("/internal/get/name/{estateId}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<PropertyNamingDto>> returnType = new ParameterizedTypeReference<ResponseDto<PropertyNamingDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }
}
