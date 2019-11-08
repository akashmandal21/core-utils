/**
 * 
 */
package com.stanzaliving.core.user.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.stanzaliving.core.user.dto.UserDto;

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

	public ResponseDto<PageResponse<UserDto>> getUserDetails(int pageNumber,int pageSize,List<String> userIds) {

		if (pageNumber < 1 || pageSize < 1 || CollectionUtils.isEmpty(userIds) ) {
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

		ParameterizedTypeReference<ResponseDto<PageResponse<UserDto>>> returnType = new ParameterizedTypeReference<ResponseDto<PageResponse<UserDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

}