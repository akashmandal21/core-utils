package com.stanzaliving.core.residence.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.residenceservice.dto.MoveInDateDto;
import com.stanzaliving.core.residenceservice.dto.PricingStrategyBookingDto;
import com.stanzaliving.residenceservice.Dto.ResidenceAttributesRequestDto;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PricingStrategyControllerApi {
    private static final Logger log = LogManager.getLogger(ResidenceDataControllerApi.class);
    private StanzaRestClient restClient;

    public PricingStrategyControllerApi(StanzaRestClient restClient) {
        this.restClient = restClient;
    }

    public ResponseDto<List<PricingStrategyBookingDto>> getPricingStrategyByResidenceAndMoveIn(String residenceUuid, Date moveIn){
        log.info("Residence-Data-Controller::Processing to get Pricing strategy based on residenceUuid {} and moveInDate {}", residenceUuid, moveIn);
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("uuid",residenceUuid);
        uriVariables.put("moveIn",moveIn);
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/pricing-strategy/{uuid}/{moveIn}").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<String>>> returnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
        };

        try {
            return (ResponseDto) this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, null, headerParams, accept, returnType);
        } catch (Exception var13) {
            log.error("Exception while fetching lock-in date based on residenceUuid {} and moveInDate {}", residenceUuid, moveIn);
            return null;
        }
    }

    public ResponseDto<List<PricingStrategyBookingDto>> setPricingStrategyForBooking(ResidenceAttributesRequestDto residenceDto ){
        log.info("Residence-Data-Controller::Processing to get Pricing strategy based on residenceUuid {} and moveInDate {}", residenceDto.getResidenceUuid());
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/pricing-strategy/setBooking").toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<String>>> returnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
        };
        //:Todo >> need to test the set booking pricing strategy entities

        try {
            return (ResponseDto) this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, null, headerParams, accept, returnType);
        } catch (Exception var13) {
            log.error("Exception while fetching lock-in date based on residenceUuid {} and moveInDate {}", residenceDto);
            return null;
        }
    }


}
