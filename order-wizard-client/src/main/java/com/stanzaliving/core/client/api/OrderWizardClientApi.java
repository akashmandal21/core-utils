package com.stanzaliving.core.client.api;


import com.stanzaliving.booking.dto.request.OrderCreationDto;
import com.stanzaliving.booking.dto.response.BookingOrderDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.enums.Source;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Collections;
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
        try {
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
        } catch (Exception e) {
            return null;
        }
    }


    public ResponseDto<List<BookingOrderDto>> orderCreation(OrderCreationDto orderCreationDto, String bookingUuid,
                                                            boolean createPaymentPlan, Source source) {
        try {
            log.info("Order-Wizard-Client::Processing to save plan details based  {} and booking {}", orderCreationDto, bookingUuid);

            final Map<String, Object> uriVariables = new HashMap<>();
            uriVariables.put("bookingUuid", bookingUuid);
            String path = UriComponentsBuilder.fromPath("/create/order/bundle/for/booking/{bookingUuid}").buildAndExpand(uriVariables).toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
            queryParams.add("createPaymentPlan", String.valueOf(createPaymentPlan));
            queryParams.add("source", source.name());
            final org.springframework.http.HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {
                    "*/*"
            };
            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<List<BookingOrderDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<BookingOrderDto>>>() {
            };

            return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, orderCreationDto, headerParams, accept, returnType);
        } catch (Exception e) {
            return null;
        }
    }
}

