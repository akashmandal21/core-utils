package com.stanzaliving.core.po.client.api;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.stanzaliving.vendor.model.VendorPocDetailsDto;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.generic.dto.UIKeyValue;
import com.stanzaliving.core.grsi.dto.GrsiUpdateDto;
import com.stanzaliving.core.invoice.dto.InvoiceItemFilter;
import com.stanzaliving.core.po.generic.dtos.PoDetailsResponse;
import com.stanzaliving.core.po.generic.dtos.VendorWisePoDetails;
import com.stanzaliving.core.pojo.EmailDto;
import com.stanzaliving.invoice.dto.InvoiceItemDto;
import com.stanzaliving.invoice.dto.InvoiceMigrationResponseDto;
import com.stanzaliving.po.enums.PoStatus;
import com.stanzaliving.po.enums.PoType;
import com.stanzaliving.po.generic.dto.TOTemplateDto;
import com.stanzaliving.po.model.PoAggregationDto;
import com.stanzaliving.po.model.PoResponse;
import com.stanzaliving.po.model.PropertyPoStatusSummaryDto;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class POClientApi {

    private StanzaRestClient restClient;

    public POClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<PoResponse> getVendorDetails(String poDetailsId) {

        log.info("HTTP Client call to get PO Details DTO for UUID " + poDetailsId);

        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("id", poDetailsId);
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        
        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        Map<String, List<String>> map = new HashMap<>();

        ParameterizedTypeReference<ResponseDto<PoResponse>> vddReturnType = new ParameterizedTypeReference<ResponseDto<PoResponse>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal/getPoDataById/{id}").buildAndExpand(uriVariables).toUriString();

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, map, headerParams, accept, vddReturnType);
    }


    public ResponseDto<Map<String, BigDecimal>> getMaxQuantities(String itemUuid, List<String> propertyUuidList) {

        List<String> postBody = propertyUuidList;
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("itemUuid",itemUuid);

        String path = UriComponentsBuilder.fromPath("/internal/generic/po/remaining/item/quantity/propertyWise/{itemUuid}")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Map<String,BigDecimal>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String,BigDecimal>>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<Boolean> acceptInvoiceFlag(String poDetailsId, String userName) {

        if (Objects.isNull(poDetailsId)) {
            return null;
        }

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("poDetailsId", poDetailsId);
        
        String path = UriComponentsBuilder.fromPath("/internal/update/regularinvoice/{poDetailsId}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.putAll(restClient.parameterToMultiValueMap(null, "userName", userName));

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

    }


    public ResponseDto<Map<String, List<PropertyPoStatusSummaryDto>>> getPoStatuses(List<String> propertyUuids) {

        log.info("HTTP Client call to get PO statuses for properties {}",propertyUuids);

        Object postBody = propertyUuids;
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/getPoStatuses")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Map<String, List<PropertyPoStatusSummaryDto>>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, List<PropertyPoStatusSummaryDto>>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<Map<PoType,List<PoStatus>>> getAllPoStatusesForProperty(String propertyUuid) {

        log.info("HTTP Client call to get All PO statuses for property {}",propertyUuid);

        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("propertyUuid", propertyUuid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();


        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        Map<String, List<String>> map = new HashMap<>();

        ParameterizedTypeReference<ResponseDto<Map<PoType,List<PoStatus>>>> vddReturnType = new ParameterizedTypeReference<ResponseDto<Map<PoType,List<PoStatus>>>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal/allPoStatus/{propertyUuid}").buildAndExpand(uriVariables).toUriString();

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, map, headerParams, accept, vddReturnType);
    }


    public ResponseDto<PoAggregationDto> getAllPoAggregationsForProperty(String propertyUuid) {

        log.info("HTTP Client call to get All PO aggregation for property {}",propertyUuid);

        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("propertyUuid", propertyUuid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();


        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        Map<String, List<String>> map = new HashMap<>();

        ParameterizedTypeReference<ResponseDto<PoAggregationDto>> vddReturnType = new ParameterizedTypeReference<ResponseDto<PoAggregationDto>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal//getPoAggregationForProperty/{propertyUuid}").buildAndExpand(uriVariables).toUriString();

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, map, headerParams, accept, vddReturnType);
    }

    public ResponseDto<Boolean> grnStarted(String poDetailsId, String userName) {

        if (Objects.isNull(poDetailsId))
            return null;

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("poDetailsId", poDetailsId);

        String path = UriComponentsBuilder.fromPath("/internal/update/grn/started/{poDetailsId}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.putAll(restClient.parameterToMultiValueMap(null, "userName", userName));

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<Map<String, BigDecimal>> poItemQuantityForPropertyUuid(String propertyUuid) {

        if (Objects.isNull(propertyUuid))
            return null;

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("propertyUuid", propertyUuid);

        String path = UriComponentsBuilder.fromPath("/internal/generic/po/remaining/item/quantity/{propertyUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Map<String, BigDecimal>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, BigDecimal>>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }
    
     public ResponseDto<PoDetailsResponse> getPoDetailsWithItems(String poUuid) {

        log.info("HTTP Client call to get PO Details with Items {}",poUuid);

        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("poToUuid", poUuid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();


        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        Map<String, List<String>> map = new HashMap<>();

        ParameterizedTypeReference<ResponseDto<PoDetailsResponse>> vddReturnType = new ParameterizedTypeReference<ResponseDto<PoDetailsResponse>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal/generic/po/get/getCompletePOTODetails/{poToUuid}").buildAndExpand(uriVariables).toUriString();

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, map, headerParams, accept, vddReturnType);
    }

    public ResponseDto<PoDetailsResponse> getPoDetailsWithoutItems(String poUuid) {

        log.info("HTTP Client call to get PO Details without Items {}",poUuid);

        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("poToUuid", poUuid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();


        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        Map<String, List<String>> map = new HashMap<>();

        ParameterizedTypeReference<ResponseDto<PoDetailsResponse>> vddReturnType = new ParameterizedTypeReference<ResponseDto<PoDetailsResponse>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal/generic/po/get/getPOTODetailsWithoutItems/{poToUuid}").buildAndExpand(uriVariables).toUriString();

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, map, headerParams, accept, vddReturnType);
    }

    public ResponseDto<PoDetailsResponse> getPoToDetailsFromPoToNumber(String poToNumber) {

        log.info("HTTP Client call to get PO/TO Details from Po Number {}",poToNumber);

        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("poToNumber", poToNumber);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        Map<String, List<String>> map = new HashMap<>();

        ParameterizedTypeReference<ResponseDto<PoDetailsResponse>> vddReturnType = new ParameterizedTypeReference<ResponseDto<PoDetailsResponse>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal/generic/po/details/{poToNumber}").buildAndExpand(uriVariables).toUriString();

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, map, headerParams, accept, vddReturnType);
    }

    public ResponseDto<Void> markGrnCompletion(GrsiUpdateDto grsiUpdateDto){
        log.info("HTTP Client call to update PO for GRN Completion {}",grsiUpdateDto);

        Object postBody = grsiUpdateDto;
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/generic/po/mark/poCompletion")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<List<InvoiceItemDto>> getPoToItems(String poToUuid, InvoiceItemFilter invoiceItemFilter) {

        log.info("HTTP Client call to get PoTo item details {}, {}", poToUuid, invoiceItemFilter);

        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("poToUuid", poToUuid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        Object postBody = invoiceItemFilter;

        ParameterizedTypeReference<ResponseDto<List<InvoiceItemDto>>> vddReturnType = new ParameterizedTypeReference<ResponseDto<List<InvoiceItemDto>>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal/generic/po/get/items/{poToUuid}").buildAndExpand(uriVariables).toUriString();

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, invoiceItemFilter, headerParams, accept, vddReturnType);
    }

    public ResponseDto<List<InvoiceItemDto>> getPoToItemsByItemUuids(String poToUuid, List<String> itemUuids) {

        if (CollectionUtils.isEmpty(itemUuids))
            return null;

        Object postBody = itemUuids;

        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("poToUuid", poToUuid);

        String path = UriComponentsBuilder.fromPath("/internal/generic/po/get/items/by/itemUuids/{poToUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<InvoiceItemDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<InvoiceItemDto>>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<String> getVendorName(String propertyUuid, String poUuid, String vendorUuid) {

        log.info("HTTP Client call to get vendor name for property {} and vendorUuid {} ", propertyUuid, vendorUuid);

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("vendorUuid", vendorUuid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        if(StringUtils.isNotEmpty(propertyUuid))
            queryParams.put("propertyUuid", Arrays.asList(propertyUuid));
        if(StringUtils.isNotEmpty(poUuid))
            queryParams.put("poUuid", Arrays.asList(poUuid));

        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        Map<String, List<String>> map = new HashMap<>();

        ParameterizedTypeReference<ResponseDto<String>> vddReturnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        String path = UriComponentsBuilder.fromPath("/internal/generic/po/get/getVendorName/{vendorUuid}").buildAndExpand(uriVariables).toUriString();
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, map, headerParams, accept, vddReturnType);
    }

    public ResponseDto<Map<String,String>> getSelectedVendorNames(Department department, String prefix, List<String> vendorUuids) {

        log.info("HTTP Client call to get vendor names for department {} and vendorUuids {} ", department, vendorUuids);

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("department", department);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        if(StringUtils.isNotEmpty(prefix))
            queryParams.put("prefix",Arrays.asList(prefix));
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        Map<String, List<String>> map = new HashMap<>();

        ParameterizedTypeReference<ResponseDto<Map<String,String>>> vddReturnType = new ParameterizedTypeReference<ResponseDto<Map<String,String>>>() {
        };
        String path = UriComponentsBuilder.fromPath("/internal/generic/po/get/getSelectedVendorNames/{department}").buildAndExpand(uriVariables).toUriString();
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, vendorUuids, headerParams, accept, vddReturnType);
    }

    public ResponseDto<Collection<VendorWisePoDetails>> getVendorWisePOs(String propertyUuid) {

        log.info("HTTP Client call to get vendor wise POs for property {} ", propertyUuid);

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("propertyUuid", propertyUuid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        Map<String, List<String>> map = new HashMap<>();

        ParameterizedTypeReference<ResponseDto<Collection<VendorWisePoDetails>>> vddReturnType = new ParameterizedTypeReference<ResponseDto<Collection<VendorWisePoDetails>>>() {
        };
        String path = UriComponentsBuilder.fromPath("/internal/generic/po/get/getVendorWisePODetails/{propertyUuid}").buildAndExpand(uriVariables).toUriString();
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, map, headerParams, accept, vddReturnType);
    }

    public ResponseDto<String> getPoPdf(String poUuid) {

        log.info("HTTP Client call to get PO Pdf{} ", poUuid);

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("poUuid", poUuid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        Map<String, List<String>> map = new HashMap<>();

        ParameterizedTypeReference<ResponseDto<String>> vddReturnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        String path = UriComponentsBuilder.fromPath("/internal/generic/downloads/getPoPdf/{poUuid}").buildAndExpand(uriVariables).toUriString();
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, map, headerParams, accept, vddReturnType);
    }

    public ResponseDto<List<InvoiceMigrationResponseDto>> getAllInvoices() {

        log.info("HTTP Client call to get All Invoices");

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        Map<String, List<String>> map = new HashMap<>();

        ParameterizedTypeReference<ResponseDto<List<InvoiceMigrationResponseDto>>> vddReturnType = new ParameterizedTypeReference<ResponseDto<List<InvoiceMigrationResponseDto>>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal/get/all/invoices").toUriString();

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, map, headerParams, accept, vddReturnType);
    }

	public ResponseDto<Void> updatePoStatus(String poToUuid) {
		 
			log.info("HTTP Client call to get update Po status");

	        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

	        final HttpHeaders headerParams = new HttpHeaders();

	        final String[] accepts = {"*/*"};
	        
	        final Map<String, Object> uriVariables = new HashMap<>();
	        uriVariables.put("poUuid", poToUuid);

	        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

	        Map<String, List<String>> map = new HashMap<>();

	        ParameterizedTypeReference<ResponseDto<Void>> vddReturnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
	        };

	        String path = UriComponentsBuilder.fromPath("/internal/generic/po/updatePoStatusOnNegGrn/{poUuid}").buildAndExpand(uriVariables).toUriString();

	        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, map, headerParams, accept, vddReturnType);
	}


    public ResponseDto<List<UIKeyValue>> getPoNumbers(Collection<String> poUuids){

        Object postBody = poUuids;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/generic/po/getPoNumbers").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<UIKeyValue>>> returnType = new ParameterizedTypeReference<ResponseDto<List<UIKeyValue>>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<List<String>> getAllInactiveInvoices() {

        log.info("HTTP Client call to get All Invoices");

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        Map<String, List<String>> map = new HashMap<>();

        ParameterizedTypeReference<ResponseDto<List<String>>> vddReturnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal/get/all/inactive/invoices").toUriString();

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, map, headerParams, accept, vddReturnType);
    }

    public ResponseDto<Map<String, String>> getPoSummaryStatus(String propertyUuid, Map<String, String> poSummaryStatusMap){

        Object postBody = poSummaryStatusMap;

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("propertyUuid",propertyUuid);

        String path = UriComponentsBuilder.fromPath("/internal/generic/po/get/updatedPoSummaryStatus/{propertyUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Map<String, String>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, String>>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }


    public ResponseDto<Map<String, List<PropertyPoStatusSummaryDto>>> getGenericPoStatuses(List<String> propertyUuids) {

        log.info("HTTP Client call to get PO statuses for properties {}",propertyUuids);

        Object postBody = propertyUuids;
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/generic/get/properties/getPoStatuses")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Map<String, List<PropertyPoStatusSummaryDto>>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, List<PropertyPoStatusSummaryDto>>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

	public ResponseDto<Map<String, String>> getPoDownloadUrls(List<String> poNos) {

        log.info("HTTP Client call to get PO pdf copy for invoice csv listing download {}",poNos);

        Object postBody = poNos;
        
        final Map<String, Object> uriVariables = new HashMap<>();
        
        String path = UriComponentsBuilder.fromPath("/internal/generic/po/get/download/urls")
        		.buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams= new LinkedMultiValueMap<>();
        
        final HttpHeaders headerParams = new HttpHeaders();
        
        final String[] accepts = {
        		 "*/*"
        };
        
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        
        ParameterizedTypeReference<ResponseDto<Map<String, String>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String,String>>>() {
		};
        
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

    public ResponseDto<String> getPoPdfAndSendEmail(String poUuid, EmailDto emailDto) {

        log.info("HTTP Client call to get PO Pdf{} ", poUuid);

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("poUuid", poUuid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> vddReturnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal/generic/downloads/getPoPdf/sendEmail/{poUuid}").buildAndExpand(uriVariables).toUriString();

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, emailDto, headerParams, accept, vddReturnType);
    }

    public ResponseDto<String> getPoToPDF(String poToNumber) {

        log.info("HTTP Client call to get PO/TO PDF by poToNumber: {}", poToNumber);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("poToNumber", poToNumber);

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        Map<String, List<String>> map = new HashMap<>();

        ParameterizedTypeReference<ResponseDto<String>> vddReturnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal/generic/po/get/pdf/{poToNumber}").buildAndExpand(uriVariables).toUriString();

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, map, headerParams, accept, vddReturnType);
    }
    
    public ResponseDto<Map<String,UIKeyValue>> getVendorInfo(List<String> poNumbers) {

        log.info("HTTP Client call to get PO Vendors{} ",poNumbers);

        final Map<String, Object> uriVariables = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Map<String,UIKeyValue>>> vddReturnType = new ParameterizedTypeReference<ResponseDto<Map<String,UIKeyValue>>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal/generic/po/get/vendor/ponumbers").buildAndExpand(uriVariables).toUriString();

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, poNumbers, headerParams, accept, vddReturnType);
    }
    
    public ResponseDto<Void> createManualTO(TOTemplateDto toTemplateDto) {

        log.info("HTTP Client call to create manual TO:{}", toTemplateDto);

        final Map<String, Object> uriVariables = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Void>> vddReturnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal/generic/po/create/manual/to").toUriString();

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, toTemplateDto, headerParams, accept, vddReturnType);
    }

    public ResponseDto<Void> updateRentalItemRate(String propertyUuid, Map<String, BigDecimal> rentalItemUpdatedRateMap) {

        log.info("HTTP Client call to update rental item rate: {}", rentalItemUpdatedRateMap);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("propertyUuid", propertyUuid);

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Void>> vddReturnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal/update/rental/item/rate/{propertyUuid}").buildAndExpand(uriVariables).toUriString();

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, rentalItemUpdatedRateMap, headerParams, accept, vddReturnType);
    }

	public ResponseDto<String> saveLocationTypeApprovalLeelForNewDept(Department newDepartment, Department refDepartment) {

		log.info("HTTP Client call to save vendorMapping details for new dept: {} refDept: {}", newDepartment, refDepartment);

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("newDepartment", newDepartment);
		uriVariables.put("refDepartment", refDepartment);

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<String>> vddReturnType = new ParameterizedTypeReference<ResponseDto<String>>() {
		};

		String path = UriComponentsBuilder.fromPath("/internal/generic/po/save/locationType-approvalLevel/{newDepartment}/{refDepartment}").buildAndExpand(uriVariables).toUriString();

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, null, headerParams, accept, vddReturnType);

	}

	public ResponseDto<String> rollBack(Department newDepartment) {

		log.info("HTTP Client call to rollBack purchase-order details for new dept: {}", newDepartment);

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("newDepartment", newDepartment);

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<String>> vddReturnType = new ParameterizedTypeReference<ResponseDto<String>>() {
		};

		String path = UriComponentsBuilder.fromPath("/internal/generic/po/roll-back/locationType-approvalLevel/{newDepartment}").buildAndExpand(uriVariables).toUriString();

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, null, headerParams, accept, vddReturnType);

	}

	public ResponseDto<Map<String, List<PoDetailsResponse>>> getPoDeliveryDetails(List<String> poUuids) {

		log.info("HTTP Client call to get po delivery details");

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final Map<String, Object> uriVariables = new HashMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Map<String, List<PoDetailsResponse>>>> vddReturnType = new ParameterizedTypeReference<ResponseDto<Map<String, List<PoDetailsResponse>>>>() {
		};

		String path = UriComponentsBuilder.fromPath("/internal/generic/po/get/getPOTODeliveryDetails").buildAndExpand(uriVariables).toUriString();

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, poUuids, headerParams, accept, vddReturnType);
	}

    public ResponseDto<VendorPocDetailsDto> getPoVendorPocDetails(String poUuid) {

        log.info("HTTP Client call to get vendor poc details for a po");

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("poUuid", poUuid);

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        Map<String, List<String>> map = new HashMap<>();

        ParameterizedTypeReference<ResponseDto<VendorPocDetailsDto>> vddReturnType = new ParameterizedTypeReference<ResponseDto<VendorPocDetailsDto>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal/generic/po/pocDetails/{poUuid}").buildAndExpand(uriVariables).toUriString();

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, map, headerParams, accept, vddReturnType);
    }

    public ResponseDto<String> getPoShortclosedItemsForEmail(String poUuid) {

        log.info("HTTP Client call to get po shortclosed items");

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("poUuid", poUuid);

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        Map<String, List<String>> map = new HashMap<>();

        ParameterizedTypeReference<ResponseDto<String>> vddReturnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal/generic/po/get/shortclosedItems/{poUuid}").buildAndExpand(uriVariables).toUriString();

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, map, headerParams, accept, vddReturnType);
    }

    public ResponseDto<List<String>> getPoToUuidsForPropertyUuid(String propertyUuid) {

        log.info("HTTP Client call to get poToUuids");

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("propertyUuid", propertyUuid);

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        Map<String, List<String>> map = new HashMap<>();

        ParameterizedTypeReference<ResponseDto<List<String>>> vddReturnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
        };

        String path = UriComponentsBuilder.fromPath("internal/getPoToUuids/{propertyUuid}").buildAndExpand(uriVariables).toUriString();

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, map, headerParams, accept, vddReturnType);
    }

}