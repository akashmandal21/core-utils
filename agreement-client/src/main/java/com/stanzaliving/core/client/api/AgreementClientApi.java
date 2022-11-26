package com.stanzaliving.core.client.api;

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

import com.stanzaliving.agreement.dto.request.DocumentRequestDTO;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.wanda.venta.response.AgreementResponseDto;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class AgreementClientApi {

	private StanzaRestClient restClient;

	public AgreementClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public ResponseDto<AgreementResponseDto> getAgreementLink(String referenceId) {

		try {
			Object postBody = null;

			log.info("get User details by userUuid is {} ", referenceId);

			final Map<String, Object> uriVariables = new HashMap<>();

			uriVariables.put("referenceId", referenceId);

			String path = UriComponentsBuilder.fromPath("/internal/get/{referenceId}").buildAndExpand(uriVariables)
					.toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<ResponseDto<AgreementResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<AgreementResponseDto>>() {
			};

			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("error while fetching the user details " + e);
		}

		return null;

	}
	

	public Void createAgreement(String bookingUUid) {

		try {

			log.info("create agreement for referenceId {}", bookingUUid);

			Object postBody = null;
			
			final Map<String, Object> uriVariables = new HashMap<>();
	        uriVariables.put("booking-uuid", bookingUUid);

			String path = UriComponentsBuilder.fromPath("/agreement-booking/{booking-uuid}/v1/create-agreement").buildAndExpand(uriVariables).toUriString();
			
			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

	        final HttpHeaders headerParams = new HttpHeaders();
	        
			final String[] accepts = {
					"*/*"
			};
			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {
			};

			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("error while fetching the user details " + e);
		}

		return null;

	}
    
	public Void createAddendum(String bookingUUid) {

		try {

			log.info("create addendum for referenceId ", bookingUUid);

			Object postBody = null;
			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
			queryParams.add("bookingUuid", bookingUUid);

			final HttpHeaders headerParams = new HttpHeaders();
			// create path and map variables
			final Map<String, Object> uriVariables = new HashMap<>();
			String path = UriComponentsBuilder.fromPath("/agreement-booking/{booking-uuid}/v1/create-addendum").buildAndExpand(uriVariables).toUriString();
			final String[] accepts = {
					"*/*"
			};
			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {
			};

			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("error while fetching the user details " + e);
		}

		return null;

	}
        
    public Void expireAgreement(DocumentRequestDTO documentRequestDTO) {

    	try {

    		log.info("expire agreement for referenceId {} with payload {} ", documentRequestDTO.getReferenceId(), documentRequestDTO.toString());

    		Object postBody = documentRequestDTO;
    		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

    		final HttpHeaders headerParams = new HttpHeaders();
    		// create path and map variables
    		final Map<String, Object> uriVariables = new HashMap<>();
    		String path = UriComponentsBuilder.fromPath("/agreement-booking/api/v1/request").buildAndExpand(uriVariables).toUriString();
    		final String[] accepts = {
    				"*/*"
    		};
    		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

    		ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {
    		};

    		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    	} catch (Exception e) {
    		log.error("error while fetching the user details " + e);
    	}

    	return null;

    }

	public ResponseDto<List<AgreementResponseDto>> getAgreementLinks(String referenceId) {

		try {
			Object postBody = null;

			log.info("get User details by userUuid is {} ", referenceId);

			final Map<String, Object> uriVariables = new HashMap<>();

			uriVariables.put("referenceId", referenceId);

			String path = UriComponentsBuilder.fromPath("/internal/agreements/{referenceId}").buildAndExpand(uriVariables)
			//String path = UriComponentsBuilder.fromPath("/internal/get/{referenceId}").buildAndExpand(uriVariables)
					.toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<ResponseDto<List<AgreementResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<AgreementResponseDto>>>() {
			};

			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("error while fetching the user details " + e);
		}

		return null;

	}


	public ResponseDto<Void> expireOldDocuments(String referenceId) {

		try {
			Object postBody = null;

			log.info("Expiring old documents with referenceId {} ", referenceId);

			final Map<String, Object> uriVariables = new HashMap<>();

			uriVariables.put("referenceId", referenceId);

			String path = UriComponentsBuilder.fromPath("/api/v1/expire-old-document/{referenceId}").buildAndExpand(uriVariables)
					.toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
			};

			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Error while expiring old documents " + e);
		}

		return null;

	}
}
