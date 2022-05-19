package com.stanzaliving.core.phoenix.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.sfr.dto.ModuleEntityDto;
import com.stanzaliving.sfr.dto.ModuleSubmissionDto;
import com.stanzaliving.sfr.enumeration.ModuleNames;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.util.LinkedMultiValueMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2
public class PhoenixClientApi {

    private StanzaRestClient restClient;

    public PhoenixClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<ModuleEntityDto> getModuleEntity(String propertyUuid, ModuleNames moduleName) {

        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("propertyUuid", propertyUuid);
        uriVariables.put("moduleName", moduleName);

        String path = UriComponentsBuilder.fromPath("/module/{propertyUuid}/{moduleName}")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<ModuleEntityDto>> returnType = new ParameterizedTypeReference<ResponseDto<ModuleEntityDto>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }

    public ResponseDto<ModuleSubmissionDto> getModuleSubmissionDto(Long moduleSubmissionId, ModuleNames moduleName) {

        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("moduleSubmissionId", moduleSubmissionId);
        uriVariables.put("moduleName", moduleName);

        String path = UriComponentsBuilder.fromPath("/module/submission/details/{moduleSubmissionId}/{moduleName}")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<ModuleSubmissionDto>> returnType = new ParameterizedTypeReference<ResponseDto<ModuleSubmissionDto>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }

    public ResponseDto<String> submitModule(String propertyUuid, ModuleNames moduleName) {

        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("propertyUuid", propertyUuid);
        uriVariables.put("moduleName", moduleName);

        String path = UriComponentsBuilder.fromPath("/module/submit/{propertyUuid}/{moduleName}")
                .buildAndExpand(uriVariables).toUriString();

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


}
