package com.stanzaliving.core.qna.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.sfr.dto.propertyOnboarding.PropertyMigrationDto;
import com.stanzaliving.sfr.enumeration.ModuleNames;
import lombok.extern.log4j.Log4j2;
import org.apache.kafka.common.utils.SecurityUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.security.Security;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2
public class QnaClientApi {

    private StanzaRestClient restClient;

    public QnaClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<String> getQuestionTemplateIdForModule(ModuleNames moduleName){

        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("moduleName", moduleName);

        String path = UriComponentsBuilder.fromPath("/internal/api/v1/question-template/module/{moduleName}")
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

    public ResponseDto<List<String>> getImageUrlsForModuleSubmission(Long moduleSubmissionId, String variableName){

        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("moduleSubmissionId", moduleSubmissionId);

        String path = UriComponentsBuilder.fromPath("/internal/api/v1/answer/get-image-urls/{moduleSubmissionId}")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("variableName", variableName);

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<String>>> returnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }

    public ResponseDto<String> migrateAnswers(PropertyMigrationDto propertyMigrationDto,String token){

        Object postBody = propertyMigrationDto;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/save/answer")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();
        headerParams.add("cookie",token);

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

    }


}
