package com.stanzaliving.complaint.dto;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@SuperBuilder
public class SlackNotificationDto<T> {

	private String slackUrl;

	private String channelName;

	private String eventName;

	private Date eventTime;

	private T data;

}