package com.stanzaliving.core.phoenix.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.constants.SecurityConstants;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.sfr.dto.ModuleEntityDto;
import com.stanzaliving.sfr.dto.ModuleSubmissionDto;
import com.stanzaliving.sfr.enumeration.ModuleNames;
import com.stanzaliving.sfr.enumeration.ModuleState;
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

    public ResponseDto<ModuleEntityDto> getModuleEntity(String propertyUuid, ModuleNames moduleName, String token) {

        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("propertyUuid", propertyUuid);
        uriVariables.put("moduleName", moduleName);

        String path = UriComponentsBuilder.fromPath("/module/{propertyUuid}/{moduleName}")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();
        headerParams.add(SecurityConstants.COOKIE_HEADER_NAME, token);

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<ModuleEntityDto>> returnType = new ParameterizedTypeReference<ResponseDto<ModuleEntityDto>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }

    public ResponseDto<ModuleSubmissionDto> getModuleSubmissionDto(Long moduleSubmissionId, ModuleNames moduleName,
                                                                   String token) {

        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("moduleSubmissionId", moduleSubmissionId);
        uriVariables.put("moduleName", moduleName);

        String path = UriComponentsBuilder.fromPath("/module/submission/details/{moduleSubmissionId}/{moduleName}")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();
        headerParams.add(SecurityConstants.COOKIE_HEADER_NAME, token);

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<ModuleSubmissionDto>> returnType = new ParameterizedTypeReference<ResponseDto<ModuleSubmissionDto>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }

    public ResponseDto<ModuleState> getModuleStatus(Long moduleSubmissionId, ModuleNames moduleName,
                                                            String token) {

        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("moduleSubmissionId", moduleSubmissionId);
        uriVariables.put("moduleName", moduleName);

        String path = UriComponentsBuilder.fromPath("/module/status/{moduleSubmissionId}/{moduleName}")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();
        headerParams.add(SecurityConstants.COOKIE_HEADER_NAME, token);

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<ModuleState>> returnType =
                new ParameterizedTypeReference<ResponseDto<ModuleState>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }

    public Boolean getIsPartialAllowed(Long moduleSubmissionId) {

        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("moduleSubmissionId", moduleSubmissionId);
//        uriVariables.put("moduleName", moduleName);

        String path = UriComponentsBuilder.fromPath("/internal/module/get/hoto/allowed/{moduleSubmissionId}")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();
//        headerParams.add(SecurityConstants.COOKIE_HEADER_NAME, token);

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<Boolean> returnType =
                new ParameterizedTypeReference<Boolean>() {
                };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }

    public ResponseDto<Map<String, Long>> getBedAndRoomCountRemaining(String propertyId){

        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("propertyId", propertyId);
//        uriVariables.put("moduleName", moduleName);

        String path = UriComponentsBuilder.fromPath("/internal/hoto/remaining/count/{propertyId}")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();
//        headerParams.add(SecurityConstants.COOKIE_HEADER_NAME, token);

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Map<String, Long>>> returnType =
                new ParameterizedTypeReference<ResponseDto<Map<String, Long>>>() {
                };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }

    public ResponseDto<String> submitModule(String propertyUuid, ModuleNames moduleName, String token) {

        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("propertyUuid", propertyUuid);
        uriVariables.put("moduleName", moduleName);

        String path = UriComponentsBuilder.fromPath("/asis/submit/{propertyUuid}/{moduleName}")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();
        headerParams.add(SecurityConstants.COOKIE_HEADER_NAME, token);

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

    }


    public ResponseDto<String> invalidateCache(Long moduleId, String variableName, List<String> updatedCount) {

        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("moduleId", moduleId);
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.add("variableName", variableName);
        queryParams.put("updatedCount", updatedCount);

        String path = UriComponentsBuilder.fromPath("/internal/module/update/cache/{moduleId}")
                .buildAndExpand(uriVariables).toUriString();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

    }


}
