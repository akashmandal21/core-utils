package com.stanzaliving.core.client.api;

import com.stanzaliving.booking.dto.request.OptedPlansRequestDto;
import com.stanzaliving.booking.dto.request.OrderCreationDto;
import com.stanzaliving.booking.dto.response.BookingOrderDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.bookingservice.dto.request.ResidenceCardDto;
import com.stanzaliving.residenceservice.enums.VasCategory;
import com.stanzaliving.stayCuration.AlfredResidenceServiceDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;




public class OrderWizardClientApi {

    private static final Logger log = LogManager.getLogger(OrderWizardClientApi.class);
    private StanzaRestClient restClient;

    public OrderWizardClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<List<BookingOrderDto>> fetchOptedPlansByBookingId(String bookingUuid) {
        log.info("Order-Wizard-Client::fetchOptedPlansByBookingId {}", bookingUuid);

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);

        String path = UriComponentsBuilder.fromPath("/booking/order/{bookingUuid}/details").buildAndExpand(uriVariables).toUriString();

        final org.springframework.util.MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        org.springframework.http.HttpHeaders headerParams = new org.springframework.http.HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<BookingOrderDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<BookingOrderDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }


    public ResponseDto<OrderCreationDto> orderCreation(OrderCreationDto orderCreationDto, String bookingUuid) {

        log.info("Order-Wizard-Client::Processing to save plan details based  {} and booking {}", orderCreationDto, bookingUuid);

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);
        String path = UriComponentsBuilder.fromPath("/order-wizard/create/order/bundle/for/booking/{bookingUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final org.springframework.http.HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<OrderCreationDto>> returnType = new ParameterizedTypeReference<ResponseDto<OrderCreationDto>>() {
        };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, orderCreationDto, headerParams, accept, returnType);
        } catch (Exception var13) {
            log.error("Exception while fetching plan details based on optedPlansRequestDtoList {}", orderCreationDto);
            return null;
        }
    }
}

