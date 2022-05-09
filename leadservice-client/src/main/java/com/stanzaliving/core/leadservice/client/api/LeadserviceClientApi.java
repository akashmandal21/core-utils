/**
 * 
 */
package com.stanzaliving.core.leadservice.client.api;

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

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.website.response.dto.LeadDetailEntity;
import com.stanzaliving.website.response.dto.LeadRequestDto;
import com.stanzaliving.website.response.dto.QualificationQuestionResponseDto;

import lombok.extern.log4j.Log4j2;

@Log4j2
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

	public ResponseDto<String> updateBrokerLead(LeadRequestDto leadRequestDto) {

		Object postBody = leadRequestDto;

		String path = UriComponentsBuilder.fromPath("/lead/qrcode/qualifcation/update").toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<QualificationQuestionResponseDto> getLeadVariantQuestion(String formInterface) {
		Object postBody = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/lead/internal/website/lead/variant/qualification/question")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("form", formInterface);

		final HttpHeaders headLeadDetailEntityerParams = new HttpHeaders();
		final HttpHeaders headerParams = new HttpHeaders();
		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<QualificationQuestionResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<QualificationQuestionResponseDto>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<String> leadUpdate(LeadRequestDto leadRequestDto) {

		Object postBody = leadRequestDto;

		String path = UriComponentsBuilder.fromPath("/lead/internal/website/lead/variant/update").toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}
	
	public ResponseDto<String> rescheduleVisitFromThankyouScreen(LeadRequestDto leadRequestDto) {

		Object postBody = leadRequestDto;

		String path = UriComponentsBuilder.fromPath("/lead/internal/website/reschedule").toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}
	

	public ResponseDto<LeadRequestDto> leadCreation(LeadRequestDto leadRequestDto) {

		try {
			log.info("LeadRequestDto while creating the lead {}", leadRequestDto);

			Object postBody = leadRequestDto;

			String path = UriComponentsBuilder.fromPath("/lead/internal/create/temp/variant").toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<ResponseDto<LeadRequestDto>> returnType = new ParameterizedTypeReference<ResponseDto<LeadRequestDto>>() {
			};

			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

		} catch (Exception e) {
			log.error("Error while creating the lead {}", e);
		}

		return null;
	}

	public ResponseDto<LeadRequestDto> leadMigration(LeadRequestDto leadRequestDto) {

		try {
			log.info("LeadRequestDto while creating the lead {}", leadRequestDto);

			Object postBody = leadRequestDto;

			String path = UriComponentsBuilder.fromPath("/lead/internal/create/variant").toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<ResponseDto<LeadRequestDto>> returnType = new ParameterizedTypeReference<ResponseDto<LeadRequestDto>>() {
			};

			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

		} catch (Exception e) {
			log.error("Error while creating the lead {}", e);
		}

		return null;
	}
	
	
	public ResponseDto<LeadRequestDto> createCommonLeadFromWebsite(LeadRequestDto leadRequestDto) {

		Object postBody = leadRequestDto;

		String path = UriComponentsBuilder.fromPath("/lead/internal/website/create/lead").toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<LeadRequestDto>> returnType = new ParameterizedTypeReference<ResponseDto<LeadRequestDto>>() {
		};

		try {
			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Error while creating the lead {}", e);
			return null;
		}	
	}
	
	public ResponseDto<LeadRequestDto> createScheduledVisitLead(LeadRequestDto leadRequestDto) {

		try {
			log.info("LeadRequestDto while creating the lead {}", leadRequestDto);

			Object postBody = leadRequestDto;

			String path = UriComponentsBuilder.fromPath("/lead/website/create").toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<ResponseDto<LeadRequestDto>> returnType = new ParameterizedTypeReference<ResponseDto<LeadRequestDto>>() {
			};

			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

		} catch (Exception e) {
			log.error("Error while creating the lead {}", e);
		}

		return null;
	}
	
	public ResponseDto<String> updateMobileVerifiedStatus(String phone) {

		Object postBody = null;

		String path = UriComponentsBuilder.fromPath("/lead/internal/update/phone/verified").toUriString();

		final HttpHeaders headerParams = new HttpHeaders();
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("phone", phone);

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
		};

		try {
			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Error while creating the lead {}", e);
			return null;
		}	
	}
	
	public String updateLeadWebsite(LeadRequestDto leadRequestDto) {

		Object postBody = leadRequestDto;

		String path = UriComponentsBuilder.fromPath("/lead/website/update").toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}
	
	public ResponseDto<Boolean> checkLeadByPhone(String phone) {
		Object postBody = null;
		
		log.info("Request received for checkLeadByPhone " + phone);

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/lead/internal/check/phone")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("phone", phone);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<LeadDetailEntity> search(String phoneNumber, String leadUuid) {

		log.debug("Lead client received phone number {}", phoneNumber);
		Object postBody = null;

		String path = UriComponentsBuilder.fromPath("/internal/lead/leadDetail").toUriString();

		final HttpHeaders headerParams = new HttpHeaders();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		if(Objects.nonNull(phoneNumber))
			queryParams.add("phone", phoneNumber);
		if(Objects.nonNull(leadUuid))
			queryParams.add("leadUuid", leadUuid);

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<LeadDetailEntity>> returnType = new ParameterizedTypeReference<ResponseDto<LeadDetailEntity>>() {
		};

		try {
			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Error while creating the lead {}", e);
			return null;
		}
	}
	
	public ResponseDto<LeadRequestDto> fetchPrebookedRefundEligibleLeads(String phone) {

		Object postBody = null;

		String path = UriComponentsBuilder.fromPath("internal/prebooking/refund/fetch/eligible/leads").toUriString();

		final HttpHeaders headerParams = new HttpHeaders();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		if(Objects.nonNull(phone))
			queryParams.add("phone", phone);

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<LeadRequestDto>> returnType = new ParameterizedTypeReference<ResponseDto<LeadRequestDto>>() {
		};

		try {
			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Error while fetching prebooked refund eligible leads {}", e);
			return null;
		}
	}
}