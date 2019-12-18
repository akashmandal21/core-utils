package com.stanzaliving.core.estate.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.estate.dto.EstateAttributeDto;
import com.stanzaliving.transformations.pojo.CountryLevelAccessMetadata;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.http.MediaType;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EstateClientApi {

    private StanzaRestClient restClient;

    public EstateClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<List<EstateAttributeDto>> getEstateAttributeByEstateUuid(String estateUuid) {

        if (StringUtils.isEmpty(estateUuid)) {
            return null;
        }

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/estate/attributes/list").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.putAll(restClient.parameterToMultiValueMap(null, "estateUuid", estateUuid));

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
