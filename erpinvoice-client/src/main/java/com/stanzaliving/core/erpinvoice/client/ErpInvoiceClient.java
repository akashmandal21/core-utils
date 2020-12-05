package com.stanzaliving.core.erpinvoice.client;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.invoice.dto.ErpInvoiceUpdateDto;
import com.stanzaliving.grn.GrnQuantity;
import com.stanzaliving.po.enums.PoType;
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

public class ErpInvoiceClient {

    private StanzaRestClient restClient;

    public ErpInvoiceClient(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<ErpInvoiceUpdateDto> getInvoiceStatus(String poUuid) {

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("poUuid",poUuid);
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        String path = UriComponentsBuilder.fromPath("/internal/get/invoicesStatus/{poUuid}").buildAndExpand(uriVariables).toUriString();

        ParameterizedTypeReference<ResponseDto<ErpInvoiceUpdateDto>> returnType = new ParameterizedTypeReference<ResponseDto<ErpInvoiceUpdateDto>>() {};

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }


}

