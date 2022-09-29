package com.stanzaliving.core.survey.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.stanzaliving.survey.dto.UserFeedBackResponse;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class SurveyClientApi {

	private StanzaRestClient restClient;

	public SurveyClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public ResponseDto<UserFeedBackResponse> getUserFeedbackResponse(String userId, String orderId) {
		Object postBody = null;

		log.info("Get User Feedback Response for userId {} orderId {}", userId, orderId);
		
		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("userId", userId);
		uriVariables.put("orderId", orderId);

		String path = UriComponentsBuilder.fromPath("/internal/get/user-feedback-response/user/{userId}/order/{orderId}").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<UserFeedBackResponse> > returnType = new ParameterizedTypeReference<ResponseDto<UserFeedBackResponse> >() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<Integer> getCampaignPriorityOrder(String campaignId) {
		Object postBody = null;

		log.info("Get Campaign Priority Order for campaignId {}", campaignId);

		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("campaignId", campaignId);

		String path = UriComponentsBuilder.fromPath("/internal/get/campaign/{campaignId}/priority").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Integer> > returnType = new ParameterizedTypeReference<ResponseDto<Integer> >() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}
}