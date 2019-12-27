package com.stanzaliving.core.estate.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.estate.dto.EstateAttributeDto;

public class EstateClientApi {

    private StanzaRestClient restClient;

    public EstateClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<List<EstateAttributeDto>> getEstateAttributeByEstateUuid(String estateUuid) {
        return this.getEstateAttributeByEstateUuidOrEstateId(estateUuid, null);
    }

    public ResponseDto<List<EstateAttributeDto>> getEstateAttributeByEstateId(String estateId) {
        return this.getEstateAttributeByEstateUuidOrEstateId(null, estateId);
    }

    public ResponseDto<List<EstateAttributeDto>> getEstateAttributeByEstateUuidOrEstateId(String estateUuid, String estateId) {

        if (StringUtils.isEmpty(estateUuid) && StringUtils.isEmpty(estateId)) {
            return null;
        }

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/attributes/list").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        if (StringUtils.isNotEmpty(estateUuid)) {
            queryParams.putAll(restClient.parameterToMultiValueMap(null, "estateUuid", estateUuid));
        }
        if (StringUtils.isNotEmpty(estateId)) {
            queryParams.putAll(restClient.parameterToMultiValueMap(null, "estateId", estateId));
        }

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<EstateAttributeDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<EstateAttributeDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }

}
