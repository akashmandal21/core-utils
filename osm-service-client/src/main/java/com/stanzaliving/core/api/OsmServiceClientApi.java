package com.stanzaliving.core.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.website.elasticsearch.index.dto.WebsitePlaceIndexDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Log4j2
public class OsmServiceClientApi {

    private StanzaRestClient restClient;

    public OsmServiceClientApi(StanzaRestClient restClient) {
        this.restClient = restClient;
    }

    public ResponseDto<String> pushOldPlacesToNewElastic(List<WebsitePlaceIndexDto> websitePlaceIndexDtos) {

        try {
            String path = UriComponentsBuilder.fromPath("internal/website/osm/push/old/places/to/new/elastic").toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            final HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, websitePlaceIndexDtos, headerParams, accept, returnType);

        } catch (Exception e) {
            log.error("Error while pushing old places data to new elastic", e);
        }
        return null;
    }
}
