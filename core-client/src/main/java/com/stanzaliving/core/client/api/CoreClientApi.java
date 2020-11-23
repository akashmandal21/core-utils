package com.stanzaliving.core.client.api;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.backend.dto.UserHostelDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.constants.SecurityConstants;
import com.stanzaliving.core.base.enums.DocumentStatus;
import com.stanzaliving.core.base.enums.DocumentType;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.dto.FeaturephoneUserDto;
import com.stanzaliving.core.dto.FullUserDto;
import com.stanzaliving.core.dto.HostelDto;
import com.stanzaliving.core.dto.RCDetailDto;
import com.stanzaliving.core.dto.UserDetailDto;
import com.stanzaliving.core.dto.UserHostelDetailsDto;
import com.stanzaliving.core.dto.UserRegistrationDto;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class CoreClientApi {

	private StanzaRestClient restClient;
	private String token;

	public CoreClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public CoreClientApi(StanzaRestClient stanzaRestClient, String token) {
		this.restClient = stanzaRestClient;
		this.token = token;
	}

	public FullUserDto getUserDetails(String userId) {
		return getUserDetails(userId, token).getData();
	}

	public UserDetailDto getUserDetailsByUserCode(String userCode) {
		Object postBody = null;

		String path = UriComponentsBuilder.fromPath("/user/userDetailDto").toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("userCode", userCode);

		final HttpHeaders headerParams = new HttpHeaders();
		headerParams.add(SecurityConstants.BASIC_HEADER_NAME, token);

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		try {
			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, UserDetailDto.class);
		} catch (Exception e) {
			log.error("Error while getting user Details from Core by userCode: {}", userCode, e);
		}
		return null;
	}

	public UserDetailDto getUserDetailsByMobile(String mobile) {
		Object postBody = null;

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("mobileNumber", mobile);

		String path = UriComponentsBuilder.fromPath("/user/userDetailDto/{mobileNumber}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();
		headerParams.add(SecurityConstants.BASIC_HEADER_NAME, token);

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		try {
			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, UserDetailDto.class);
		} catch (Exception e) {
			log.error("Error while getting user Details from Core by mobile: {}", mobile, e);
		}
		return null;
	}

	public ResponseDto<FullUserDto> getUserDetails(String userId, String token) {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("userId", userId);

		String path = UriComponentsBuilder.fromPath("/fulluserdto/id/{userId}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();
		headerParams.add(SecurityConstants.BASIC_HEADER_NAME, token);

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		FullUserDto fullUserDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, FullUserDto.class);
		ResponseDto<FullUserDto> responseDto = new ResponseDto<>();
		responseDto.setData(fullUserDto);
		responseDto.setStatus(true);
		responseDto.setHttpStatusCode(200);

		return responseDto;
	}

	public ResponseDto<UserRegistrationDto> updateUserRegistration(String userId, String token, DocumentType documentType, DocumentStatus documentStatus) {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/registerUser").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.putAll(restClient.parameterToMultiValueMap(null, "userId", userId));
		queryParams.putAll(restClient.parameterToMultiValueMap(null, "documentType", documentType));
		queryParams.putAll(restClient.parameterToMultiValueMap(null, "documentStatus", documentStatus));

		final HttpHeaders headerParams = new HttpHeaders();
		headerParams.add(SecurityConstants.BASIC_HEADER_NAME, token);

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		UserRegistrationDto response = restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, UserRegistrationDto.class);
		ResponseDto<UserRegistrationDto> responseDto = new ResponseDto<>();
		responseDto.setData(response);
		responseDto.setStatus(true);
		responseDto.setHttpStatusCode(200);

		return responseDto;
	}

	public List<RCDetailDto> getContactNumber(String residenceId, String token) {
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("residenceId", residenceId);

		String path = UriComponentsBuilder.fromPath("/getRCDetail/{residenceId}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();
		headerParams.add(SecurityConstants.BASIC_HEADER_NAME, token);

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<List<RCDetailDto>> returnType = new ParameterizedTypeReference<List<RCDetailDto>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public Object getUserPropertyByUserCodeOrMobileOrId(String userCode, String mobile, String userId, String requestedProperty) {

		if (StringUtils.isBlank(requestedProperty)) {
			throw new IllegalArgumentException("Param 'requestedProperty' is mandatory");
		}

		if (StringUtils.isBlank(userCode) && StringUtils.isBlank(mobile) && StringUtils.isBlank(userId)) {
			throw new IllegalArgumentException("Atleast 1 search parameter is mandatory");
		}

		Object postBody = null;

		String path = UriComponentsBuilder.fromPath("/user").toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		if (StringUtils.isNotBlank(userCode)) {
			queryParams.add("userCode", userCode);
		} else if (StringUtils.isNotBlank(mobile)) {
			queryParams.add("userMobile", mobile);
		} else {
			queryParams.add("userId", userId);
		}

		queryParams.add("requestedProperty", requestedProperty);

		final HttpHeaders headerParams = new HttpHeaders();
		headerParams.add(SecurityConstants.BASIC_HEADER_NAME, token);

		final String[] accepts = {
				"*/*"
		};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		try {
			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, Object.class);
		} catch (Exception e) {
			log.error("Error while getting user requestedProperty from Core by Search Param: " + queryParams.toString(), e);
		}

		return null;
	}

	public List<HostelDto> getListOfAllHostelDto() {

		Object postBody = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/hostel/").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();
		headerParams.add(SecurityConstants.BASIC_HEADER_NAME, token);

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<List<HostelDto>> returnType = new ParameterizedTypeReference<List<HostelDto>>() {
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

	public List<FeaturephoneUserDto> getFeaturePhoneUsers(String hostel) {
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

		ParameterizedTypeReference<List<FeaturephoneUserDto>> returnType = new ParameterizedTypeReference<List<FeaturephoneUserDto>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public List<UserHostelDto> getUserHostelList() {
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/user/list/hostel").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();
		headerParams.add(SecurityConstants.BASIC_HEADER_NAME, token);

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<List<UserHostelDto>> returnType = new ParameterizedTypeReference<List<UserHostelDto>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

	}

	public List<String> getStudentsOnLeave(Integer hostelId, LocalDate date) {
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/studentCheckin/leaveRecords").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		if (Objects.nonNull(hostelId)) {
			queryParams.add("hostelId", hostelId.toString());
		}

		queryParams.add("date", date.toString());

		final HttpHeaders headerParams = new HttpHeaders();
		headerParams.add(SecurityConstants.BASIC_HEADER_NAME, token);

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<List<String>> returnType = new ParameterizedTypeReference<List<String>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public List<UserHostelDetailsDto> getUserHostelDetails(Integer hostelId) {
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/user/hostel/details").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.add("hostelId", hostelId.toString());

		final HttpHeaders headerParams = new HttpHeaders();
		headerParams.add(SecurityConstants.BASIC_HEADER_NAME, token);

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<List<UserHostelDetailsDto>> returnType = new ParameterizedTypeReference<List<UserHostelDetailsDto>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public boolean updateHostelOfUser(Integer userId, Integer hostelId) {

		Object postBody = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("userId", userId);
		uriVariables.put("hostelId", hostelId);

		String path = UriComponentsBuilder.fromPath("/user/update/hostel/{userId}/{hostelId}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();
		headerParams.add(SecurityConstants.BASIC_HEADER_NAME, token);

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
		};

		try {
			String response = restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

			log.info("Response of updating user: {} hostel to {} - {}", userId, hostelId, response);

			return true;

		} catch (Exception e) {
			log.error("Exception while update hostel for user: {} to {}", userId, hostelId, e);
		}

		return false;
	}
}