package com.stanzaliving.core.estate.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.estate.dto.AtlFileRequestDto;
import com.stanzaliving.core.estate.dto.EstateAttributeDto;
import com.stanzaliving.core.estate.dto.EstateDto;
import com.stanzaliving.core.estate.enums.EstateStatus;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class EstateClientApi {

    private StanzaRestClient restClient;

    public EstateClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<List<EstateAttributeDto>> getEstateAttributeByEstateUuid(String estateUuid) {
        return this.getEstateAttributeByEstateUuidOrEstateId(estateUuid, null);
    }

    public ResponseDto<List<EstateAttributeDto>> getEstateAttributeByEstateId(String estateId) {
        return this.getEstateAttributeByEstateUuidOrEstateId(null, estateId);
    }

    public ResponseDto<List<EstateAttributeDto>> getEstateAttributeByEstateUuidOrEstateId(String estateUuid, String estateId) {

        if (StringUtils.isEmpty(estateUuid) && StringUtils.isEmpty(estateId)) {
            return null;
        }

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/attributes/list").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        if (StringUtils.isNotEmpty(estateUuid)) {
            queryParams.putAll(restClient.parameterToMultiValueMap(null, "estateUuid", estateUuid));
        }
        if (StringUtils.isNotEmpty(estateId)) {
            queryParams.putAll(restClient.parameterToMultiValueMap(null, "estateId", estateId));
        }

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<EstateAttributeDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<EstateAttributeDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }

    public ResponseDto<Void> approveByLeadership(Long estateId) {

        if (Objects.isNull(estateId)) {
            return null;
        }

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("estateId", estateId);
        
        String path = UriComponentsBuilder.fromPath("/internal/estate/approve/leadership/{estateId}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();


        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

    }

    public ResponseDto<Void> updateStatus(String estateUuid,EstateStatus estateStatus) {

        if (Objects.isNull(estateUuid)) {
            return null;
        }

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("estateUuid", estateUuid);
        uriVariables.put("estateStatus", estateStatus);
        
        String path = UriComponentsBuilder.fromPath("/internal/estate/update/status/{estateUuid}/{estateStatus}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();


        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

    }

    public ResponseDto<EstateDto> getEstateDtoFromEstateUuid(String estateUuId) {

        if (Objects.isNull(estateUuId)) {
            return null;
        }

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("estateUuid", estateUuId);

        String path = UriComponentsBuilder.fromPath("/internal/estate/get/estate/{estateUuid}").buildAndExpand(uriVariables).toUriString();

        log.info("Using Url Path:{}",path);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();


        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<EstateDto>> returnType = new ParameterizedTypeReference<ResponseDto<EstateDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

    }
    
    public ResponseDto<Void> sendBackByLeadership(Long estateId) {

        if (Objects.isNull(estateId)) {
            return null;
        }

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("estateId", estateId);
        
        String path = UriComponentsBuilder.fromPath("/internal/estate/sendback/leadership/{estateId}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

    }

    public ResponseDto<Boolean> updateStatusAfterAtlGeneration(AtlFileRequestDto atlFileRequestDto) {

		String path = UriComponentsBuilder.fromPath("/internal/estate/update/atlgenerate/status").toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, atlFileRequestDto, headerParams, accept,
				returnType);
	}
}
