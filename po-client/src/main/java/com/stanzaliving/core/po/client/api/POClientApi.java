package com.stanzaliving.core.po.client.api;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.stanzaliving.core.grsi.dto.GrsiUpdateDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.po.generic.dtos.PoDetailsResponse;
import com.stanzaliving.po.enums.PoStatus;
import com.stanzaliving.po.enums.PoType;
import com.stanzaliving.po.model.PoAggregationDto;
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

    public ResponseDto<Boolean> acceptInvoiceFlag(String poDetailsId, String userName) {

        if (Objects.isNull(poDetailsId)) {
            return null;
        }

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("poDetailsId", poDetailsId);
        
        String path = UriComponentsBuilder.fromPath("/internal/update/regularinvoice/{poDetailsId}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.putAll(restClient.parameterToMultiValueMap(null, "userName", userName));

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


    public ResponseDto<PoAggregationDto> getAllPoAggregationsForProperty(String propertyUuid) {

        log.info("HTTP Client call to get All PO aggregation for property {}",propertyUuid);

        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("propertyUuid", propertyUuid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();


        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        Map<String, List<String>> map = new HashMap<>();

        ParameterizedTypeReference<ResponseDto<PoAggregationDto>> vddReturnType = new ParameterizedTypeReference<ResponseDto<PoAggregationDto>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal//getPoAggregationForProperty/{propertyUuid}").buildAndExpand(uriVariables).toUriString();

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, map, headerParams, accept, vddReturnType);
    }

    public ResponseDto<Boolean> grnStarted(String poDetailsId, String userName) {

        if (Objects.isNull(poDetailsId))
            return null;

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("poDetailsId", poDetailsId);

        String path = UriComponentsBuilder.fromPath("/internal/update/grn/started/{poDetailsId}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.putAll(restClient.parameterToMultiValueMap(null, "userName", userName));

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<Map<String, BigDecimal>> poItemQuantityForPropertyUuid(String propertyUuid) {

        if (Objects.isNull(propertyUuid))
            return null;

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("propertyUuid", propertyUuid);

        String path = UriComponentsBuilder.fromPath("/internal/remaining/item/quantity/{propertyUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Map<String, BigDecimal>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, BigDecimal>>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }
    
     public ResponseDto<PoDetailsResponse> getPoDetailsWithItems(String poUuid) {

        log.info("HTTP Client call to get PO Details with Items {}",poUuid);

        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("poToUuid", poUuid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();


        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        Map<String, List<String>> map = new HashMap<>();

        ParameterizedTypeReference<ResponseDto<PoDetailsResponse>> vddReturnType = new ParameterizedTypeReference<ResponseDto<PoDetailsResponse>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal/generic/po/get/getCompletePOTODetails/{poToUuid}").buildAndExpand(uriVariables).toUriString();

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, map, headerParams, accept, vddReturnType);
    }

    public ResponseDto<PoDetailsResponse> getPoDetailsWithoutItems(String poUuid) {

        log.info("HTTP Client call to get PO Details without Items {}",poUuid);

        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("poToUuid", poUuid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();


        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        Map<String, List<String>> map = new HashMap<>();

        ParameterizedTypeReference<ResponseDto<PoDetailsResponse>> vddReturnType = new ParameterizedTypeReference<ResponseDto<PoDetailsResponse>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal/generic/po/get/getPOTODetailsWithoutItems/{poToUuid}").buildAndExpand(uriVariables).toUriString();

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, map, headerParams, accept, vddReturnType);
    }

    public ResponseDto<Void> markGrnCompletion(GrsiUpdateDto grsiUpdateDto){
        log.info("HTTP Client call to update PO for GRN Completion {}",grsiUpdateDto);

        Object postBody = grsiUpdateDto;
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/generic/po/mark/poCompletion")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }
}