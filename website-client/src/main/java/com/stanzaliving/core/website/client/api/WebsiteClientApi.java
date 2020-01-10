/**
 * 
 */
package com.stanzaliving.core.website.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.website.response.dto.ScheduledVisitsResponseDTO;

/**
 * @author naveen.kumar
 *
 * @date 03-Nov-2019
 *
 **/
public class WebsiteClientApi {

	private StanzaRestClient restClient;

	public WebsiteClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public ScheduledVisitsResponseDTO getScheduledVisitsForPhone(String phone) {
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("phone", phone);

		String path = UriComponentsBuilder.fromPath("scheduledVisit/{phone}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ScheduledVisitsResponseDTO> returnType = new ParameterizedTypeReference<ScheduledVisitsResponseDTO>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

	}
}