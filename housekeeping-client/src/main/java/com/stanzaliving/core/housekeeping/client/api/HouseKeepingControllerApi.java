package com.stanzaliving.core.housekeeping.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.generictaskservice.dto.response.AreaTagDetailsResponseDto;
import com.stanzaliving.generictaskservice.dto.response.MappedTemplateAndBeatPlanResponseDto;
import com.stanzaliving.housekeepingservice.dto.HKSubCategoryConfigDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2
public class HouseKeepingControllerApi {

    private final StanzaRestClient restClient;

    public HouseKeepingControllerApi(StanzaRestClient restClient) {
        this.restClient = restClient;
    }


    public ResponseDto<List<HKSubCategoryConfigDTO>> getSubCategoryBySubCategoryUuid(String subCategoryUuid) {
        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("subCategoryUuid", subCategoryUuid);
        String path = UriComponentsBuilder.fromPath("/internal/hkTasksTypeConfig/{subCategoryUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<HKSubCategoryConfigDTO>>> returnType = new ParameterizedTypeReference<ResponseDto<List<HKSubCategoryConfigDTO>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }


    public ResponseDto<HKSubCategoryConfigDTO> getSubCategoryBySubCategoryUuidAndVariable(String subCategoryUuid, String variable) {
        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("subCategoryUuid", subCategoryUuid);
        uriVariables.put("variable", variable);
        String path = UriComponentsBuilder.fromPath("/internal/hkTasksTypeConfig/{subCategoryUuid}/{variable}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<HKSubCategoryConfigDTO>> returnType = new ParameterizedTypeReference<ResponseDto<HKSubCategoryConfigDTO>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }

    public ResponseDto<MappedTemplateAndBeatPlanResponseDto> getMappedSlotResponse(String uuid,List<String> shiftAllocationUuids) {
        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/template/map/slot").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.put("uuid", Collections.singletonList(uuid));
        queryParams.put("shiftAllocationUuids",shiftAllocationUuids);
        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<MappedTemplateAndBeatPlanResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<MappedTemplateAndBeatPlanResponseDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }

    public ResponseDto<List<AreaTagDetailsResponseDto>> getAreaTagDetailsResponseDto(String residenceUuid) {
        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("residenceUuid", residenceUuid);
        String path = UriComponentsBuilder.fromPath("/internal/areaRoom/{residenceUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<AreaTagDetailsResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<AreaTagDetailsResponseDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }

    public ResponseDto<List<AreaTagDetailsResponseDto>> getAreaTagDetailsBathRoomsResponseDto(String residenceUuid) {
        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("residenceUuid", residenceUuid);
        String path = UriComponentsBuilder.fromPath("/internal/areaRoom/bathroom/{residenceUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<AreaTagDetailsResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<AreaTagDetailsResponseDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }

    public ResponseDto<List<AreaTagDetailsResponseDto>> getAreaCommonDetailsResponseDto(String residenceUuid) {
        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("residenceUuid", residenceUuid);
        String path = UriComponentsBuilder.fromPath("/internal/areaCommon/{residenceUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<AreaTagDetailsResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<AreaTagDetailsResponseDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }

}
