/**
 * 
 */
package com.stanzaliving.pushnotification.pojo;

import java.util.Date;

import com.stanzaliving.pushnotification.enums.PushNotificationType;
import com.stanzaliving.pushnotification.enums.ServiceName;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class PushNotificationResponseDto {

	private String uuid;
	private String estateUuid;
	private String notificationTitle;
	private String notificationMessage;
	private ServiceName serviceName;
	private PushNotificationType pushNotificationType;
	private Date messageReadAt;
}
