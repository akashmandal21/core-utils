/**
 * 
 */
package com.stanzaliving.core.sfr.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.sfr.SfrReportSummaryDto;

/**
 * @author raj.kumar
 *
 *
 **/
public class SfrClientApi {

	private StanzaRestClient restClient;

	public SfrClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public ResponseDto<SfrReportSummaryDto> getSfrSummary(String propertyUuid) {
		
		Object postBody = null;

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("propertyUuid", propertyUuid);

		String path = UriComponentsBuilder.fromPath("/internal/property/sfrSummary/{propertyUuid}")
								.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<SfrReportSummaryDto>> returnType = new ParameterizedTypeReference<ResponseDto<SfrReportSummaryDto>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

}