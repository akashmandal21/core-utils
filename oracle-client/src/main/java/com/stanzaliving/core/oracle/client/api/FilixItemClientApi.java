package com.stanzaliving.core.oracle.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.estate.enums.SOWStatus;
import com.stanzaliving.core.filix.FilixIntegrationDto;
import com.stanzaliving.core.filix.ItemFilixIntegrationDto;
import org.springframework.beans.factory.annotation.Value;
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

/**
 * @author dhruv.mathur
 * @date 01/04/21
 */
public class FilixItemClientApi {
    @Value("${service.filix.oracle.url}")
    private String filixUrl;

    private StanzaRestClient restClient;

    public FilixItemClientApi(StanzaRestClient restClient) {
        this.restClient = restClient;
    }

    public ResponseDto<SOWStatus> sendItemDetails(ItemFilixIntegrationDto itemFilixIntegrationDto) {

        String service =  "";

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath(filixUrl+service).buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();


        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<SOWStatus>> returnType = new ParameterizedTypeReference<ResponseDto<SOWStatus>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, itemFilixIntegrationDto, headerParams, accept, returnType);

    }
}
