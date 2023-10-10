package com.stanzaliving.core.generic.po.client;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.generictaskservice.dto.response.GenericTaskResponseDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2
public class GenericTaskControllerApi {

    private StanzaRestClient restClient;

    public GenericTaskControllerApi(StanzaRestClient restClient) {
        this.restClient = restClient;
    }

    public ResponseDto <GenericTaskResponseDto> getTasks(String uuid) {

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("taskId",uuid);

        String path = UriComponentsBuilder.fromPath("/task/{taskId}").buildAndExpand(uriVariables).toUriString();
        log.info("Path: {}",path);
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto  <GenericTaskResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto <GenericTaskResponseDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }
}
