package com.stanzaliving.foodservice.client.api;

import java.util.Objects;

import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.cafe.dto.CafeOrderDto;
import com.stanzaliving.food.v2.common.dto.VasMasterDto;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class CafeOrderClientApi {

    private StanzaRestClient restClient;

    public CafeOrderClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public CafeOrderDto getOrderByVasOrderId(String orderId) {
    	
        ResponseDto<CafeOrderDto> responseDto = null;
        String path = UriComponentsBuilder.fromPath("/internal/cafe/order/{id}").buildAndExpand(orderId).toUriString();
        
        TypeReference<ResponseDto<CafeOrderDto>> returnType = new TypeReference<ResponseDto<CafeOrderDto>>() {};

        try {
        	responseDto = restClient.get(path, null, null, null, returnType, MediaType.APPLICATION_JSON);
        } catch (Exception e) {
            log.error("Error while fetching CafeOrder ByVasOrderId: {}", orderId, e);
        }

        return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : null;

    }
    
	public void mapVasItemWithAllCafe(VasMasterDto vasMasterDto) {

		String path = UriComponentsBuilder.fromPath("/internal/cafe/pricing/map/vasItem").build().toUriString();

		TypeReference<ResponseDto<Void>> returnType = new TypeReference<ResponseDto<Void>>() {
		};

		try {
			restClient.post(path, null, vasMasterDto, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while map vas item with all cafe: {}", e);
		}

	}
	
	public void deleteItemFromCafe(String id) {

		String path = UriComponentsBuilder.fromPath("/internal/cafe/pricing/delete").build().toUriString();

		TypeReference<ResponseDto<Void>> returnType = new TypeReference<ResponseDto<Void>>() {
		};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.add("id", id);

		try {
			restClient.post(path, queryParams, null, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while deleteItemFromCafe", e);
		}

	}

	public void deleteItemsFromFutureMenu(String id) {

		String path = UriComponentsBuilder.fromPath("/internal/cafe/pricing/delete/cafeMenuItem/futureMenu").build()
				.toUriString();

		TypeReference<ResponseDto<Void>> returnType = new TypeReference<ResponseDto<Void>>() {
		};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.add("id", id);

		try {
			restClient.post(path, queryParams, null, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while delete ItemsFromFutureMenu", e);
		}

	}
	
}