package com.stanzaliving.core.residence.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.*;

import com.stanzaliving.core.residenceservice.dto.RoomDetailsResponseDto;
import lombok.extern.log4j.Log4j2;
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

	public ResponseDto<RoomDetailsResponseDto> getRoomDetails(String roomUUID) {

		log.info("Residence-Data-Controller::Processing to get room details based on roomUUID {}", roomUUID);

		Map<String, Object> uriVariables = new HashMap();

		uriVariables.put("roomUUID", roomUUID);

		String path = UriComponentsBuilder.fromPath("/api/v1/room/{roomUUID}").buildAndExpand(uriVariables).toUriString();

		MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

		HttpHeaders headerParams = new HttpHeaders();

		String[] accepts = new String[]{"*/*"};

		List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<RoomDetailsResponseDto>> returnType =
				new ParameterizedTypeReference<ResponseDto<RoomDetailsResponseDto>>() {};

		try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
		} catch (Exception var13) {
			log.error(var13);
            log.error("Exception while fetching Room Details from roomUuid: {}", roomUUID);
		}
//        return Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData()) ? responseDto.getData() : null;
		return null;
	}
}
