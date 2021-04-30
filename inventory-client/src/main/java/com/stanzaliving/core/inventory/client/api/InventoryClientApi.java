package com.stanzaliving.core.inventory.client.api;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.grsi.dto.GrsiEventUpdateDto;
import com.stanzaliving.core.inventory.dto.InventoryActionRequestDto;
import com.stanzaliving.core.inventory.dto.InventoryItemDetailedDto;
import com.stanzaliving.core.inventory.dto.InventoryTOResponse;
import com.stanzaliving.item_master.dtos.FilterDto;
import com.stanzaliving.website.response.dto.LeadRequestDto;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class InventoryClientApi {

    private StanzaRestClient restClient;
    
    public InventoryClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<Collection<InventoryItemDetailedDto>> getInventoryItems(String addressUuid, FilterDto filterDto) {

        Object postBody = filterDto;

        String path = UriComponentsBuilder.fromPath("/internal/get/items/" + addressUuid).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Collection<InventoryItemDetailedDto>>> returnType = new ParameterizedTypeReference<ResponseDto<Collection<InventoryItemDetailedDto>>>() {
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

    public ResponseDto<Boolean> releaseQuantities(InventoryActionRequestDto inventoryActionRequestDto) {

        Object postBody = inventoryActionRequestDto;

        String path = UriComponentsBuilder.fromPath("/internal/release/all").toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<Boolean> handleTOShortClose(InventoryActionRequestDto inventoryActionRequestDto) {

        Object postBody = inventoryActionRequestDto;

        String path = UriComponentsBuilder.fromPath("/internal/release/partial").toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<Map<String, BigDecimal>> getTOShortclosePricing(InventoryActionRequestDto inventoryActionRequestDto) {

        Object postBody = inventoryActionRequestDto;

        String path = UriComponentsBuilder.fromPath("/internal/get/price/release/partial").toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Map<String, BigDecimal>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, BigDecimal>>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<Boolean> handleNegGrn(GrsiEventUpdateDto grsiEventUpdateDto) {

        Object postBody = grsiEventUpdateDto;

        String path = UriComponentsBuilder.fromPath("/internal/reduce/neg/grn").toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }
    
	public LeadRequestDto createBrokerLead(LeadRequestDto leadRequestDto) {

		try {
			log.error("LeadRequestDto while creating the lead {}", leadRequestDto);
			Object postBody = leadRequestDto;

			String path = UriComponentsBuilder.fromPath("/lead/").toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<LeadRequestDto> returnType = new ParameterizedTypeReference<LeadRequestDto>() {
			};

			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

		} catch (Exception e) {
			log.error("Error while creating the lead {}", e);
		}

		return null;
	}

	public boolean verifyOtp(String phone, String otp) {

		Object postBody = null;

		log.info("Received request to verify otp for mobile: {}", phone);

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/lead/otp/verify").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("phone", phone);
		queryParams.add("otp", otp);

		final HttpHeaders headerParams = new HttpHeaders();
		
		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<Boolean> returnType = new ParameterizedTypeReference<Boolean>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public boolean sendOtp(String phone, String flow) {

		Object postBody = null;

		log.info("Received request to send otp for mobile: {}", phone);

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/lead/otp/send").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("flow", flow);
		queryParams.add("phone", phone);

		final HttpHeaders headerParams = new HttpHeaders();
		
		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<Boolean> returnType = new ParameterizedTypeReference<Boolean>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}
	
	public LeadRequestDto leadCreation(LeadRequestDto leadRequestDto) {

		try {
			log.error("LeadRequestDto while creating the lead {}", leadRequestDto);
			
			Object postBody = leadRequestDto;

			String path = UriComponentsBuilder.fromPath("/internal/lead/create/temp/variant").toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<LeadRequestDto> returnType = new ParameterizedTypeReference<LeadRequestDto>() {
			};

			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

		} catch (Exception e) {
			log.error("Error while creating the lead {}", e);
		}

		return null;
	}

	public LeadRequestDto leadMigration(LeadRequestDto leadRequestDto) {
		
		try {
			log.error("LeadRequestDto while creating the lead {}", leadRequestDto);
	
			Object postBody = leadRequestDto;

			String path = UriComponentsBuilder.fromPath("/internal/lead/create/variant").toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<LeadRequestDto> returnType = new ParameterizedTypeReference<LeadRequestDto>() {
			};

			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

		} catch (Exception e) {
			log.error("Error while creating the lead {}", e);
		}

		return null;
	}
}