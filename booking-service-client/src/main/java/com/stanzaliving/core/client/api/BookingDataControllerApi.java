package com.stanzaliving.core.client.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.booking.dto.*;
import com.stanzaliving.booking.dto.response.BookingCommercialsCardResponseDto;
import com.stanzaliving.booking.dto.response.LedgerResponseDto;
import com.stanzaliving.booking.dto.response.NeedsAttentionBookingResponseDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.exception.ApiValidationException;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.bookingservice.dto.response.BookedPackageServiceDto;
import com.stanzaliving.core.client.dto.*;
import com.stanzaliving.ledger.dto.UpcomingBookingsDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.time.LocalDate;
import java.util.Collection;
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

    public ResponseDto<Collection<String>> getVacantInventoriesForRoom(String roomUUID) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/v1/room/vacant-inventories/{roomUUID}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.add("roomUUID", roomUUID);

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Collection<String>>> returnType = new ParameterizedTypeReference<ResponseDto<Collection<String>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<List<NeedsAttentionBookingResponseDto>> getNeedsAttentionBooking() {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/booking/v1/needs-attention").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<NeedsAttentionBookingResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<NeedsAttentionBookingResponseDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<BookingResponseDto> sendBookingForNeedsAttentionUpdate(BookingNeedsAttentionUpdationDto bookingNeedsAttentionUpdationDto) {

        Object postBody = bookingNeedsAttentionUpdationDto;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/booking/v1/needs-attention").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<BookingResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<BookingResponseDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<ContractModificationDetailsDto> getContractModificationDetails(String bookingUuid) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);

        String path = UriComponentsBuilder.fromPath("/internal/modify/contract/details/{bookingUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<ContractModificationDetailsDto>> returnType
                = new ParameterizedTypeReference<ResponseDto<ContractModificationDetailsDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }

    public ResponseDto<Double> getBedCountForNonMgDeal(String dealUuid) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("dealUuid", dealUuid);

        String path = UriComponentsBuilder.fromPath("/internal/deal/{dealUuid}/bed-count/non-mg").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);


        ParameterizedTypeReference<ResponseDto<Double>> returnType = new ParameterizedTypeReference<ResponseDto<Double>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<String> blockMultipleInventories(ContractApprovalDto contractApprovalDto) {

        Object postBody = contractApprovalDto;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/v1/multiple-booking").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<BookingCommercialsCardResponseDto> getBookingDetailsForCommercials(String bookingUuid) {

        try {
            Object postBody = null;
            log.info("Received request to get booking details for commercials for bookingUuid {}", bookingUuid);
            final Map<String, Object> uriVariables = new HashMap<>();
            uriVariables.put("bookingUuid", bookingUuid);
            String path = UriComponentsBuilder.fromPath("/internal/v1/booking-details/get/{bookingUuid}").buildAndExpand(uriVariables)
                    .toUriString();
            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
            final HttpHeaders headerParams = new HttpHeaders();
            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
            ParameterizedTypeReference<ResponseDto<BookingCommercialsCardResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<BookingCommercialsCardResponseDto>>() {
            };
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while getting booking details : ", e);
        }
        return null;
    }

    public ResponseDto<ExceptionOnboardingDetailsDto> getExceptionOnboardingDetails(String bookingUuid) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);
        String path = UriComponentsBuilder.fromPath("/internal/get/exceptionOnboardingDetails/{bookingUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

//        queryParams.add("bookingUuid", bookingUuid);

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        TypeReference<ResponseDto<ExceptionOnboardingDetailsDto>> returnType = new TypeReference<ResponseDto<ExceptionOnboardingDetailsDto>>() {
        };
        ResponseDto<ExceptionOnboardingDetailsDto> responseDto;
        try {
            responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
            return responseDto;
        } catch (Exception e) {

            log.error("Error while searching from exceptional onboarding.", e);

            throw new ApiValidationException("Some error occurred. Please try again after some time.");

        }

    }


    public LedgerResponseDto getBookingLedger(String bookingUuid) {
        try {
            log.info("Received request to get booking ledger for bookingUuid {}", bookingUuid);
            final Map<String, Object> uriVariables = new HashMap<>();
            uriVariables.put("booking-uuid", bookingUuid);
            String path = UriComponentsBuilder.fromPath("/booking/ledger/{booking-uuid}").buildAndExpand(uriVariables)
                    .toUriString();
            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
            final HttpHeaders headerParams = new HttpHeaders();
            final String[] accepts = {"*/*"};
            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
            ParameterizedTypeReference<LedgerResponseDto> returnType = new ParameterizedTypeReference<LedgerResponseDto>() {
            };
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while getting discount splitter : ", e);
        }
        return null;
    }

    public void checkForTresspasserBookings() {
        Object postBody = null;
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/exit/tresspasser/bookings").buildAndExpand(uriVariables).toUriString();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {
        };
        try {
            restClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception occurred while calling api with message:{}", e.getMessage());
        }
    }

    public ResponseDto<BookingResponseDto> getBookingDetails(String bookingUuid) {
        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("booking-uuid", bookingUuid);

        String path = UriComponentsBuilder.fromPath("/booking/get/{booking-uuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<BookingResponseDto>> returnType
                = new ParameterizedTypeReference<ResponseDto<BookingResponseDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }

    public ResponseDto<List<UpcomingBookingsDto>> getUpcomingBookingDetails(String userUuid, String currentBookingUuid) {
        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("userUuid", userUuid);
        uriVariables.put("currentBookingUuid", currentBookingUuid);

        String path = UriComponentsBuilder.fromPath("/internal/v1/get/user/{userUuid}/upcomingBooking/details/{currentBookingUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<UpcomingBookingsDto>>> returnType
                = new ParameterizedTypeReference<ResponseDto<List<UpcomingBookingsDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }

    public ResponseDto<List<com.stanzaliving.booking.dto.response.InventoryResponseOccupancyDto>> findBookedInventoryDetailsForManagedApartment(String bookingUuid) {
        Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);

        String path = UriComponentsBuilder.fromPath("/internal/{bookingUuid}/booked-inventory")
                .buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<com.stanzaliving.booking.dto.response.InventoryResponseOccupancyDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<com.stanzaliving.booking.dto.response.InventoryResponseOccupancyDto>>>() {
        };
        try {
            log.info("Executing Api for getting booked inventory with Url {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching booked inventory for booking uuid {}, Exception is ", bookingUuid, e);
        }
        return null;
    }

    public ResponseDto<String> checkAndUpdateContractBasedInventories(UpdateDealAndInventoryDto updateDealAndInventoryDto) {

        Object postBody = updateDealAndInventoryDto;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/v1/update/contract/inventory").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<RequestDto> fetchLatestModifyRequestForBooking(String bookingUuid, String requestType){
        Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);

        String path = UriComponentsBuilder.fromPath("/internal/v1/request/{bookingUuid}")
                .buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.add("requestType", requestType);


        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<RequestDto>> returnType = new ParameterizedTypeReference<ResponseDto<RequestDto>>() {
        };
        try {
            log.info("Executing Api for getting latest request with Url {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching booked inventory for booking uuid {}, Exception is ", bookingUuid, e);
        }
        return null;


    }

    public ResponseDto<Map<String, Object>> getContractPricingDetailsRoomNumbers(String contractUuid) {

        log.info("Booking-Data-Controller::Processing to fetch Contract Pricing Details for Contract uuid {}", contractUuid);

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("contractUuid", contractUuid);

        String path = UriComponentsBuilder.fromPath("/contract-pricing/{contractUuid}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Map<String, Object>>> returnType =
                new ParameterizedTypeReference<ResponseDto<Map<String, Object>>>() {
                };

        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception var13) {
            log.error("Exception while fetching fetch Contract Pricing Details for Contract uuid {}", contractUuid);
            return null;
        }
    }

    public ResponseDto<Map<String, List<InventoryResponseOccupancyDto>>> getBookedInventoryDetailForContract(BookingInventoryDto bookingInventoryDto) {

        log.info("Booking-Data-Controller::Processing to get booked inventories detail of rooms {} for contract {}, moveInDate {}",
                bookingInventoryDto.getRoomUUID(),
                bookingInventoryDto.getBookingUuid(),
                bookingInventoryDto.getMoveInDate());

        Object postBody = bookingInventoryDto;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/v1/contract/inventory-occupancy/fetch").buildAndExpand(uriVariables).toUriString();

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

    public BookingResponseDto rejectKycV2(String bookingUuid) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);
        String path =
                UriComponentsBuilder.fromPath("/internal/v1/reject-kyc/{bookingUuid}")
                        .buildAndExpand(uriVariables)
                        .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<BookingResponseDto> returnType =
                new ParameterizedTypeReference<BookingResponseDto>() {};

        return restClient.invokeAPI(
                path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

}
