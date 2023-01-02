package com.stanzaliving.core.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Objects;

@Log4j2
public class OsmServiceClientApi {

    private StanzaRestClient restClient;

    public OsmServiceClientApi(StanzaRestClient restClient) {
        this.restClient = restClient;
    }

    public ResponseDto<Object> getOsmPlaceEntitiesByCity(String cityTransformationUuid) {

        try {
            String path = UriComponentsBuilder.fromPath("internal/get/example").toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            queryParams.add("cityTransformationUuid", cityTransformationUuid);

            final HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<Object>> returnType = new ParameterizedTypeReference<ResponseDto<Object>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, null, headerParams, accept, returnType);

        } catch (Exception e) {
            log.error("Error while Fetching Osm Place Entities By cityTransformationUuid: {}, {}", cityTransformationUuid, e);
        }
        return null;
    }
}
