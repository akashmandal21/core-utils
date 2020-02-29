/**
 * 
 */
package com.stanzaliving.core.item_master.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.stanzaliving.item_master.dtos.BoqRequestDto;
import com.stanzaliving.item_master.dtos.MasterBoqDto;
import com.stanzaliving.item_master.enums.ItemType;
import com.stanzaliving.transformations.enums.BrandName;
import com.stanzaliving.transformations.enums.SubBrandName;
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
public class ItemMasterClientApi {

	private StanzaRestClient restClient;

	public ItemMasterClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public ResponseDto<List<MasterBoqDto>> getMasterBoqDtos(BoqRequestDto boqRequestDto) {
		
		Object postBody = boqRequestDto;

		final Map<String, Object> uriVariables = new HashMap<>();
		String path = UriComponentsBuilder.fromPath("/internal/details/post/fetchBoqItems")
								.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<MasterBoqDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<MasterBoqDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}


}