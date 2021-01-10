package com.stanzaliving.core.notifications.dto;

import com.stanzaliving.core.enums.Platform;
import com.stanzaliving.core.notifications.enums.AppName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FcmTokenDto {

	private Long id;
	
	private String uuid;
	
	private AppName appName;
	
	private String mobileNumber;
	
	private String userId;
	
	private Platform platform;
	
	private String token;
	
	private String deviceName;
	
	private String fingerprint;

}
