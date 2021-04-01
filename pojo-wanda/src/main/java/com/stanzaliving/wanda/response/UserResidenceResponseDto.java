package com.stanzaliving.wanda.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserResidenceResponseDto {

	private String reisdenceName; 
	private String userCode; 
	private String userName; 
	private String userUuid; 
	private String roomNumber; 
	private String mobileNo; 
}
