package com.stanzaliving.core.bundle.client.api;

import com.stanzaliving.booking.dto.request.OptedPlansRequestDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.residenceservice.enums.VasCategory;
import com.stanzaliving.stay_curation.dto.AddOnDetailsDto;
import com.stanzaliving.stay_curation.dto.AlfredResidenceServiceDto;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BundleDataControllerApi {

    private static final Logger log = LogManager.getLogger(BundleDataControllerApi.class);
    private StanzaRestClient restClient;

    public BundleDataControllerApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<Map<VasCategory, List<AlfredResidenceServiceDto>>> fetchOptedPlans(List<OptedPlansRequestDto> optedPlansRequestDtoList) {
        log.info("Residence-Data-Controller::Processing to fetch plan details based on optedPlansRequestDtoList {}", optedPlansRequestDtoList);

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/add-on/list/by/bundleId/planUuid/").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final org.springframework.http.HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Map<VasCategory, List<AlfredResidenceServiceDto>>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<VasCategory, List<AlfredResidenceServiceDto>>>>() {
        };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, optedPlansRequestDtoList, headerParams, accept, returnType);
        } catch (Exception var13) {
            log.error("Exception while fetching plan details based on optedPlansRequestDtoList {}", optedPlansRequestDtoList);
            return null;
        }
    }

    public List<AddOnDetailsDto> getAddOnListForPostpaidBillingIds(List<String> billingPreferenceIds) {
        log.info("Bundle-Data-Controller::Processing to fetch add on details based on billingPreferenceIds {}", billingPreferenceIds);

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/add-on/list/by/billing-ids").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final org.springframework.http.HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<List<AddOnDetailsDto>> returnType = new ParameterizedTypeReference<List<AddOnDetailsDto>>() {
        };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, billingPreferenceIds, headerParams, accept, returnType);
        } catch (Exception var13) {
            log.error("Exception while fetching add-on details based on billingPreferenceIds {}", billingPreferenceIds);
            return new ArrayList<>();
        }
    }
}
