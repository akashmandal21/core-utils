package com.stanzaliving.core.estate.client.api;

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
import com.stanzaliving.designservice.enums.DesignStatus;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class DesignServiceClient {

    private StanzaRestClient restClient;

    public DesignServiceClient(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }
    
    public ResponseDto<DesignStatus> getDesignStatusByEstateUuid(String estateUuid) {

    	log.debug(" Get design status for estateUuid " + estateUuid);
    	
        if (Objects.isNull(estateUuid)) {
            return null;
        }

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("estateUuid", estateUuid);
        
        String path = UriComponentsBuilder.fromPath("/internal/get/designstatus/{estateUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();


        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<DesignStatus>> returnType = new ParameterizedTypeReference<ResponseDto<DesignStatus>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }
}
