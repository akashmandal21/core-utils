package com.stanzaliving.core.po.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.stanzaliving.vendor.model.VendorAndPocDetails;
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
public class POClientApi {

    private StanzaRestClient restClient;

    public POClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<List<VendorDetailsDto>> getVendorDetails(String poDetailsId) {

        log.info("HTTP Client call to get PO Details DTO for UUID " + poDetailsId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.add("id", poDetailsId);
        
        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        Map<String, List<String>> map = new HashMap<>();

        ParameterizedTypeReference<ResponseDto<List<VendorDetailsDto>>> vddReturnType = new ParameterizedTypeReference<ResponseDto<List<VendorDetailsDto>>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal/getPoDataById/{id}").buildAndExpand(queryParams).toUriString();

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, map, headerParams, accept, vddReturnType);
    }

}