/**
 * 
 */
package com.stanzaliving.core.user.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.stanzaliving.core.user.acl.dto.UserDeptLevelRoleNameUrlExpandedDto;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.PageResponse;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.user.dto.UserProfileDto;

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
}