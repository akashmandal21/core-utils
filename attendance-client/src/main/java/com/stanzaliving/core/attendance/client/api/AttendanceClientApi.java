package com.stanzaliving.core.attendance.client.api;

import java.time.LocalDate;
import java.util.ArrayList;
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

import com.stanzaiving.core.attendance.dto.HostelMealMapDto;
import com.stanzaiving.core.attendance.dto.UserAttendanceSummaryDto;
import com.stanzaliving.core.base.http.StanzaRestClient;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class AttendanceClientApi {

	private StanzaRestClient restClient;

	public AttendanceClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public List<UserAttendanceSummaryDto> getAttendanceSummary(LocalDate date, List<HostelMealMapDto> hostelMealMapDtos) {

		List<UserAttendanceSummaryDto> responseDto = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		 List<HostelMealMapDto> postBody = hostelMealMapDtos;

		String path = UriComponentsBuilder.fromPath("/userAttendance/users").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("date", date.toString());

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<List<UserAttendanceSummaryDto>> returnType = new ParameterizedTypeReference<List<UserAttendanceSummaryDto>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("exception while fetching meal attendance from attendance", e);
		}
		

		return Objects.nonNull(responseDto) ? responseDto : new ArrayList<>();
	}

}
