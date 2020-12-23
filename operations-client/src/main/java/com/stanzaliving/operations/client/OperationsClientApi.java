package com.stanzaliving.operations.client;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.stanzaliving.core.base.utils.DateUtil;
import com.stanzaliving.internet.dto.InternetDetails;
import com.stanzaliving.internet.dto.InternetProviderDetails;
import com.stanzaliving.operations.ServiceMixSeasonResponseDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.CollectionUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.backend.dto.UserHostelDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.operations.dto.ResidentFoodPreferenceCountDto;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class OperationsClientApi {

	private StanzaRestClient restClient;

	public OperationsClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public Map<String, Integer> getResideneMIRMap(LocalDate date) {

		Object postBody = null;

		ResponseDto<Map<String, Integer>> responseDto = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/get/mir").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.add("mirDate", date.toString());

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Map<String, Integer>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, Integer>>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while fetching MIR from operations: ", e);
		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new HashMap<>();

	}

	public List<ResidentFoodPreferenceCountDto> getResidentFoodPreferenceCount(LocalDate date) {

		Object postBody = null;

		ResponseDto<List<ResidentFoodPreferenceCountDto>> responseDto = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/get/resident/food/preference/count").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.add("mirDate", date.toString());

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<ResidentFoodPreferenceCountDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ResidentFoodPreferenceCountDto>>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while fetching food preference count from operations: ", e);
		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new ArrayList<>();

	}

	public List<UserHostelDto> getUserHostelList(LocalDate date) {

		Object postBody = null;

		ResponseDto<List<UserHostelDto>> responseDto = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/get/resident/list").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.add("mirDate", date.toString());

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<UserHostelDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<UserHostelDto>>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while fetching resident list from operations: ", e);
		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new ArrayList<>();

	}

	public List<ServiceMixSeasonResponseDto> getSeasonByResidenceId(List<String> residenceIds) {

		if(CollectionUtils.isEmpty(residenceIds)){
			return new ArrayList<>();
		}

		Object postBody = residenceIds;

		ResponseDto<List<ServiceMixSeasonResponseDto>> responseDto = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/season/get").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<ServiceMixSeasonResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ServiceMixSeasonResponseDto>>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while fetching Season List from residenceId: {}", residenceIds, e);
		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new ArrayList<>();

	}

	public InternetProviderDetails getInternetVendor(String residenceId, LocalDate localDate) {

		Object postBody = null;

		InternetDetails responseDto = null;

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("key", "internet.internet");
		uriVariables.put("residenceId", residenceId);
		uriVariables.put("date", localDate.toString());

		String path =
				UriComponentsBuilder.fromPath("/internal/servicemix/current/getValueForKey/{residenceId}/{key}/{date}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<InternetDetails> returnType = new ParameterizedTypeReference<InternetDetails>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while fetching Vendor Name from residenceId: {}", residenceId, e);
		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : null;

	}
}