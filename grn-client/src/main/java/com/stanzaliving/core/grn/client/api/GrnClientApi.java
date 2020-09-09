package com.stanzaliving.core.grn.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.stanzaliving.grn.GrnQuantity;
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

}