package com.stanzaliving.core.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.constants.SecurityConstants;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.dto.FeaturephoneUserDto;
import com.stanzaliving.core.dto.UserDetailDto;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class WandaClientApi {

	private StanzaRestClient restClient;
	private String token;

	public WandaClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public WandaClientApi(StanzaRestClient stanzaRestClient, String token) {
		this.restClient = stanzaRestClient;
		this.token = token;
	}

	public ResponseDto<UserDetailDto> getUserDetailsByUserCode(String userCode) {
		Object postBody = null;
		
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("userCode", userCode);
		
		String path = UriComponentsBuilder.fromPath("/fulluserdto/id/{userCode}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		

		final HttpHeaders headerParams = new HttpHeaders();
		headerParams.add(SecurityConstants.BASIC_HEADER_NAME, token);

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<UserDetailDto>> returnType = new ParameterizedTypeReference<ResponseDto<UserDetailDto>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

	}
	
	public Map<String, Integer> getUserCodeIdMap(Set<String> userCodes) {

		Object postBody = userCodes;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/user/userCodeId").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();
		headerParams.add(SecurityConstants.BASIC_HEADER_NAME, token);
		log.info("header {}", token);
		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<Map<String, Integer>> returnType = new ParameterizedTypeReference<Map<String, Integer>>() {
		};

		Map<String, Integer> response = new HashMap<>();

		try {

			response = restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

		} catch (Exception e) {

			log.error("exception while getting user code map from core", e);

		}
		return response;
	}
	
	
	public ResponseDto<List<FeaturephoneUserDto>> getFeaturePhoneUsers(String hostel) {
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/user/list/feature/phone").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("hostel", hostel);
		queryParams.add("featurePhone", Boolean.TRUE.toString());

		final HttpHeaders headerParams = new HttpHeaders();
		headerParams.add(SecurityConstants.BASIC_HEADER_NAME, token);

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<FeaturephoneUserDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<FeaturephoneUserDto>>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}
}
