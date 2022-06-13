package com.stanzaliving.core.kyc.client.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.dto.DocumentDTO;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class KycDocumentClientApi {

	private StanzaRestClient restClient;

	public KycDocumentClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}
	public List<DocumentDTO> getUserDocument(String bookingUuid){
		
		final Map<String, Object> uriVariables = new HashMap<>();
		
		uriVariables.put("bookingUuid", bookingUuid);

		String path = UriComponentsBuilder.fromPath("/internal/get/kyc/document/{bookingUuid}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
	
		TypeReference<ResponseDto<List<DocumentDTO>>> returnType = new TypeReference<ResponseDto<List<DocumentDTO>>>() {};

		ResponseDto<List<DocumentDTO>> responseDto = null;

		try {

			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting documents", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new ArrayList<>();

	}
}