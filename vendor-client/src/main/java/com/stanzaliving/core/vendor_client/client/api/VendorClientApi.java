package com.stanzaliving.core.vendor_client.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.stanzaliving.vendor.model.VendorDetailsDto;
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

}