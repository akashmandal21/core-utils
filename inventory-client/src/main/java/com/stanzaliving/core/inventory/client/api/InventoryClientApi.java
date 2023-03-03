package com.stanzaliving.core.inventory.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.dto.AddressResponseDTO;
import com.stanzaliving.core.dto.CityResponseDTO;
import com.stanzaliving.core.dto.TransactionMigrationForDate;
import com.stanzaliving.core.grsi.dto.GrsiEventUpdateDto;
import com.stanzaliving.core.inventory.dto.InventoryActionRequestDto;
import com.stanzaliving.core.inventory.dto.InventoryItemDetailedDto;
import com.stanzaliving.core.inventory.dto.InventoryTOResponse;
import com.stanzaliving.item_master.dtos.FilterDto;
import com.stanzaliving.website.constants.WebsiteConstants;
import com.stanzaliving.website.response.dto.LeadRequestDto;
import com.stanzaliving.website.response.dto.RazorPayRequestDto;
import lombok.extern.log4j.Log4j2;
import org.apache.kafka.common.protocol.types.Field;
import org.codehaus.plexus.util.StringUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.math.BigDecimal;
import java.util.*;

@Log4j2
public class InventoryClientApi {

	private StanzaRestClient restClient;

	public InventoryClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public HttpHeaders getHeadersForIMS(String sessionId) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", WebsiteConstants.IMS_DEFAULT_BEARER_TOKEN);
		headers.add(WebsiteConstants.STANZA_SESSION, sessionId);
		return headers;
	}

	public ResponseDto<Collection<InventoryItemDetailedDto>> getInventoryItems(String addressUuid,
			FilterDto filterDto) {

		Object postBody = filterDto;

		String path = UriComponentsBuilder.fromPath("/internal/get/items/" + addressUuid).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Collection<InventoryItemDetailedDto>>> returnType = new ParameterizedTypeReference<ResponseDto<Collection<InventoryItemDetailedDto>>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<InventoryTOResponse> blockQuantities(InventoryActionRequestDto inventoryActionRequestDto) {

		Object postBody = inventoryActionRequestDto;

		String path = UriComponentsBuilder.fromPath("/internal/block/resources").toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<InventoryTOResponse>> returnType = new ParameterizedTypeReference<ResponseDto<InventoryTOResponse>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<Boolean> releaseQuantities(InventoryActionRequestDto inventoryActionRequestDto) {

		Object postBody = inventoryActionRequestDto;

		String path = UriComponentsBuilder.fromPath("/internal/release/all").toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<Boolean> handleTOShortClose(InventoryActionRequestDto inventoryActionRequestDto) {

		Object postBody = inventoryActionRequestDto;

		String path = UriComponentsBuilder.fromPath("/internal/release/partial").toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<Map<String, BigDecimal>> getTOShortclosePricing(
			InventoryActionRequestDto inventoryActionRequestDto) {

		Object postBody = inventoryActionRequestDto;

		String path = UriComponentsBuilder.fromPath("/internal/get/price/release/partial").toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Map<String, BigDecimal>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, BigDecimal>>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<Boolean> handleNegGrn(GrsiEventUpdateDto grsiEventUpdateDto) {

		Object postBody = grsiEventUpdateDto;

		String path = UriComponentsBuilder.fromPath("/internal/reduce/neg/grn").toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

	public LeadRequestDto createBrokerLead(LeadRequestDto leadRequestDto) {

		try {
			log.info("LeadRequestDto while creating the lead {}", leadRequestDto);
			Object postBody = leadRequestDto;

			String path = UriComponentsBuilder.fromPath("/lead/").toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<LeadRequestDto> returnType = new ParameterizedTypeReference<LeadRequestDto>() {
			};

			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

		} catch (Exception e) {
			log.error("Error while creating the lead {}", e);
		}

		return null;
	}

	public boolean verifyOtp(String phone, String otp) {

		Object postBody = null;

		log.info("Received request to verify otp for mobile: {}", phone);

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/lead/otp/verify").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("phone", phone);
		queryParams.add("otp", otp);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<Boolean> returnType = new ParameterizedTypeReference<Boolean>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public boolean sendOtp(String phone, String flow) {

		Object postBody = null;

		log.info("Received request to send otp for mobile: {}", phone);

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/lead/otp/send").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("flow", flow);
		queryParams.add("phone", phone);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<Boolean> returnType = new ParameterizedTypeReference<Boolean>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public LeadRequestDto leadCreation(LeadRequestDto leadRequestDto) {

		try {
			log.info("LeadRequestDto while creating the lead {}", leadRequestDto);

			Object postBody = leadRequestDto;

			String path = UriComponentsBuilder.fromPath("/internal/lead/create/temp/variant").toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<LeadRequestDto> returnType = new ParameterizedTypeReference<LeadRequestDto>() {
			};

			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

		} catch (Exception e) {
			log.error("Error while creating the lead {}", e);
		}

		return null;
	}

	public LeadRequestDto leadMigration(LeadRequestDto leadRequestDto) {

		try {
			log.info("LeadRequestDto while creating the lead {}", leadRequestDto);

			Object postBody = leadRequestDto;

			String path = UriComponentsBuilder.fromPath("/internal/lead/create/variant").toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<LeadRequestDto> returnType = new ParameterizedTypeReference<LeadRequestDto>() {
			};

			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

		} catch (Exception e) {
			log.error("Error while creating the lead {}", e);
		}

		return null;
	}

	public String unverifiedOtp(LeadRequestDto leadRequestDto) {

		try {
			log.error("leadRequestDto is {}", leadRequestDto);

			Object postBody = leadRequestDto;

			String path = UriComponentsBuilder.fromPath("lead/otp/unverified").toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
			};

			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

		} catch (Exception e) {
			log.error("Error while creating the lead {}", e);
		}

		return null;
	}

	public String confirmRazorPayPayment(RazorPayRequestDto razorPayRequestDto) {

		try {
			log.error("razorPayRequestDto is {}", razorPayRequestDto);

			Object postBody = razorPayRequestDto;

			String path = UriComponentsBuilder.fromPath("/website/confirm/razorPay").toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
			};

			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

		} catch (Exception e) {
			log.info("razorpay Response sent to IMS: " + razorPayRequestDto);
			log.error("Exception caught while updating the payment details in ims ", e);
		}

		return null;
	}

	public boolean verifyReferralCode(String referralCode) {

		Object postBody = null;

		log.info("Received request to verify referralCode : {}", referralCode);

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/referral/verify").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("code", referralCode);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<Boolean> returnType = new ParameterizedTypeReference<Boolean>() {
		};
		try {
			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception caught while verifying referral code on IMS ", e);
		}
		return false;
	}

	public LeadRequestDto createSchdeuledVisit(LeadRequestDto leadRequestDto) {

		try {
			log.error("LeadRequestDto is {}", leadRequestDto);

			Object postBody = leadRequestDto;

			String path = null;
			if (leadRequestDto.isCreateHotLead()) {
				path = UriComponentsBuilder.fromPath("/lead/create/website/").toUriString();
			} else {
				path = UriComponentsBuilder.fromPath("lead/website/").toUriString();
			}
			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<LeadRequestDto> returnType = new ParameterizedTypeReference<LeadRequestDto>() {
			};

			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

		} catch (Exception e) {
			log.info("leadRequestDto Response sent to IMS: " + leadRequestDto);
			log.error("Exception caught while schedule vist in ims ", e);
		}

		return null;
	}

    public Map<String, Object> getBookingInformation(String bookingUuid) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);
        String path =
                UriComponentsBuilder.fromPath("/booking/{bookingUuid}")
                        .buildAndExpand(uriVariables)
                        .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<Map<String, Object>> returnType =
                new ParameterizedTypeReference<Map<String, Object>>() {};

        return restClient.invokeAPI(
                path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public CityResponseDTO getCity(int cityId) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("id", cityId);
        String path =
                UriComponentsBuilder.fromPath("/city/{id}")
                        .buildAndExpand(uriVariables)
                        .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();


        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<CityResponseDTO> returnType =
                new ParameterizedTypeReference<CityResponseDTO>() {};

        return restClient.invokeAPI(
                path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public AddressResponseDTO getAddress(int addressId) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("id", addressId);
        String path =
                UriComponentsBuilder.fromPath("/address/get/{id}")
                        .buildAndExpand(uriVariables)
                        .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<AddressResponseDTO> returnType =
                new ParameterizedTypeReference<AddressResponseDTO>() {};

        return restClient.invokeAPI(
                path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

	public void migrateTransaction(TransactionMigrationForDate requestDto) {

		try {
			log.error("RequestDto is {}", requestDto);

			Object postBody = requestDto;

			String path = UriComponentsBuilder.fromPath("/migrate/transaction/date").toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {
			};

			restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

		} catch (Exception e) {
			log.info("TO migrate transactions request sent to IMS: " + requestDto);
			log.error("Exception caught while schedule request in ims ", e);
		}


	}

	public LeadQrDto verifyRequest(String uuid, String sessionId) {
		try {

			if (StringUtils.isBlank(sessionId)){
				sessionId = "null";
			}

			Object postBody = null;
			String path = UriComponentsBuilder.fromPath("/lead/verifyRequest").toUriString();
			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
			if (Objects.nonNull(uuid)) {
				queryParams.add("uuid", uuid);
			}
			queryParams.add("sessionId", sessionId);
			final HttpHeaders headerParams = getHeadersForIMS(sessionId);
			final String[] accepts = {"*/*"};
			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
			ParameterizedTypeReference<LeadQrDto> returnType = new ParameterizedTypeReference<LeadQrDto>() {
			};
			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception caught while verifying request generated from scanning a QR code ", e);
			return null;
		}
	}

	public String sendOtpToLeadOnIms(String phone, String flow) {
		try {
			Object postBody = null;
			String path = UriComponentsBuilder.fromPath("lead/otp/send").toUriString();
			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
			if (Objects.nonNull(flow))
				queryParams.add("flow", flow);
			if (Objects.nonNull(phone))
				queryParams.add("phone", phone);
			final HttpHeaders headerParams = getHeadersForIMS(null);
			final String[] accepts = {"*/*"};
			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
			ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
			};
			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception caught while sending otp to lead on IMS ", e);
			return null;
		}
	}

	public LeadQrDto verifyOtpAndGetLeadDetails(String phone, String otp) {
		try {
			Object postBody = null;
			String path = UriComponentsBuilder.fromPath("/lead/verifyOtpAndGetLeadDetails").toUriString();
			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
			if (Objects.nonNull(phone))
				queryParams.add("phone", phone);
			if (Objects.nonNull(otp))
				queryParams.add("otp", otp);
			final HttpHeaders headerParams = getHeadersForIMS(null);
			final String[] accepts = {"*/*"};
			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
			ParameterizedTypeReference<LeadQrDto> returnType = new ParameterizedTypeReference<LeadQrDto>() {
			};
			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception caught while getting lead details and verifying otp sent to lead on IMS ", e);
			return null;
		}
	}

	public LeadQrDto createOrUpdateLead(LeadQrDto leadQrDto, String sessionId) {
		try {
			Object postBody = leadQrDto;
			String path = UriComponentsBuilder.fromPath("/lead/createOrUpdateLead/").toUriString();
			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
			final HttpHeaders headerParams = getHeadersForIMS(sessionId);
			final String[] accepts = {"*/*"};
			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
			ParameterizedTypeReference<LeadQrDto> returnType = new ParameterizedTypeReference<LeadQrDto>() {
			};
			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception caught while creating or updating lead", e);
			return null;
		}
	}



	public ResponseDto<List<String>> getInventoryMovementTrackerDetails(String gsriId, String eventType) {

		Object postBody = null;
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<String>>> returnType = new ParameterizedTypeReference< ResponseDto<List<String>>>() {
		};


		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("gsriId", gsriId);
		uriVariables.put("eventType", eventType);
		String path = UriComponentsBuilder.fromUriString("/internal/get/inventory/movement/{gsriId}/{eventType}").buildAndExpand(uriVariables).toUriString();
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}





}