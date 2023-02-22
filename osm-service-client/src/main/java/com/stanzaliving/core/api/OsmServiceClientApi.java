package com.stanzaliving.core.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.osm.dto.StanzaOsmPlaceDto;
import com.stanzaliving.website.elasticsearch.index.dto.WebsitePlaceIndexDto;
import com.stanzaliving.website.response.dto.PlaceSearchResponseDto;
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

    public ResponseDto<List<StanzaOsmPlaceDto>> fetchOsmPlacesForTheWholeCity(String transformationCityUuid) {

        try {
            String path = UriComponentsBuilder.fromPath("internal/website/osm/get/all/stanza/place/by").toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
            queryParams.add("transformationCityUuid", transformationCityUuid);

            final HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<List<StanzaOsmPlaceDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<StanzaOsmPlaceDto>>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);

        } catch (Exception e) {
            log.error("Error while pushing old places data to new elastic", e);
        }
        return null;
    }

    public ResponseDto<PlaceSearchResponseDto> searchPlaceInOsmElasticCluster(String searchTerm) {

        try {
            String path = UriComponentsBuilder.fromPath("internal/website/place/search").toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
            queryParams.add("searchTerm", searchTerm);

            final HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<PlaceSearchResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<PlaceSearchResponseDto>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);

        } catch (Exception e) {
            log.error("Error while searching place in elastic", e);
        }
        return null;
    }
}
