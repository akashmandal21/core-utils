package com.stanzaliving.core.vendor_client.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.stanzaliving.core.vendor.dtos.VendorListingDto;
import com.stanzaliving.item_master.dtos.FilterDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.generic.dto.UIKeyValue;
import com.stanzaliving.core.vendor.FilterVendorDto;
import com.stanzaliving.core.vendor.dtos.GenericVendorDetailDto;
import com.stanzaliving.core.vendor.dtos.VendorSuppliedItem;
import com.stanzaliving.vendor.model.VendorAndPocDetails;
import com.stanzaliving.vendor.model.VendorDetailsDto;
import com.stanzaliving.vendor.model.VendorPoDownloadDataDto;
import com.stanzaliving.vendor.model.VendorPoDownloadRequest;
import com.stanzaliving.vendor.model.VendorPocDetailsDto;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class VendorClientApi {

    private StanzaRestClient restClient;

    public VendorClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }
    
    public ResponseDto<Set<String>> getApprovedVendorUuids(List<String> uuids) {

        log.info("HTTP Client call to get Approved Vendor UUIDs " + uuids);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        Map<String, List<String>> map = new HashMap<>();

        ParameterizedTypeReference<ResponseDto<Set<String>>> vddReturnType = new ParameterizedTypeReference<ResponseDto<Set<String>>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal/getApprovedVendorUuids").toUriString();

        map.put("ids", uuids);

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, map, headerParams, accept, vddReturnType);
        
    }

    public ResponseDto<Map<String,List<VendorAndPocDetails>>> getVendorPlusPocDetailsByIdsV2(List<String> uuids) {

        log.info("HTTP Client call to get Vendor POC Details DTO for UUID " + uuids);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        Map<String, List<String>> map = new HashMap<>();

        ParameterizedTypeReference<ResponseDto<Map<String,List<VendorAndPocDetails>>>> vddReturnType = new ParameterizedTypeReference<ResponseDto<Map<String,List<VendorAndPocDetails>>>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal/getVendorPlusPocDetailsByIdsV2").toUriString();

        map.put("ids", uuids);

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, map, headerParams, accept, vddReturnType);
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

    public ResponseDto<GenericVendorDetailDto> getGenericVendorDetailPo(String vendorUuid, String stateUuid) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("vendorUuid", vendorUuid);
        uriVariables.put("stateUuid", stateUuid);

        String path = UriComponentsBuilder.fromPath("/generic/internal/getVendorDetailsByIdPo/{vendorUuid}/{stateUuid}").buildAndExpand(uriVariables).toUriString();

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

    public ResponseDto<String> getPaymentTerms(String vendorUuid) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("vendorUuid",vendorUuid);
        String path = UriComponentsBuilder.fromPath("/generic/internal/getVendorPaymentTerms/{vendorUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<List<VendorSuppliedItem>> getGenericVendorSuppliedItems(String vendorUuid, String cityUuid) {

        log.info("HTTP Client call to get Vendor Items for vendor {} for city {}" , vendorUuid,cityUuid);

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("vendorUuid",vendorUuid);
        uriVariables.put("cityUuid",cityUuid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);


        ParameterizedTypeReference<ResponseDto<List<VendorSuppliedItem>>> vddReturnType = new ParameterizedTypeReference<ResponseDto<List<VendorSuppliedItem>>>() {
        };

        String path = UriComponentsBuilder.fromPath("/generic/internal/getVendorItems/{vendorUuid}/{cityUuid}").buildAndExpand(uriVariables).toUriString();


        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, vddReturnType);
    }

    public ResponseDto<String> getHouseVendorUuid(String propertyUuid) {

        log.info("HTTP Client call to get Internal House vendor uuid {}" , propertyUuid);

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("propertyUuid",propertyUuid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        
        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);


        ParameterizedTypeReference<ResponseDto<String>> vddReturnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };

        String path = UriComponentsBuilder.fromPath("/generic/internal/getHouseVendorUuid/{propertyUuid}").buildAndExpand(uriVariables).toUriString();


        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, vddReturnType);
    }

    public ResponseDto<String> getHouseUuid(String vendorUuid) {

        log.info("HTTP Client call to get House  uuid {}" , vendorUuid);

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("vendorUuid",vendorUuid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        	
        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);


        ParameterizedTypeReference<ResponseDto<String>> vddReturnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };

        String path = UriComponentsBuilder.fromPath("/generic/internal/getPropertyUuid/{vendorUuid}").buildAndExpand(uriVariables).toUriString();


        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, vddReturnType);
    }
    
    public ResponseDto<String> getHouseUuidForAllLocationTypes(String vendorUuid) {

        log.info("HTTP Client call to get House  uuid {}" , vendorUuid);

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("vendorUuid",vendorUuid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("allLocationTypes", Boolean.TRUE.toString());
        
        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);


        ParameterizedTypeReference<ResponseDto<String>> vddReturnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };

        String path = UriComponentsBuilder.fromPath("/generic/internal/getPropertyUuid/{vendorUuid}").buildAndExpand(uriVariables).toUriString();


        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, vddReturnType);
    }

    public ResponseDto<List<String>> createHouseWareHouseVendor(List<String> properties) {

        log.info("HTTP Client call to create house warehouse vendor for properties {}", properties);

        Object postBody = properties;

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);


        ParameterizedTypeReference<ResponseDto<List<String>>> vddReturnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
        };

        String path = UriComponentsBuilder.fromPath("/generic/internal/createHHWVendor").toUriString();

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, vddReturnType);
    }

    public ResponseDto<List<VendorListingDto>> getListOfVendorsWithFilters(FilterDto filterDto) {

        log.info("HTTP Client call to get list of vendors for the filterDto: {}", filterDto);

        Object postBody = filterDto;

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<VendorListingDto>>> vddReturnType = new ParameterizedTypeReference<ResponseDto<List<VendorListingDto>>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal/listing/filtered").toUriString();

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, vddReturnType);
    }

}