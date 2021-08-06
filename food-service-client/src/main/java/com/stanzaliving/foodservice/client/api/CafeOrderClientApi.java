package com.stanzaliving.foodservice.client.api;

import java.util.Objects;

import org.springframework.http.MediaType;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.cafe.dto.CafeOrderDto;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class CafeOrderClientApi {

    private StanzaRestClient restClient;

    public CafeOrderClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public CafeOrderDto getOrderByVasOrderId(String orderId) {
    	
        ResponseDto<CafeOrderDto> responseDto = null;
        String path = UriComponentsBuilder.fromPath("/internal/cafe/order/{id}").buildAndExpand(orderId).toUriString();
        
        TypeReference<ResponseDto<CafeOrderDto>> returnType = new TypeReference<ResponseDto<CafeOrderDto>>() {};

        try {
        	responseDto = restClient.get(path, null, null, null, returnType, MediaType.APPLICATION_JSON);
        } catch (Exception e) {
            log.error("Error while fetching CafeOrder ByVasOrderId: {}", orderId, e);
        }

        return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : null;

    }
   	
}