/**
 * 
 */
package com.stanzaliving.pushnotification.pojo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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
public class UserDeviceTokenRequestDto {

	@NotEmpty(message = "Device token cannot be null")
	private String deviceToken;
	
	@NotNull(message = "Service name should not be null")
	private ServiceName serviceName;
}
