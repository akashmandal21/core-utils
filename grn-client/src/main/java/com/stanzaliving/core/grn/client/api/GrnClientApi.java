package com.stanzaliving.core.grn.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.generic.po.enums.EventType;
import com.stanzaliving.core.grsi.dto.GrsiItemDto;
import com.stanzaliving.core.grsi.dto.GrsiUpdateDto;
import com.stanzaliving.core.grsi.dto.ToFetchRequestDto;
import com.stanzaliving.core.grsi.dto.response.ToResponseDto;
import com.stanzaliving.core.invoice.dto.InvoiceItemFilter;
import com.stanzaliving.core.po.generic.dtos.GenericPoUpdate;
import com.stanzaliving.grn.GSRIEmailData;
import com.stanzaliving.grn.GSRIReceivedQuantity;
import com.stanzaliving.grn.GrnCsvResponseDto;
import com.stanzaliving.grn.GrnQuantity;
import com.stanzaliving.invoice.dto.InvoiceItemDto;
import com.stanzaliving.po.enums.PoType;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.math.BigDecimal;
import java.util.*;

@Log4j2
public class GrnClientApi {

    private StanzaRestClient restClient;

    public GrnClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<List<GrnQuantity>> getGrnQuantityForPo(PoType poType, String poUuid, String propertyUuid) {

        final Map<String, Object> uriVariables = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        String path = UriComponentsBuilder.fromPath("/internal/grn/get/quantity").buildAndExpand(uriVariables).toUriString();

        queryParams.set("poType", poType.name());
        queryParams.set("poUuid", poUuid);

        if (Objects.nonNull(propertyUuid))
            queryParams.set("propertyUuid", propertyUuid);

        ParameterizedTypeReference<ResponseDto<List<GrnQuantity>>> returnType = new ParameterizedTypeReference<ResponseDto<List<GrnQuantity>>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<List<GSRIReceivedQuantity>> getGrnQuantitiesForPO(String poUuid) {

        final Map<String, Object> uriVariables = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        String path = UriComponentsBuilder.fromPath("/internal/generic/get/gsri/quantity").buildAndExpand(uriVariables).toUriString();
        queryParams.set("poToUuid", poUuid);

        ParameterizedTypeReference<ResponseDto<List<GSRIReceivedQuantity>>> returnType = new ParameterizedTypeReference<ResponseDto<List<GSRIReceivedQuantity>>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<List<GSRIReceivedQuantity>> getGrnQuantitiesForFAR(String poToNumber, String itemCode) {

        final Map<String, Object> uriVariables = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        String path = UriComponentsBuilder.fromPath("/internal/generic/get/far/gsri/quantity").buildAndExpand(uriVariables).toUriString();
        queryParams.set("poToNumber", poToNumber);
        queryParams.set("itemCode", itemCode);

        ParameterizedTypeReference<ResponseDto<List<GSRIReceivedQuantity>>> returnType = new ParameterizedTypeReference<ResponseDto<List<GSRIReceivedQuantity>>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<List<InvoiceItemDto>> getGrnQuantitiesForInvoice(Department department, String poUuid, InvoiceItemFilter invoiceItemFilter) {

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("poToUuid",poUuid);
        uriVariables.put("department",department);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        String path = UriComponentsBuilder.fromPath("/internal/generic/get/gsri/invoice/quantity/{department}/{poToUuid}").buildAndExpand(uriVariables).toUriString();

        ParameterizedTypeReference<ResponseDto<List<InvoiceItemDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<InvoiceItemDto>>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, invoiceItemFilter, headerParams, accept, returnType);
    }

    public ResponseDto<GrsiUpdateDto> getGrsiStatus(String poUuid) {

        final Map<String, Object> uriVariables = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        String path = UriComponentsBuilder.fromPath("/internal/generic/get/gsri/status").buildAndExpand(uriVariables).toUriString();
        queryParams.set("poToUuid", poUuid);

        ParameterizedTypeReference<ResponseDto<GrsiUpdateDto>> returnType = new ParameterizedTypeReference<ResponseDto<GrsiUpdateDto>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<Map<EventType,Boolean>> getGrsiEventsAllowed(String poUuid) {

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("poToUuid", poUuid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        String path = UriComponentsBuilder.fromPath("/internal/generic/grnEventAllowed/{poToUuid}").buildAndExpand(uriVariables).toUriString();

        ParameterizedTypeReference<ResponseDto<Map<EventType,Boolean>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<EventType,Boolean>>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<Void> updatePoEndDate(GenericPoUpdate poUpdate) {
        final Map<String, Object> uriVariables = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        String path = UriComponentsBuilder.fromPath("/internal/generic/updatePoEndDate").buildAndExpand(uriVariables).toUriString();

        ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, poUpdate, headerParams, accept, returnType);
    }

    public ResponseDto<Map<String, List<GSRIEmailData>>> getDailyOrWeeklyEmailData(Date startDate, Date endDate) {

        final Map<String, Object> uriVariables = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.set("startDate", String.valueOf(startDate.getTime()));
        queryParams.set("endDate", String.valueOf(endDate.getTime()));

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        String path = UriComponentsBuilder.fromPath("/internal/generic/daily/or/weekly/email/data").buildAndExpand(uriVariables).toUriString();

        ParameterizedTypeReference<ResponseDto<Map<String, List<GSRIEmailData>>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, List<GSRIEmailData>>>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<Integer> getTOVersion(String toUuid) {

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("toUuid", toUuid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        String path = UriComponentsBuilder.fromPath("/internal/generic/get/to/version/{toUuid}").buildAndExpand(uriVariables).toUriString();

        ParameterizedTypeReference<ResponseDto<Integer>> returnType = new ParameterizedTypeReference<ResponseDto<Integer>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }

    // Platform Should be any of these according to requirement NUCLEUS, PHOENIX, NEXUS
    public ResponseDto<Void> receiveOrInstallManualGSRI(String platform, EventType eventType, String toNumber, boolean isComplete, List<GrsiItemDto> gsriItems) {

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("platform", platform);
        uriVariables.put("eventType", eventType);
        uriVariables.put("toNumber", toNumber);
        uriVariables.put("isComplete", isComplete);

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        String path = UriComponentsBuilder.fromPath("/internal/generic/manual/gsri/receive/or/install/{platform}/{eventType}/{toNumber}/{isComplete}").buildAndExpand(uriVariables).toUriString();

		ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, gsriItems, headerParams, accept, returnType);
	}

    public ResponseDto<List<ToResponseDto>> fetchToListForFar(ToFetchRequestDto toFetchRequestDto) {

        final Map<String, Object> uriVariables = new HashMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        String path = UriComponentsBuilder.fromPath("/internal/generic/fetch-to-list").buildAndExpand(uriVariables).toUriString();

        ParameterizedTypeReference<ResponseDto<List<ToResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ToResponseDto>>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, null, toFetchRequestDto, headerParams, accept, returnType);
    }

    public ResponseDto<List<String>> getPendingGsriPoUuids(Boolean isPo) {

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("isPo", isPo);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        String path = UriComponentsBuilder.fromPath("/internal/generic/get/pending/gsri/poUuids/{isPo}").buildAndExpand(uriVariables).toUriString();

        ParameterizedTypeReference<ResponseDto<List<String>>> returnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<List<GrnCsvResponseDto>> fetchGrnDataForPoListingCsv(List<String> poUuids) {

        final Map<String, Object> uriVariables = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        String path = UriComponentsBuilder.fromPath("/internal/generic/poListing/csv/data").buildAndExpand(uriVariables).toUriString();

        ParameterizedTypeReference<ResponseDto<List<GrnCsvResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<GrnCsvResponseDto>>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, poUuids, headerParams, accept, returnType);
    }

    public ResponseDto<Map<String, BigDecimal>> getGSRIItemCodeAndQuantity(String propertyUuid) {

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("propertyUuid", propertyUuid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        String path = UriComponentsBuilder.fromPath("/internal/generic/get/gsri/quantities/{propertyUuid}").buildAndExpand(uriVariables).toUriString();

        ParameterizedTypeReference<ResponseDto<Map<String, BigDecimal>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, BigDecimal>>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }

}