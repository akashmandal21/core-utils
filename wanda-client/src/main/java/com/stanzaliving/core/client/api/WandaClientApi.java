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

import com.stanzaliving.core.backend.dto.UserHostelDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.transformations.pojo.ResidenceUIDto;
import com.stanzaliving.wanda.dtos.FeaturephoneUserDto;
import com.stanzaliving.wanda.dtos.FullUserDto;
import com.stanzaliving.wanda.dtos.UserCodeIdMapDto;
import com.stanzaliving.wanda.dtos.UserDetailDto;
import com.stanzaliving.wanda.dtos.UserHostelDetailsDto;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class WandaClientApi {

	private StanzaRestClient restClient;

	public WandaClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public FullUserDto getUserDetails(String userUuid) {
		try {
			Object postBody = null;

			log.info("Received request to get FullUserDto of userUuid {}", userUuid);

			final Map<String, Object> uriVariables = new HashMap<>();

			uriVariables.put("userUuid", userUuid);

			String path = UriComponentsBuilder.fromPath("/coreApi/fulluserdto/id/{userUuid}").buildAndExpand(uriVariables)
					.toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };
			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<FullUserDto> returnType = new ParameterizedTypeReference<FullUserDto>() {
			};

			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Error while fetching user details for userUuid: {}", userUuid, e);
		}

		return null;
	}

	public UserDetailDto getUserDetailsByUserCode(String userCode) {

		try {
			Object postBody = null;

			log.info("Received request to get UserDetailDto of userCode: {}", userCode);

			final Map<String, Object> uriVariables = new HashMap<>();
			uriVariables.put("userCode", userCode);

			String path = UriComponentsBuilder.fromPath("/coreApi/userDetailDto/id/{userCode}").buildAndExpand(uriVariables)
					.toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };
			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<UserDetailDto> returnType = new ParameterizedTypeReference<UserDetailDto>() {
			};

			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Error while fetching user details for user code: {}", userCode, e);
		}

		return null;
	}

	public Map<String, String> getUserCodeIdMap(Set<String> userCodes) {

		Object postBody = userCodes;

		log.info("Received request to get Map of userCode {}" , userCodes);

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/coreApi/user/userCodeId").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<Map<String, String>> returnType = new ParameterizedTypeReference<Map<String, String>>() {
		};

		Map<String, String> response = new HashMap<>();

		try {

			response = restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

		} catch (Exception e) {
			log.error("Exception while getting user code map from wanda: ", e);
		}

		return response;
	}

	public List<FeaturephoneUserDto> getFeaturePhoneUsers(String hostel) {

		try {
			Object postBody = null;

			log.info("Received request to get Feature phone user dto of hostel: {}", hostel);

			final Map<String, Object> uriVariables = new HashMap<>();

			String path = UriComponentsBuilder.fromPath("/coreApi/user/list/feature/phone").buildAndExpand(uriVariables).toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
			queryParams.add("hostel", hostel);
			queryParams.add("featurePhone", Boolean.TRUE.toString());

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };
			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<List<FeaturephoneUserDto>> returnType = new ParameterizedTypeReference<List<FeaturephoneUserDto>>() {
			};

			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Error while fetching feature phone users for hostel: {}", hostel, e);
		}

		return null;
	}

	public List<UserHostelDetailsDto> getUserHostelDetails(String hostelId) {
		return getUserHostelDetails(hostelId, false);
	}

	public List<UserHostelDetailsDto> getUserHostelDetails(String hostelId, boolean currentHostel) {
		try {
			Object postBody = null;

			log.info("Received request to get UserHostelDetailsDto of hostelId: {}", hostelId);

			final Map<String, Object> uriVariables = new HashMap<>();

			String path = UriComponentsBuilder.fromPath("/coreApi/user/hostel/details").buildAndExpand(uriVariables)
					.toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			queryParams.add("hostelId", hostelId);
			queryParams.add("currentHostel", String.valueOf(currentHostel));

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };
			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<List<UserHostelDetailsDto>> returnType = new ParameterizedTypeReference<List<UserHostelDetailsDto>>() {
			};

			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Error while fetching users for hostel: {}", hostelId, e);
		}

		return null;
	}

	public List<UserHostelDto> getUserHostelList() {

		Object postBody = null;

		log.info("Received request to get UserHostelDto");

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/coreApi/user/list/hostel").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<List<UserHostelDto>> returnType = new ParameterizedTypeReference<List<UserHostelDto>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

	}

	public boolean updateHostelOfUser(String userId, String hostelId) {

		Object postBody = null;

		log.info("Received request to update Hostel of user {} hostelId {} ", userId, hostelId);

		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("userId", userId);
		uriVariables.put("hostelId", hostelId);

		String path = UriComponentsBuilder.fromPath("/coreApi/user/update/hostel/{userId}/{hostelId}")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<Boolean> returnType = new ParameterizedTypeReference<Boolean>() {
		};

		try {

			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

		} catch (Exception e) {
			log.error("Exception while update hostel for user: {} to {}", userId, hostelId, e);
		}

		return false;
	}

	public UserDetailDto getUserDetailsByMobile(String mobile) {

		Object postBody = null;

		log.info("Received request to get UserDetailDto from mobile: {}", mobile);

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("mobileNumber", mobile);

		String path = UriComponentsBuilder.fromPath("/coreApi/user/userDetailDto/{mobileNumber}")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		try {
			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept,
					UserDetailDto.class);
		} catch (Exception e) {
			log.error("Error while getting user Details from Core by mobile: {}", mobile, e);
		}
		return null;
	}

	public List<UserCodeIdMapDto> getUserDataBySearch(String searchTerm) {

		Object postBody = null;

		log.info("Received request to get UserCodeIdMapDto {}",  searchTerm);

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/coreApi/get/all/user").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("searchTerm", searchTerm);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<List<UserCodeIdMapDto>> returnType = new ParameterizedTypeReference<List<UserCodeIdMapDto>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

	}

	public ResidenceUIDto getUserResidenceDetails(String userUuid, String flag) {

		Object postBody = null;

		log.info("Received request to get ResidenceUIDto of userUuid {}", userUuid);

		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("userUuid", userUuid);
		uriVariables.put("flag", flag);

		String path = UriComponentsBuilder.fromPath("/coreApi//get/user/residence/{flag}/{userCode}")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResidenceUIDto> returnType = new ParameterizedTypeReference<ResidenceUIDto>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public String getUserUuidByUserCode(String userCode) {

		try {
			Object postBody = null;

			log.info("Inside the request for get userUuid {}", userCode);

			final Map<String, Object> uriVariables = new HashMap<>();

			String path = UriComponentsBuilder.fromPath("/coreApi/get/userUuid").buildAndExpand(uriVariables).toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
			queryParams.add("userCode", userCode);

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
			};

			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Error fetching user uuid for userCode: {}", userCode, e);
		}

		return null;
	}

	public String getUserCodeByUserUuid(String userUuid) {

		try {
			Object postBody = null;

			log.info("Inside the request for get userCode {}", userUuid);

			final Map<String, Object> uriVariables = new HashMap<>();

			String path = UriComponentsBuilder.fromPath("/coreApi/get/userCode").buildAndExpand(uriVariables).toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
			queryParams.add("userUuid", userUuid);

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
			};

			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

		} catch (Exception e) {
			log.error("Error fetching user code for userUuid: {}", userUuid, e);
		}

		return null;

	}
	
	public ResidenceUIDto getUserCityMicromarketResidenceUuidsByUserCode(String usercode) {

		try {
			Object postBody = null;

			log.info("Received request to get User City Micromarket Residence Uuids By UserCode: {}", usercode);

			final Map<String, Object> uriVariables = new HashMap<>();
			uriVariables.put("usercode", usercode);
			
			String path = UriComponentsBuilder.fromPath("/coreApi/get/user/residence/userCode/{usercode}").buildAndExpand(uriVariables).toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };
			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<ResidenceUIDto> returnType = new ParameterizedTypeReference<ResidenceUIDto>() {
			};

			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Error while fetching User City Micromarket Residence Uuids By UserCode: {}", usercode, e);
		}

		return null;
	}

}