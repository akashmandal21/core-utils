package com.stanzaliving.core.venta_aggregation_client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.venta_aggregation_client.config.RestResponsePage;
import com.stanzaliving.core.ventaaggregationservice.dto.*;
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
public class VentaAggregationServiceApi {


    private StanzaRestClient restClient;

    public VentaAggregationServiceApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    /**
     * This method is used to fetch ResidenceAggregation Data from Venta-Aggregation-Service
     *
     * @param residenceUuid->Unique ID corresponding to residence
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
        String[] accepts = new String[]{"*/*"};
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

        ParameterizedTypeReference<ResponseDto<RestResponsePage<BookingResidenceAggregationEntityDto>>> returnType = new ParameterizedTypeReference<ResponseDto<RestResponsePage<BookingResidenceAggregationEntityDto>>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<RestResponsePage<BookingAggregationDto>> getBookingAggregationListing(BookingFilterRequestDto bookingFilterRequestDto) {
        log.info("Aggregation Booking Controller");

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
}
