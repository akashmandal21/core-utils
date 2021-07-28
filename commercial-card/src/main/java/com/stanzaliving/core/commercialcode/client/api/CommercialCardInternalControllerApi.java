package com.stanzaliving.core.commercialcode.client.api;

import com.stanzaliving.booking.dto.ExpiredBookingsDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.commercialcode.dto.CommercialCardResponseDto;
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
public class CommercialCardInternalControllerApi {
    private StanzaRestClient restClient;

    public CommercialCardInternalControllerApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }
    public ResponseDto<ExpiredBookingsDto> updateCommercialCardStatusWithActive() {

        log.info("Commercial-code-Data-Controller::Processing to retrieve commercial card that needs status ACTIVE updation ");

        Map<String, Object> uriVariables = new HashMap();

        String path = UriComponentsBuilder.fromPath("/internal/commercial/active").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();


        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<ExpiredBookingsDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<ExpiredBookingsDto>>() {};

        return this.restClient.invokeAPI(path, HttpMethod.GET
                , queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<ExpiredBookingsDto> updateCommercialCardStatusWithExpired() {

        log.info("Commercial-code-Data-Controller::Processing to retrieve commercial card that needs status EXPIRED updation ");

        Map<String, Object> uriVariables = new HashMap();

        String path = UriComponentsBuilder.fromPath("/internal/commercial/expire").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();


        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<ExpiredBookingsDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<ExpiredBookingsDto>>() {};

        return this.restClient.invokeAPI(path, HttpMethod.GET
                , queryParams, null, headerParams, accept, returnType);
    }
}
