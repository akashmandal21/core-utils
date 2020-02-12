/**
 * 
 */
package com.stanzaliving.core.pushnotification.client.api;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

/**
 * @author Amit
 *
 */
@Log4j2
public class SlackExceptionNotification {

	private StanzaRestClient restClient;

	public SlackExceptionNotification(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public ResponseDto<String> sendPushNotificationRequest(Exception ex) {

		log.info("Send exception notification on Slack request exception " + ex);

		String path = UriComponentsBuilder.fromPath("").toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
		};

		Map<String, String> map = new HashMap<>();
		
		StringWriter sw = new StringWriter();
		ex.printStackTrace(new PrintWriter(sw));
		map.put("text", sw.toString());
		
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, map, headerParams, accept,
				returnType);
	}

}