package com.stanzaliving.core.locationservice.client;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.base.location.GeoPointDto;
import com.stanzaliving.core.locationservice.dto.LocationDetailsDto;
import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public class LocationServiceClientApi {

    private StanzaRestClient restClient;

    public ResponseDto<LocationDetailsDto> getStanzaMicromarketFromLatLong(GeoPointDto geoPointDto) {

        try {
            String path = UriComponentsBuilder.fromPath("internal/micro-market").toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            final HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<LocationDetailsDto>> returnType = new ParameterizedTypeReference<ResponseDto<LocationDetailsDto>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, geoPointDto, headerParams, accept, returnType);

        } catch (Exception e) {
            log.error("Error while Fetching Stanza Micro market details from lat, long, geoPointDto: {}", geoPointDto, e);
        }
        return null;
    }
}
