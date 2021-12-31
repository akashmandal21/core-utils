package com.stanzaliving.wanda.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Builder
@ToString
public class CafeProfileResponseDto {

	private WandaFileResponseDto profilePicture;
	
	private String residenceId;
	
	private String houseName;
	
	private String roomNumber;
	
	private String studentCode;
}
