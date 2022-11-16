package com.stanzaliving.supportclient.controller;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.constants.SecurityConstants;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.supportclient.dto.AuditTicketRequestDto;
import com.stanzaliving.supportclient.dto.TicketResponseDto;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

public class SupportDataControllerApi {
    private static final Logger log = LogManager.getLogger(SupportDataControllerApi.class);
    private StanzaRestClient restClient;

    public SupportDataControllerApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }


    public ResponseDto<TicketResponseDto> createTicketOnSupport(String token, AuditTicketRequestDto auditTicketRequestDto) {
        if (StringUtils.isBlank(token)) {
            throw new IllegalArgumentException("Token missing for retrieving room details based on roomUUID");
        }

        Object postBody = auditTicketRequestDto;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/api/v1/ticket").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        String tokenCookie = SecurityConstants.TOKEN_HEADER_NAME + "=" + token;

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.COOKIE_HEADER_NAME, tokenCookie);

        final String[] accepts = {
                "*/*"
        };
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<TicketResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<TicketResponseDto>>() {
        };

        try {
            log.info("Executing support api to create internal ticket");
            return (ResponseDto) this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception var11) {
            log.info("Exception e {},", var11);
            return null;
        }
    }
}
