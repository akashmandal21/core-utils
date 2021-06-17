/**
 * 
 */
package com.stanzaliving.core.paymentplan.client.api;

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

import com.stanzaliving.booking.dto.request.PaymentPlanRequestDto;
import com.stanzaliving.booking.dto.response.PaymentPlanResponseDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PaymentPlanClientApi {

	private StanzaRestClient restClient;

	public PaymentPlanClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public ResponseDto<PaymentPlanResponseDto> getPaymentPlan(PaymentPlanRequestDto paymentPlanRequestDto,String token) {

		Object postBody = null;
		log.info("PaymentPlanRequestDto is {} ", paymentPlanRequestDto);

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/create").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		HttpHeaders headerParams = new HttpHeaders();

        headerParams.add("Cookie", "token=" + token);
        
		final String[] accepts = { "*/*" };

		
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<PaymentPlanResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<PaymentPlanResponseDto>>() {
		};
		postBody = paymentPlanRequestDto;
		
		try {
			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("error while fetching the payment plan {}",e);
			return null;
		}
		
		
	}

}