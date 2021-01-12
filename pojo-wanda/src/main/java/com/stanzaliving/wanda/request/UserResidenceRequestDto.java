package com.stanzaliving.wanda.request;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class UserResidenceRequestDto {

	
	@NotBlank(message = "userId is Mandatory")
	private String userId;
	
	@NotBlank(message = "userCode is Mandatory")
	private String userCode;
	
	@NotBlank(message = "ResidenceId is Mandatory")
	private String residenceId;
	
	private String roomNumber;
}
