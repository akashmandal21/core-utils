package com.stanzaliving.core.booking.client.api;

import com.stanzaliving.booking.dto.*;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.booking.client.dto.*;
import com.stanzaliving.core.bookingservice.dto.response.BookedPackageServiceDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2
public class BookingDataControllerApi {

    private StanzaRestClient restClient;

    public BookingDataControllerApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<Map<String, List<InventoryResponseOccupancyDto>>> getBookedInventoryDetail(BookingInventoryDto bookingInventoryDto) {

        log.info("Booking-Data-Controller::Processing to get booked inventories detail of rooms {}, moveInDate {}, inventory {} ",
                bookingInventoryDto.getRoomUUID(),
                bookingInventoryDto.getMoveInDate());

        Object postBody = bookingInventoryDto;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/v1/inventory-occupancy/fetch").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Map<String, List<InventoryResponseOccupancyDto>>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, List<InventoryResponseOccupancyDto>>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<List<BookingResponseDto>> getBookingsEligibleForExpiration() {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/v1/booking/eligible-for-expiration").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<BookingResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<BookingResponseDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }


    public ResponseDto<ExpiredBookingsResponseDto> expireBooking(ExpiredBookingsDto expiredBookingsDto) {

        Object postBody = expiredBookingsDto;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/booking/v1/expire").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<ExpiredBookingsResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<ExpiredBookingsResponseDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<PackageServicesResponseDto> getPackageDescriptionForBookingUuid(String bookingUuid) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/v1/packaged-service/categories/{bookingUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.add("bookingUuid", bookingUuid);

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<PackageServicesResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<PackageServicesResponseDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<BookedPackageServiceDto> fetchPackagedServiceData(String bookingUuid) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/v1/packaged-service/{bookingUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.add("bookingUuid", bookingUuid);

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<BookedPackageServiceDto>> returnType
                = new ParameterizedTypeReference<ResponseDto<BookedPackageServiceDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<List<PaymentPendingBookingResponseDto>> getPaymentPendingBookings() {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/booking/v1/payment-pending-booking").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<PaymentPendingBookingResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<PaymentPendingBookingResponseDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }


    public ResponseDto<PaymentPendingBookingStatusChangeDto> changeBookingStatus(PaymentPendingBookingDto paymentPendingBookingDto) {

        Object postBody = paymentPendingBookingDto;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/booking/v1/change-payment-pending-booking-status").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<PaymentPendingBookingStatusChangeDto>> returnType = new ParameterizedTypeReference<ResponseDto<PaymentPendingBookingStatusChangeDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public Void createAgreement(String bookingUUid) {
        Object postBody = null;
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("bookingUuid", bookingUUid);

        final HttpHeaders headerParams = new HttpHeaders();
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/agreement-booking/{booking-uuid}/v1/create-agreement").buildAndExpand(uriVariables).toUriString();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

    }

    public Void createAddendum(String bookingUUid) {
        Object postBody = null;
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("bookingUuid", bookingUUid);

        final HttpHeaders headerParams = new HttpHeaders();
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/agreement-booking/{booking-uuid}/v1/create-addendum").buildAndExpand(uriVariables).toUriString();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

    }
}
