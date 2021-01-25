/**
 * 
 */
package com.stanzaliving.core.fr.client.api;

import java.util.List;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.base.utils.StanzaParseUtils;
import com.stanzaliving.core.facerecognition.dto.FrRequestDto;
import com.stanzaliving.core.facerecognition.dto.FrResponseDto;
import com.stanzaliving.core.facerecognition.dto.FrUrlRequestDto;

import lombok.extern.log4j.Log4j2;

/**
 * @author naveen.kumar
 *
 * @date 05-April-2020
 *
 **/
@Log4j2
public class UserRecognitionControllerApi {

	private StanzaRestClient restClient;

	public UserRecognitionControllerApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public Integer getUserIdFromImage(String imageUrl) {
		try {

			String path = UriComponentsBuilder.fromPath("recognize/user/image/url").toUriString();

			FrUrlRequestDto frRequestDto = FrUrlRequestDto.builder().presignedUrl(imageUrl).build();

			final String[] accepts = {
					"*/*"
			};

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<FrResponseDto> returnType = new ParameterizedTypeReference<FrResponseDto>() {
			};

			FrResponseDto resp = restClient.invokeAPI(path, HttpMethod.POST, queryParams, frRequestDto, headerParams, accept, returnType);

			log.info("Response from FR Service: " + resp);

			if (Objects.nonNull(resp) && StringUtils.isNotBlank(resp.getUserId())) {
				return StanzaParseUtils.getIntValue(resp.getUserId());
			}

		} catch (Exception e) {
			log.error("Exception while fetching data from face recognition system: ", e);
		}

		return -1;
	}

	public Integer getUserIdFromImage(String bucketName, String imagePath) {
		try {

			String path = UriComponentsBuilder.fromPath("recognize/user/image/path").toUriString();

			FrRequestDto frRequestDto = FrRequestDto.builder().bucket(bucketName).path(imagePath).build();

			final String[] accepts = {
					"*/*"
			};

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<FrResponseDto> returnType = new ParameterizedTypeReference<FrResponseDto>() {
			};

			FrResponseDto resp = restClient.invokeAPI(path, HttpMethod.POST, queryParams, frRequestDto, headerParams, accept, returnType);

			log.info("Response from FR Service: " + resp);

			if (Objects.nonNull(resp) && StringUtils.isNotBlank(resp.getUserId())) {
				return StanzaParseUtils.getIntValue(resp.getUserId());
			}

		} catch (Exception e) {
			log.error("Exception while fetching data from face recognition system: ", e);
		}

		return -1;
	}
}