/**
 * 
 */
package com.stanzaliving.pushnotification.pojo;

import lombok.Setter;
import lombok.ToString;

import java.util.List;

import javax.validation.constraints.NotNull;

import lombok.Getter;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class PushNotificationMessageReadAtRequestDto {

	@NotNull(message = "Notification uuids cannot be null")
	private List<String> notificationUuids;
}
