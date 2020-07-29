package com.stanzaliving.pushnotification.pojo;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class BulkPushNotificationsDto extends PushNotificationDto {

	@NotNull
	private MultipartFile contactsFile;
	
	private MultipartFile paramsFile;
	
	private List<String> params;
	
	private boolean isUserIds;
	
	private String tag;
}
