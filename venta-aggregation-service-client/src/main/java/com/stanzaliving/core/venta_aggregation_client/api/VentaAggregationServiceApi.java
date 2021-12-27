package com.stanzaliving.core.venta_aggregation_client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.stanzaliving.core.ventaaggregationservice.dto.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.venta_aggregation_client.config.RestResponsePage;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class VentaAggregationServiceApi {

	private StanzaRestClient restClient;

	public VentaAggregationServiceApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	/**
	 * This method is used to fetch ResidenceAggregation Data from Venta-Aggregation-Service
	 *
	 * @param residenceUuid->Unique
	 *            ID corresponding to residence
	 * @return Aggregated Residence data on aggregation service
	 */
	public ResponseDto<ResidenceAggregationEntityDto> getAggregatedResidenceInformation(String residenceUuid) {
		log.info("Aggregation Residence Controller::Processing to get residence information on basis of residenceUuid {}", residenceUuid);
		Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("residenceUuid", residenceUuid);

		String path = UriComponentsBuilder.fromPath("/internal/residence/{residenceUuid}")
				.buildAndExpand(uriVariables).toUriString();

		MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		HttpHeaders headerParams = new HttpHeaders();
		String[] accepts = new String[] { "*/*" };
		List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<ResidenceAggregationEntityDto>> returnType = new ParameterizedTypeReference<ResponseDto<ResidenceAggregationEntityDto>>() {
		};
		try {
			log.info("Executing Api for getting residence Info with Url {}", path);
			return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while fetching residence information based on residenceUUID {}, Exception is ", residenceUuid, e);
		}
		return null;
	}

	public ResponseDto<RestResponsePage<BookingResidenceAggregationEntityDto>> getResidenceListing(ResidenceFilterRequestDto residenceFilterRequestDto) {
		log.info("Aggregation Residence Controller::Processing to get residence listing based on residence filter request dto {}", residenceFilterRequestDto);

		Object postBody = residenceFilterRequestDto;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/residence/listing").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<RestResponsePage<BookingResidenceAggregationEntityDto>>> returnType =
				new ParameterizedTypeReference<ResponseDto<RestResponsePage<BookingResidenceAggregationEntityDto>>>() {
				};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<RestResponsePage<BookingAggregationDto>> getBookingAggregationListing(BookingFilterRequestDto bookingFilterRequestDto) {
		log.info("Aggregation Booking Controller getBookingAggregationListing with payload {}", bookingFilterRequestDto.toString());

		Object postBody = bookingFilterRequestDto;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/booking/listing").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<RestResponsePage<BookingAggregationDto>>> returnType = new ParameterizedTypeReference<ResponseDto<RestResponsePage<BookingAggregationDto>>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}
	public ResponseDto<RestResponsePage<BookingAggregationEntityDto>> getBookingListingForInvoicingDashBoard(BookingFilterRequestDto bookingFilterRequestDto,
																								 String type) {
		log.info("Invoice Aggregation Booking Controller getBookingAggregationInvoiceListing with payload {}", bookingFilterRequestDto.toString());
		Map<String, Object> uriVariables = new HashMap<>();

		Object postBody = bookingFilterRequestDto;

		String path = UriComponentsBuilder.fromPath("/booking/invoice/listing").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("type",type);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<RestResponsePage<BookingAggregationEntityDto>>> returnType = new ParameterizedTypeReference<ResponseDto<RestResponsePage<BookingAggregationEntityDto>>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<List<BookingAggregationDto>> getActiveBookings() {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/booking/v1/active").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<BookingAggregationDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<BookingAggregationDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public Map<String, Object> getBookingDetails(String bookingUuid) {
		log.info("Aggregation Booking Details Controller::Processing to get booking information on basis of bookingUuid {}", bookingUuid);

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("bookingUuid", bookingUuid);

		String path = UriComponentsBuilder.fromPath("/internal/data/{bookingUuid}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<Map<String, Object>> returnType = new ParameterizedTypeReference<Map<String, Object>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<BookingAggregationDto> getBookingDetailsByBookingUuid(String bookingUuid) {
		log.info("Aggregation Booking Details Controller::Processing to get booking on basis of bookingUuid {}", bookingUuid);

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("booking-uuid", bookingUuid);

		String path = UriComponentsBuilder.fromPath("/internal/booking/{booking-uuid}/details").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<BookingAggregationDto>> returnType = new ParameterizedTypeReference<ResponseDto<BookingAggregationDto>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}
	public ResponseDto<BookingAggregationDto> findBookingDetailsForResidentAndBookingStatus(String residentId) {
		Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("residentId", residentId);

		String path = UriComponentsBuilder.fromPath("/internal/booking/details/resident/{residentId}")
				.buildAndExpand(uriVariables).toUriString();
		MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		HttpHeaders headerParams = new HttpHeaders();
		String[] accepts = new String[]{"*/*"};
		List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
		ParameterizedTypeReference<ResponseDto<BookingAggregationDto>> returnType = new ParameterizedTypeReference<ResponseDto<BookingAggregationDto>>() {
		};
		try {
			log.info("Executing Api for getting booked details with Url {}", path);
			return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while fetching booked details for resident id {}, Exception is ", residentId, e);
		}
		return null;
	}

	public ResponseDto<String> updateResidencePricingAndBedInformation() {
		log.info("Residence Internal Controller::Processing to update residence pricing and bed info");

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/residence/update-price-bed-cache").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

	public List<MoveInDetailDataDto> getMoveInDetailData(String date, String residenceUuid) {

		Object postBody = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/booking/move-in-detail-data").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("Date", date);
		if (StringUtils.isNotBlank(residenceUuid)) {
			queryParams.add("residenceUuid", residenceUuid);
		}

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<List<MoveInDetailDataDto>> returnType = new ParameterizedTypeReference<List<MoveInDetailDataDto>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public List<String> getBookingUuidByResidentId(String residentId) {
		log.info("Resident Details Controller::Processing to get booking uuids on basis of residentId {}", residentId);

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("residentId", residentId);

		String path = UriComponentsBuilder.fromPath("/internal/resident/data/{residentId}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<List<String>> returnType = new ParameterizedTypeReference<List<String>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}
}
