package com.stanzaliving.operations.client;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.backend.dto.UserHostelDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.cafe.order.dto.CafeOrderRDto;
import com.stanzaliving.core.operations.dto.ActiveResidenceDetailsDto;
import com.stanzaliving.core.operations.dto.CurrentServiceMixRequestDto;
import com.stanzaliving.core.operations.dto.DealDto;
import com.stanzaliving.core.operations.dto.ResidentFoodPreferenceCountDto;
import com.stanzaliving.core.operations.dto.ServiceMixDto;
import com.stanzaliving.core.operations.enums.DealCategory;
import com.stanzaliving.core.security.dto.FoodCafeRequestDto;
import com.stanzaliving.core.security.dto.SupportHkRmTicketResponseDto;
import com.stanzaliving.internet.dto.InternetDetails;
import com.stanzaliving.internet.dto.InternetProviderDetails;
import com.stanzaliving.operations.ServiceMixSeasonResponseDto;
import com.stanzaliving.operations.dto.servicemix.ServiceMixEntityDto;
import com.stanzaliving.operations.dto.servicemix.ServiceNameRequestDto;
import com.stanzaliving.operations.dto.servicemix.ServiceNameResponseDto;
import com.stanzaliving.operations.enums.ServiceMixStatus;

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