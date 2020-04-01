package com.stanzaliving.core.task.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.taskservice.response.dto.TaskResponseDto;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TaskServiceClientApi {

    private StanzaRestClient restClient;

    public TaskServiceClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }
    
    public ResponseDto<TaskResponseDto> getPendingTaskByRole(String role) {

    	log.debug(" Fetch all pending tasks associated with role " + role);
    	
        if (Objects.isNull(role)) {
            return null;
        }

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("role", role);
        
        String path = UriComponentsBuilder.fromPath("/internal/task/get/{role}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();


        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<TaskResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<TaskResponseDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }
}
