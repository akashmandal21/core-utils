/**
 * 
 */
package com.stanzaliving.core.payment.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.payment.dto.PaymentDto;
import com.stanzaliving.core.payment.dto.TransactionInitiateDto;
import com.stanzaliving.core.payment.enums.StanzaPaymentService;

import lombok.extern.log4j.Log4j2;
@Log4j2
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
	
	public ResponseDto<PaymentDto> checkTransactionStatusInDb(String paymentId) {
		Object postBody = null;

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("paymentId", paymentId);

		String path = UriComponentsBuilder.fromPath("/internal/check/status/paymentId/{paymentId}")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<PaymentDto>> returnType = new ParameterizedTypeReference<ResponseDto<PaymentDto>>() {
		};
		try {
			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept,
					returnType);
		} catch (Exception e) {
			log.error("Exception while fetching payment Status {} ", paymentId);
		}
		return null;

	}

}