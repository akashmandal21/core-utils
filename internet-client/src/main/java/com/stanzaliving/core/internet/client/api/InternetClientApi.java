package com.stanzaliving.core.internet.client.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.internet.dto.InternetLoginFoodRequestDto;
import com.stanzaliving.core.internet.dto.InternetLoginSummaryDto;
import com.stanzaliving.core.security.dto.InternetAttendanceMappingRequestDto;
import com.stanzaliving.internet.dto.InternetPlanDto;
import com.stanzaliving.internet.dto.UserLastUsageDetailsDto;
import com.stanzaliving.internet.enums.InternetVendor;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class InternetClientApi {

	private StanzaRestClient restClient;

	public InternetClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public List<InternetLoginSummaryDto> getInternetSessionSummary(List<String> imsResidenceIds, Date startDate, Date endDate) {

		ResponseDto<List<InternetLoginSummaryDto>> responseDto = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		Map<String, Object> postBody = new HashMap<String, Object>();
		postBody.put("proprtyIds", imsResidenceIds);
		postBody.put("endDate", endDate);
		postBody.put("startDate", startDate);

		String path = UriComponentsBuilder.fromPath("/sessionDetails/get/all/foodFeedback").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<InternetLoginSummaryDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<InternetLoginSummaryDto>>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while fetching session details from internet: ", e);
		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new ArrayList<>();
	}

	public List<InternetLoginSummaryDto> getInternetSessionSummaryV2(List<String> residenceIds, Date startDate, Date endDate) {

		ResponseDto<List<InternetLoginSummaryDto>> responseDto = null;

		final Map<String, Object> uriVariables = new HashMap<>();
		InternetLoginFoodRequestDto internetLoginFoodRequestDto = InternetLoginFoodRequestDto.builder().residenceIdList(residenceIds).startDate(startDate)
				.endDate(endDate).build();

		String path = UriComponentsBuilder.fromPath("/sessionDetails/get/all/foodFeedback/v2").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<InternetLoginSummaryDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<InternetLoginSummaryDto>>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.POST, queryParams, internetLoginFoodRequestDto, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while fetching session details from internet: ", e);
		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new ArrayList<>();
	}



	public Map<InternetVendor, List<InternetPlanDto>> listPlans() {
		ResponseDto<Map<InternetVendor, List<InternetPlanDto>>> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internet/plans").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Map<InternetVendor, List<InternetPlanDto>>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<InternetVendor, List<InternetPlanDto>>>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while listing internet plans: ", e);
		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new HashMap<>();

	}

	public InternetPlanDto getPlan(String planId) {

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("planId", planId);

		String path = UriComponentsBuilder.fromPath("/internet/plans/{planId}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<InternetPlanDto>> returnType = new ParameterizedTypeReference<ResponseDto<InternetPlanDto>>() {
		};

		ResponseDto<InternetPlanDto> responseDto = null;

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while getting plan details: {}", planId, e);
		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : null;

	}
	
	public List<UserLastUsageDetailsDto> getLastInternetUsage(List<String> userIds){

		String path = UriComponentsBuilder.fromPath("/sessionDetails/lastUsage").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
	
		TypeReference<ResponseDto<List<UserLastUsageDetailsDto>>> returnType = new TypeReference<ResponseDto<List<UserLastUsageDetailsDto>>>() {};

		ResponseDto<List<UserLastUsageDetailsDto>> responseDto = null;

		try {

			responseDto = restClient.post(path, queryParams, userIds, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting last internet usage", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new ArrayList<>();

	}
	
	public List<InternetLoginSummaryDto> getInternetLoginSummaryForAttendanceMapping(InternetAttendanceMappingRequestDto internetAttendanceMappingRequestDto) {

		ResponseDto<List<InternetLoginSummaryDto>> responseDto = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/sessionDetails/attendance/mapping").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<InternetLoginSummaryDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<InternetLoginSummaryDto>>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.POST, queryParams, internetAttendanceMappingRequestDto, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while fetching session details from internet: ", e);
		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new ArrayList<>();
	}

	
	
}