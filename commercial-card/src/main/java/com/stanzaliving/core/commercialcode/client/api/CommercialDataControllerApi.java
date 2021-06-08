package com.stanzaliving.core.commercialcode.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.commercialcode.dto.CommercialCardDto;
import com.stanzaliving.core.commercialcode.dto.CommercialCardListDto;
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

    public ResponseDto<List<CommercialCardListDto>> getAllCommercialCards(CommercialCardDto commercialCardDto) {

        log.info("Commercial-code-Data-Controller::Processing to get residence list for filter {}", commercialCardDto);

        Object postBody = commercialCardDto;

        Map<String, Object> uriVariables = new HashMap();

        String path = UriComponentsBuilder.fromPath("/api/v1/commercial-codes").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<CommercialCardListDto>>> returnType =
                new ParameterizedTypeReference<ResponseDto<List<CommercialCardListDto>>>() {};

        return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

}
