package com.stanzaliving.core.housekeeping.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.housekeepingservice.dto.HKSubCategoryConfigDTO;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class HouseKeepingControllerApi {

    private StanzaRestClient restClient;

    public HouseKeepingControllerApi(StanzaRestClient restClient) {
        this.restClient = restClient;
    }


    public ResponseDto<List<HKSubCategoryConfigDTO>> getSubCategoryBySubCategoryUuid(String subCategoryUuid) {
        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("subCategoryUuid", subCategoryUuid);
        String path = UriComponentsBuilder.fromPath("/hkTasksTypeConfig/{subCategoryUuid}").buildAndExpand(uriVariables).toUriString();

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
        String path = UriComponentsBuilder.fromPath("/hkTasksTypeConfig/{subCategoryUuid}/{variable}").buildAndExpand(uriVariables).toUriString();

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


}
