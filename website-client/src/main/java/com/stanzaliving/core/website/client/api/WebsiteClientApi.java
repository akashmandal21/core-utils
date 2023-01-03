/**
 *
 */
package com.stanzaliving.core.website.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.location.GeoPointDto;
import com.stanzaliving.core.base.utils.ObjectMapperUtil;
import com.stanzaliving.website.dto.WebsiteResidenceResponseDto;
import com.stanzaliving.website.response.dto.*;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.http.StanzaRestClient;

/**
 * s
 *
 * @author naveen.kumar
 *
 * @date 03-Nov-2019
 *
 **/
@Log4j2
public class WebsiteClientApi {

    private StanzaRestClient restClient;

    public WebsiteClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public List<LeadVisitResponseDTO> getScheduledVisitsForPhone(String phone) {
        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("phone", phone);

        String path = UriComponentsBuilder.fromPath("scheduledVisit/{phone}").buildAndExpand(uriVariables)
                .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<List<LeadVisitResponseDTO>> returnType = new ParameterizedTypeReference<List<LeadVisitResponseDTO>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }

    public void insertElasticSearchContent(ElasticsearchRequestDTO elasticsearchRequestDTO) {
        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/elasticsearch/insert").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        postBody = elasticsearchRequestDTO;

        ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {
        };

        restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

    }

    public ResidenceResponseDTO getResidenceDetails(String residenceName) {
        try {
            Object postBody = null;

            log.info("Received request to get residence details of {}", residenceName);
            // create path and map variables
            final Map<String, Object> uriVariables = new HashMap<>();

            uriVariables.put("name", residenceName);

            String path = UriComponentsBuilder.fromPath("/internal/get/residence/{name}").buildAndExpand(uriVariables)
                    .toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            final HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};
            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResidenceResponseDTO> returnType = new ParameterizedTypeReference<ResidenceResponseDTO>() {
            };
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

        } catch (Exception e) {
            log.error("Error while fetching residence details of : " + residenceName, e);
            return null;
        }

    }

    public WebsiteResidenceResponseDto getResidenceDetailsV2(String residenceName) {
        try {
            Object postBody = null;

            log.info("Received request to get residence details of {}", residenceName);
            // create path and map variables
            final Map<String, Object> uriVariables = new HashMap<>();

            uriVariables.put("name", residenceName);

            String path = UriComponentsBuilder.fromPath("/internal/get/residence/{name}").buildAndExpand(uriVariables)
                    .toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            final HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};
            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<WebsiteResidenceResponseDto> returnType = new ParameterizedTypeReference<WebsiteResidenceResponseDto>() {
            };
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

        } catch (Exception e) {
            log.error("Error while fetching residence details of : " + residenceName, e);
            return null;
        }

    }

    public ResponseDto<String> getResidenceGoogleLink(String residenceName) {
        try {
            Object postBody = null;
            log.info("Received request to get google ling of residenceName {}", residenceName);
            // create path and map variables
            final Map<String, Object> uriVariables = new HashMap<>();

            String path = UriComponentsBuilder.fromPath("/website/url/by").buildAndExpand(uriVariables)
                    .toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
            queryParams.add("name", residenceName);

            final HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};
            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Error while fetching residence details of : " + residenceName, e);
            return null;
        }
    }

    public ResponseDto<CityCmsResponseDTO> getCityDetailsByWebsiteIdOrTransformationUuid(Integer websiteCityId, String transformationUuid) {

        try {
            String path = UriComponentsBuilder.fromPath("/internal/city/get/details/by").toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            if (Objects.nonNull(websiteCityId)) {
                queryParams.add("websiteCityId", websiteCityId.toString());
            }

            if (StringUtils.isNotBlank(transformationUuid)) {
                queryParams.add("transformationUuid", transformationUuid);
            }

            final HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<CityCmsResponseDTO>> returnType = new ParameterizedTypeReference<ResponseDto<CityCmsResponseDTO>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Error while Fetching Stanza City details from website for cityId: {}, transformationUuid: {}", websiteCityId, transformationUuid, e);
        }
        return null;
    }

    public ResponseDto<List<MicromarketListingResponseDTO>> getMicromarketListingByCityId(Integer websiteCityId) {

        try {
            String path = UriComponentsBuilder.fromPath("/internal/micromarket/get/all/by/city").toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            queryParams.add("cityId", websiteCityId.toString());

            final HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<List<MicromarketListingResponseDTO>>> returnType = new ParameterizedTypeReference<ResponseDto<List<MicromarketListingResponseDTO>>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Error while Fetching Stanza MM details from website for cityId: {}", websiteCityId, e);
        }
        return null;
    }

    public ResponseDto<List<CityListingResponseDTO>> getAllCitiesDto() {

        try {
            String path = UriComponentsBuilder.fromPath("/internal/city/get/all").toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            final HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
            ParameterizedTypeReference<ResponseDto<List<CityListingResponseDTO>>> returnType = new ParameterizedTypeReference<ResponseDto<List<CityListingResponseDTO>>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Error while Fetching Stanza MM details from website for cityId: {}", e);
        }
        return null;
    }
}