/**
 * 
 */
package com.stanzaliving.core.pushnotification.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.stanzaliving.core.user.acl.dto.UserDeptLevelRoleNameUrlExpandedDto;
import com.stanzaliving.documentgenerator.dto.PdfRequestDto;
import com.stanzaliving.pushnotification.pojo.PushNotificationRequestDto;
import com.stanzaliving.transformations.pojo.CountryLevelAccessMetadata;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.CollectionUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.transformations.pojo.CityMetadataDto;
import com.stanzaliving.transformations.pojo.MicroMarketDetailsDto;
import com.stanzaliving.transformations.pojo.MicroMarketMetadataDto;
import com.stanzaliving.transformations.pojo.MicroMarketUIDto;
import com.stanzaliving.transformations.pojo.StateMetadataDto;
import com.stanzaliving.core.base.enums.AccessLevel;

/**
 * @author raj.kumar
 *
 */
@Log4j2
public class PushNotificationClientApi {

	private StanzaRestClient restClient;

	public PushNotificationClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public ResponseDto<Boolean> sendPushNotificationRequest(PushNotificationRequestDto pushNotificationRequestDto) {

		log.info("Send push notification request dto " + pushNotificationRequestDto);

		String path = UriComponentsBuilder.fromPath("/send").toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, pushNotificationRequestDto, headerParams, accept,
				returnType);
	}


}