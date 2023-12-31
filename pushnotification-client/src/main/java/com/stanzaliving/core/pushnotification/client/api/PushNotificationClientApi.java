/**
 * 
 */
package com.stanzaliving.core.pushnotification.client.api;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.stanzaliving.pushnotification.enums.ServiceName;
import com.stanzaliving.pushnotification.pojo.PushNotificationRequestDto;
import com.stanzaliving.pushnotification.pojo.PushNotificationResponseDto;

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

/**
 * @author raj.kumar
 *
 */
@Log4j2
public class PushNotificationClientApi {

	private StanzaRestClient restClient;

	public PushNotificationClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public ResponseDto<Boolean> sendPushNotificationRequest(PushNotificationRequestDto pushNotificationRequestDto) {

		log.info("Send push notification request dto " + pushNotificationRequestDto);

		String path = UriComponentsBuilder.fromPath("/send").toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, pushNotificationRequestDto, headerParams, accept,
				returnType);
	}


	public ResponseDto<List<PushNotificationResponseDto>> getPushNotificationLog(ServiceName serviceName, int pageNo, int limit) {
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("serviceName", serviceName);
		
		String path = UriComponentsBuilder.fromPath("/get/{serviceName}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.put("pageNo", Arrays.asList(String.valueOf(pageNo)));
		queryParams.put("limit", Arrays.asList(String.valueOf(limit)));
		
		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<PushNotificationResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<PushNotificationResponseDto>>>() {
		};
		
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}
}