package com.stanzaliving.core.inventory.client.api;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.generic.po.enums.EventType;
import com.stanzaliving.core.grsi.dto.GrsiUpdateDto;
import com.stanzaliving.core.inventory.dto.InventoryActionRequestDto;
import com.stanzaliving.core.inventory.dto.InventoryItemQuantityPrice;
import com.stanzaliving.core.inventory.dto.InventoryTOResponse;
import com.stanzaliving.core.invoice.dto.InvoiceItemFilter;
import com.stanzaliving.core.po.generic.enums.GenericPOType;
import com.stanzaliving.grn.GSRIReceivedQuantity;
import com.stanzaliving.grn.GrnQuantity;
import com.stanzaliving.invoice.dto.InvoiceItemDto;
import com.stanzaliving.item_master.dtos.FilterDto;
import com.stanzaliving.po.enums.PoType;
import com.stanzaliving.transformations.pojo.PropertyBoqStatusDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;

@Log4j2
public class InventoryClientApi {

    private StanzaRestClient restClient;

    public InventoryClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<Collection<InventoryItemQuantityPrice>> getInventoryItems(String addressUuid, FilterDto filterDto) {

        Object postBody = filterDto;

        String path = UriComponentsBuilder.fromPath("/internal/get/items/" + addressUuid).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Collection<InventoryItemQuantityPrice>>> returnType = new ParameterizedTypeReference<ResponseDto<Collection<InventoryItemQuantityPrice>>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<InventoryTOResponse> blockQuantities(InventoryActionRequestDto inventoryActionRequestDto) {

        Object postBody = inventoryActionRequestDto;

        String path = UriComponentsBuilder.fromPath("/internal/block/resources").toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<InventoryTOResponse>> returnType = new ParameterizedTypeReference<ResponseDto<InventoryTOResponse>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<InventoryTOResponse> releaseQuantities(InventoryActionRequestDto inventoryActionRequestDto) {

        Object postBody = inventoryActionRequestDto;

        String path = UriComponentsBuilder.fromPath("/internal/release/all").toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<InventoryTOResponse>> returnType = new ParameterizedTypeReference<ResponseDto<InventoryTOResponse>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<InventoryTOResponse> handleTOShortClose(InventoryActionRequestDto inventoryActionRequestDto) {

        Object postBody = inventoryActionRequestDto;

        String path = UriComponentsBuilder.fromPath("/internal/release/partial").toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<InventoryTOResponse>> returnType = new ParameterizedTypeReference<ResponseDto<InventoryTOResponse>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

}