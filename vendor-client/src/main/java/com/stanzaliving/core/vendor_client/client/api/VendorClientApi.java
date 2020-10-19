package com.stanzaliving.core.vendor_client.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.stanzaliving.core.generic.dto.UIKeyValue;
import com.stanzaliving.core.vendor.FilterVendorDto;
import com.stanzaliving.core.vendor.dtos.GenericVendorDetailDto;
import com.stanzaliving.transformations.projections.StanzaGstView;
import com.stanzaliving.vendor.model.VendorAndPocDetails;
import com.stanzaliving.vendor.model.VendorDetailsDto;
import com.stanzaliving.vendor.model.VendorPoDownloadDataDto;
import com.stanzaliving.vendor.model.VendorPoDownloadRequest;
import com.stanzaliving.vendor.model.VendorPocDetailsDto;
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
public class VendorClientApi {

    private StanzaRestClient restClient;

    public VendorClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<List<VendorDetailsDto>> getVendorDetails(List<String> uuids) {

        log.info("HTTP Client call to get Vendor Details DTO for UUID " + uuids);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        Map<String, List<String>> map = new HashMap<>();

        ParameterizedTypeReference<ResponseDto<List<VendorDetailsDto>>> vddReturnType = new ParameterizedTypeReference<ResponseDto<List<VendorDetailsDto>>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal/getVendorDetailsByIds").toUriString();

        map.put("ids", uuids);

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, map, headerParams, accept, vddReturnType);
    }

    public ResponseDto<List<VendorPocDetailsDto>> getVendorPocDetails(List<String> uuids) {

        log.info("HTTP Client call to get Vendor POC Details DTO for UUID " + uuids);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        Map<String, List<String>> map = new HashMap<>();

        ParameterizedTypeReference<ResponseDto<List<VendorPocDetailsDto>>> vddReturnType = new ParameterizedTypeReference<ResponseDto<List<VendorPocDetailsDto>>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal/getVendorPocDetailsByIds").toUriString();

        map.put("ids", uuids);

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, map, headerParams, accept, vddReturnType);
    }
    
    public ResponseDto<List<VendorAndPocDetails>> getVendorAndPocDetails(List<String> uuids) {

        log.info("HTTP Client call to get Vendor POC Details DTO for UUID " + uuids);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        Map<String, List<String>> map = new HashMap<>();

        ParameterizedTypeReference<ResponseDto<List<VendorAndPocDetails>>> vddReturnType = new ParameterizedTypeReference<ResponseDto<List<VendorAndPocDetails>>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal/getVendorPlusPocDetailsByIds").toUriString();

        map.put("ids", uuids);

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, map, headerParams, accept, vddReturnType);
    }

    public ResponseDto<VendorPoDownloadDataDto> getVendorPoDownloadData(VendorPoDownloadRequest request) {

        log.info("HTTP Client call to get Vendor Purchase Order Download Data for request " + request);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<VendorPoDownloadDataDto>> vddReturnType = new ParameterizedTypeReference<ResponseDto<VendorPoDownloadDataDto>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal/getVendorPoDownloadData").toUriString();

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, request, headerParams, accept, vddReturnType);
    }

    public ResponseDto<List<GenericVendorDetailDto>> getGenericVendorDetails(List<String> vendorIds, boolean isUuid) {

        log.info("HTTP Client call to get Vendor Details DTO for UUID {}" , vendorIds);

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("isUuid",isUuid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);


        ParameterizedTypeReference<ResponseDto<List<GenericVendorDetailDto>>> vddReturnType = new ParameterizedTypeReference<ResponseDto<List<GenericVendorDetailDto>>>() {
        };

        String path = UriComponentsBuilder.fromPath("/generic/internal/getGenericVendorDetailsByIds/{isUuid}").buildAndExpand(uriVariables).toUriString();


        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, vendorIds, headerParams, accept, vddReturnType);
    }

    public ResponseDto<List<UIKeyValue>> getGenericVendorNames(FilterVendorDto filterVendorDto) {

        log.info("HTTP Client call to get Vendor Names {}" , filterVendorDto);

        final Map<String, Object> uriVariables = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);


        ParameterizedTypeReference<ResponseDto<List<UIKeyValue>>> vddReturnType = new ParameterizedTypeReference<ResponseDto<List<UIKeyValue>>>() {
        };

        String path = UriComponentsBuilder.fromPath("/generic/internal/getVendorNames").buildAndExpand(uriVariables).toUriString();


        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, filterVendorDto, headerParams, accept, vddReturnType);
    }

    public ResponseDto<GenericVendorDetailDto> getGenericVendorDetail(String vendorUuid, String stateUuid) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("vendorUuid", vendorUuid);
        uriVariables.put("stateUuid", stateUuid);

        String path = UriComponentsBuilder.fromPath("/generic/internal/getVendorDetailsByIds/{vendorUuid}/{stateUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<GenericVendorDetailDto>> returnType = new ParameterizedTypeReference<ResponseDto<GenericVendorDetailDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }


}