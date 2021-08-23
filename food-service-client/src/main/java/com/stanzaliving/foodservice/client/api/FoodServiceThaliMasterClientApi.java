package com.stanzaliving.foodservice.client.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.food.enums.FoodItemBasePreference;
import com.stanzaliving.core.food.enums.FoodRegion;
import com.stanzaliving.food.v2.common.dto.ThaliMasterDto;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.http.MediaType;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Log4j2
public class FoodServiceThaliMasterClientApi {

	private StanzaRestClient restClient;

	public FoodServiceThaliMasterClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public Map<String, String> getThaliNameMap() {
		String path = UriComponentsBuilder.fromPath("/internal/v2/common/thali/master/thaliNameMap").build().toUriString();

		TypeReference<ResponseDto<Map<String, String>>> returnType = new TypeReference<ResponseDto<Map<String, String>>>() {};

		ResponseDto<Map<String, String>> responseDto = null;

		try {

			responseDto = restClient.get(path, null, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting thaliNameMap", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new HashMap<>();

	}
	
	public Map<String, ThaliMasterDto> getThaliMap() {
		String path = UriComponentsBuilder.fromPath("/internal/v2/common/thali/master/thaliMap").build().toUriString();

		TypeReference<ResponseDto<Map<String, ThaliMasterDto>>> returnType = new TypeReference<ResponseDto<Map<String, ThaliMasterDto>>>() {};

		ResponseDto<Map<String, ThaliMasterDto>> responseDto = null;

		try {

			responseDto = restClient.get(path, null, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting thali master map", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new HashMap<>();
	}
	
	public List<ThaliMasterDto> findAllCached() {

		String path = UriComponentsBuilder.fromPath("/internal/v2/common/thali/master/all").build().toUriString();

		TypeReference<ResponseDto<List<ThaliMasterDto>>> returnType = new TypeReference<ResponseDto<List<ThaliMasterDto>>>() {};

		ResponseDto<List<ThaliMasterDto>> responseDto = null;

		try {

			responseDto = restClient.get(path, null, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting thali masters", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new ArrayList<>();
	}
	
	public Map<Pair<FoodRegion, FoodItemBasePreference>, ThaliMasterDto> getThaliMapper() {

		String path = UriComponentsBuilder.fromPath("/internal/v2/common/thali/master/thaliMapper").build().toUriString();

		TypeReference<ResponseDto<Map<Pair<FoodRegion, FoodItemBasePreference>, ThaliMasterDto>>> returnType =
				new TypeReference<ResponseDto<Map<Pair<FoodRegion, FoodItemBasePreference>, ThaliMasterDto>>>() {};

		ResponseDto<Map<Pair<FoodRegion, FoodItemBasePreference>, ThaliMasterDto>> responseDto = null;

		try {

			responseDto = restClient.get(path, null, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting thaliMapper", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new HashMap<>();
	}

}