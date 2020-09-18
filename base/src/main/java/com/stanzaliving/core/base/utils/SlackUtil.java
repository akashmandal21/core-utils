/**
 * 
 */
package com.stanzaliving.core.base.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.util.Objects;

import org.apache.commons.lang3.tuple.Pair;
import org.slf4j.MDC;

import com.stanzaliving.core.base.StanzaConstants;
import com.stanzaliving.core.base.enums.DateFormat;

import lombok.experimental.UtilityClass;

/**
 * @author naveen.kumar
 *
 * @date 09-Jun-2020
 *
 **/
@UtilityClass
public class SlackUtil {

	public StringBuilder createMessage(Exception exception) {
		Pair<String, String> ipAddress = getIpAddress();

		StringBuilder slackMessage = new StringBuilder();
		slackMessage
				.append("Event Time: ")
				.append(DateUtil.convertLocalDateTimeToDateFormatString(LocalDateTime.now(), DateFormat.ELASTIC_SEARCH_WITH_MILI_SECONDS))
				.append("\n GUID: ")
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

	public StringBuilder createMessageForKafka(String topic, String record, String error) {
		Pair<String, String> ipAddress = getIpAddress();

		StringBuilder slackMessage = new StringBuilder();
		slackMessage
				.append("Event Time: ")
				.append(DateUtil.convertLocalDateTimeToDateFormatString(LocalDateTime.now(), DateFormat.ELASTIC_SEARCH_WITH_MILI_SECONDS))
				.append("\n GUID: ")
				.append(MDC.get(StanzaConstants.GUID))
				.append("\n IP Address: ")
				.append(ipAddress.getLeft())
				.append("\n Hostname: ")
				.append(ipAddress.getRight())
				.append("\n ").append("Topic: ")
				.append(topic)
				.append("\n ").append("Record: ")
				.append(record)
				.append("\n ").append("Error: ")
				.append(error);

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
}
