/**
 * 
 */
package com.stanzaliving.core.user.client.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.user.acl.dto.RoleDto;
import com.stanzaliving.core.user.request.dto.*;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.lang.Nullable;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.PageResponse;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.constants.SecurityConstants;
import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.user.acl.dto.UserDeptLevelRoleNameUrlExpandedDto;
import com.stanzaliving.core.user.acl.request.dto.UserRoleSearchDto;
import com.stanzaliving.core.user.dto.AccessLevelRoleRequestDto;
import com.stanzaliving.core.user.dto.UserDto;
import com.stanzaliving.core.user.dto.UserManagerProfileRequestDto;
import com.stanzaliving.core.user.dto.UserProfileDto;
import com.stanzaliving.core.user.dto.UserPropertyAndProfileMappingDto;
import com.stanzaliving.core.user.dto.UserRoleCacheDto;
import com.stanzaliving.core.user.dto.response.UserContactDetailsResponseDto;
import com.stanzaliving.core.user.request.dto.UpdateUserRequestDto;

import lombok.extern.log4j.Log4j2;

/**
 * @author naveen.kumar
 *
 * @date 03-Nov-2019
 *
 **/
@Log4j2
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

	public ResponseDto<PageResponse<UserProfileDto>> getUserDetailsRequest(UserRequestDto userRequestDto) {

		log.info("UserRequestDto: {} ", userRequestDto);

		if (Objects.isNull(userRequestDto) || userRequestDto.getPageNo() < 1 || userRequestDto.getLimit() < 1
				|| CollectionUtils.isEmpty(userRequestDto.getUserIds())) {

			throw new IllegalArgumentException("Please check all the provided params!!");
		}

		Object postBody = userRequestDto;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/search/user").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<PageResponse<UserProfileDto>>> returnType = new ParameterizedTypeReference<ResponseDto<PageResponse<UserProfileDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
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



	public ResponseDto<UserDto> updateUserDetails( UpdateUserRequestDto updateUserRequestDto) {


		Object postBody = updateUserRequestDto;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/update/mobile").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();
		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<UserDto>> returnType = new ParameterizedTypeReference<ResponseDto<UserDto>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}


	public ResponseDto<UserDto> addUserInternal(AddUserRequestDto addUserRequestDto) {
		if (Objects.isNull(addUserRequestDto)) {
			throw new IllegalArgumentException("Request is null for adding user");
		}

		Object postBody = addUserRequestDto;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		String path = UriComponentsBuilder.fromPath("/internal/add").buildAndExpand(uriVariables).toUriString();
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		final HttpHeaders headerParams = new HttpHeaders();
		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<UserDto>> returnType = new ParameterizedTypeReference<ResponseDto<UserDto>>() {		};
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

	public ResponseDto<List<String>> getUserIdsByDepartmentRolenameAccessLevelId(Department department, String roleName, String accessLevelId) {
		return getUserIdsByDepartmentRolenameAccessLevelId(department, roleName, Arrays.asList(accessLevelId));
	}

	public ResponseDto<List<String>> getUserIdsByDepartmentRolenameAccessLevelId(Department department, String roleName, List<String> accessLevelId) {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("department", department);
		uriVariables.put("roleName", roleName);
		uriVariables.put("accessLevelId", StringUtils.join(accessLevelId, ','));

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

	public ResponseDto<List<UserContactDetailsResponseDto>> getUserContactDetailsByRoleParams(UserRoleSearchDto userRoleSearchDto) {
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("roleName", userRoleSearchDto.getRoleName());
		uriVariables.put("department", userRoleSearchDto.getDepartment());
		uriVariables.put("accessLevelId", userRoleSearchDto.getAccessLevelId());

		String path = UriComponentsBuilder.fromPath("/internal/acl/usercontactdetails/{department}/{roleName}/{accessLevelId}")
				.buildAndExpand(uriVariables)
				.toUriString();

		MultiValueMap<String, String> queryMap = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();
		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<UserContactDetailsResponseDto>>> userContactResponse = new ParameterizedTypeReference<ResponseDto<List<UserContactDetailsResponseDto>>>() {
		};
		try {
			return restClient.invokeAPI(path, HttpMethod.GET, queryMap, null, headerParams, accept, userContactResponse);
		} catch (Exception e) {
			log.error("exception while fetching contact details from user service", e);
			return null;
		}
	}

	public ResponseDto<UserProfileDto> getUserProfileByUuid(String userUuid) {

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
		try {
			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
		}
		catch (Exception ex) {
			log.error("Error occurred while fetching user details from UserId",ex);
			return null;
		}
	}

	public ResponseDto<List<UserProfileDto>> getAllUsers() {

		Object postBody = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/details/all").buildAndExpand(uriVariables).toUriString();

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
	
	public ResponseDto<PageResponse<UserProfileDto>> getUserDetailsByPhone(String phone) {

		if (StringUtils.isEmpty(phone)) {
			throw new IllegalArgumentException("Please check all the provided params!!");
		}

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("pageNo", 1);
		uriVariables.put("limit", 1);

		String path = UriComponentsBuilder.fromPath("/search/{pageNo}/{limit}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.putAll(restClient.parameterToMultiValueMap(null, "mobile", phone));

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<PageResponse<UserProfileDto>>> returnType = new ParameterizedTypeReference<ResponseDto<PageResponse<UserProfileDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}
	
	public UserDto getUserDtoByRoleAndAccessLevel(AccessLevelRoleRequestDto cityRolesRequestDto) {
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/user/role/accesslevel").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<UserDto> returnType = new ParameterizedTypeReference<UserDto>() {
		};

		postBody = cityRolesRequestDto;

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

	}

	public ResponseDto<UserProfileDto> getUserDetailsByMobileNo(String mobileNo) {

		Object postBody = null;

		final Map<String, Object> uriVariables = new HashMap<>();
		

		String path = UriComponentsBuilder.fromPath("/internal/details/mobile").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("mobileNo", mobileNo);
		
		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<UserProfileDto>> returnType = new ParameterizedTypeReference<ResponseDto<UserProfileDto>>() {
		};
		try {
			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		}
		catch (Exception ex) {
			log.error("Error occurred while fetching user details from mobile number ",ex);
			return null;
		}
	}

	public ResponseDto<List<UserRoleCacheDto>> getCacheableRoles(List<String> userRoles) {
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/accesslevel/cachemaps").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<UserRoleCacheDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<UserRoleCacheDto>>>() {
		};

		postBody = userRoles;

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

	}

	public ResponseDto<List<UserProfileDto>> getAllUsersByUuidIn(ActiveUserRequestDto activeUserRequestDto) {

		Object postBody = activeUserRequestDto;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/details/user/all").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<UserProfileDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<UserProfileDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<Map<String, UserProfileDto>> getUserProfileForUsers(List<String> userIds) {

		Object postBody = null;

		log.info("userIds for geting UserProfileDto is {}", userIds);

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/details/userProfiles").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		ParameterizedTypeReference<ResponseDto<Map<String, UserProfileDto>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, UserProfileDto>>>() {
		};

		UserManagerProfileRequestDto userManagerProfileRequestDto = new UserManagerProfileRequestDto();
		userManagerProfileRequestDto.setUserUuids(userIds);

		postBody = userManagerProfileRequestDto;
		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

	}

	public ResponseDto<UserDto> updateUserProfileDetails(UpdateUserRequestDto updateUserRequestDto) {


		Object postBody = updateUserRequestDto;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/update").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();
		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<UserDto>> returnType = new ParameterizedTypeReference<ResponseDto<UserDto>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}


	public ResponseDto<UserProfileDto> getUserProfileByEmail(String email) {

		Object postBody = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/details/email").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.add("email", email);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<UserProfileDto>> returnType = new ParameterizedTypeReference<ResponseDto<UserProfileDto>>() {
		};
		
		try {
			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		}
		catch (Exception ex) {
			log.error("Error occurred while fetching user details from email ",ex);
			return null;
		}
	}

	public List<UserPropertyAndProfileMappingDto> getUsersMappedToProperty(String propertyId) {

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/mapping/property/users").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.add("propertyId", propertyId);

		TypeReference<ResponseDto<List<UserPropertyAndProfileMappingDto>>> returnType = new TypeReference<ResponseDto<List<UserPropertyAndProfileMappingDto>>>() {};

		ResponseDto<List<UserPropertyAndProfileMappingDto>> responseDto = null;

		try {

			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting users MappedToProperty", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new ArrayList<>();
	}



	public ResponseDto<List<RoleDto>> getFilterRoles(Department department, AccessLevel accessLevel, String roleName, String token) {

		Object postBody = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/acl/role/list").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		if(!Objects.isNull(department)) {
			queryParams.add("department", department.shortCode);
		}
		if(!Objects.isNull(accessLevel)) {
			queryParams.add("accessLevel", accessLevel.toString());
		}
		if(!Objects.isNull(roleName)) {
			queryParams.add("department", roleName);
		}

		final HttpHeaders headerParams = new HttpHeaders();
		String tokenCookie = SecurityConstants.TOKEN_HEADER_NAME + "=" + token;
		headerParams.add(SecurityConstants.COOKIE_HEADER_NAME, tokenCookie);

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<RoleDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<RoleDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<List<RoleDto>> getRoleByDepartment(Department department, @Nullable  AccessLevel accessLevel, String cookieToken) {

		Object postBody = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/acl/role/getRoles").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.add("department", department.shortCode);
		if(!Objects.isNull(accessLevel)) {
			queryParams.add("accessLevel", accessLevel.toString());
		}

		final HttpHeaders headerParams = new HttpHeaders();
		String tokenCookie = SecurityConstants.TOKEN_HEADER_NAME + "=" + cookieToken;
		headerParams.add(SecurityConstants.COOKIE_HEADER_NAME, tokenCookie);

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<RoleDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<RoleDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<RoleDto> getRoleByUuid(String roleUuid, String cookieToken) {

		Object postBody = null;

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("roleUuid", roleUuid);

		String path = UriComponentsBuilder.fromPath("/acl/role/{roleUuid}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();
		String tokenCookie = SecurityConstants.TOKEN_HEADER_NAME + "=" + cookieToken;
		headerParams.add(SecurityConstants.COOKIE_HEADER_NAME, tokenCookie);

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<RoleDto>> returnType = new ParameterizedTypeReference<ResponseDto<RoleDto>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}


}
