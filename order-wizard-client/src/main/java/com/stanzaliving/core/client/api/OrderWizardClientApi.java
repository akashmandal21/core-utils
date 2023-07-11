package com.stanzaliving.core.client.api;


import com.stanzaliving.booking.dto.request.OrderCreationDto;
import com.stanzaliving.booking.dto.response.BookingOrderDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.util.UriComponentsBuilder;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;


@Log4j2
public class OrderWizardClientApi {


    private StanzaRestClient restClient;

    public OrderWizardClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public List<BookingOrderDto> fetchOptedPlansByBookingId(String bookingUuid, String orderStatus) {
        log.info("Order-Wizard-Client::fetchOptedPlansByBookingId {}", bookingUuid);

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);

        String path = UriComponentsBuilder.fromPath("/booking/order/{bookingUuid}/details").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

         orderStatus = !StringUtils.isEmpty(orderStatus) ? orderStatus : "ORDER_FULFILLED";

        queryParams.put("orderStatus", Collections.singletonList(orderStatus));

        org.springframework.http.HttpHeaders headerParams = new org.springframework.http.HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<List<BookingOrderDto>> returnType = new ParameterizedTypeReference<List<BookingOrderDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }


    public ResponseDto<List<BookingOrderDto>> orderCreation(OrderCreationDto orderCreationDto, String bookingUuid) {

        log.info("Order-Wizard-Client::Processing to save plan details based  {} and booking {}", orderCreationDto, bookingUuid);

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);
        String path = UriComponentsBuilder.fromPath("/create/order/bundle/for/booking/{bookingUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

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
            log.error("Exception while fetching plan details based on optedPlansRequestDtoList {}", orderCreationDto);
            return null;
        }
    }
}

