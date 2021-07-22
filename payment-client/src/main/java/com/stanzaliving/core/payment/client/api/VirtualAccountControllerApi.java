package com.stanzaliving.core.payment.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
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
public class VirtualAccountControllerApi {

    private StanzaRestClient restClient;

    public VirtualAccountControllerApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto getVirtualAccountDetails(String userId){

        log.info("Called api to fetch virtual account details");
        Object postBody=null;
        final Map<String,Object> uriVariables=new HashMap<>();
        uriVariables.put("userId",userId);
        String path= UriComponentsBuilder.fromPath("/virtualAccount/{userId}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams=new HttpHeaders();
        final String[] accepts = { "*/*" };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto> returnType = new ParameterizedTypeReference<ResponseDto>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept,
                    returnType);
        } catch (Exception e) {
            log.error("Exception while fetching virtual account details with userId",userId);
        }
        return null;
    }
}
