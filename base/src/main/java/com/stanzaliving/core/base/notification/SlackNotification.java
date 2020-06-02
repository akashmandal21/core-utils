/**
 *
 */
package com.stanzaliving.core.base.notification;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.lang3.tuple.Pair;
import org.slf4j.MDC;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.StanzaConstants;
import com.stanzaliving.core.base.http.StanzaRestClient;

import lombok.extern.log4j.Log4j2;

/**
 * @author Amit
 *
 */
@Log4j2
public class SlackNotification {

	private StanzaRestClient restClient;

	public SlackNotification(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public String sendPushNotificationRequest(String message, String endUrl) {

		String path = UriComponentsBuilder.fromPath(endUrl).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
		};

		Map<String, String> map = new HashMap<>();
		map.put("text", message);

		try {
			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, map, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception caught while sending message on Slack : ", e);
		}

		return null;
	}

	public String sendExceptionNotificationRequest(Exception exception, String endUrl) {

		if (log.isTraceEnabled()) {
			log.trace("Send exception notification on Slack request exception: {}", exception);
		}

		StringBuilder slackMessage = createMessage(exception);

		return sendPushNotificationRequest(slackMessage.toString(), endUrl);
	}

	private StringBuilder createMessage(Exception exception) {
		Pair<String, String> ipAddress = getIpAddress();

		StringBuilder slackMessage = new StringBuilder();
		slackMessage
				.append("GUID: ")
				.append(MDC.get(StanzaConstants.GUID))
				.append("\n IP Address: ")
				.append(ipAddress.getLeft())
				.append("\n Hostname: ")
				.append(ipAddress.getRight())
				.append("\n ").append(StanzaConstants.REQUEST_PATH).append(": ")
				.append(MDC.get(StanzaConstants.REQUEST_PATH))
				.append("\n ").append(StanzaConstants.QUERY_STRING).append(": ")
				.append(MDC.get(StanzaConstants.QUERY_STRING))
				.append("\n Exception: ")
				.append(exception.toString());

		return slackMessage;
	}

	private Pair<String, String> getIpAddress() {

		Pair<String, String> pair = Pair.of("", "");

		try {
			InetAddress ip = InetAddress.getLocalHost();
			if (Objects.nonNull(ip)) {
				pair = Pair.of(ip.getHostAddress(), ip.getHostName());
			}

		} catch (UnknownHostException e) {
		}

		return pair;
	}

	public String sendExceptionNotificationRequest(String springApplicationName, Exception exception, String endUrl) {

		if (log.isTraceEnabled()) {
			log.trace("Send exception notification on Slack request exception: {}", exception);
		}

		StringBuilder slackMessage = new StringBuilder();
		slackMessage.append("Application Name:")
				.append(springApplicationName)
				.append("\n ").append(createMessage(exception));

		return sendPushNotificationRequest(slackMessage.toString(), endUrl);
	}
}