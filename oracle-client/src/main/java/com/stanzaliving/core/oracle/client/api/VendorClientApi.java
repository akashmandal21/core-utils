package com.stanzaliving.core.oracle.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.estate.enums.SOWStatus;
import com.stanzaliving.core.vendor.dtos.FilixIntegrationDto;
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

public class VendorClientApi {

    private StanzaRestClient restClient;

    public VendorClientApi(StanzaRestClient restClient) {
        this.restClient = restClient;
    }

    public ResponseDto<SOWStatus> sendVendorDetails(FilixIntegrationDto filixIntegrationDto) {

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/estate/{estateUuid}/sowstatus").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();


        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<SOWStatus>> returnType = new ParameterizedTypeReference<ResponseDto<SOWStatus>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, filixIntegrationDto, headerParams, accept, returnType);

    }
}
