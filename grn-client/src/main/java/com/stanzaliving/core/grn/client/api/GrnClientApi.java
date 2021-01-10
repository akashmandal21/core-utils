package com.stanzaliving.core.grn.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.generic.po.enums.EventType;
import com.stanzaliving.core.grsi.dto.GrsiUpdateDto;
import com.stanzaliving.core.invoice.dto.InvoiceItemFilter;
import com.stanzaliving.core.po.generic.enums.GenericPOType;
import com.stanzaliving.grn.GSRIReceivedQuantity;
import com.stanzaliving.grn.GrnQuantity;
import com.stanzaliving.invoice.dto.InvoiceItemDto;
import com.stanzaliving.po.enums.PoType;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;

@Log4j2
public class GrnClientApi {

    private StanzaRestClient restClient;

    public GrnClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<List<GrnQuantity>> getGrnQuantityForPo(PoType poType, String poUuid, String propertyUuid) {

        final Map<String, Object> uriVariables = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        String path = UriComponentsBuilder.fromPath("/internal/grn/get/quantity").buildAndExpand(uriVariables).toUriString();

        queryParams.set("poType", poType.name());
        queryParams.set("poUuid", poUuid);

        if (Objects.nonNull(propertyUuid))
            queryParams.set("propertyUuid", propertyUuid);

        ParameterizedTypeReference<ResponseDto<List<GrnQuantity>>> returnType = new ParameterizedTypeReference<ResponseDto<List<GrnQuantity>>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<List<GSRIReceivedQuantity>> getGrnQuantitiesForPO(String poUuid) {

        final Map<String, Object> uriVariables = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        String path = UriComponentsBuilder.fromPath("/internal/generic/get/gsri/quantity").buildAndExpand(uriVariables).toUriString();
        queryParams.set("poToUuid", poUuid);

        ParameterizedTypeReference<ResponseDto<List<GSRIReceivedQuantity>>> returnType = new ParameterizedTypeReference<ResponseDto<List<GSRIReceivedQuantity>>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<List<InvoiceItemDto>> getGrnQuantitiesForInvoice(Department department, String poUuid, InvoiceItemFilter invoiceItemFilter) {

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("poToUuid",poUuid);
        uriVariables.put("department",department);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        String path = UriComponentsBuilder.fromPath("/internal/generic/get/gsri/invoice/quantity/{department}/{poToUuid}").buildAndExpand(uriVariables).toUriString();

        ParameterizedTypeReference<ResponseDto<List<InvoiceItemDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<InvoiceItemDto>>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, invoiceItemFilter, headerParams, accept, returnType);
    }

    public ResponseDto<GrsiUpdateDto> getGrsiStatus(String poUuid) {

        final Map<String, Object> uriVariables = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        String path = UriComponentsBuilder.fromPath("/internal/generic/get/gsri/status").buildAndExpand(uriVariables).toUriString();
        queryParams.set("poToUuid", poUuid);

        ParameterizedTypeReference<ResponseDto<GrsiUpdateDto>> returnType = new ParameterizedTypeReference<ResponseDto<GrsiUpdateDto>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<Map<EventType,Boolean>> getGrsiEventsAllowed(String poUuid) {

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("poToUuid", poUuid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        String path = UriComponentsBuilder.fromPath("/internal/generic/grnEventAllowed/{poToUuid}").buildAndExpand(uriVariables).toUriString();

        ParameterizedTypeReference<ResponseDto<Map<EventType,Boolean>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<EventType,Boolean>>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }

}