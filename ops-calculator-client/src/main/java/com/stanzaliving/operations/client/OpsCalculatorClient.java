package com.stanzaliving.operations.client;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.stanzaliving.core.opscalculator.dto.response.ApprovalDashboardSummeryDetailsDto;
import com.stanzaliving.core.pojo.CurrentUser;
import com.stanzaliving.operations.ServiceMixSeasonResponseDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.CollectionUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.backend.dto.UserHostelDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.operations.dto.ResidentFoodPreferenceCountDto;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class OpsCalculatorClient {

	private StanzaRestClient restClient;

	public OpsCalculatorClient(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public ApprovalDashboardSummeryDetailsDto getApprovalPendingSummary(CurrentUser currentUser) {

		Object postBody = null;

		ResponseDto<ApprovalDashboardSummeryDetailsDto> responseDto = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/underwritten/annual/totalPending").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();
		if (currentUser != null) {
			headerParams.add("cookie", "token=" + currentUser.getToken());
		}
		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<ApprovalDashboardSummeryDetailsDto>> returnType = new ParameterizedTypeReference<ResponseDto<ApprovalDashboardSummeryDetailsDto>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while fetching ApprovalPending Summary from OpsCalculator: ", e);
		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : null;

	}
}