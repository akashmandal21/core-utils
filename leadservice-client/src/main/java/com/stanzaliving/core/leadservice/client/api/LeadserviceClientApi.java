/**
 * 
 */
package com.stanzaliving.core.leadservice.client.api;

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
import com.stanzaliving.website.response.dto.LeadRequestDto;
import com.stanzaliving.website.response.dto.QualificationQuestionResponseDto;

public class LeadserviceClientApi {

	private StanzaRestClient restClient;

	public LeadserviceClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public ResponseDto<QualificationQuestionResponseDto> getLeadQualificationQuestions() {
		Object postBody = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("lead/website/qualification/question").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<QualificationQuestionResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<QualificationQuestionResponseDto>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<QualificationQuestionResponseDto> getLeadQualificationQuestions(String questionUuid,
			String answer) {
		Object postBody = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("lead/website/qualification/question").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("questionUuid", questionUuid);
		queryParams.add("answer", answer);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<QualificationQuestionResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<QualificationQuestionResponseDto>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}
	
	public ResponseDto<String> leadUpdate(LeadRequestDto leadRequestDto) {

		Object postBody = leadRequestDto;

		String path = UriComponentsBuilder.fromPath("/lead/").toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<String> > returnType = new ParameterizedTypeReference<ResponseDto<String> >() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}
}