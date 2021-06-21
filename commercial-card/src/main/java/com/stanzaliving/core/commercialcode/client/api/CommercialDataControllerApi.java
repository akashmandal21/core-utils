package com.stanzaliving.core.commercialcode.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.commercialcode.dto.*;
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
public class CommercialDataControllerApi {

    private StanzaRestClient restClient;

    public CommercialDataControllerApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<CommercialCardListDto> getAllCommercialCards(String token, CommercialCardDto commercialCardDto) {

        log.info("Commercial-code-Data-Controller::Processing to get residence list for filter {}", commercialCardDto);

        Object postBody = commercialCardDto;

        Map<String, Object> uriVariables = new HashMap();

        String path = UriComponentsBuilder.fromPath("/api/v1/commercial-codes").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        headerParams.add("Cookie", "token=" + token);

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<CommercialCardListDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<CommercialCardListDto>>() {};

        return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<CommercialCardUsageDto> updateCommercialCardUsage(String token, CommercialCardBookingDto commercialCardBookingDto) {

        log.info("Commercial-code-Data-Controller::Processing to update commercial card usage", commercialCardBookingDto);

        Object postBody = commercialCardBookingDto;

        Map<String, Object> uriVariables = new HashMap();

        String path = UriComponentsBuilder.fromPath("/api/v1/commercial-card/usage").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        headerParams.add("Cookie", "token=" + token);

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<CommercialCardUsageDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<CommercialCardUsageDto>>() {};

        return this.restClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, accept, returnType);
    }


    public ResponseDto<CommercialCardUsageDto> restoreCommercialCardUsage(String token, CommercialCardBookingDto commercialCardBookingDto) {

        log.info("Commercial-code-Data-Controller::Processing to restore commercial card usage", commercialCardBookingDto);

        Object postBody = commercialCardBookingDto;

        Map<String, Object> uriVariables = new HashMap();

        String path = UriComponentsBuilder.fromPath("/api/v1/commercial-card/restore").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        headerParams.add("Cookie", "token=" + token);

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<CommercialCardUsageDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<CommercialCardUsageDto>>() {};

        return this.restClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<CommercialCardResponseDto> getCardByUuid(String token, String commercialCardUuid) {

        log.info("Commercial-code-Data-Controller::Processing to retrieve commercial card information {}", commercialCardUuid);

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("uuid", commercialCardUuid);

        String path = UriComponentsBuilder.fromPath("/api/v1/commercial-card/{uuid}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        headerParams.add("Cookie", "token=" + token);

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<CommercialCardResponseDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<CommercialCardResponseDto>>() {};

        return this.restClient.invokeAPI(path, HttpMethod.GET
                , queryParams, null, headerParams, accept, returnType);
    }

}
