package com.stanzaliving.core.legal.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.stanzaliving.core.pojo.AttachmentDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;

public class LegalClientApi {

    private StanzaRestClient restClient;

    public LegalClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<Boolean> checkAllAtlApproved(String estateUuid) {

        if (Objects.isNull(estateUuid)) {
            return null;
        }

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("estateUuid", estateUuid);
        
        String path = UriComponentsBuilder.fromPath("/internal/atlDetails/{estateUuid}/checkAllAtlApproved").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();


        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }

    public ResponseDto<String> getSOWATL(String estateUuid,String propertyUuid) {

        if (Objects.isNull(estateUuid) || Objects.isNull(propertyUuid)) {
            return null;
        }

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("estateUuid", estateUuid);
        uriVariables.put("propertyUuid",propertyUuid);

        String path = UriComponentsBuilder.fromPath("/internal/atlDetails/{estateUuid}/{propertyUuid}/getSOWDetails").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();


        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }

    public ResponseDto<AttachmentDto> getSOWATLAttachment(String estateUuid) {

        if (Objects.isNull(estateUuid)) {
            return null;
        }

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("estateUuid", estateUuid);

        String path = UriComponentsBuilder.fromPath("/internal/atlDetails/{estateUuid}/getSOWDetailsAttachment").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();


        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<AttachmentDto>> returnType = new ParameterizedTypeReference<ResponseDto<AttachmentDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }


    public ResponseDto<Boolean> checkAllDealTermApproved(String estateUuid) {

        if (Objects.isNull(estateUuid)) {
            return null;
        }

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("estateUuid", estateUuid);
        
        String path = UriComponentsBuilder.fromPath("/internal/dealterms/{estateUuid}/checkAllDealTermApproved").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();


        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }

}
