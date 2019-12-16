/**
 * 
 */
package com.stanzaliving.core.user.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.constants.SecurityConstants;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.user.acl.request.dto.AddUserDeptLevelRoleRequestDto;
import com.stanzaliving.core.user.acl.request.dto.RevokeUserDeptLevelRoleRequestDto;
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

/**
 * @author naveen.kumar
 *
 * @date 11-Dec-2019
 *
 **/
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
			throw new IllegalArgumentException("Token missing for adding user roles");
		}

		if (Objects.isNull(reokeUserDeptroleRequestDto)) {
			throw new IllegalArgumentException("Request is null for adding role for user");
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
}
