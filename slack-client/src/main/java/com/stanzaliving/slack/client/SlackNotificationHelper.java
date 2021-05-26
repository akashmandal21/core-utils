/**
 * 
 */
package com.stanzaliving.slack.client;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.stanzaliving.core.base.common.dto.SlackMessageDto;
import com.stanzaliving.core.base.utils.SlackUtil;
import com.stanzaliving.core.kafka.producer.NotificationProducer;

/**
 * @author naveen.kumar
 *
 * @date 9 Sep, 2020
 *
 **/
@Component
public class SlackNotificationHelper {

	@Value("${enable.slack.exception:false}")
	private boolean enableSlackException;

	@Value("${service.slack.url}")
	private String serviceSlackUrl;

	@Value("${service.slack.exception.endUrl}")
	private String slackExceptionEndUrl;

	@Value("${kafka.topic.slack_message}")
	private String slackMessageTopic;

	@Autowired
	private NotificationProducer notificationProducer;

	public void sendExceptionMessageOnSlack(Exception exception) {

		if (enableSlackException) {

			StringBuilder message = SlackUtil.createMessage(exception);
			sendMessageOnSlack(message.toString());
		}
	}

	public void sendMessageOnSlack(String message) {

		if (enableSlackException && StringUtils.isNotBlank(message)) {
			notificationProducer.publish(slackMessageTopic, SlackMessageDto.class.getName(), new SlackMessageDto(message, serviceSlackUrl + slackExceptionEndUrl));
		}
	}
}