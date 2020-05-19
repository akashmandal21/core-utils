package com.stanzaliving.campaign.client.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.campaign.dto.GetUserCampaignDto;
import com.stanzaliving.campaign.dto.UserCampaignStatusDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class CampaignClientApi {

	private StanzaRestClient restClient;

	public CampaignClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public List<UserCampaignStatusDto> getUsersCampaignTriggerStatusResponse(GetUserCampaignDto campaignDto) {

		ResponseDto<List<UserCampaignStatusDto>> responseDto = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		GetUserCampaignDto postBody = campaignDto;

		String path = UriComponentsBuilder.fromPath("/internal/get/user/campaign/sent/status").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<UserCampaignStatusDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<UserCampaignStatusDto>>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("exception while fetching campaign status from campaign service", e);
		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new ArrayList<>();
	}

}
