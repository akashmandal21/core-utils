package com.stanzaliving.core.client.api;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.stanzaliving.booking.dto.*;
import com.stanzaliving.core.base.enums.DateFormat;
import com.stanzaliving.core.base.utils.DateUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.booking.SoldBookingDto;
import com.stanzaliving.booking.dto.request.BookingRequestDto;
import com.stanzaliving.booking.dto.request.CustomizeVasSyncResponse;
import com.stanzaliving.booking.dto.response.BookingCommercialsCardResponseDto;
import com.stanzaliving.booking.dto.response.BookingWaiveOffDetailsResponseDto;
import com.stanzaliving.booking.dto.response.InventoryOccupancyResponseDto;
import com.stanzaliving.booking.dto.response.LedgerResponseDto;
import com.stanzaliving.booking.dto.response.NeedsAttentionBookingResponseDto;
import com.stanzaliving.booking.dto.response.RefundResponseDto;
import com.stanzaliving.booking.enums.ResidenceAgreementType;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.exception.ApiValidationException;
import com.stanzaliving.core.base.exception.StanzaException;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.bookingservice.dto.request.GuestRequestPayloadDto;
import com.stanzaliving.core.bookingservice.dto.request.ResidenceCardDto;
import com.stanzaliving.core.bookingservice.dto.request.ResidentRequestDto;
import com.stanzaliving.core.bookingservice.dto.response.BookedPackageServiceDto;
import com.stanzaliving.core.bookingservice.dto.response.GstDto;
import com.stanzaliving.core.bookingservice.dto.response.PackagedServiceResponseDto;
import com.stanzaliving.core.client.dto.BookingAmountRealisationResponseDto;
import com.stanzaliving.core.client.dto.BookingDetailDto;
import com.stanzaliving.core.client.dto.BookingInventoryDto;
import com.stanzaliving.core.client.dto.BookingInventoryResponseDto;
import com.stanzaliving.core.client.dto.CancelBookingDto;
import com.stanzaliving.core.client.dto.ContractModificationDetailsDto;
import com.stanzaliving.core.client.dto.ExceptionOnboardingDetailsDto;
import com.stanzaliving.core.client.dto.InventoryResponseOccupancyDto;
import com.stanzaliving.core.client.dto.PackageServicesResponseDto;
import com.stanzaliving.core.client.dto.PlanMirResponseDto;
import com.stanzaliving.core.client.dto.RequestDto;
import com.stanzaliving.ledger.dto.UpcomingBookingsDto;
import com.stanzaliving.wanda.venta.response.BookingStatusResponseDto;
import com.stanzaliving.wanda.venta.response.PendingDuesDetailsResponseDtoV2;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class BookingDataControllerApi {

    private StanzaRestClient restClient;

    public BookingDataControllerApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<Map<String, List<InventoryResponseOccupancyDto>>> getBookedInventoryDetail(BookingInventoryDto bookingInventoryDto) {
        Object postBody = bookingInventoryDto;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/v1/inventory-occupancy/fetch").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Map<String, List<InventoryResponseOccupancyDto>>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, List<InventoryResponseOccupancyDto>>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResidenceCardDto getBookedInventoryDetail(String residenceUuid, String moveInDate, String moveOutDate) {

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("uuid", residenceUuid);
        uriVariables.put("moveIn", moveInDate);
        uriVariables.put("moveOut", moveOutDate);

        String path = UriComponentsBuilder.fromPath("/internal/v2/residence/{uuid}/move-in/{moveIn}/move-out/{moveOut}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResidenceCardDto> returnType = new ParameterizedTypeReference<ResidenceCardDto>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<List<BookingResponseDto>> getBookingsEligibleForExpiration() {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/v1/booking/eligible-for-expiration").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<BookingResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<BookingResponseDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<List<RefundResponseDto>> findRefundDetailsForUser(String userUuid) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("userUuid", userUuid);

        String path = UriComponentsBuilder.fromPath("/internal/refundDetails/{userUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();


        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<RefundResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<RefundResponseDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }


    public ResponseDto<ExpiredBookingsResponseDto> expireBooking(ExpiredBookingsDto expiredBookingsDto) {

        Object postBody = expiredBookingsDto;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/booking/v1/expire").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
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

        final String[] accepts = {"*/*"};
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

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<BookedPackageServiceDto>> returnType = new ParameterizedTypeReference<ResponseDto<BookedPackageServiceDto>>() {
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

        final String[] accepts = {"*/*"};
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

        final String[] accepts = {"*/*"};
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
        final String[] accepts = {"*/*"};
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

        final String[] accepts = {"*/*"};
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

        final String[] accepts = {"*/*"};
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

        final String[] accepts = {"*/*"};
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

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<ContractModificationDetailsDto>> returnType = new ParameterizedTypeReference<ResponseDto<ContractModificationDetailsDto>>() {
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

        final String[] accepts = {"*/*"};
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

        final String[] accepts = {"*/*"};
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
            String path = UriComponentsBuilder.fromPath("/internal/v1/booking-details/get/{bookingUuid}").buildAndExpand(uriVariables).toUriString();
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

        final String[] accepts = {"*/*"};
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
            String path = UriComponentsBuilder.fromPath("/booking/ledger/{booking-uuid}").buildAndExpand(uriVariables).toUriString();
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
        String path = UriComponentsBuilder.fromPath("/internal/exit/tresspasser/bookings").buildAndExpand(uriVariables).toUriString();
        final String[] accepts = {"*/*"};
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

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<BookingResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<BookingResponseDto>>() {
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

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<UpcomingBookingsDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<UpcomingBookingsDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }

    public ResponseDto<List<com.stanzaliving.booking.dto.response.InventoryResponseOccupancyDto>> findBookedInventoryDetailsForManagedApartment(String bookingUuid) {
        Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);

        String path = UriComponentsBuilder.fromPath("/internal/{bookingUuid}/booked-inventory").buildAndExpand(uriVariables).toUriString();
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

        String path = UriComponentsBuilder.fromPath("/internal/v1/update/contract/inventory").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<RequestDto> fetchLatestModifyRequestForBooking(String bookingUuid, String requestType) {
        Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);

        String path = UriComponentsBuilder.fromPath("/internal/v1/request/{bookingUuid}").buildAndExpand(uriVariables).toUriString();
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

        ParameterizedTypeReference<ResponseDto<Map<String, Object>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, Object>>>() {
        };

        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception var13) {
            log.error("Exception while fetching fetch Contract Pricing Details for Contract uuid {}", contractUuid);
            return null;
        }
    }

    public ResponseDto<Map<String, List<InventoryResponseOccupancyDto>>> getBookedInventoryDetailForContract(BookingInventoryDto bookingInventoryDto) {

        Object postBody = bookingInventoryDto;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/v1/contract/inventory-occupancy/fetch").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
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
        String path = UriComponentsBuilder.fromPath("/internal/v1/reject-kyc/{bookingUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<BookingResponseDto> returnType = new ParameterizedTypeReference<BookingResponseDto>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public List<BookingDetailDto> getBookingDetailsForResident(String residentId) {
        Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("residentId", residentId);

        String path = UriComponentsBuilder.fromPath("/internal/booking-detail/resident/{residentId}").buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<BookingDetailDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<BookingDetailDto>>>() {
        };
        ResponseDto<List<BookingDetailDto>> response = null;
        try {
            log.info("Executing Api for getting booked inventory with Url {}", path);
            response = this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching bookin details for resident for residentId {}, Exception is ", residentId, e);
        }
        return Objects.nonNull(response) ? response.getData() : new ArrayList<>();
    }

    public BookingResponseDto getCurrentBookingDetailsForResident(String residentId) {
        Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("residentId", residentId);

        String path = UriComponentsBuilder.fromPath("/internal/current-booking-detail/resident/{residentId}").buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<BookingResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<BookingResponseDto>>() {
        };
        ResponseDto<BookingResponseDto> response = null;
        try {
            log.info("Executing Api for getting current booking detail with Url {}", path);
            response = this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching booking details for resident for residentId {}, Exception is ", residentId, e);
        }
        return Objects.nonNull(response) ? response.getData() : null;
    }


    public ResponseDto<PaymentPendingBookingResponseDto> getLatestActivePaymentPendingBookingEntity(String bookingUuid,Double amount) {
        Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);
        uriVariables.put("amount",amount);

        String path = UriComponentsBuilder.fromPath("/internal/latest/active/payment-pending-booking/{bookingUuid}/{amount}")
                .buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<PaymentPendingBookingResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<PaymentPendingBookingResponseDto>>() {
        };
        ResponseDto<PaymentPendingBookingResponseDto> response  = null;
        try {
            log.info("Executing Api for getting latest active payment pending booking entity for bookingUuid {} with Url {}",bookingUuid,path);
            response = this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while getting latest active payment pending booking entity for bookingUuid {} Exception is ",bookingUuid , e);
        }
        return response;
    }

    public ResponseDto<BookingResponseDto> captureTokenAmountPayment(BookingRequestDto confirmBookingDto) {

        Object postBody = confirmBookingDto;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/v1/capture-payment").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<BookingResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<BookingResponseDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public List<BookingStatusResponseDto> getBookingStatusForResident(String userUuid) {
        Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("userUuid", userUuid);

        String path = UriComponentsBuilder.fromPath("/internal/booking/status/{userUuid}").buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<List<BookingStatusResponseDto>> returnType = new ParameterizedTypeReference<List<BookingStatusResponseDto>>() {
        };
        List<BookingStatusResponseDto> response = null;
        try {
            log.info("Executing Api for getting booking status with Url {}", path);
            response = this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching booking status for resident for user uuid {}, Exception is ", userUuid, e);
        }
        return Objects.nonNull(response) ? response : new ArrayList<>();
    }

    public Map<String, List<BookingDetailDto>> getBookingDetailsForResidentsInCaseOfElectricity(ResidentRequestDto residentRequestDto) {
        Object postBody = residentRequestDto;
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/electricity/booking-detail/residents").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<Map<String, List<BookingDetailDto>>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, List<BookingDetailDto>>>>() {
        };
        ResponseDto<Map<String, List<BookingDetailDto>>> response = null;
        try {
            log.info("Executing Api for getting booked inventory in case of electricity with Url {}", path);
            response = restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching booking details for resident for residentIds {}, Exception is ", residentRequestDto, e);
        }
        return Objects.nonNull(response) && Objects.nonNull(response.getData()) ? response.getData() : new HashMap<>();
    }

    public List<com.stanzaliving.core.bookingservice.dto.response.BookingDetailDto> getBookingDetailsForResidentForSupport(String residentId) {
        Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("residentId", residentId);

        String path = UriComponentsBuilder.fromPath("/internal/booking-detail/resident/{residentId}").buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<com.stanzaliving.core.bookingservice.dto.response.BookingDetailDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<com.stanzaliving.core.bookingservice.dto.response.BookingDetailDto>>>() {
        };
        ResponseDto<List<com.stanzaliving.core.bookingservice.dto.response.BookingDetailDto>> response = null;
        try {
            log.info("Executing Api for getting booked inventory with Url {}", path);
            response = this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching bookin details for resident for residentId {}, Exception is ", residentId, e);
        }
        return Objects.nonNull(response) ? response.getData() : new ArrayList<>();
    }


    public ResponseDto<BookingInventoryResponseDto> getInventoryOccupancyDetailsForBookingUid(String bookingUuid) {
        Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);

        String path = UriComponentsBuilder.fromPath("/internal/v1/inventory-occupancy-details/{bookingUuid}").buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<BookingInventoryResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<BookingInventoryResponseDto>>() {
        };
        ResponseDto<BookingInventoryResponseDto> response = null;
        try {
            log.info("Executing Api for getting booking inventory details with Url {}", path);
            response = this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching booking inventory details for bookingUuid {}, Exception is ", bookingUuid, e);
        }
        return response;
    }

    public ResponseDto<BookingResponseDto> getCurrentBookingDetails(String residentId) {
        Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("residentId", residentId);

        String path = UriComponentsBuilder.fromPath("/internal/current-booking-detail/resident/{residentId}")
                .buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<BookingResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<BookingResponseDto>>() {
        };
        ResponseDto<BookingResponseDto> response  = null;
        try {
            log.info("Executing Api for getting booking inventory details with Url {}", path);
            response =restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching booking inventory details for resident {}, Exception is ",residentId , e);
        }
        return response;

    }

    public ResponseDto<BookingResponseDto> createGuestBooking(String guestPhoneNumber) {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("guestPhoneNumber", guestPhoneNumber);

        String path = UriComponentsBuilder.fromPath("/internal/onboard/guest/{guestPhoneNumber}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<BookingResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<BookingResponseDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }


    public ResponseDto<Void> cancelBooking(CancelBookingDto cancelBookingDto) {

        Object postBody = cancelBookingDto;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/booking/v1/cancel").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<List<BookingResponseDto>> getBookingsEligibleForContractTermination() {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/v1/booking/eligible-for-contract-termination").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<BookingResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<BookingResponseDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }


    public ResponseDto<String> terminateContractForBookings(List<String> bookingUuid) {

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/v1/booking/contract-termination").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, bookingUuid, headerParams, accept, returnType);
    }

    public ResponseDto<VasEmailDto> fetchRequestDetailsForVas(String requestUuid) {
        Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("requestUuid", requestUuid);

        String path = UriComponentsBuilder.fromPath("/internal/vas/request/{requestUuid}/details").buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<VasEmailDto>> returnType = new ParameterizedTypeReference<ResponseDto<VasEmailDto>>() {
        };
        try {
            log.info("Executing Api for getting vas details request with Url {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching vas details for request uuid {}, Exception is ", requestUuid, e);
        }
        return null;

    }
    public ResponseDto<BookingResponseDto> getBookingDetailsForVirtualAccountMapping(String residentId) {
        Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("residentId", residentId);

        String path = UriComponentsBuilder.fromPath("/internal/booking-detail/virtual-account/resident/{residentId}")
                .buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<BookingResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<BookingResponseDto>>() {
        };
        ResponseDto<BookingResponseDto> response  = null;
        try {
            log.info("Executing Api for getting booking inventory details with Url {}", path);
            response =restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching booking inventory details for resident {}, Exception is ",residentId , e);
        }
        return response;
    }

    public ResponseDto<Boolean> getRoomOccupancyStatusForRoom(BookingInventoryDto bookingInventoryDto) {
        Object postBody = bookingInventoryDto;
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/v1/room-occupancy-details").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<List<com.stanzaliving.booking.dto.response.InventoryResponseOccupancyDto>> getRoomDetails(String roomUuid) {
        Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("uuid", roomUuid);

        String path = UriComponentsBuilder.fromPath("/internal/v1/room/{uuid}")
                .buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<com.stanzaliving.booking.dto.response.InventoryResponseOccupancyDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<com.stanzaliving.booking.dto.response.InventoryResponseOccupancyDto>>>() {
        };
        ResponseDto<List<com.stanzaliving.booking.dto.response.InventoryResponseOccupancyDto>> response  = null;
        try {
            log.info("Executing Api for getting booking inventory details with Url {}", path);
            response =restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching booking inventory details for resident {}, Exception is " , e);
        }
        return response;
    }

    public ResponseDto<com.stanzaliving.booking.dto.response.InventoryResponseOccupancyDto> findBookedInventoryDetailsForB2B(String bookingInventoryOccupancyUuid) {
        Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingInventoryOccupancyUuid", bookingInventoryOccupancyUuid);

        String path = UriComponentsBuilder.fromPath("/internal/{bookingInventoryOccupancyUuid}/b2b-inventory").buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<com.stanzaliving.booking.dto.response.InventoryResponseOccupancyDto>> returnType = new ParameterizedTypeReference<ResponseDto<com.stanzaliving.booking.dto.response.InventoryResponseOccupancyDto>>() {
        };
        try {
            log.info("Executing Api for getting booked inventory with Url {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching booked inventory for booking uuid {}, Exception is ", bookingInventoryOccupancyUuid, e);
        }
        return null;
    }

    public ResponseDto<Float> getPriceIncreasePercentage(String bookingUuid) {
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);

        String path = UriComponentsBuilder.fromPath("/internal/priceIncrease/{bookingUuid}").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Float>> returnType = new ParameterizedTypeReference<ResponseDto<Float>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<List<PackagedServiceResponseDto>> fetchPackagedServiceSummary(String residenceUuid) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("residenceUuid", residenceUuid);

        String path = UriComponentsBuilder.fromPath("/internal/packaged-service-summary/residence/{residenceUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

//        queryParams.add("residenceUuid", residenceUuid);

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<PackagedServiceResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<PackagedServiceResponseDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<Integer> getRoomBookingDetailsByUuid(String roomUuid) {
        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("roomUuid", roomUuid);

        String path = UriComponentsBuilder.fromPath("/bookingDetail/v1/occupied-inventory/{roomUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<Integer>> returnType = new ParameterizedTypeReference<ResponseDto<Integer>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<BookingWaiveOffDetailsResponseDto> getBookingWaiveOffAmount(String bookingUuid) {
        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);

        String path = UriComponentsBuilder.fromPath("/internal/v1/booking/waive-off-amount/{bookingUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<BookingWaiveOffDetailsResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<BookingWaiveOffDetailsResponseDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<GuestRequestPayloadDto> getGuestDetailsByPhone(String phoneNumber) {

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("phoneNumber", phoneNumber);

        String path = UriComponentsBuilder.fromPath("/internal/booking/guest-info/{phoneNumber}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<GuestRequestPayloadDto>> returnType = new ParameterizedTypeReference<ResponseDto<GuestRequestPayloadDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<Map<String, SoldBookingDto>> getBookingInfoByResidenceUuid(List<String> residenceUuids, Date toDate) {

        Object postBody = residenceUuids;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/residence/booking-info/").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        if (Objects.nonNull(toDate)) {
            queryParams.add("toDate", toDate.toString());
        }

        ParameterizedTypeReference<ResponseDto<Map<String, SoldBookingDto>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, SoldBookingDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<Boolean> isResidenceHavingAnyActiveBooking(String residenceUuid) {

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("residenceUuid", residenceUuid);

        String path = UriComponentsBuilder.fromPath("/internal/residence/{residenceUuid}/active-booking").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<String> emailVerifiedUpdate(String phoneNumber) {

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("phoneNumber", phoneNumber);

        String path = UriComponentsBuilder.fromPath("/internal/booking/guest-info/update/{phoneNumber}").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<String> syncMysqlAndElasticData() {
        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/sync-mysql-elastic").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<List<BookingResponseDto>> getBookingEntities(List<String> bookingUuids) {

        final Map<String, Object> uriVariables = new HashMap<>();
        Object requestBody = bookingUuids;

        String path = UriComponentsBuilder.fromPath("/internal/v1/booking/bookings-info").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<BookingResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<BookingResponseDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, requestBody, headerParams, accept, returnType);
    }

    public ResponseDto<List<GstDto>> getGstDetails(String amount) {
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/applicable-gst-details").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("amount", amount);
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<GstDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<GstDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<List<GstDto>> getGstDetailsByType(String gstAmountType) {
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/applicable-gst-details").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("amount-type", gstAmountType);
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<GstDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<GstDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<Boolean> expireDeal(String dealUuid) {
        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("dealUuid", dealUuid);

        String path = UriComponentsBuilder.fromPath("/internal/dealExpire/{dealUuid}").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<BookingAmountRealisationResponseDto> getBookingAmountRealisationDetails(String bookingUuid) {
        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);

        String path = UriComponentsBuilder.fromPath("/internal/v1/booking/booking-amount-realisation/{bookingUuid}").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<BookingAmountRealisationResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<BookingAmountRealisationResponseDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<BookingAmountRealisationResponseDto> getBookingAmountRealisationDetails(String bookingUuid, boolean notificationRequest) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);

        String path = UriComponentsBuilder.fromPath("/internal/v1/booking/booking-amount-realisation/{bookingUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("notificationRequest", String.valueOf(notificationRequest));

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<BookingAmountRealisationResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<BookingAmountRealisationResponseDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<Double> getBookingAmountRealisationAmount(String bookingUuid) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);

        String path = UriComponentsBuilder.fromPath("/internal/v1/booking/booking-amount-realisation/get-realisation-amount/{bookingUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Double>> returnType = new ParameterizedTypeReference<ResponseDto<Double>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public void validateBooking() {
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/utility/validate-bookings").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {
        };
        restClient.invokeAPI(path, HttpMethod.POST, queryParams, null, headerParams, accept, returnType);

    }

    public PendingDuesDetailsResponseDtoV2 getPendingDuesForBooking(String bookingUuid) {
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bookingUuid", bookingUuid);
        String path = UriComponentsBuilder.fromPath("/internal/get/pendingDues/{bookingUuid}").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<PendingDuesDetailsResponseDtoV2> returnType = new ParameterizedTypeReference<PendingDuesDetailsResponseDtoV2>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception occurred while getting dues for bookingUuid: {}", bookingUuid, e);
        }
        return null;
    }

    public ResponseDto<InventoryOccupancyResponseDto> getLatestInventoryOccupancyDetailsForBookingUid(String bookingUuid) {
        Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);

        String path = UriComponentsBuilder.fromPath("/internal/v1/latest-inventory-occupancy-details/booking/{bookingUuid}")
                .buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<InventoryOccupancyResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<InventoryOccupancyResponseDto>>() {
        };
        ResponseDto<InventoryOccupancyResponseDto> response  = null;
        try {
            log.info("Executing Api for getting booking inventory details with Url {}", path);
            response = this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching booking inventory details for bookingUuid {}, Exception is ",bookingUuid , e);
        }
        return response;
    }

    public ResponseDto<String> createAuditForBooking(String bookingUuid) {
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);
        String path = UriComponentsBuilder.fromPath("/internal/initate/audit/{bookingUuid}").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<List<BookingResponseDto>> getBookingsForBookingAmountRealisation() {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/v1/booking/booking-amount-realisation/all").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<BookingResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<BookingResponseDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<String> bookingAutoForfeiture(List<String> bookingUuids) {

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/booking/v1/auto-forfeiture").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, bookingUuids, headerParams, accept, returnType);
    }

    public ResponseDto<String> markBookingAutoForfeitureAndRealiseBookingAmount(List<String> bookingUuids) {

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/v1/booking/auto-forfeiture").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, bookingUuids, headerParams, accept, returnType);
    }

    public ResponseDto<Map<String, List<InventoryResponseOccupancyDto>>> getSoftBlockedInventoryDetail(BookingInventoryDto bookingInventoryDto) {
        Object postBody = bookingInventoryDto;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/v1/soft-block/inventory-occupancy/fetch").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Map<String, List<InventoryResponseOccupancyDto>>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, List<InventoryResponseOccupancyDto>>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<Double> getLandLordRent(String bookingUuid) {
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);
        String path = UriComponentsBuilder.fromPath("/internal/v1/landlord-rent/{bookingUuid}").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<Double>> returnType = new ParameterizedTypeReference<ResponseDto<Double>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<List<String>> getPendingRequestsEligibleForExpiration() {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/v1/booking/pending-requests-for-expiration").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<String>>> returnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<ExpiredPendingRequestsResponseDto> expirePendingRequests(ExpiredPendingRequestsDto expiredPendingRequestsDto) {

        Object postBody = expiredPendingRequestsDto;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/v1/request/pending-approval/expire").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<ExpiredPendingRequestsResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<ExpiredPendingRequestsResponseDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<CustomizeVasSyncResponse> fetchBookingsForVasSync() {
        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/v1/booking/sync-vas-jarvis/all").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<CustomizeVasSyncResponse>> returnType = new ParameterizedTypeReference<ResponseDto<CustomizeVasSyncResponse>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<String> updateResidenceAgreementType(String bookingUuid, ResidenceAgreementType residenceAgreementType) {
        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("bookingUuid", bookingUuid);
        uriVariables.put("residenceAgreementType", residenceAgreementType);

        String path = UriComponentsBuilder.fromPath("/internal/v1/update/residence-agreement-type/{residenceAgreementType}/booking/{bookingUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public List<PlanMirResponseDto> getMenuCategoryWiseMir(List<String> residenceIds, LocalDate date) {
        ResponseDto<List<PlanMirResponseDto>> responseDto = null;
        if (residenceIds.size() > 10) {
            log.error("residenceIds list input size can't be greater than 10");
            throw new StanzaException("residenceIds list input size can't be greater than 10");
        }
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/v2/move-in-resident").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("date", date.toString());

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = { "*/*" };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<PlanMirResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<PlanMirResponseDto>>>() {
        };

        try {
            responseDto = restClient.invokeAPI(path, HttpMethod.POST, queryParams, residenceIds, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Error while getting menucategory wise mir {}", date, e);
        }

        return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : null;
    }

    public ResponseDto<String> forfeitRemoteBookings() {

        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/v1/booking/forfeit-remote-bookings").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResidenceCardDto getBedsStatByResidenceUuidByDate(List<String> residenceUuids, Date moveIn) {

        ResidenceCardDto responseDto = null;
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/v2/residence-stats").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        if(Objects.nonNull(moveIn))
            queryParams.add("moveIn", DateUtil.customDateFormatter(moveIn, DateFormat.YYYY_HIFEN_MM_HIFEN_DD));

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = { "*/*" };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResidenceCardDto> returnType = new ParameterizedTypeReference<ResidenceCardDto>() {
        };

        try {
            responseDto = restClient.invokeAPI(path, HttpMethod.POST, queryParams, residenceUuids, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Error while getting BedsStatByResidenceUuidByDate", e);
        }
        return (Objects.nonNull(responseDto)) ? responseDto : null;

    }

    public ResponseDto<BookingConfirmationDto> getBookingsEligibleForConfirmation() {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/v1/booking/eligible-for-confirmation").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<BookingConfirmationDto>> returnType = new ParameterizedTypeReference<ResponseDto<BookingConfirmationDto>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public void updateONMCorrectionFailureLogs(String bookingUuid, String failureMessage){

        String responseDto = null;

        final Map<String, Object> uriVariables = new HashMap<>();

        Object postBody = null;

        uriVariables.put("bookingUuid", bookingUuid);

        String path = UriComponentsBuilder.fromPath("/internal/v1/update/onm-failure-message/{bookingUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        if(StringUtils.isNotBlank(failureMessage))
            queryParams.add("failureMessage", failureMessage);

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
        };

        restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public void updateONMMigrationLogs(String bookingUuid, String migrationStatus, String message) {

        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("bookingUuid", bookingUuid);

        String path = UriComponentsBuilder.fromPath("/internal/v1/save/onm-migration-logs/{bookingUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        if(StringUtils.isNotBlank(message))
            queryParams.add("message", message);

        if(StringUtils.isNotBlank(migrationStatus))
            queryParams.add("migrationStatus", migrationStatus);

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
        };

        restClient.invokeAPI(path, HttpMethod.POST, queryParams, null, headerParams, accept, returnType);
    }

    public void cancelPotentialDefaulterExits() {

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/booking-exit-details/v1/cancel-potential-defaulter-exits").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
        };

        restClient.invokeAPI(path, HttpMethod.DELETE, queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<BookingConfirmationResponseDto> confirmRofrBookings(BookingConfirmationDto bookingConfirmationDto) {

        Object postBody = bookingConfirmationDto;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/booking/v1/confirm-rofr-bookings").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<BookingConfirmationResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<BookingConfirmationResponseDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

}
