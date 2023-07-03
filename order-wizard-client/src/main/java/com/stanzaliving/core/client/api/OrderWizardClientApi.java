package com.stanzaliving.core.client.api;

import com.stanzaliving.booking.dto.response.BookingOrderDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.bookingservice.dto.request.ResidenceCardDto;
import org.apache.commons.collections.map.MultiValueMap;
import org.apache.http.HttpHeaders;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
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
}

