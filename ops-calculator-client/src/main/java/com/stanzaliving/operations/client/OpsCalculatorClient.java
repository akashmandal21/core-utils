package com.stanzaliving.operations.client;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.opscalculator.constants.UnderwrittenCalculatorCategory;
import com.stanzaliving.core.opscalculator.dto.response.UnderWrittenListingResponseDto;
import com.stanzaliving.core.opscalculator.dto.summary.CategoryPopUpSummaryDto;
import com.stanzaliving.core.opscalculator.dto.summary.MonthlyUnderwrittenForecastSummaryDto;
import com.stanzaliving.core.opscalculator.enums.UnderWrittenStatus;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2
public class OpsCalculatorClient {

	private StanzaRestClient restClient;

	public OpsCalculatorClient(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public ResponseDto<MonthlyUnderwrittenForecastSummaryDto> getMonthlyForeCast(String residenceUuid,
																				 String seasonUuid,
																				 List<String> annualUnderwrittenUuidList,
																				 boolean occupiedView) {
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		String path = UriComponentsBuilder.fromPath("/internal/get").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.put("residenceUuid", Collections.singletonList(residenceUuid));
		queryParams.put("seasonUuid", Collections.singletonList(seasonUuid));
		queryParams.put("annualUnderwrittenUuidList",annualUnderwrittenUuidList);
		queryParams.put("occupiedView", Collections.singletonList(Boolean.toString(occupiedView)));
		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<MonthlyUnderwrittenForecastSummaryDto>> returnType = new ParameterizedTypeReference<ResponseDto<MonthlyUnderwrittenForecastSummaryDto>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<List<UnderWrittenListingResponseDto>> getAnnualUnderWrittenListByResidence(String residenceUuid,
																								  UnderWrittenStatus underWrittenStatus) {
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		String path = UriComponentsBuilder.fromPath("/internal/get/listByResidence").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.put("residenceUuid", Collections.singletonList(residenceUuid));
		queryParams.put("underWrittenStatus", Collections.singletonList(underWrittenStatus.getStatus()));
		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<UnderWrittenListingResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<UnderWrittenListingResponseDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<CategoryPopUpSummaryDto> getCategoryPopUpSummary(List<String> monthlyUnderWrittenUuid,
																		String fromDate,
																		String toDate,
																		UnderwrittenCalculatorCategory underwrittenCalculatorCategory) {
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		String path = UriComponentsBuilder.fromPath("/internal/getCategoryPopUpSummary").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.put("monthlyUnderWrittenUuid", monthlyUnderWrittenUuid);
		queryParams.put("fromDate", Collections.singletonList(fromDate));
		queryParams.put("toDate", Collections.singletonList(toDate));
		queryParams.put("underwrittenCalculatorCategory", Collections.singletonList(underwrittenCalculatorCategory.getUnderwrittenCalculatorCategory()));
		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<CategoryPopUpSummaryDto>> returnType = new ParameterizedTypeReference<ResponseDto<CategoryPopUpSummaryDto>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}


}