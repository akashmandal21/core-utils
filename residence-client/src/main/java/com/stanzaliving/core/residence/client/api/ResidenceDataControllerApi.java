package com.stanzaliving.core.residence.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.*;

import com.stanzaliving.core.residenceservice.dto.MoveInDateDto;
import com.stanzaliving.core.residenceservice.dto.PricingDetailsResponseDto;
import com.stanzaliving.core.residenceservice.dto.RoomDetailsResponseDto;
import com.stanzaliving.core.residenceservice.dto.ServiceMixDto;
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


	public ResponseDto<List<String>> fetchLockInDateForResidence(String token, String residenceUuid, MoveInDateDto moveInDateDto) {

		log.info("Residence-Data-Controller::Processing to get lock-in date based on residenceUuid {} and moveInDate {}", residenceUuid, moveInDateDto);

		if (StringUtils.isBlank(token)) {
			throw new IllegalArgumentException("Token missing for retrieving room details based on roomUUID");
		}


		Object postBody = moveInDateDto;

		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("residenceUuid", residenceUuid);

		String path = UriComponentsBuilder.fromPath("/api/v1/lock-in-date/{residenceUuid}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		headerParams.add("Cookie", "token="+token);

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<String>>> returnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
		};

		try {
			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception ex) {
			log.error("Exception while fetching lock-in date based on residenceUuid {} and moveInDate {}",
					residenceUuid, moveInDateDto);
		}
		return null;
	}

	public ResponseDto<List<ServiceMixDto>> fetchPackagedServiceForResidenceUuid(String token, String residenceUuid) {

		log.info("Residence-Data-Controller::Processing to fetch packaged service names based on residenceUuid {}", residenceUuid);

		if (StringUtils.isBlank(token)) {
			throw new IllegalArgumentException("Token missing for retrieving packaged service names based on residenceUuid");
		}

		Map<String, Object> uriVariables = new HashMap();

		uriVariables.put("residenceUuid", residenceUuid);

		String path = UriComponentsBuilder.fromPath("/api/v1/packaged-service/get/{residenceUuid}").buildAndExpand(uriVariables).toUriString();

		MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

		HttpHeaders headerParams = new HttpHeaders();

		headerParams.add("Cookie", "token="+token);

		String[] accepts = new String[]{"*/*"};

		List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<ServiceMixDto>>> returnType =
				new ParameterizedTypeReference<ResponseDto<List<ServiceMixDto>>>() {};

		try {
			return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);

		} catch (Exception ex) {
			log.error("Exception while fetching packaged service for residenceUuid : {}", residenceUuid);
		}
		return null;
	}

	public ResponseDto<Map<Object,Object>> fetchPackagedServiceData(String token, String residenceUuid, String serviceMix) {

		log.info("Residence-Data-Controller::Processing to fetch Package service properties for residenceUuid {}, service-mix {}", residenceUuid, serviceMix);

		if (StringUtils.isBlank(token)) {
			throw new IllegalArgumentException("Token missing for fetching package service based on residenceUuid");
		}

		Map<String, Object> uriVariables = new HashMap();

		uriVariables.put("residenceUuid", residenceUuid);

		uriVariables.put("servicemix", serviceMix);

		String path = UriComponentsBuilder.fromPath("/api/v1/packaged-service/get/{residenceUuid}/{servicemix}").buildAndExpand(uriVariables).toUriString();

		MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

		HttpHeaders headerParams = new HttpHeaders();

		headerParams.add("Cookie", "token="+token);

		String[] accepts = new String[]{"*/*"};

		List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Map<Object,Object>>> returnType =
				new ParameterizedTypeReference<ResponseDto<Map<Object,Object>> >() {};

		try {
			return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);

		} catch (Exception ex) {
			log.error("Exception while fetching packaged service properties for residenceUuid, serviceMix : {} , {}", residenceUuid, serviceMix);
		}
		return null;
	}

	public ResponseDto<PricingDetailsResponseDto> getPricingDetails(String token, String roomUuid, String serviceMixUuid, String moveInDate) {

		log.info("Residence-Data-Controller::Processing to get pricing detail based on move-in date {} , serviceMixUuid {}, roomUuid {}", moveInDate, serviceMixUuid, roomUuid);

		if (StringUtils.isBlank(token)) {
			throw new IllegalArgumentException("Token missing for fetching pricing detail based on move-in date");
		}

		Map<String, Object> uriVariables = new HashMap();

		uriVariables.put("roomUUID", roomUuid);

		uriVariables.put("serviceMixUUID", serviceMixUuid);

		uriVariables.put("moveInDate", moveInDate);

		String path = UriComponentsBuilder.fromPath("/api/v1/room-pricing/{roomUUID}/{serviceMixUUID}/{moveInDate}").buildAndExpand(uriVariables).toUriString();

		MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

		HttpHeaders headerParams = new HttpHeaders();

		headerParams.add("Cookie", "token="+token);

		String[] accepts = new String[]{"*/*"};

		List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<PricingDetailsResponseDto>> returnType =
				new ParameterizedTypeReference<ResponseDto<PricingDetailsResponseDto>>() {};

		try {
			return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);

		} catch (Exception ex) {
			log.error("Exception while get pricing detail based on move-in date {} , serviceMixUuid {}, roomUuid {}", moveInDate, serviceMixUuid, roomUuid);
		}
		return null;
	}
}
