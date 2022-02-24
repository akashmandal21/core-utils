package com.stanzaliving.core.user.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.constants.SecurityConstants;
import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.user.acl.dto.RoleDto;
import com.stanzaliving.core.user.acl.dto.UserAccessLevelIdsByRoleNameDto;
import com.stanzaliving.core.user.acl.dto.UserDeptLevelRoleNameUrlExpandedDto;
import com.stanzaliving.core.user.acl.request.dto.AddUserDeptLevelRoleRequestDto;
import com.stanzaliving.core.user.acl.request.dto.CheckRoleNamesDto;
import com.stanzaliving.core.user.acl.request.dto.RevokeUserDeptLevelRoleRequestDto;
import com.stanzaliving.core.user.dto.response.UserContactDetailsResponseDto;
import com.stanzaliving.core.user.enums.EnumListing;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class AclUserClientApi {

	private StanzaRestClient restClient;

	public AclUserClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public ResponseDto<Void> addUserAclRole(String token, AddUserDeptLevelRoleRequestDto addUserDeptLevelRoleRequestDto) {

		if (StringUtils.isBlank(token)) {
			throw new IllegalArgumentException("Token missing for adding user roles");
		}

		if (Objects.isNull(addUserDeptLevelRoleRequestDto)) {
			throw new IllegalArgumentException("Request is null for adding role for user");
		}

		Object postBody = addUserDeptLevelRoleRequestDto;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/acl/user/add/role").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		String tokenCookie = SecurityConstants.TOKEN_HEADER_NAME + "=" + token;

		final HttpHeaders headerParams = new HttpHeaders();
		headerParams.add(SecurityConstants.COOKIE_HEADER_NAME, tokenCookie);

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<Void> revokeUserAclRole(String token, RevokeUserDeptLevelRoleRequestDto reokeUserDeptroleRequestDto) {

		if (StringUtils.isBlank(token)) {
			throw new IllegalArgumentException("Token missing for revoking user roles");
		}

		if (Objects.isNull(reokeUserDeptroleRequestDto)) {
			throw new IllegalArgumentException("Request is null for revoking role from user");
		}

		Object postBody = reokeUserDeptroleRequestDto;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/acl/user/revoke/department/level/levelEntityList").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		String tokenCookie = SecurityConstants.TOKEN_HEADER_NAME + "=" + token;

		final HttpHeaders headerParams = new HttpHeaders();
		headerParams.add(SecurityConstants.COOKIE_HEADER_NAME, tokenCookie);

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

	}

	public ResponseDto<List<String>> getUsersForRole(Department department, String roleName, String accessLevelId) {

		if (Objects.isNull(department) || StringUtils.isBlank(roleName) || StringUtils.isEmpty(accessLevelId)) {
			throw new IllegalArgumentException("Missing arguments");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("department", department);
		uriVariables.put("roleName", roleName);
		uriVariables.put("accessLevelId", accessLevelId);

		String path = UriComponentsBuilder.fromPath("/internal/acl/useridByRoleName/{department}/{roleName}/{accessLevelId}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<String>>> returnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
	}

	public ResponseDto<List<UserContactDetailsResponseDto>> getUserDetailsForRole(Department department, String roleName, String accessLevelId) {

		if (Objects.isNull(department) || StringUtils.isBlank(roleName) || StringUtils.isEmpty(accessLevelId)) {
			throw new IllegalArgumentException("Missing arguments");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("department", department);
		uriVariables.put("roleName", roleName);
		uriVariables.put("accessLevelId", accessLevelId);

		String path = UriComponentsBuilder.fromPath("/internal/acl/usercontactdetails/{department}/{roleName}/{accessLevelId}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<UserContactDetailsResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<UserContactDetailsResponseDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
	}

	public ResponseDto<Map<String, List<String>>> getUseridAccessLevelIdByRoleName(UserAccessLevelIdsByRoleNameDto userAccessLevelIdsByRoleNameDto) {

		Object postBody = userAccessLevelIdsByRoleNameDto;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/acl/useridAccessLevelIdByRoleName").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();


		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Map<String, List<String>>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, List<String>>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

	}

	public ResponseDto<Map<String, List<String>>> getUserIdAccessLevelIdByDepartmentRolenameAccessLevelId(Department department, String roleName, List<String> accessLevelId) {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("department", department);
		uriVariables.put("roleName", roleName);
		uriVariables.put("accessLevelId", StringUtils.join(accessLevelId, ','));

		String path = UriComponentsBuilder.fromPath("/internal/acl/useridAccessLevelIdByRoleName/{department}/{roleName}/{accessLevelId}")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Map<String, List<String>>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, List<String>>>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

	}

	public ResponseDto<Map<String, List<String>>> getActiveUserIdAccessLevelIdByDepartmentRoleNameAccessLevelId(Department department, String roleName, List<String> accessLevelId) {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("department", department);
		uriVariables.put("roleName", roleName);
		uriVariables.put("accessLevelId", StringUtils.join(accessLevelId, ','));

		String path = UriComponentsBuilder.fromPath("/internal/acl/activeUseridAccessLevelIdByRoleName/{department}/{roleName}/{accessLevelId}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Map<String, List<String>>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, List<String>>>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

	}

	public ResponseDto<List<UserDeptLevelRoleNameUrlExpandedDto>> getUserInfoByEmailId(String email) {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("email", email);

		String path = UriComponentsBuilder.fromPath("/internal/acl/user/fe/{email}")
				.buildAndExpand(uriVariables).toUriString();

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

	public ResponseDto<List<EnumListing<Department>>> getDepartmentList(String token) {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/department/list")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();
		String tokenCookie = SecurityConstants.TOKEN_HEADER_NAME + "=" + token;
		headerParams.add(SecurityConstants.COOKIE_HEADER_NAME, tokenCookie);

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<EnumListing<Department>>>> returnType = new ParameterizedTypeReference<ResponseDto<List<EnumListing<Department>>>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

	}

	public ResponseDto<List<RoleDto>> checkRolesInACL(CheckRoleNamesDto checkRoleNamesDto) {
		CheckRoleNamesDto postBody = checkRoleNamesDto;
		final Map<String, Object> uriVariables = new HashMap<>();
		String path = UriComponentsBuilder.fromPath("/acl/role/getRolesByDepartmentAndNames")
				.buildAndExpand(uriVariables)
				.toUriString();
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		final HttpHeaders headerParams = new HttpHeaders();
		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
		ParameterizedTypeReference<ResponseDto<List<RoleDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<RoleDto>>>() {
		};
		try {
			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			return null;
		}
	}

}
