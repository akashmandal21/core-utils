package com.stanzaliving.core;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.ruleEngine.dto.SalesCommandResidenceViewDto;
import com.stanzaliving.ruleEngine.dto.SalesCommandResidenceViewReqDto;
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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RuleEngineDataControllerApi {
    private static final Logger log = LogManager.getLogger(RuleEngineDataControllerApi.class);
    private StanzaRestClient restClient;

    public RuleEngineDataControllerApi(StanzaRestClient stanzaRestClient){
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<SalesCommandResidenceViewDto> fetchSalesCommandCenterForResidence(SalesCommandResidenceViewReqDto salesCommandResidenceViewReqDto){
        log.info("RuleEngine-Data-Controller::Processing to get sales command center based on request {}", salesCommandResidenceViewReqDto);

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/rule/sales-command/fetch-residence-view").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<SalesCommandResidenceViewDto>> returnType = new ParameterizedTypeReference<ResponseDto<SalesCommandResidenceViewDto>>() {
        };

        try {
            return (ResponseDto<SalesCommandResidenceViewDto>) this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, salesCommandResidenceViewReqDto, headerParams, accept, returnType);
        } catch (Exception var13) {
            log.error("Exception while fetching sales command center for request {}", salesCommandResidenceViewReqDto);
            return null;
        }
    }
}