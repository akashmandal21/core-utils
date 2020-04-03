/**
 * 
 */
package com.stanzaliving.core.boq_client.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.stanzaliving.boq_service.BoqItemSearchRequestDto;
import com.stanzaliving.core.projectservice.tiles.PropertyReportsTile;
import com.stanzaliving.item_master.dtos.BoqRequestDto;
import com.stanzaliving.item_master.dtos.MasterBoqDto;
import com.stanzaliving.item_master.enums.ItemType;
import com.stanzaliving.transformations.enums.BrandName;
import com.stanzaliving.transformations.enums.SubBrandName;
import com.stanzaliving.transformations.pojo.MasterBoqResponseDto;
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
import com.stanzaliving.sfr.SfrReportSummaryDto;

import com.stanzaliving.core.projectservice.tiles.TileDeciderDto;
import com.stanzaliving.core.projectservice.tiles.TileStatusDto;


@Log4j2
public class BoqClientApi {

	private StanzaRestClient restClient;

	public BoqClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}


	public ResponseDto<List<PropertyBoqStatusDto>> getMasterBoqStatusByPropertyUuids(List<String> propertyUuids) {
		log.info("HTTP Client call to get Master BOQ Status data for properties["+propertyUuids+"]");

		Object postBody = propertyUuids;

		final Map<String, Object> uriVariables = new HashMap<>();
		String path = UriComponentsBuilder.fromPath("/internal/boq/get/property/status")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<PropertyBoqStatusDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<PropertyBoqStatusDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

	}

	public ResponseDto<TileStatusDto> getTileStatus(TileDeciderDto tileDeciderDto) {
		log.info("HTTP Client call to get BOQ Tile Status dto with DTO {}",tileDeciderDto);

		Object postBody = tileDeciderDto;

		final Map<String, Object> uriVariables = new HashMap<>();
		String path = UriComponentsBuilder.fromPath("/internal/boq/get/property/tileStatus")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<TileStatusDto>> returnType = new ParameterizedTypeReference<ResponseDto<TileStatusDto>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}


}