package com.stanzaliving.support.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.security.dto.SupportHkRmTicketRequestDto;
import com.stanzaliving.core.security.dto.SupportHkRmTicketResponseDto;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class SupportClientApi {

	private StanzaRestClient restClient;

	public SupportClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public List<SupportHkRmTicketResponseDto> getRmANDHkTicket(SupportHkRmTicketRequestDto supportHkRmTicketRequestDto){

		String path = UriComponentsBuilder.fromPath("/internal/api/v1/tickets/attendance/mapping").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		TypeReference<ResponseDto<List<SupportHkRmTicketResponseDto>>> returnType = new TypeReference<ResponseDto<List<SupportHkRmTicketResponseDto>>>() {};

		ResponseDto<List<SupportHkRmTicketResponseDto>> responseDto = null;

		try {

			responseDto = restClient.post(path, queryParams, supportHkRmTicketRequestDto, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting support tickets for attendance mapping summary", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new ArrayList<>();

	}	
}