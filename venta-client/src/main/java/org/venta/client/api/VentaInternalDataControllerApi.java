
package org.venta.client.api;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;
import org.venta.client.dto.ResidenceGstDto;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;

import lombok.extern.log4j.Log4j2;



/**
 * @author Abhishek.kumar
 *
 * @date 12-May-2020
 *
 **/

@Log4j2
public class VentaInternalDataControllerApi {

	private StanzaRestClient restClient;

	public VentaInternalDataControllerApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}
	
	public List<ResidenceGstDto> getGstDetailsForResidences() {
		
		String path = UriComponentsBuilder.fromPath("/residence-gst-details").buildAndExpand().toUriString();
		
		final HttpHeaders headerParams = new HttpHeaders();

		ParameterizedTypeReference<List<ResidenceGstDto>> returnType = new ParameterizedTypeReference<List<ResidenceGstDto>>() {
		};
		
		return restClient.invokeAPI(path, HttpMethod.GET, null, null, headerParams, null, returnType);
		
	}

}