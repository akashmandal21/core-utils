/**
 * 
 */
package com.stanzaliving.core.counter.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.exception.PreconditionFailedException;
import com.stanzaliving.core.base.http.StanzaRestClient;
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

/**
 * @author naveen.kumar
 *
 * @date 03-Nov-2019
 *
 **/
public class CounterControllerApi {

	private StanzaRestClient restClient;

	public CounterControllerApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	@Deprecated
	public ResponseDto<Long> getCounterForKey(String key) {

		if (StringUtils.isBlank(key)) {
			throw new IllegalArgumentException("Counter Key cannot be blank");
		}

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("key", key);

		String path = UriComponentsBuilder.fromPath("/get/{key}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Long>> returnType = new ParameterizedTypeReference<ResponseDto<Long>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<Long> getCounterForKeyFromParam(String key) {

		if (StringUtils.isBlank(key)) {
			throw new IllegalArgumentException("Counter Key cannot be blank");
		}

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/get").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.putAll(restClient.parameterToMultiValueMap(null, "key", key));

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Long>> returnType = new ParameterizedTypeReference<ResponseDto<Long>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public Long getCounter(String counterKey) {
		return getCounter(counterKey, 1);
	}

	private Long getCounter(String counterKey, int retryAttempt) {
		if (retryAttempt > 5) {
			throw new PreconditionFailedException("Unable to get counter for Vendor. Please retry");
		} else {
			ResponseDto<Long> counterResponse = getCounterForKeyFromParam(counterKey);
			if (counterResponse.isStatus()) {
				return counterResponse.getData();
			} else {
				return getCounter(counterKey, retryAttempt + 1);
			}
		}
	}
}