/**
 * 
 */
package com.stanzaliving.core.payment.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.payment.dto.TransactionInitiateDto;
import com.stanzaliving.core.payment.enums.StanzaPaymentService;

public class TransactionControllerApi {

	private StanzaRestClient restClient;

	public TransactionControllerApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public ResponseDto<TransactionInitiateDto> initiateRazorpayTransaction(StanzaPaymentService stanzaPaymentService, String userId, String transactionId, Double amount) {

		if (Objects.isNull(stanzaPaymentService) || StringUtils.isBlank(transactionId) || StringUtils.isBlank(userId) || Objects.isNull(amount)) {
			throw new IllegalArgumentException("Missing mandatory parameters for transaction");
		}

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/transaction/razorpay/initiate").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.add("service", stanzaPaymentService.toString());
		queryParams.add("userId", userId);
		queryParams.add("transactionId", transactionId);
		queryParams.add("amount", String.valueOf(amount));

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		TypeReference<ResponseDto<TransactionInitiateDto>> returnType = new TypeReference<ResponseDto<TransactionInitiateDto>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

}