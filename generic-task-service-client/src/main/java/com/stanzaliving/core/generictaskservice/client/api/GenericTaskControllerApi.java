package com.stanzaliving.core.generictaskservice.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.generictaskservice.dto.ShiftAllocationDto;
import com.stanzaliving.generictaskservice.dto.response.MicroClusterResponseDto;
import com.stanzaliving.generictaskservice.dto.response.ShitAllocationDetailsResponse;
import lombok.extern.log4j.Log4j2;
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

/**
 * @author Vikas S T
 * @date 09-Sep-21
 **/
@Log4j2
public class GenericTaskControllerApi {
    private StanzaRestClient restClient;

    public GenericTaskControllerApi(StanzaRestClient restClient) {
        this.restClient = restClient;
    }

    public ResponseDto<List<ShiftAllocationDto>> createShiftAllocationDto(List<ShiftAllocationDto> shiftAllocationDtoList) {
        Object postBody = shiftAllocationDtoList;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/shift/allocation/saveAll").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<ShiftAllocationDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ShiftAllocationDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<List<ShitAllocationDetailsResponse>> getShiftAllocationDto(List<String> shiftAllocationUuid){

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/shift/allocation").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.put("shiftAllocationUuidList",shiftAllocationUuid);

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<ShitAllocationDetailsResponse>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ShitAllocationDetailsResponse>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<MicroClusterResponseDto> getMicroClusterByUuid(String microClusterUuid) {
        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("microClusterUuid", microClusterUuid);
        String path = UriComponentsBuilder.fromPath("/microcluster/get/{microClusterUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<MicroClusterResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<MicroClusterResponseDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }


    public ResponseDto<List<String>> getAllTaskUuidByTaskTemplate() {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/template/getTaskUuidByTaskTemplate").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<String>>> returnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }
}
