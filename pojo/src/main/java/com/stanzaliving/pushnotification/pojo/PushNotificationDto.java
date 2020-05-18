package com.stanzaliving.pushnotification.pojo;

import java.util.Collection;
import java.util.Map;

import lombok.Data;

@Data
public class PushNotificationDto {

	private String title;
	private String message;
	private String topic;
	private Collection<String> mobileNumbers;
	private Collection<String> userIds;
	private String imageUrl;
	private String appName;
	
	Map<String,String> data;

}