package com.stanzaliving.core.bundle.client.api;

import java.time.LocalDate;
import java.util.*;

import com.stanzaliving.booking.dto.request.OptedPlansRequestDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.enums.DateFormat;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.base.utils.DateUtil;
import com.stanzaliving.residenceservice.enums.VasCategory;
import com.stanzaliving.stay_curation.dto.AddOnDetailsDto;
import com.stanzaliving.stay_curation.dto.AlfredResidenceServiceDto;
import com.stanzaliving.stay_curation.dto.BundleOrderRequestDto;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.util.UriComponentsBuilder;

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

    public List<AddOnDetailsDto> getAddOnListForPostpaidBillingIds(BundleOrderRequestDto orderRequestDto) {
        log.info("Bundle-Data-Controller::Processing to fetch add on details based on orderRequestDto {}", orderRequestDto);

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/add-on/postpaid/list/by/billingPreferenceIds").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final org.springframework.http.HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<List<AddOnDetailsDto>> returnType = new ParameterizedTypeReference<List<AddOnDetailsDto>>() {
        };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, orderRequestDto, headerParams, accept, returnType);
        } catch (Exception var13) {
            log.error("Exception while fetching add-on details based on orderRequestDto {}", orderRequestDto);
            return new ArrayList<>();
        }
    }

    public Object getActiveBundle(String residenceId, String dealCategory, LocalDate fromDate) {
        log.info("Bundle-Data-Controller::Fetching bundles for residenceId: {}, dealCategory: {}: fromDate: {}", residenceId, dealCategory, fromDate);

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("residenceUuid", residenceId);
        uriVariables.put("dealCategory", dealCategory);
        uriVariables.put("validFrom", fromDate);
        String path = UriComponentsBuilder.fromPath("/service-mix/find-first/{residenceUuid}/{dealCategory}/{validFrom}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final org.springframework.http.HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {
        };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching bundle for residenceId: {}, dealCategory: {}: fromDate: {}", residenceId, dealCategory, fromDate, e);
            return null;
        }
    }

    public Object getBundle(String uuid) {
        log.info("Bundle-Data-Controller::Fetching bundles for bundleIds: {}", uuid);

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bundleId", uuid);
        String path = UriComponentsBuilder.fromPath("/service-mix/formatted/from/bundle/{bundleId}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final org.springframework.http.HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {
        };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching bundle for bundleId: {}", uuid, e);
            return null;
        }
    }

    public List<Object> getBundles(List<String> uuidList, String moveInDate) {
        log.info("Bundle-Data-Controller::Fetching bundles for uuids: {}, moveInDate: {}", uuidList, moveInDate);

        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/service-mix/listing/by/uuids").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("validFrom", moveInDate);
        final org.springframework.http.HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<List<Object>> returnType = new ParameterizedTypeReference<List<Object>>() {
        };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, uuidList, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching bundle for bundleIds: {}", uuidList, e);
            return Collections.emptyList();
        }
    }

    public ResponseDto<Map<VasCategory, List<AlfredResidenceServiceDto>>> fetchPlanListForBundle(String bundleId, String moveIn) {
        log.info("Residence-Data-Controller::Processing to fetch plan details based on bundleId {}", bundleId);

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bundleId", bundleId);
        String path = UriComponentsBuilder.fromPath("/add-on/by/bundleId/{bundleId}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("planType", "POSTPAID");
        if(!StringUtils.isEmpty(moveIn))
            queryParams.add("moveIn", moveIn);
        final org.springframework.http.HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Map<VasCategory, List<AlfredResidenceServiceDto>>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<VasCategory, List<AlfredResidenceServiceDto>>>>() {
        };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception var13) {
            log.error("Exception while fetching plan details based on bundleId {}", bundleId);
            return null;
        }
    }
}
