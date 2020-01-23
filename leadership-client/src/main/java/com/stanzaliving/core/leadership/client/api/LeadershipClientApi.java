package com.stanzaliving.core.leadership.client.api;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.stanzaliving.core.leadership.dto.PropertyNamingDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;


import lombok.extern.log4j.Log4j2;

@Log4j2
public class LeadershipClientApi {


    private StanzaRestClient restClient;

    public LeadershipClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<PropertyNamingDto> getEstateAttributeByEstateUuid(String estateUuid) {
        return this.getPropertyNamingDtoByEstateUuid(estateUuid);
    }

    private ResponseDto<PropertyNamingDto> getPropertyNamingDtoByEstateUuid(String estateUuid) {

        if (Objects.isNull(estateUuid)) {
            return null;
        }

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("estateUuid", estateUuid);

        String path = UriComponentsBuilder.fromPath("/internal/property/getdetails/{estateUuid}").buildAndExpand(uriVariables).toUriString();

        log.info("Using Url Path:{}",path);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();


        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<PropertyNamingDto>> returnType = new ParameterizedTypeReference<ResponseDto<PropertyNamingDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

    }

}
