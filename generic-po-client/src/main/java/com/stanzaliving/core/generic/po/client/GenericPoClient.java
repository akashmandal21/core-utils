package com.stanzaliving.core.generic.po.client;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.po.generic.dtos.PoTimelineDto;
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
public class GenericPoClient {

    private StanzaRestClient restClient;

    public GenericPoClient(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<Boolean> addPoTimeline(PoTimelineDto timelineDto) {

        final Map<String, Object> uriVariables = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        String path = UriComponentsBuilder.fromPath("/migrate/timeline").buildAndExpand(uriVariables).toUriString();

        ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, timelineDto, headerParams, accept, returnType);
    }

    public ResponseDto<List<String>> getPoUuidsWhereGsriAfterDate(Boolean isPo, String date) {

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("isPo", isPo);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.set("date", date);

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        String path = UriComponentsBuilder.fromPath("/internal/get/poUuid/gsri/after/date/{isPo}").buildAndExpand(uriVariables).toUriString();

        ParameterizedTypeReference<ResponseDto<List<String>>> returnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<String> getFileUrl(String serviceOwner, String filePath) {

        final Map<String, Object> uriVariables = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.set("serviceOwner", serviceOwner);
        queryParams.set("filePath", filePath);

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        String path = UriComponentsBuilder.fromPath("/internal/get/fileUrl").buildAndExpand(uriVariables).toUriString();

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }

}
