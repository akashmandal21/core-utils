/**
 * 
 */
package com.stanzaliving.core.website.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.website.response.dto.ElasticsearchRequestDTO;
import com.stanzaliving.website.response.dto.LeadVisitResponseDTO;
import com.stanzaliving.website.response.dto.ResidenceResponseShortDTO;

/**
 * s
 * 
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

	public List<LeadVisitResponseDTO> getScheduledVisitsForPhone(String phone) {
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("phone", phone);

		String path = UriComponentsBuilder.fromPath("scheduledVisit/{phone}").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<List<LeadVisitResponseDTO>> returnType = new ParameterizedTypeReference<List<LeadVisitResponseDTO>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

	}

	public void insertElasticSearchContent(ElasticsearchRequestDTO elasticsearchRequestDTO) {
		Object postBody = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/elasticsearch/insert").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		postBody = elasticsearchRequestDTO;

		ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {
		};

		restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

	}

	public Object getResidenceDetails(String residenceName) {
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("name", residenceName);

		String path = UriComponentsBuilder.fromPath("/internal/get/residence/{name}").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

	}

}