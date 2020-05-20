/**
 * 
 */
package com.stanzaliving.core.user.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.PageResponse;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.constants.SecurityConstants;
import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.user.acl.dto.UserDeptLevelRoleNameUrlExpandedDto;
import com.stanzaliving.core.user.dto.UserDto;
import com.stanzaliving.core.user.dto.UserManagerProfileRequestDto;
import com.stanzaliving.core.user.dto.UserProfileDto;
import com.stanzaliving.core.user.request.dto.AddUserRequestDto;

/**
 * @author naveen.kumar
 *
 * @date 03-Nov-2019
 *
 **/
public class UserClientApi {

	private StanzaRestClient restClient;

	public UserClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public ResponseDto<PageResponse<UserProfileDto>> getUserDetails(int pageNumber, int pageSize, List<String> userIds) {

		if (pageNumber < 1 || pageSize < 1 || CollectionUtils.isEmpty(userIds)) {
			throw new IllegalArgumentException("Please check all the provided params!!");
		}

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("pageNo", pageNumber);
		uriVariables.put("limit", pageSize);

		String path = UriComponentsBuilder.fromPath("/search/{pageNo}/{limit}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.putAll(restClient.parameterToMultiValueMap(null, "userIds", userIds));

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<PageResponse<UserProfileDto>>> returnType = new ParameterizedTypeReference<ResponseDto<PageResponse<UserProfileDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<List<String>> getUserIdsMappedToManagerId(String managerId) {
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("managerId", managerId);

		String path = UriComponentsBuilder.fromPath("/usermanagermapping/{managerId}").buildAndExpand(uriVariables).toUriString();

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

	public ResponseDto<List<UserDeptLevelRoleNameUrlExpandedDto>> getUserRolesBe(String userUuid) {
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("userUuid", userUuid);

		String path = UriComponentsBuilder.fromPath("/acl/user/be/{userUuid}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<UserDeptLevelRoleNameUrlExpandedDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<UserDeptLevelRoleNameUrlExpandedDto>>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

	}

	public ResponseDto<String> getManagerNameForUser(String userId) {
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("userId", userId);

		String path = UriComponentsBuilder.fromPath("/usermanagermapping/managername/{userId}").buildAndExpand(uriVariables).toUriString();

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
	
	public ResponseDto<UserProfileDto> getManagerProfileForUser(String userId) {
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("userId", userId);
		
		String path = UriComponentsBuilder.fromPath("/usermanagermapping/managerprofile/{userId}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<UserProfileDto>> returnType = new ParameterizedTypeReference<ResponseDto<UserProfileDto>>() {
		};
		
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

	}

	public ResponseDto<UserDto> addUser(String token, AddUserRequestDto addUserRequestDto) {

		if (StringUtils.isBlank(token)) {
			throw new IllegalArgumentException("Token missing for adding user");
		}

		if (Objects.isNull(addUserRequestDto)) {
			throw new IllegalArgumentException("Request is null for adding user");
		}

		Object postBody = addUserRequestDto;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/add").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		String tokenCookie = SecurityConstants.TOKEN_HEADER_NAME + "=" + token;

		final HttpHeaders headerParams = new HttpHeaders();
		headerParams.add(SecurityConstants.COOKIE_HEADER_NAME, tokenCookie);

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<UserDto>> returnType = new ParameterizedTypeReference<ResponseDto<UserDto>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}
	
	
	public ResponseDto<Map<String, UserProfileDto>> getManagerProfileForUsers(List<String> userIds) {
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		
		String path = UriComponentsBuilder.fromPath("/usermanagermapping/managerprofiles").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Map<String, UserProfileDto>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, UserProfileDto>>>() {
		};
		
		UserManagerProfileRequestDto userManagerProfileRequestDto = new UserManagerProfileRequestDto();
		userManagerProfileRequestDto.setUserUuids(userIds);
		
		postBody = userManagerProfileRequestDto;
		
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

	}
	
	public ResponseDto<List<String>> getUserIdsByDepartmentRolenameAccessLevelId
			(Department department, String roleName, String accessLevelId) {
		
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("department", department);
		uriVariables.put("roleName", roleName);
		uriVariables.put("accessLevelId", accessLevelId);

		String path = UriComponentsBuilder.fromPath("/internal/acl/useridByRoleName/{department}/{roleName}/{accessLevelId}")
						.buildAndExpand(uriVariables).toUriString();

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

	public ResponseDto<List<UserProfileDto>> getUserProfilesByManagerId(String managerUuid) {
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("managerId", managerUuid);
		
		String path = UriComponentsBuilder.fromPath("/usermanagermapping//userprofiles/{managerId}")
										  .buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<UserProfileDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<UserProfileDto>>>() {
		};
				
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

	}

	public ResponseDto<UserProfileDto> getUserProfileByUuid(String userUuid) {

		Object postBody = null;

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("userUuid", userUuid);

		String path = UriComponentsBuilder.fromPath("/internal/details/{userUuid}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<UserProfileDto>> returnType = new ParameterizedTypeReference<ResponseDto<UserProfileDto>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}
}