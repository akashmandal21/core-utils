package com.stanzaliving.core.backendlocator.client.api;

import com.stanzaliving.core.backendlocator.client.dto.*;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.dto.TransactionMigrationForDate;
import com.stanzaliving.core.leaddashboard.dto.LeadDetailsDto;
import com.stanzaliving.core.payment.dto.PreBookingRefundDto;
import com.stanzaliving.venta.BedCountDetailsDto;
import com.stanzaliving.venta.DeadBedCountDto;
import com.stanzaliving.venta.ResidenceRoomDetails;
import com.stanzaliving.website.constants.WebsiteConstants;
import com.stanzaliving.website.response.dto.LeadRequestDto;
import com.stanzaliving.website.response.dto.VentaSyncDataResponseDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
			log.error("Error while getting user Details from Core by userCode: {}", residentCode);
			//log.error("Error while getting user Details from Core by userCode: {}", residentCode, e.getMessage());
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
	
	public List<ResidenceRoomDetails> getRoomDetailsForResidence(String residenceUuid) {
		Object postBody = null;

		List<ResidenceRoomDetails> roomNumberList = new ArrayList<>();
		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("residenceUuid", residenceUuid);
		String path = UriComponentsBuilder.fromPath("/residence/roomInfo/{residenceUuid}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<List<ResidenceRoomDetails>> returnType = new ParameterizedTypeReference<List<ResidenceRoomDetails>>() {
		};

		try {
			roomNumberList = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
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
	
	public List<VentaSyncDataResponseDTO> getSyncDataForWebsite() {
		
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/syncData/website").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();
		
		headerParams.add("Authorization", WebsiteConstants.IMS_DEFAULT_BEARER_TOKEN);

		final String[] accepts = { "*/*" };
		
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<List<VentaSyncDataResponseDTO>> returnType = new ParameterizedTypeReference<List<VentaSyncDataResponseDTO>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
	}

	public Map<String,Object> getInventoryBookingDetails(String id) {

		try {
			Object postBody = null;

			log.info("get booking details for booking uuid {} ", id);

			final Map<String, Object> uriVariables = new HashMap<>();
			uriVariables.put("id", id);

			String path = UriComponentsBuilder.fromPath("/booking/{id}").buildAndExpand(uriVariables)
					.toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = {"*/*"};

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
			ParameterizedTypeReference<Map<String,Object>> returnType = new ParameterizedTypeReference<Map<String,Object>>() {
			};

			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

		} catch (Exception e) {
			log.error("error while fetching the booking details " + e);
		}

		return null;

	}

	public Map<String, String> rejectStudentOnboardingDetails(Integer bookingId)  {

		Object postBody = bookingId;

		log.info("Reject student onBoarding details for booking ID: {}", bookingId);

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/onboarding/reject").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
		ParameterizedTypeReference<Map<String,String>> returnType =
				new ParameterizedTypeReference<Map<String,String>>() {};

		return restClient.invokeAPI(
				path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

	}

	public Map<String, String> clearKycRejectStatus(Integer bookingId)  {

		Object postBody = bookingId;

		log.info("Clear Reject status for booking ID: {}", bookingId);

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/onboarding/clear/kycReject/status")
				.build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
		ParameterizedTypeReference<Map<String,String>> returnType =
				new ParameterizedTypeReference<Map<String,String>>() {};

		return restClient.invokeAPI(
				path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

	}
	
	
	public RoomResponseDTO2 getRoomDetails(String roomId) {
		
		final Map<String, Object> uriVariables = new HashMap<>();
		
		uriVariables.put("id", roomId);
		
		String path = UriComponentsBuilder.fromPath("/room/{id}")
				.buildAndExpand(uriVariables).toUriString();
	
		final HttpHeaders headerParams = new HttpHeaders();
		
		ParameterizedTypeReference<RoomResponseDTO2> returnType = new ParameterizedTypeReference<RoomResponseDTO2>() {
		};
		
		try {
			return restClient.invokeAPI(path, HttpMethod.GET, null, null, headerParams, null, returnType);
		} catch (Exception e) {
			log.error("Error while getting room Details from roomId: {} exception is {}", roomId, e);
		}
		return null;
	}

	public ResponseDto<LeadRequestDto> fetchPrebookedRefundEligibleLeads(String phone) {

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("prebooking/refund/fetch/eligible/leads").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.add("phone", phone);

		final HttpHeaders headerParams = new HttpHeaders();

		headerParams.add("Authorization", WebsiteConstants.IMS_DEFAULT_BEARER_TOKEN);

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<LeadRequestDto>> returnType = new ParameterizedTypeReference<ResponseDto<LeadRequestDto>>() {
		};

		try {
			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, null, returnType);
		} catch (Exception e) {
			log.error("Error while fetching prebooked refund eligible leads {}", e);
			return null;
		}
	}

	public String migrateTransactionForDate(String token, TransactionMigrationForDate requestDto) {

		Object postBody = requestDto;

		log.info("Migrate Transaction for date: {}", requestDto.getTransactionDate());

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/migrate/transaction/date").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		HttpHeaders headerParams = new HttpHeaders();

		headerParams.add("Cookie", "token=" + token);

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
		ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
		};

		return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

	public BrokerReferralCodeResponseDto getReferralDetails(String phone) {
		Object postBody = null;

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("phone", phone);
		String path = UriComponentsBuilder.fromPath("/broker/referral-details/{phone}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<BrokerReferralCodeResponseDto> returnType = new ParameterizedTypeReference<BrokerReferralCodeResponseDto>() {
		};

		try {
			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Error while fetching referral details: {}", e);
			return null;
		}
	}


	public Boolean verifyReferralCode(String referralCode) {

		Object postBody = null;

		final Map<String, Object> uriVariables = new HashMap<>();
		// uriVariables.put("userUuid", userUuid);

		String path = UriComponentsBuilder.fromPath("/referral/verify").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("code", referralCode);
		queryParams.add("requestFromLead", Boolean.TRUE.toString());

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<Boolean> returnType = new ParameterizedTypeReference<Boolean>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

}