/**
 * 
 */
package com.stanzaliving.pushnotification.pojo;

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
public class PushNotificationRequestDto {

	private String estateId;
	private String notificationTitle;
	private String notificationMessage;
}
