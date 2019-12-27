/**
 * 
 */
package com.stanzaliving.pushnotification.pojo;

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

	private String estateId;
	private String notificationTitle;
	private String notificationMessage;
	private ServiceName serviceName;
	private PushNotificationType pushNotificationType;
}
