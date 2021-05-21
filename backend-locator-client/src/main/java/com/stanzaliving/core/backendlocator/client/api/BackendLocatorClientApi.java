/**
 * 
 */
package com.stanzaliving.core.backendlocator.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.locator.dto.LocatorEstateViewDto;

/**
 * @author raj.kumar
 *
 */
@Log4j2
public class BackendLocatorClientApi {

	private StanzaRestClient restClient;

	public BackendLocatorClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public ResponseDto<LocatorEstateViewDto> getLocatorData(String cityName, double latitude, double longitude) {
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("cityName", cityName);
		uriVariables.put("latitude", latitude);
		uriVariables.put("longitude", longitude);
		
		String path = UriComponentsBuilder.fromPath("/estate/city/{cityName}/{latitude}/{longitude}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<LocatorEstateViewDto>> returnType = new ParameterizedTypeReference<ResponseDto<LocatorEstateViewDto>>() {
		};
		
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<Void> addCompetitor(String cityName, double latitude, double longitude, String compName) {
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("cityName", cityName);
		uriVariables.put("latitude", latitude);
		uriVariables.put("longitude", longitude);
		uriVariables.put("name", compName);
		String path = UriComponentsBuilder.fromPath("/internal/add/copetitor/{name}/{cityName}/{latitude}/{longitude}").buildAndExpand(uriVariables).toUriString();


		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}
}