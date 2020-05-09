package com.stanzaliving.core.po.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.stanzaliving.po.enums.PoStatus;
import com.stanzaliving.po.enums.PoType;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.po.model.PoResponse;
import com.stanzaliving.po.model.PropertyPoStatusSummaryDto;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class POClientApi {

    private StanzaRestClient restClient;

    public POClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<PoResponse> getVendorDetails(String poDetailsId) {

        log.info("HTTP Client call to get PO Details DTO for UUID " + poDetailsId);

        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("id", poDetailsId);
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        
        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        Map<String, List<String>> map = new HashMap<>();

        ParameterizedTypeReference<ResponseDto<PoResponse>> vddReturnType = new ParameterizedTypeReference<ResponseDto<PoResponse>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal/getPoDataById/{id}").buildAndExpand(uriVariables).toUriString();

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, map, headerParams, accept, vddReturnType);
    }

    public ResponseDto<Boolean> acceptInvoiceFlag(String poDetailsId) {

        if (Objects.isNull(poDetailsId)) {
            return null;
        }

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("poDetailsId", poDetailsId);
        
        String path = UriComponentsBuilder.fromPath("/internal/update/regularinvoice/{poDetailsId}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

    }


    public ResponseDto<Map<String, List<PropertyPoStatusSummaryDto>>> getPoStatuses(List<String> propertyUuids) {

        log.info("HTTP Client call to get PO statuses for properties {}",propertyUuids);

        Object postBody = propertyUuids;
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/getPoStatuses")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Map<String, List<PropertyPoStatusSummaryDto>>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, List<PropertyPoStatusSummaryDto>>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<Map<PoType,List<PoStatus>>> getAllPoStatusesForProperty(String propertyUuid) {

        log.info("HTTP Client call to get All PO statuses for property {}",propertyUuid);

        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("propertyUuid", propertyUuid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();


        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        Map<String, List<String>> map = new HashMap<>();

        ParameterizedTypeReference<ResponseDto<Map<PoType,List<PoStatus>>>> vddReturnType = new ParameterizedTypeReference<ResponseDto<Map<PoType,List<PoStatus>>>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal/allPoStatus/{propertyUuid}").buildAndExpand(uriVariables).toUriString();

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, map, headerParams, accept, vddReturnType);
    }
}