/**
 *
 */
package com.stanzaliving.core.backendlocator.client.api;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
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

import com.stanzaliving.core.backendlocator.client.dto.ResidenceGstDto;
import com.stanzaliving.core.backendlocator.client.dto.ResidentDto;
import com.stanzaliving.core.backendlocator.client.dto.UserLuggageDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;

import com.stanzaliving.core.leaddashboard.dto.LeadDetailsDto;
import com.stanzaliving.core.payment.dto.PreBookingRefundDto;

import com.stanzaliving.venta.BedCountDetailsDto;
import com.stanzaliving.venta.DeadBedCountDto;

import lombok.extern.log4j.Log4j2;

/**
 * @author raj.kumar
 *
 * @date 12-May-2020
 *
 **/

@Log4j2
public class VentaClientApi {

	private StanzaRestClient restClient;

	public VentaClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public ResponseDto<List<BedCountDetailsDto>> getLiveBedDetails(List<String> micromarketNameList) {
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/getBedDetails").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		postBody = micromarketNameList;
		ParameterizedTypeReference<ResponseDto<List<BedCountDetailsDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<BedCountDetailsDto>>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

	public List<ResidenceGstDto> getGstDetailsForResidences() {

		String path = UriComponentsBuilder.fromPath("/residence-gst-details").buildAndExpand().toUriString();

		final HttpHeaders headerParams = new HttpHeaders();

		ParameterizedTypeReference<List<ResidenceGstDto>> returnType = new ParameterizedTypeReference<List<ResidenceGstDto>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, null, null, headerParams, null, returnType);

	}

	public List<UserLuggageDto> getUsersWithLuggage() {

		String path = UriComponentsBuilder.fromPath("/getAllLuggageUsers").buildAndExpand().toUriString();

		final HttpHeaders headerParams = new HttpHeaders();

		ParameterizedTypeReference<List<UserLuggageDto>> returnType = new ParameterizedTypeReference<List<UserLuggageDto>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, null, null, headerParams, null, returnType);
	}

	public ResidentDto getResidentDetails(String residentCode) {
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("residentCode", residentCode);
		String path = UriComponentsBuilder.fromPath("/student/getStudentDetails/{residentCode}")
				.buildAndExpand(uriVariables).toUriString();
		final HttpHeaders headerParams = new HttpHeaders();
		ParameterizedTypeReference<ResidentDto> returnType = new ParameterizedTypeReference<ResidentDto>() {
		};
		try {
			return restClient.invokeAPI(path, HttpMethod.GET, null, null, headerParams, null, returnType);
		} catch (Exception e) {
			log.error("Error while getting user Details from Core by userCode: {}", residentCode, e);
		}
		return null;
	}

	public HashMap<String, Object> getReferralCodeByUser(String userUuid) {

		Object postBody = null;

		final Map<String, Object> uriVariables = new HashMap<>();
		// uriVariables.put("userUuid", userUuid);

		String path = UriComponentsBuilder.fromPath("/broker").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("brokerMobile", userUuid);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<HashMap<String, Object>> returnType = new ParameterizedTypeReference<HashMap<String, Object>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public String getPdfUrlByType(String type, String typeId, String typeName) {

		Object postBody = null;

		final Map<String, Object> uriVariables = new HashMap<>();
		String path = UriComponentsBuilder.fromPath("/get/pdf").buildAndExpand(uriVariables).toUriString();
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.add("type", type);
		queryParams.add("typeId", typeId);
		queryParams.add("typeName", typeName);
		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

	}

	public List<DeadBedCountDto> getDeadBedDetails(String residenceUuid, LocalDate fromDate, LocalDate toDate) {
		Object postBody = null;

		List<DeadBedCountDto> deadBedCountDtoList = new ArrayList<>();
		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("residenceUuid", residenceUuid);
		String path = UriComponentsBuilder.fromPath("/coreApi/getDeadBedDetails/{residenceUuid}")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("fromDate", fromDate.toString());
		queryParams.add("toDate", toDate.toString());

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<List<DeadBedCountDto>> returnType = new ParameterizedTypeReference<List<DeadBedCountDto>>() {
		};

		try {
			deadBedCountDtoList = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams,
					accept, returnType);
		} catch (Exception e) {
			log.error("Exception while fetching dead bed details for residence {} ", residenceUuid);
		}

		return deadBedCountDtoList;
	}

	public List<String> getRoomNumberList(String residenceUuid) {
		Object postBody = null;

		List<String> roomNumberList = new ArrayList<>();
		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("residenceUuid", residenceUuid);
		String path = UriComponentsBuilder.fromPath("/residence/rooms/{residenceUuid}").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<List<String>> returnType = new ParameterizedTypeReference<List<String>>() {
		};

		try {
			roomNumberList = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept,
					returnType);
		} catch (Exception e) {
			log.error("Exception while fetching room numbers list for residence {} ", residenceUuid);
		}

		return roomNumberList;
	}
	
	public Map<String, Object> getBookingDetails(int bookingId) {

		Object postBody = null;

		Map<String, Object> response = new HashMap<>();

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("bookingId", bookingId);

		String path = UriComponentsBuilder.fromPath("/wanda/booking/{bookingId}").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<HashMap<String, Object>> returnType = new ParameterizedTypeReference<HashMap<String, Object>>() {
		};
		try {
			response = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept,
					returnType);

		} catch (Exception e) {
			log.error("Exception while fetching booking details for bookingId {} ", bookingId);
		}
		return response;
	}

	public LeadDetailsDto getLeadDetails(String phone) {
		Object postBody = null;

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("phone", phone);
		String path = UriComponentsBuilder.fromPath("/lead/student/details/{phone}").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<LeadDetailsDto> returnType = new ParameterizedTypeReference<LeadDetailsDto>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

	}

	public Void updateLeadTagStatus(PreBookingRefundDto preBookingRefundDto) {

		Object postBody = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/lead/update/leadTag").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		postBody = preBookingRefundDto;

		ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}
	
	public Void leadScheduledVisitReminder(String phone, String house, Date scheduleDate) {

		Object postBody = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/lead/scheduleVisit/reminder").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("phone", phone);
		queryParams.add("house", house);
		queryParams.add("scheduleDate", scheduleDate.toString());

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

}