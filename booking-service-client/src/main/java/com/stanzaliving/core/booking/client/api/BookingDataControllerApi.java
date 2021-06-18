package com.stanzaliving.core.booking.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.booking.client.dto.InventoryResponseOccupancyDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2
public class BookingDataControllerApi {

    private StanzaRestClient restClient;

    public BookingDataControllerApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<Map<String, List<InventoryResponseOccupancyDto>>> getBookedInventoryDetail(String token, List<String> roomUUID, List<String> inventoryUUID, String moveInDate) {

        log.info("Booking-Data-Controller::Processing to get booked inventories detail of rooms {}, moveInDate {} ", roomUUID, moveInDate);

        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/booked-inventory-detail").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.put("roomUUID", roomUUID);
        queryParams.put("moveInDate", Collections.singletonList(moveInDate));
        queryParams.put("inventoryUUID", inventoryUUID);

        HttpHeaders headerParams = new HttpHeaders();

        headerParams.add("Cookie", "token=" + token);

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Map<String, List<InventoryResponseOccupancyDto>>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, List<InventoryResponseOccupancyDto>>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

}
