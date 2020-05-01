package com.stanzaliving.core.phoenixAggregation.client.api;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.stanzaliving.core.phoenixAggregation.dto.PropertyDetailsDto;
import com.stanzaliving.core.projectservice.dto.BedCountDto;

import com.stanzaliving.core.projectservice.dto.PropertyInfoDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.CollectionUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.projectsapprovalservice.internal.PropertyUpdateTrackerListDto;

public class PhoenixAggregationClientApi {

    private StanzaRestClient restClient;

    public PhoenixAggregationClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<List<PropertyDetailsDto>> getHouseDetails(Collection<String> houseUuids) {

        if (CollectionUtils.isEmpty(houseUuids)) {
            return null;
        }

        Object postBody = houseUuids;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/getHouseDetails")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<PropertyDetailsDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<PropertyDetailsDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }


}
