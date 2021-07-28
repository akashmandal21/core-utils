package com.stanzaliving.core.deal.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.stanzaliving.core.deal.client.dto.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class DealDataControllerApi {

    private StanzaRestClient restClient;

    public DealDataControllerApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<DealUserResponseDto> updateUserDetails(DealUserRequestDto dealUserRequestDto) {

        log.info("Deal-Data-Controller:: update deal user with uuid {} and payload {}");

        Object putBody = dealUserRequestDto;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/deal/user").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<DealUserResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<DealUserResponseDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.PUT, queryParams, putBody, headerParams, accept, returnType);
    }

	public ResponseDto<List<String>> getServiceMixUuidForDealAndResidence(String dealUuid, String residenceUuid) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/deal/service-mix/"+dealUuid+"/"+residenceUuid).buildAndExpand(uriVariables).toUriString();

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

	public ResponseDto<List<Integer>> getAllowedOccupanciesForDealAndResidence(DealRoomsRequestDto dealRoomsRequestDto) {

			log.info("fetching allowed occupancies for ContactUuid : " + dealRoomsRequestDto.getDealUuid());

			Object postBody = null;

	        final Map<String, Object> uriVariables = new HashMap<>();
	        
	        String path = UriComponentsBuilder.fromPath("/internal/deal/allowed-occupancies/"+ dealRoomsRequestDto.getDealUuid() + "/" + dealRoomsRequestDto.getResidenceUuid()).buildAndExpand(uriVariables).toUriString();

	        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

	        final HttpHeaders headerParams = new HttpHeaders();

	        final String[] accepts = {
	                "*/*"
	        };
	        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

	        ParameterizedTypeReference<ResponseDto<List<Integer>>> returnType = new ParameterizedTypeReference<ResponseDto<List<Integer>>>() {
	        };
	        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<DealUserResponseDto> getUserDetails(String userUuid) {

		log.info("fetching user details for userUuid : " + userUuid);

		Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/deal/user/"+ userUuid).buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<DealUserResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<DealUserResponseDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
}

	public ResponseDto<String> getPackagedServiceDetailsForUser(String userUuid, String bookingUuid) {
		log.info("fetching user details for userUuid : " + userUuid);

		Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/user/service-mix/"+ userUuid+"/"+bookingUuid).buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

    public ResponseDto<List<DealApprovedUserResponseDto>> getApprovedUserList(String contractId,
                                                                              DealApprovedUserRequestDto dealApprovedUserRequestDto, Integer pageNo, Integer pageSize, String sortBy, String sortOrder) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("dealUuid", contractId);
        String path =
                UriComponentsBuilder.fromPath("/internal/deal/{dealUuid}/residents")
                        .buildAndExpand(uriVariables)
                        .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("pageNo",String.valueOf(pageNo));
        queryParams.add("pageSize",String.valueOf(pageSize));
        queryParams.add("sortBy",sortBy);
        queryParams.add("sortOrder",sortOrder);

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<DealApprovedUserResponseDto>>> returnType =
                new ParameterizedTypeReference<ResponseDto<List<DealApprovedUserResponseDto>>>() {
                };
        postBody=dealApprovedUserRequestDto;
        return restClient.invokeAPI(
                path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<List<DealKycResponseDto>> getDealKycDocumentsForUser(String userUuid) {

        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("userId",userUuid);

        String path = UriComponentsBuilder.fromPath("/internal/resident/{userId}/documents")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<DealKycResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<DealKycResponseDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }
}
