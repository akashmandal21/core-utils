package com.stanzaliving.pushnotification.pojo;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

import com.stanzaliving.core.notifications.enums.AppName;

import lombok.Data;

@Data
public class PushNotificationDto {

	private String title;
	private String message;
	private String topic;
	private Collection<String> mobileNumbers;
	private Collection<String> userIds;
	private String imageUrl;
	private AppName appName;
	private Date createdAt;
	private Date messageReadAt;
	private String uuid;

	private Map<String,String> data;

}