package com.stanzaliving.core.client.api;


import com.stanzaliving.booking.dto.request.OrderCreationDto;
import com.stanzaliving.booking.dto.response.BookingOrderDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
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
public class OrderWizardClientApi {


    private final StanzaRestClient restClient;

    public OrderWizardClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public List<BookingOrderDto> fetchOptedPlansByBookingId(String bookingUuid) {
        log.info("Order-Wizard-Client::fetchOptedPlansByBookingId {}", bookingUuid);

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);

        String path = UriComponentsBuilder.fromPath("/booking/order/{bookingUuid}/details").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        org.springframework.http.HttpHeaders headerParams = new org.springframework.http.HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<List<BookingOrderDto>> returnType = new ParameterizedTypeReference<List<BookingOrderDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }


    public ResponseDto<List<BookingOrderDto>> orderCreation(OrderCreationDto orderCreationDto, String bookingUuid, boolean createPaymentPlan) {

        log.info("Order-Wizard-Client::Processing to save plan details based  {} and booking {}", orderCreationDto, bookingUuid);

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);
        String path = UriComponentsBuilder.fromPath("/create/order/bundle/for/booking/{bookingUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("createPaymentPlan", String.valueOf(createPaymentPlan));
        final org.springframework.http.HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<BookingOrderDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<BookingOrderDto>>>() {
        };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, orderCreationDto, headerParams, accept, returnType);
        } catch (Exception var13) {
            log.error("Exception while fetching plan details based on optedPlansRequestDtoList {}", orderCreationDto, var13);
            return null;
        }
    }

    public List<BookingOrderDto> dropAddPostpaidAddOns(String bookingUuid, List<String> planUuids, boolean removePaymentPlan) {

        log.info("Order-Wizard-Client::Processing to remove add-ons with planUuids: {} for bookingUuid {}, removePaymentPlan: {}",
                planUuids, bookingUuid, removePaymentPlan);

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);
        String path = UriComponentsBuilder.fromPath("/modify/order/drop/add-ons/{bookingUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("removePaymentPlan", String.valueOf(removePaymentPlan));
        final org.springframework.http.HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<List<BookingOrderDto>> returnType = new ParameterizedTypeReference<List<BookingOrderDto>>() {
        };

        return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, planUuids, headerParams, accept, returnType);
    }

    public List<BookingOrderDto> dropAllOrders(String bookingUuid, boolean removePaymentPlan, boolean dropBundle) {

        log.info("Order-Wizard-Client::Processing to remove add-ons with for bookingUuid {}, removePaymentPlan: {}", bookingUuid, removePaymentPlan);

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);
        String path = UriComponentsBuilder.fromPath("/modify/order/drop/all/{bookingUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("removePaymentPlan", String.valueOf(removePaymentPlan));
        queryParams.add("dropBundle", String.valueOf(dropBundle));
        final org.springframework.http.HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<List<BookingOrderDto>> returnType = new ParameterizedTypeReference<List<BookingOrderDto>>() {
        };

        return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, null, headerParams, accept, returnType);
    }
}

