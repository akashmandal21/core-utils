package com.stanzaliving.core.locationservice.client;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.base.location.GeoPointDto;
import com.stanzaliving.core.locationservice.dto.GeoPoint;
import com.stanzaliving.core.locationservice.dto.LocationDetailsDto;
import com.stanzaliving.core.locationservice.dto.LocationDto;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2
public class LocationServiceClientApi {

    private StanzaRestClient restClient;

    public LocationServiceClientApi(StanzaRestClient restClient) {
        this.restClient = restClient;
    }

    public ResponseDto<LocationDetailsDto> getStanzaMicromarketFromLatLong(double latitude, double longitude) {

        GeoPointDto geoPointDto = GeoPointDto.builder().lat(latitude).lon(longitude).build();

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

    public ResponseDto<LocationDetailsDto> getLocationDetailsDtoForCity(String cityTransformationUuid) {

        try {
            final Map<String, Object> uriVariables = new HashMap<>();

            uriVariables.put("cityTransformationUuid", cityTransformationUuid);

            String path = UriComponentsBuilder.fromPath("internal/city/{cityTransformationUuid}").buildAndExpand(uriVariables).toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            final HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<LocationDetailsDto>> returnType = new ParameterizedTypeReference<ResponseDto<LocationDetailsDto>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);

        } catch (Exception e) {
            log.error("Error while Fetching Location Details Dto For cityTransformationUuid: {}", cityTransformationUuid, e);
        }
        return null;
    }

    public ResponseDto<List<LocationDto>> getSocietyLocation(String transformationUuid , String society, String standaloneBuilding) {

        try {
            final Map<String, Object> uriVariables = new HashMap<>();

            uriVariables.put("transformationUuid", transformationUuid);

            String path = UriComponentsBuilder.fromPath("/internal/residence/{transformationUuid}/parents").buildAndExpand(uriVariables).toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            if (StringUtils.isNotBlank(society)) {
                queryParams.add("parentTypes", society);
            }

            if (StringUtils.isNotBlank(standaloneBuilding)) {
                queryParams.add("parentTypes", standaloneBuilding);
            }

            final HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<List<LocationDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<LocationDto>>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);

        } catch (Exception e) {
            log.error("Error while fetching LocationDto for transformationUuid: {}", transformationUuid, e);
        }
        return null;
    }

    public ResponseDto<LocationDto> getEnclosedAreaByTypeAndLatLong(double latitude, double longitude, String enclosedAreaType) {

        GeoPoint geoPointDto = GeoPoint.builder().latitude(latitude).longitude(longitude).build();

        try {
            final Map<String, Object> uriVariables = new HashMap<>();

            uriVariables.put("type", enclosedAreaType);

            String path = UriComponentsBuilder.fromPath("/internal/residence/{type}/parents").buildAndExpand(uriVariables).toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            final HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<LocationDto>> returnType = new ParameterizedTypeReference<ResponseDto<LocationDto>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, geoPointDto, headerParams, accept, returnType);

        } catch (Exception e) {
            log.error("Error while Fetching Stanza Enclosed Area details from lat, long, geoPoint: {}", geoPointDto, e);
        }
        return null;
    }
}
