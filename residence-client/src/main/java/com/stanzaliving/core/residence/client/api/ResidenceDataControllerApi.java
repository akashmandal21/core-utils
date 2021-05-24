package com.stanzaliving.core.residence.client.api;

import com.stanzaliving.core.base.http.*;

import com.stanzaliving.core.residenceservice.dto.RoomDetailsResponseDto;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
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
public class ResidenceDataControllerApi {

	private StanzaRestClient restClient;

	public ResidenceDataControllerApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public RoomDetailsResponseDto getRoomDetails(String roomUUID, String token) {

		log.info("Residence-Data-Controller::Processing to get room details based on roomUUID {}", roomUUID);

		if (StringUtils.isBlank(token)) {
			throw new IllegalArgumentException("Token missing for retrieving room details based on roomUUID");
		}

		Map<String, Object> uriVariables = new HashMap();

		uriVariables.put("roomUUID", roomUUID);

		String path = UriComponentsBuilder.fromPath("/api/v1/room/{roomUUID}").buildAndExpand(uriVariables).toUriString();

		MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

		HttpHeaders headerParams = new HttpHeaders();

		headerParams.add("Cookie", "token="+token);

		String[] accepts = new String[]{"*/*"};

		List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<RoomDetailsResponseDto> returnType =
				new ParameterizedTypeReference<RoomDetailsResponseDto>() {};

		try {
             return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);

		} catch (Exception ex) {
            log.error("Exception while fetching Room Details from roomUuid: {}", roomUUID);
		}
    	return null;
	}


	public RoomCountWithStatusDto getRoomStatusCount(String residenceUuid) {

		log.info("Residence-Data-Controller::Processing to get room status count based on residenceUUID {}", residenceUuid);


		Map<String, Object> uriVariables = new HashMap();

		uriVariables.put("residenceUuid", residenceUuid);

		String path = UriComponentsBuilder.fromPath("/api/v1/internal/room/room-status-count/{residenceUuid}").buildAndExpand(uriVariables).toUriString();

		MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

		HttpHeaders headerParams = new HttpHeaders();

		headerParams.add("Cookie", "token="+token);

		String[] accepts = new String[]{"*/*"};

		List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<RoomCountWithStatusDto> returnType =
				new ParameterizedTypeReference<RoomCountWithStatusDto>() {};

		try {
			return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);

		} catch (Exception ex) {
			log.error("Exception while fetching Room Details from roomUuid: {}", roomUUID);
		}
		return null;
	}

	public BlendedPriceWithOccupancyDataDto getBlendedPriceData(String residenceUuid,String token) {

		log.info("Residence-Data-Controller::Processing to get blended price data based on residence UUID {}", residenceUuid);

		if (StringUtils.isBlank(token)) {
			throw new IllegalArgumentException("Token missing for retrieving room details based on roomUUID");
		}

		Map<String, Object> uriVariables = new HashMap();

		uriVariables.put("residenceUuid", residenceUuid);

		String path = UriComponentsBuilder.fromPath("/api/v1/internal/room/blended-price/{residenceUuid}").buildAndExpand(uriVariables).toUriString();

		MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

		HttpHeaders headerParams = new HttpHeaders();


		String[] accepts = new String[]{"*/*"};

		List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<BlendedPriceWithOccupancyDataDto> returnType =
				new ParameterizedTypeReference<BlendedPriceWithOccupancyDataDto>() {};

		try {
			return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);

		} catch (Exception ex) {
			log.error("Exception while fetching Room Details from roomUuid: {}", roomUUID);
		}
		return null;
	}



}
